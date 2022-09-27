package org.openapitools.codegen.languages;

import static org.openapitools.codegen.CodegenConstants.GENERATE_API_TESTS;
import static org.openapitools.codegen.CodegenConstants.MODEL_NAME_SUFFIX;
import static org.openapitools.codegen.CodegenConstants.SOURCE_FOLDER;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import org.openapitools.codegen.CliOption;
import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.CodegenModel;
import org.openapitools.codegen.CodegenOperation;
import org.openapitools.codegen.CodegenParameter;
import org.openapitools.codegen.CodegenProperty;
import org.openapitools.codegen.CodegenResponse;
import org.openapitools.codegen.SpecValidationException;
import org.openapitools.codegen.SupportingFile;
import org.openapitools.codegen.languages.features.BeanValidationFeatures;
import org.openapitools.codegen.languages.features.OptionalFeatures;
import org.openapitools.codegen.languages.features.UseGenericResponseFeatures;
import org.openapitools.codegen.model.ModelsMap;
import org.openapitools.codegen.utils.ModelUtils;
import org.openapitools.codegen.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.servers.Server;

public class MicronautCodegen extends AbstractJavaCodegen
		implements BeanValidationFeatures, UseGenericResponseFeatures, OptionalFeatures {

	public static final String CLIENT_ID = "clientId";
	public static final String INTROSPECTED = "introspected";
	public static final String DATETIME_RELAXED = "dateTimeRelaxed";
	public static final String PAGEABLE = "pageable";

	// '{' or '}' is not allowed according to https://datatracker.ietf.org/doc/html/rfc6570#section-3.2
	// so the RegExp needs to work around and be very verbose as quantifiers cannot be used.
	private static final String UUID_PATTERN = "[a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9]"
			+ "-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]"
			+ "-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]"
			+ "-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]"
			+ "-[a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9]";
	private static final Logger LOG = LoggerFactory.getLogger(MicronautCodegen.class);

	private boolean generateApiTests = true;
	private boolean useBeanValidation = true;
	private boolean useGenericResponse = true;
	private boolean useOptional = true;
	private boolean introspected = true;
	private boolean dateTimeRelaxed = true;
	private boolean pageable = false;
	private boolean isClient = false;

	public MicronautCodegen() {

		// enable the supported default-codegen features

		supportsAdditionalPropertiesWithComposedSchema = true;
		useOneOfInterfaces = true;

		cliOptions.clear();
		cliOptions.add(CliOption.newBoolean(USE_BEANVALIDATION, "Use bean validation annotations", useBeanValidation));
		cliOptions.add(CliOption.newBoolean(USE_GENERIC_RESPONSE, "Use generic response", useGenericResponse));
		cliOptions.add(CliOption.newBoolean(USE_OPTIONAL, "Use Optional<T> instead of @Nullable.", useOptional));
		cliOptions.add(CliOption.newBoolean(INTROSPECTED, "Add @Introspected to models", introspected));
		cliOptions.add(CliOption.newBoolean(SUPPORT_ASYNC, "Use async responses", supportAsync));
		cliOptions.add(CliOption.newBoolean(DATETIME_RELAXED, "Relaxed parsing of datetimes.", dateTimeRelaxed));
		cliOptions.add(CliOption.newBoolean(PAGEABLE, "Generate provider for pageable (mironaut-data).", pageable));
		cliOptions.add(CliOption.newBoolean(OPENAPI_NULLABLE, "Enable OpenAPI Jackson Nullable", openApiNullable));
		cliOptions.add(CliOption.newString(CLIENT_ID, "ClientId to use."));

		// there is no documentation template yet

		apiTemplateFiles.clear();
		apiDocTemplateFiles.clear();
		apiTestTemplateFiles.clear();
		modelTemplateFiles.clear();
		modelTemplateFiles.put("model.mustache", ".java");
		modelDocTemplateFiles.clear();
		modelTestTemplateFiles.clear();

		// parent flags

		additionalProperties.clear();
		additionalProperties.put(USE_BEANVALIDATION, useBeanValidation);
		additionalProperties.put(USE_GENERIC_RESPONSE, useGenericResponse);
		additionalProperties.put(USE_OPTIONAL, useOptional);
		additionalProperties.put(INTROSPECTED, introspected);
		additionalProperties.put(PAGEABLE, pageable);

		// add custom type mappings

		typeMapping.clear();

		typeMapping.put("object", java.lang.Object.class.getName());
		typeMapping.put("AnyType", java.lang.Object.class.getName());
		typeMapping.put("date", java.time.LocalDate.class.getName());
		typeMapping.put("DateTime", java.time.Instant.class.getName());
		typeMapping.put("array", java.util.List.class.getName());
		typeMapping.put("map", java.util.Map.class.getName());
		typeMapping.put("set", java.util.Set.class.getName());
		typeMapping.put("boolean", java.lang.Boolean.class.getName());
		typeMapping.put("string", java.lang.String.class.getName());
		typeMapping.put("int", java.lang.Integer.class.getName());
		typeMapping.put("integer", java.lang.Integer.class.getName());
		typeMapping.put("Integer", java.lang.Integer.class.getName());
		typeMapping.put("long", java.lang.Long.class.getName());
		typeMapping.put("Long", java.lang.Long.class.getName());
		typeMapping.put("float", java.lang.Float.class.getName());
		typeMapping.put("Float", java.lang.Float.class.getName());
		typeMapping.put("double", java.lang.Double.class.getName());
		typeMapping.put("Double", java.lang.Double.class.getName());
		typeMapping.put("number", java.lang.Double.class.getName());
		typeMapping.put("BigDecimal", java.lang.Double.class.getName());
		typeMapping.put("UUID", java.util.UUID.class.getName());
		typeMapping.put("URI", java.net.URI.class.getName());
		typeMapping.put("URL", java.net.URL.class.getName());
		typeMapping.put("file", "byte[]");
		typeMapping.put("ByteArray", "byte[]");
		typeMapping.put("MultipartBody", "io.micronaut.http.client.multipart.MultipartBody");
		typeMapping.put("fileUpload", "io.micronaut.http.multipart.CompletedFileUpload");
		typeMapping.put("asyncFileUpload", "io.micronaut.http.multipart.StreamingFileUpload");
		typeMapping.put("asyncCompletable", "reactor.core.publisher.Mono");
		typeMapping.put("asyncSingle", "reactor.core.publisher.Mono");
		typeMapping.put("asyncMaybe", "reactor.core.publisher.Mono");
		typeMapping.put("asyncFlowable", "reactor.core.publisher.Flux");
		typeMapping.put("Generated", "jakarta.annotation.Generated");
		typeMapping.put("Nullable", "io.micronaut.core.annotation.Nullable");
		typeMapping.put("Nonnull", "io.micronaut.core.annotation.NonNull");
		typeMapping.put("Inject", "jakarta.inject.Inject");
		typeMapping.put("Singleton", "jakarta.inject.Singleton");
		instantiationTypes.clear();
		instantiationTypes.put("array", ArrayList.class.getName());
		instantiationTypes.put("map", HashMap.class.getName());
		instantiationTypes.put("set", LinkedHashSet.class.getName());
		importMapping.clear();

		// allow list and file as variables

		reservedWords.remove("file");
		reservedWords.remove("list");
	}

	@Override
	public String getName() {
		return "micronaut";
	}

	@Override
	public void postProcess() {
	}

	@Override
	public void processOpts() {
		BiFunction<String, String, String> getOrDefault = (key,
			defaultValue) -> (String) additionalProperties.computeIfAbsent(key, k -> defaultValue);

		// reuse package if other packages are not provided

		var packageName = getOrDefault.apply(CodegenConstants.PACKAGE_NAME, "changeMe");
		apiPackage = getOrDefault.apply(CodegenConstants.API_PACKAGE, packageName);
		modelPackage = getOrDefault.apply(CodegenConstants.MODEL_PACKAGE, packageName);
		invokerPackage = getOrDefault.apply(CodegenConstants.INVOKER_PACKAGE, packageName);
		additionalProperties.put("isModelImport", !apiPackage.equals(modelPackage));

		// process flags - this class

		if (additionalProperties.containsKey(USE_BEANVALIDATION)) {
			useBeanValidation = convertPropertyToBooleanAndWriteBack(USE_BEANVALIDATION);
		}
		if (additionalProperties.containsKey(USE_GENERIC_RESPONSE)) {
			useGenericResponse = convertPropertyToBooleanAndWriteBack(USE_GENERIC_RESPONSE);
		}
		if (additionalProperties.containsKey(USE_OPTIONAL)) {
			useOptional = convertPropertyToBooleanAndWriteBack(USE_OPTIONAL);
		}
		if (additionalProperties.containsKey(INTROSPECTED)) {
			introspected = convertPropertyToBooleanAndWriteBack(INTROSPECTED);
		}
		if (additionalProperties.containsKey(DATETIME_RELAXED)) {
			dateTimeRelaxed = convertPropertyToBooleanAndWriteBack(DATETIME_RELAXED);
		}
		if (additionalProperties.containsKey(PAGEABLE)) {
			pageable = convertPropertyToBooleanAndWriteBack(PAGEABLE);
		}
		if (additionalProperties.containsKey(SUPPORT_ASYNC)) {
			supportAsync = convertPropertyToBooleanAndWriteBack(SUPPORT_ASYNC);
		}
		if (additionalProperties.containsKey(GENERATE_API_TESTS)) {
			generateApiTests = convertPropertyToBooleanAndWriteBack(GENERATE_API_TESTS);
		}
		if (additionalProperties.containsKey(OPENAPI_NULLABLE)) {
			openApiNullable = convertPropertyToBooleanAndWriteBack(OPENAPI_NULLABLE);
		}

		// we do not generate projects, only api, set source and test folder

		templateDir = "Micronaut";
		projectFolder = getOrDefault.apply("projectFolder", "generated-sources");
		projectTestFolder = getOrDefault.apply("projectTestFolder", "generated-test-sources");
		sourceFolder = getOrDefault.apply(SOURCE_FOLDER, projectFolder + File.separator + "openapi");
		testFolder = getOrDefault.apply("testFolder", projectTestFolder + File.separator + "openapi");
		modelNameSuffix = getOrDefault.apply(MODEL_NAME_SUFFIX, modelNameSuffix);
		isClient = additionalProperties.containsKey(CLIENT_ID);

		// add files to generate

		if (isClient) {
			apiTemplateFiles.put("apiClient.mustache", "Client.java");
		} else {
			apiTemplateFiles.put("apiServer.mustache", ".java");
			if (pageable) {
				addSupportingFile(sourceFolder, invokerPackage, "PageableProvider");
			}
			if (generateApiTests && !openAPI.getPaths().isEmpty()) {
				apiTestTemplateFiles.put("testSpec.mustache", "Spec.java");
				apiTestTemplateFiles.put("testClient.mustache", "Client.java");
				addSupportingFile(testFolder, invokerPackage, "HttpResponseAssertions");
			}
		}

		// add type mappings for mustache

		additionalProperties.put("type.Nullable", typeMapping.get("Nullable"));
		additionalProperties.put("type.Nonnull", typeMapping.get("Nonnull"));
		additionalProperties.put("type.Inject", typeMapping.get("Inject"));
		additionalProperties.put("type.Singleton", typeMapping.get("Singleton"));
		additionalProperties.put("type.MultipartBody", typeMapping.get("MultipartBody"));
		Optional.ofNullable(typeMapping.get("Generated"))
				.filter(type -> !type.isBlank())
				.ifPresent(type -> additionalProperties.put("type.Generated", type));
	}

	@Override
	public CodegenOperation fromOperation(String path, String httpMethod, Operation source, List<Server> servers) {

		var operation = super.fromOperation(path, httpMethod, source, servers);
		var produces = operation.produces == null ? List.<Map<String, String>>of() : operation.produces;

		// warn if operation has wildcard/range responses

		if (operation.responses.stream().anyMatch(CodegenResponse::isWildcard)) {
			throw new SpecValidationException("Wildcard responses are not supported.");
		}
		if (operation.responses.stream().anyMatch(CodegenResponse::isRange)) {
			throw new SpecValidationException("Range responses are not supported.");
		}

		// get responses for considering repsonse type

		var responses = operation.responses.stream().filter(r -> r.is2xx || r.is3xx).collect(Collectors.toList());
		var responsesCodes = responses.stream().map(r -> Integer.parseInt(r.code)).collect(Collectors.toList());
		var responseGeneric = useGenericResponse;
		var dataTypes = responses.stream().map(r -> r.dataType).collect(Collectors.toSet());

		if (!responseGeneric && responses.size() > 1) {
			LOG.info("operation {} has multiple responses {}, use generic response",
					operation.nickname, responsesCodes);
			responseGeneric = true;
		}

		if (!responseGeneric && responses.stream().anyMatch(r -> r.hasHeaders)) {
			LOG.info("operation {} has response with header, use generic response", operation.nickname);
			responseGeneric = true;
		}

		if (operation.returnType != null && dataTypes.size() > 1) {
			LOG.info("operation {} has multiple responses {} with multiple models {}, erase return type",
					operation.nickname, responsesCodes, dataTypes);
			operation.returnType = null;
		}

		if ((operation.returnType != null || !responseGeneric) && produces.size() > 1) {
			var specResponse = (ApiResponse) responses.get(0).vendorExtensions.get(ApiResponse.class.getName());
			var returnTypes = specResponse.getContent().values().stream().collect(Collectors.toSet());
			if (returnTypes.size() > 1) {
				var mediaTypes = produces.stream().flatMap(m -> m.values().stream()).collect(Collectors.toSet());
				LOG.info("operation {} has multiple media types {} with multiple models, erase return type",
						operation.nickname, mediaTypes);
				operation.returnType = null;
				responseGeneric = true;
			}
		}

		// store method and status for micronaut

		var extensions = operation.vendorExtensions;
		extensions.put("httpMethod", httpMethod.toUpperCase().charAt(0) + httpMethod.substring(1).toLowerCase());
		extensions.put("generic", responseGeneric);
		if (responses.size() == 1) {
			extensions.put("status", HttpStatus.valueOf(responsesCodes.get(0)).name());
		}
		operation.responses.forEach(r -> extensions.put("has" + r.code, true));

		// jwt provider for tests

		var hasSecurityJwt = (boolean) operation.vendorExtensions.getOrDefault("has401", false);
		if (generateApiTests && hasSecurityJwt) {
			addSupportingFile(testFolder, invokerPackage, "JwtProvider");
			addSupportingFile(testFolder, invokerPackage, "JwtBuilder");
		}

		// async

		if (supportAsync) {
			var isVoid = operation.returnType == null;
			var isStream = Optional.ofNullable(source.getResponses().get("200"))
					.map(ApiResponse::getContent)
					.filter(content -> content.containsKey(MediaType.APPLICATION_JSON_STREAM))
					.isPresent();
			extensions.put("asyncContainer", typeMapping.get("asyncSingle"));
			extensions.put("asyncStream", isStream);
			if (!responseGeneric) {
				if (isVoid) {
					var asyncCompletable = typeMapping.get("asyncCompletable");
					if ("reactor.core.publisher.Mono".equals(asyncCompletable)) {
						extensions.put("asyncContainer", asyncCompletable + "<" + java.lang.Void.class.getName() + ">");
					} else {
						extensions.put("asyncContainer", asyncCompletable);
					}
				} else if ((boolean) operation.vendorExtensions.getOrDefault("has404", false)) {
					extensions.put("asyncContainer", typeMapping.get("asyncMaybe"));
				}
			}
			if (isStream) {
				extensions.put("asyncContainer", typeMapping.get("asyncFlowable"));
			}
		}

		// add upper case operationId for path constants

		operation.vendorExtensions.put("operationIdUpperCase",
				StringUtils.underscore(operation.nickname).toUpperCase());

		operation.pathParams.stream().filter(p -> p.defaultValue != null).forEach(p -> {
			LOG.warn("operation {} has path param {} with unsupported default value {}, default removed",
					operation.nickname, p.baseName, p.defaultValue);
			p.defaultValue = null;
		});

		// for handle client/server specific path

		var clientPath = operation.path;
		var queryParamsWithArray = operation.queryParams.stream().filter(p -> p.isArray).collect(Collectors.toList());
		if (!queryParamsWithArray.isEmpty()) {
			clientPath = operation.path + "?"
					+ queryParamsWithArray.stream().map(p -> "{&" + p.baseName + "*}").collect(Collectors.joining());
		}
		extensions.put("clientPath", clientPath);

		// for handle client/server specific path

		var serverPath = operation.path;
		for (var pathParam : operation.pathParams) {
			var name = pathParam.baseName;
			if (pathParam.isBoolean) {
				serverPath = serverPath.replace("{" + name + "}", "{" + name + ":true|false}");
			} else if (pathParam.isInteger || pathParam.isLong) {
				serverPath = serverPath.replace("{" + name + "}", "{" + name + ":\\\\-?[0-9]+}");
			} else if (pathParam.isUuid) {
				serverPath = serverPath.replace("{" + name + "}", "{" + name + ":" + UUID_PATTERN + "}");
			} else if (pathParam.maxLength != null) {
				serverPath = serverPath.replace("{" + name + "}", "{" + name + ":" + pathParam.maxLength + "}");
			} else if (pathParam.pattern != null && !pathParam.pattern.contains("{")) {
				serverPath = serverPath.replace("{" + name + "}", "{" + name + ":" + pathParam.pattern + "}");
			}
		}
		extensions.put("serverPath", serverPath);

		return operation;
	}

	@Override
	public CodegenResponse fromResponse(String responseCode, ApiResponse response) {
		var codegenResponse = super.fromResponse(responseCode, response);

		// save responses with multiple content types
		// see https://github.com/OpenAPITools/openapi-generator/issues/6708

		codegenResponse.vendorExtensions.put(ApiResponse.class.getName(), response);
		return codegenResponse;
	}

	@Override
	public Map<String, ModelsMap> updateAllModels(Map<String, ModelsMap> objs) {
		var superObjs = super.updateAllModels(objs);

		// remove AllOf

		objs.entrySet().removeIf(e -> e.getKey().endsWith("_allOf"));

		Map<String, CodegenModel> allModels = getAllModels(objs);
		for (CodegenModel model : allModels.values()) {
			// check if composed schemas for additional properties should be handled and apply to the map if so.
			if (supportsAdditionalPropertiesWithComposedSchema && model.getAdditionalProperties() != null) {
				model.getVendorExtensions()
						.put("additionalPropertiesMap",
								Map.of("keyType", "java.lang.String",
										"valueType", model.getAdditionalProperties().getDataType()));
			}

			// handle discriminator

			var discriminator = model.discriminator;
			if (discriminator == null) {
				continue;
			}

			// remove discriminator type

			model.vars.stream()
					.filter(property -> property.getName().equals(discriminator.getPropertyName()))
					.findAny().ifPresent(property -> {
						discriminator.setPropertyType(property.getDataType());
						model.vars.remove(property);
					});

			// add discriminator value to submodel

			for (var mappedModel : discriminator.getMappedModels()) {

				var subModel = allModels.get(mappedModel.getModelName());
				if (subModel == null) {
					LOG.warn("{} - model in discriminator {} with name {} not found",
							model.name, discriminator.getPropertyName(), mappedModel.getModelName());
					continue;
				}
				if (subModel.parentModel == null) {
					subModel.parentModel = model;
					subModel.parent = model.getClassname();
					LOG.warn("{} added missing sub model {}", model.name, subModel.name);
				}
				subModel.vars.removeIf(property -> property.getName().equals(discriminator.getPropertyName()));

				Map<String, Object> extensions = subModel.getVendorExtensions();
				extensions.put("discriminatorPropertyGetter", discriminator.getPropertyGetter());
				extensions.put("discriminatorPropertyType", discriminator.getPropertyType());
				switch (discriminator.getPropertyType()) {
					case "java.lang.String":
						extensions.put("discriminatorPropertyValue", '"' + mappedModel.getMappingName() + '"');
						break;
					case "java.lang.Long":
					case "java.lang.Integer":
					case "java.lang.Double":
					case "java.lang.Float":
						extensions.put("discriminatorPropertyValue", mappedModel.getMappingName());
						break;
					default:
						extensions.put("discriminatorPropertyValue", discriminator.getPropertyType() + "."
								+ toEnumVarName(mappedModel.getMappingName(), ""));
				}
			}
		}

		return superObjs;
	}

	@Override
	public void postProcessParameter(CodegenParameter parameter) {
		if (parameter.isFormParam && parameter.isFile) {
			parameter.dataType = typeMapping.get(supportAsync ? "asyncFileUpload" : "fileUpload");
		}
		if (dateTimeRelaxed && (parameter.isDate || parameter.isDateTime)) {
			addSupportingFile(sourceFolder, invokerPackage, "TimeTypeConverterRegistrar");
		}
	}

	@Override
	public void postProcessModelProperty(CodegenModel model, CodegenProperty property) {
		super.postProcessModelProperty(model, property);

		if (openApiNullable && Boolean.FALSE.equals(property.required) && Boolean.TRUE.equals(property.isNullable)) {
			property.getVendorExtensions().put("x-jackson-nullable", true);
		}
	}

	@Override
	public boolean isDataTypeString(String dataType) {
		return List.of(String.class.getSimpleName(), String.class.getName()).contains(dataType);
	}

	// enum

	@Override
	public String toEnumName(CodegenProperty property) {
		return property.nameInCamelCase;
	}

	@Override
	public String toEnumVarName(String value, String datatype) {
		return super.toEnumVarName(value, datatype.replace("java.lang.", ""));
	}

	@Override
	public String toEnumValue(String value, String datatype) {
		if (List.of("int", Integer.class.getSimpleName(), Integer.class.getName()).contains(datatype)) {
			return value;
		}
		if (List.of("long", Long.class.getSimpleName(), Long.class.getName()).contains(datatype)) {
			return value + "L";
		}
		if (List.of("float", Float.class.getSimpleName(), Float.class.getName()).contains(datatype)) {
			return value + "F";
		}
		if (List.of("double", Double.class.getSimpleName(), Double.class.getName()).contains(datatype)) {
			return value + "D";
		}
		return super.toEnumValue(value, datatype);
	}

	// setter

	@Override
	public void setUseBeanValidation(boolean useBeanValidation) {
		this.useBeanValidation = useBeanValidation;
	}

	@Override
	public void setUseGenericResponse(boolean useGenericResponse) {
		this.useGenericResponse = useGenericResponse;
	}

	@Override
	public void setUseOptional(boolean useOptional) {
		this.useOptional = useOptional;
	}

	@Override
	public String toDefaultValue(Schema schema) {
		if (ModelUtils.isGenerateAliasAsModel() && schema.get$ref() != null) {
			return "new " + getSchemaType(schema) + "()";
		}
		return super.toDefaultValue(schema);
	}

	// internal

	private void addSupportingFile(String folder, String packageString, String file) {
		var templateFile = "support/" + file + ".mustache";
		var destinationFilename = folder + "/" + packageString.replace(".", "/") + "/" + file + ".java";
		var supportingFile = new SupportingFile(templateFile, destinationFilename);
		if (!supportingFiles.contains(supportingFile)) {
			supportingFiles.add(supportingFile);
		}
	}
}
