package org.openapitools.codegen.languages;

import static org.openapitools.codegen.CodegenConstants.GENERATE_API_TESTS;
import static org.openapitools.codegen.CodegenConstants.MODEL_NAME_SUFFIX;
import static org.openapitools.codegen.CodegenConstants.SOURCE_FOLDER;
import static org.openapitools.codegen.CodegenConstants.SOURCE_FOLDER_DESC;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
import org.openapitools.codegen.model.ModelMap;
import org.openapitools.codegen.model.ModelsMap;
import org.openapitools.codegen.utils.ModelUtils;
import org.openapitools.codegen.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.media.ArraySchema;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.servers.Server;

public class MicronautCodegen extends AbstractJavaCodegen
		implements BeanValidationFeatures, UseGenericResponseFeatures, OptionalFeatures {

	public static final String CLIENT_ID = "clientId";
	public static final String SERDEABLE = "serdeable";
	public static final String DATETIME_RELAXED = "dateTimeRelaxed";
	public static final String PAGEABLE = "pageable";
	public static final String RECORD = "record";
	public static final String GENERATE_AUTHENTICATION = "generateAuthentication";
	public static final String GENERATE_EXAMPLES = "generateExamples";
	public static final String GENERATE_CONSTANTS = "generateConstants";
	public static final String SEALED = "sealed";
	public static final String REMOVE_ENUM_VALUE_PREFIX = "removeEnumValuePrefix";

	// '{' or '}' is not allowed according to https://datatracker.ietf.org/doc/html/rfc6570#section-3.2
	// so the RegExp needs to work around and be very verbose as quantifiers cannot be used.
	private static final String UUID_PATTERN = """
			[a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9]\
			-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]\
			-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]\
			-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]\
			-[a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9]""";
	private static final Logger LOG = LoggerFactory.getLogger(MicronautCodegen.class);

	private boolean generateApiTests = true;
	private boolean generateAuthentication = false;
	private boolean generateExamples = false;
	private boolean generateConstants = false;
	private boolean useBeanValidation = true;
	private boolean useGenericResponse = true;
	private boolean useOptional = true;
	private boolean serdeable = true;
	private boolean dateTimeRelaxed = true;
	private boolean record = false;
	private boolean pageable = false;
	private boolean sealed = true;
	private boolean removeEnumValuePrefix = true;

	public MicronautCodegen() {

		// enable the supported default-codegen features

		supportsAdditionalPropertiesWithComposedSchema = true;
		useOneOfInterfaces = true;

		cliOptions.clear();
		cliOptions.add(CliOption.newBoolean(USE_BEANVALIDATION, "Use bean validation annotations", useBeanValidation));
		cliOptions.add(CliOption.newBoolean(USE_GENERIC_RESPONSE, "Use generic response", useGenericResponse));
		cliOptions.add(CliOption.newBoolean(USE_OPTIONAL, "Use Optional<T> instead of @Nullable.", useOptional));
		cliOptions.add(CliOption.newBoolean(SERDEABLE, "Add @Serdeable to models", serdeable));
		cliOptions.add(CliOption.newBoolean(SUPPORT_ASYNC, "Use async responses", supportAsync));
		cliOptions.add(CliOption.newBoolean(DATETIME_RELAXED, "Relaxed parsing of datetimes.", dateTimeRelaxed));
		cliOptions.add(CliOption.newBoolean(PAGEABLE, "Generate provider for pageable (mironaut-data).", pageable));
		cliOptions.add(CliOption.newBoolean(SEALED, "Seal interfaces.", sealed));
		cliOptions.add(CliOption.newBoolean(RECORD, "Generate records instead of pojos.", record));
		cliOptions.add(CliOption.newBoolean(OPENAPI_NULLABLE, "Enable OpenAPI Jackson Nullable", openApiNullable));
		cliOptions.add(CliOption.newBoolean(GENERATE_AUTHENTICATION,
				"Generate authentication into apis with return code 401.", generateAuthentication));
		cliOptions.add(CliOption.newBoolean(GENERATE_EXAMPLES, "Generate examples for tests.", generateExamples));
		cliOptions.add(CliOption.newBoolean(GENERATE_CONSTANTS, "Generate model/api constants.", generateConstants));
		cliOptions.add(CliOption.newString(CLIENT_ID, "ClientId to use."));
		cliOptions.add(CliOption.newString(SOURCE_FOLDER, SOURCE_FOLDER_DESC));
		cliOptions.add(CliOption.newString("testFolder", "test folder for generated code"));
		cliOptions.add(CliOption.newBoolean(REMOVE_ENUM_VALUE_PREFIX, "Remove value prefix", removeEnumValuePrefix));

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
		additionalProperties.put(SERDEABLE, serdeable);
		additionalProperties.put(PAGEABLE, pageable);
		additionalProperties.put(GENERATE_AUTHENTICATION, generateAuthentication);
		additionalProperties.put(GENERATE_EXAMPLES, generateExamples);
		additionalProperties.put(GENERATE_CONSTANTS, generateConstants);
		additionalProperties.put(SEALED, sealed);
		additionalProperties.put(RECORD, record);
		additionalProperties.put(REMOVE_ENUM_VALUE_PREFIX, removeEnumValuePrefix);
		additionalProperties.put("curly", "{");

		// add custom type mappings

		typeMapping.clear();
		typeMapping.put("object", "java.lang.Object");
		typeMapping.put("AnyType", "java.lang.Object");
		typeMapping.put("date", "java.time.LocalDate");
		typeMapping.put("DateTime", "java.time.Instant");
		typeMapping.put("array", "java.util.List");
		typeMapping.put("map", "java.util.Map");
		typeMapping.put("set", "java.util.Set");
		typeMapping.put("boolean", "java.lang.Boolean");
		typeMapping.put("string", "java.lang.String");
		typeMapping.put("int", "java.lang.Integer");
		typeMapping.put("integer", "java.lang.Integer");
		typeMapping.put("Integer", "java.lang.Integer");
		typeMapping.put("long", "java.lang.Long");
		typeMapping.put("Long", "java.lang.Long");
		typeMapping.put("float", "java.lang.Float");
		typeMapping.put("Float", "java.lang.Float");
		typeMapping.put("double", "java.lang.Double");
		typeMapping.put("Double", "java.lang.Double");
		typeMapping.put("number", "java.lang.Double");
		typeMapping.put("BigDecimal", "java.lang.Double");
		typeMapping.put("UUID", "java.util.UUID");
		typeMapping.put("URI", "java.net.URI");
		typeMapping.put("URL", "java.net.URL");
		typeMapping.put("file", "byte[]");
		typeMapping.put("ByteArray", "byte[]");
		typeMapping.put("Authentication", "io.micronaut.security.authentication.Authentication");
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
		instantiationTypes.put("array", "java.util.ArrayList");
		instantiationTypes.put("map", "java.util.HashMap");
		instantiationTypes.put("set", "java.util.LinkedHashSet");
		importMapping.clear();

		// allow list and file as variables

		reservedWords.remove("file");
		reservedWords.remove("list");
		reservedWords.add("authentication");
	}

	@Override
	public String getName() {
		return "micronaut";
	}

	@Override
	public void postProcess() {}

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
		if (additionalProperties.containsKey(SERDEABLE)) {
			serdeable = convertPropertyToBooleanAndWriteBack(SERDEABLE);
		}
		if (additionalProperties.containsKey(DATETIME_RELAXED)) {
			dateTimeRelaxed = convertPropertyToBooleanAndWriteBack(DATETIME_RELAXED);
		}
		if (additionalProperties.containsKey(PAGEABLE)) {
			pageable = convertPropertyToBooleanAndWriteBack(PAGEABLE);
		}
		if (additionalProperties.containsKey(SEALED)) {
			sealed = convertPropertyToBooleanAndWriteBack(SEALED);
		}
		if (additionalProperties.containsKey(RECORD)) {
			record = convertPropertyToBooleanAndWriteBack(RECORD);
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
		if (additionalProperties.containsKey(GENERATE_AUTHENTICATION)) {
			generateAuthentication = convertPropertyToBooleanAndWriteBack(GENERATE_AUTHENTICATION);
		}
		if (additionalProperties.containsKey(GENERATE_EXAMPLES)) {
			generateExamples = convertPropertyToBooleanAndWriteBack(GENERATE_EXAMPLES);
		}
		if (additionalProperties.containsKey(GENERATE_CONSTANTS)) {
			generateConstants = convertPropertyToBooleanAndWriteBack(GENERATE_CONSTANTS);
		}
		if (additionalProperties.containsKey(REMOVE_ENUM_VALUE_PREFIX)) {
			removeEnumValuePrefix = convertPropertyToBooleanAndWriteBack(REMOVE_ENUM_VALUE_PREFIX);
		}

		// we do not generate projects, only api, set source and test folder

		templateDir = "Micronaut";
		projectFolder = getOrDefault.apply("projectFolder", "generated-sources");
		projectTestFolder = getOrDefault.apply("projectTestFolder", "generated-test-sources");
		sourceFolder = getOrDefault.apply(SOURCE_FOLDER, projectFolder + File.separator + "openapi");
		testFolder = getOrDefault.apply("testFolder", projectTestFolder + File.separator + "openapi");
		modelNameSuffix = getOrDefault.apply(MODEL_NAME_SUFFIX, modelNameSuffix);

		// add files to generate

		if (additionalProperties.containsKey(CLIENT_ID)) {
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
		if (generateExamples) {
			modelTestTemplateFiles.put("testExampleObject.mustache", "Example.java");
		}

		// add type mappings for mustache

		additionalProperties.put("type.Authentication", typeMapping.get("Authentication"));
		additionalProperties.put("type.Nullable", typeMapping.get("Nullable"));
		additionalProperties.put("type.Nonnull", typeMapping.get("Nonnull"));
		additionalProperties.put("type.Inject", typeMapping.get("Inject"));
		additionalProperties.put("type.Singleton", typeMapping.get("Singleton"));
		additionalProperties.put("type.MultipartBody", typeMapping.get("MultipartBody"));
		instantiationTypes.forEach((k, v) -> additionalProperties.put("instantiationType." + k, v));
		Optional.ofNullable(typeMapping.get("Generated"))
				.filter(type -> !type.isBlank())
				.ifPresent(type -> additionalProperties.put("type.Generated", type));
	}

	@Override
	public CodegenOperation fromOperation(String path, String httpMethod, Operation source, List<Server> servers) {

		var operation = super.fromOperation(path, httpMethod, source, servers);
		var produces = operation.produces == null ? List.<Map<String, String>>of() : operation.produces;

		// warn if operation has wildcard/range responses

		if (operation.responses.stream().allMatch(CodegenResponse::isWildcard)) {
			throw new SpecValidationException("Only default response is not supported.");
		}
		if (operation.responses.stream().anyMatch(CodegenResponse::isRange)) {
			throw new SpecValidationException("Range responses are not supported.");
		}

		// get responses for considering repsonse type

		var responses = operation.responses.stream().filter(r -> r.is2xx || r.is3xx).toList();
		var responsesCodes = responses.stream().map(r -> Integer.parseInt(r.code)).toList();
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
						extensions.put("asyncContainer", asyncCompletable + "<java.lang.Void>");
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
		var queryParamsWithArray = operation.queryParams.stream().filter(p -> p.isArray).toList();
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

		// helper for mustache: has any non form param this is required

		extensions.put("hasOtherThanMultipart",
				operation.allParams.stream().anyMatch(p -> !p.isFormParam && !p.required));

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

		var allModels = getAllModels(objs);
		for (CodegenModel model : allModels.values()) {

			// check if composed schemas for additional properties should be handled and apply to the map if so.

			if (supportsAdditionalPropertiesWithComposedSchema && model.getAdditionalProperties() != null) {
				model.getVendorExtensions().put("additionalPropertiesMap", Map.of(
						"keyType", "java.lang.String",
						"valueType", model.getAdditionalProperties().getDataType()));
			}

			// oneOf handling

			if (model.oneOf != null && !model.oneOf.isEmpty()) {
				model.children = model.oneOf.stream().map(allModels::get).collect(Collectors.toList());
				model.hasChildren = true;
				model.interfaceModels.removeAll(model.children);
				for (var child : model.children) {
					if (child.interfaceModels == null) {
						child.interfaceModels = new ArrayList<>();
					}
					child.interfaceModels.add(model);
				}
				model.allVars = new ArrayList<>();
				model.vars = new ArrayList<>();
				model.hasVars = false;
			}

			// model all parents as interfaces

			model.parent = null;
			model.parentModel = null;
			model.parentSchema = null;
			model.parentVars = List.of();
			model.allParents = List.of();
			if (model.interfaceModels != null) {
				for (var interfaceModel : model.interfaceModels) {

					// add missing children
					if (interfaceModel.children == null) {
						interfaceModel.children = new ArrayList<>();
					}
					if (!interfaceModel.children.contains(model)) {
						LOG.debug("Add model " + model.name + " as children to " + interfaceModel.name + ".");
						interfaceModel.children.add(model);
						interfaceModel.hasChildren = true;
					}

					// strip parent vars from vars
					model.vars.removeIf(property -> {
						var remove = interfaceModel.allVars.stream()
								.map(CodegenProperty::getBaseName)
								.anyMatch(property.getBaseName()::equals);
						if (remove) {
							LOG.debug("Remove property " + property.getBaseName() + " from " + model.name
									+ " because already present on " + interfaceModel.name + ".");
						}
						return remove;
					});
				}
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
				subModel.vars.removeIf(property -> property.getName().equals(discriminator.getPropertyName()));
				subModel.allVars.removeIf(property -> property.getName().equals(discriminator.getPropertyName()));

				var extensions = subModel.vendorExtensions;
				extensions.put("discriminatorPropertyGetter", discriminator.getPropertyGetter());
				extensions.put("discriminatorPropertyName", discriminator.getPropertyName());
				extensions.put("discriminatorPropertyType", discriminator.getPropertyType());
				extensions.put("discriminatorPropertyValue", switch (discriminator.getPropertyType()) {
					case "java.lang.String" -> '"' + mappedModel.getMappingName() + '"';
					case "java.lang.Long", "java.lang.Integer" -> mappedModel.getMappingName();
					case "java.lang.Double", "java.lang.Float" -> mappedModel.getMappingName();
					default -> discriminator.getPropertyType() + "." + toEnumVarName(mappedModel.getMappingName(), "");
				});
			}
		}

		// add default classes

		for (var model : allModels.values()) {
			if (model.hasChildren && model.discriminator == null && model.oneOf.isEmpty()) {

				var suffix = "Default";
				var copy = copy(model);
				copy.name = model.name + suffix + modelNameSuffix;
				copy.classname = model.name + suffix + modelNameSuffix;
				copy.classFilename = model.name + suffix + modelNameSuffix;
				copy.children = null;
				copy.hasChildren = false;
				copy.interfaces = List.of(model.name + modelNameSuffix);
				copy.interfaceModels = List.of(model);
				copy.vars = List.of();

				var obj = new ModelsMap();
				obj.putAll(superObjs.get(model.name));
				obj.put("classname", copy.classname);
				obj.setModels(List.of(new ModelMap(Map.of("model", copy))));
				superObjs.put(model.name + "Default", obj);

				// add as children for sealed classes
				model.children.add(copy);
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
		if (parameter.isArray
				&& parameter.items.allowableValues != null
				&& !parameter.items.allowableValues.isEmpty()) {
			parameter.dataType = parameter.datatypeWithEnum = parameter.dataType.replace("@jakarta.validation.Valid ",
					"");
		}
		parameter.vendorExtensions.put("x-datatype-without-validation", removeValidation(parameter.dataType));
	}

	@Override
	public void postProcessResponseWithProperty(CodegenResponse response, CodegenProperty property) {
		if (property != null && property.dataType != null && property.dataType.contains("@jakarta.validation")) {
			property.dataType = removeValidation(property.dataType);
		}
		if (response != null && response.dataType != null && response.dataType.contains("@jakarta.validation")) {
			response.dataType = removeValidation(response.dataType);
		}
	}

	@Override
	public void postProcessModelProperty(CodegenModel model, CodegenProperty property) {
		super.postProcessModelProperty(model, property);

		if (openApiNullable && !property.required && property.isNullable) {
			property.getVendorExtensions().put("x-jackson-nullable", true);
		}
		if (property.isArray && property.items.allowableValues != null && !property.items.allowableValues.isEmpty()) {
			property.dataType = property.datatypeWithEnum = property.dataType.replace("@jakarta.validation.Valid ", "");
		}
	}

	@Override
	public boolean isDataTypeString(String dataType) {
		return "java.lang.String".equals(dataType) || "String".equals(dataType);
	}

	@Override
	public String getTypeDeclaration(@SuppressWarnings("rawtypes") Schema p) {
		var schema = unaliasSchema(p);
		var target = ModelUtils.isGenerateAliasAsModel() ? p : schema;
		if (useBeanValidation && ModelUtils.isArraySchema(target)) {
			var items = unaliasSchema(getSchemaItems((ArraySchema) target));
			var itemType = getTypeDeclaration(items);
			var annotations = getBeanValidation(items).stream().map(n -> n + " ").collect(Collectors.joining());
			var index = itemType.lastIndexOf(".");
			return getSchemaType(target) + "<" + (index == -1 ? annotations + itemType
					: (itemType.substring(0, index + 1) + annotations + itemType.substring(index + 1))) + ">";
		}
		return super.getTypeDeclaration(p);
	}

	@Override
	public String toDefaultValue(CodegenProperty property, @SuppressWarnings("rawtypes") Schema schema) {
		if (ModelUtils.isGenerateAliasAsModel() && schema.get$ref() != null) {
			return "new " + getSchemaType(schema) + "()";
		}
		return super.toDefaultValue(property, schema);
	}

	@Override
	public String toDefaultValue(@SuppressWarnings("rawtypes") Schema schema) {
		if (ModelUtils.isGenerateAliasAsModel() && schema.get$ref() != null) {
			return "new " + getSchemaType(schema) + "()";
		}
		return super.toDefaultValue(schema);
	}

	@Override
	public String toExampleValue(@SuppressWarnings("rawtypes") Schema schema) {

		// first choice: use the example, provided from the spec
		// second choice: use the default provided by the spec
		// special handling for enum: if no example or default is provided, use the first value
		@SuppressWarnings("unchecked")
		Optional<String> value = Optional
				.ofNullable(schema.getExample())
				.or(() -> Optional.ofNullable(schema.getDefault()))
				.or(() -> Optional.ofNullable(schema.getEnum()).flatMap(e -> e.stream().findFirst()))
				.map(Object::toString);

		// third choice: set type-specific default examples

		if (ModelUtils.isBooleanSchema(schema)) {
			return value.orElse("false");
		}
		if (ModelUtils.isLongSchema(schema)) {
			return value.orElse("100L") + "L";
		}
		if (ModelUtils.isFloatSchema(schema)) {
			return value.orElse("12.34") + "F";
		}
		if (ModelUtils.isDoubleSchema(schema)) {
			return value.orElse("43.21") + "D";
		}
		if (ModelUtils.isIntegerSchema(schema) || ModelUtils.isShortSchema(schema)) {
			return value.orElse("12");
		}
		if (ModelUtils.isNumberSchema(schema)) {
			return value.map(v -> "java.lang.Number.valueOf(\"" + v + "\")").orElse("12.34");
		}

		if (ModelUtils.isDateSchema(schema)) {
			if ("java.time.LocalDate".equals(typeMapping.get(schema.getType()))) {
				return "java.time.LocalDate." + value.map(v -> "parse(\"" + v + "\")").orElse("now()");
			}
			// we cannot provide a valid example for all possible date types
			return "null";
		}
		if (ModelUtils.isDateTimeSchema(schema)) {
			if ("java.time.Instant".equals(typeMapping.get(schema.getType()))) {
				return "java.time.Instant." + value.map(v -> "parse(\"" + v + "\")").orElse("now()");
			}
			// we cannot provide a valid example for all possible date types
			return "null";
		}
		if (ModelUtils.isByteArraySchema(schema) || ModelUtils.isBinarySchema(schema)) {
			return value.orElse("\"byteArray\".getBytes()");
		}
		if (ModelUtils.isFileSchema(schema)) {
			return value.orElse("\"myFile\".getBytes()");
		}
		if (ModelUtils.isUUIDSchema(schema)) {
			return "java.util.UUID." + value.map(v -> "fromString(\"" + v + "\")").orElse("randomUUID()");
		}
		if (ModelUtils.isURISchema(schema)) {
			return "java.net.URI.create(\"" + value.orElse("my:uri") + "\")";
		}
		if (ModelUtils.isEmailSchema(schema)) {
			return '"' + value.orElse("mail@example.org") + '"';
		}
		if (ModelUtils.isStringSchema(schema)) {
			return '"' + value.orElse("string") + '"';
		}

		if (ModelUtils.isMapSchema(schema)) {
			return "java.util.Map." + value
					.map(v -> (Map<?, ?>) new org.yaml.snakeyaml.Yaml().loadAs(v, Map.class))
					.filter(map -> !map.isEmpty())
					.map(map -> map.entrySet().stream()
							.map(e -> "new java.util.AbstractMap.SimpleEntry(\""
									+ e.getKey() + "\", \"" + e.getValue() + "\")")
							.collect(Collectors.joining(", ")))
					.map(map -> "ofEntries(" + map + ")")
					.orElse("of()");
		}
		if (ModelUtils.isSet(schema)) {
			return "java.util.Set.of(" + value.map(v -> v.substring(1, v.length() - 1)).orElse("") + ")";
		}
		if (ModelUtils.isArraySchema(schema)) {
			return "java.util.List.of(" + value.map(v -> v.substring(1, v.length() - 1)).orElse("") + ")";
		}

		// if no example can be generated, leave it null.
		return "null";
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
		if (List.of("int", "Integer", "java.lang.Integer").contains(datatype)) {
			return value;
		}
		if (List.of("long", "Long", "java.lang.Long").contains(datatype)) {
			return value + "L";
		}
		if (List.of("float", "Float", "java.lang.Float").contains(datatype)) {
			return value + "F";
		}
		if (List.of("double", "Double", "java.lang.Double").contains(datatype)) {
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

	// internal

	private void addSupportingFile(String folder, String packageString, String file) {
		var templateFile = "support/" + file + ".mustache";
		var destinationFilename = folder + "/" + packageString.replace(".", "/") + "/" + file + ".java";
		var supportingFile = new SupportingFile(templateFile, destinationFilename);
		if (!supportingFiles.contains(supportingFile)) {
			supportingFiles.add(supportingFile);
		}
	}

	private CodegenModel copy(CodegenModel model) {
		var copy = new CodegenModel();

		copy.additionalPropertiesType = model.additionalPropertiesType;
		copy.allMandatory = model.allMandatory == null ? null : new HashSet<>(model.allMandatory);
		copy.allOf = model.allOf == null ? null : new HashSet<>(model.allOf);
		copy.allowableValues = model.allowableValues == null ? null : Map.copyOf(model.allowableValues);
		copy.allParents = model.allParents == null ? null : new ArrayList<>(model.allParents);
		copy.allVars = model.allVars == null ? null : new ArrayList<>(model.allVars);
		copy.anyOf = model.anyOf == null ? null : new HashSet<>(model.anyOf);
		copy.arrayModelType = model.arrayModelType;
		copy.children = model.children == null ? null : new ArrayList<>(model.children);
		copy.classFilename = model.classFilename;
		copy.classname = model.classname;
		copy.classVarName = model.classVarName;
		copy.dataType = model.dataType;
		copy.defaultValue = model.defaultValue;
		copy.description = model.description;
		copy.discriminator = model.discriminator;
		copy.emptyVars = model.emptyVars;
		copy.externalDocumentation = model.externalDocumentation;
		copy.hasChildren = model.hasChildren;
		copy.hasEnums = model.hasEnums;
		copy.hasMoreModels = model.hasMoreModels;
		copy.hasOnlyReadOnly = model.hasOnlyReadOnly;
		copy.hasOptional = model.hasOptional;
		copy.hasRequired = model.hasRequired;
		copy.hasValidation = model.hasValidation;
		copy.hasVars = model.hasVars;
		copy.imports = model.imports == null ? null : new HashSet<>(model.imports);
		copy.interfaceModels = model.interfaceModels == null ? null : new ArrayList<>(model.interfaceModels);
		copy.interfaces = model.interfaces == null ? null : new ArrayList<>(model.interfaces);
		copy.isAdditionalPropertiesTrue = model.isAdditionalPropertiesTrue;
		copy.isAlias = model.isAdditionalPropertiesTrue;
		copy.isArray = model.isAdditionalPropertiesTrue;
		copy.isBoolean = model.isAdditionalPropertiesTrue;
		copy.isDate = model.isAdditionalPropertiesTrue;
		copy.isDateTime = model.isAdditionalPropertiesTrue;
		copy.isDecimal = model.isAdditionalPropertiesTrue;
		copy.isDeprecated = model.isAdditionalPropertiesTrue;
		copy.isDouble = model.isAdditionalPropertiesTrue;
		copy.isEnum = model.isAdditionalPropertiesTrue;
		copy.isFloat = model.isAdditionalPropertiesTrue;
		copy.isInteger = model.isAdditionalPropertiesTrue;
		copy.isLong = model.isAdditionalPropertiesTrue;
		copy.isMap = model.isAdditionalPropertiesTrue;
		copy.isNull = model.isAdditionalPropertiesTrue;
		copy.isNullable = model.isAdditionalPropertiesTrue;
		copy.isNumber = model.isAdditionalPropertiesTrue;
		copy.isNumeric = model.isAdditionalPropertiesTrue;
		copy.isPrimitiveType = model.isAdditionalPropertiesTrue;
		copy.isShort = model.isAdditionalPropertiesTrue;
		copy.isString = model.isAdditionalPropertiesTrue;
		copy.isUnboundedInteger = model.isAdditionalPropertiesTrue;
		copy.isVoid = model.isAdditionalPropertiesTrue;
		copy.mandatory = model.mandatory;
		copy.modelJson = model.modelJson;
		copy.name = model.name;
		copy.nonNullableVars = model.nonNullableVars == null ? null : new ArrayList<>(model.nonNullableVars);
		copy.oneOf = model.oneOf == null ? null : new HashSet<>(model.oneOf);
		copy.optionalVars = model.optionalVars == null ? null : new ArrayList<>(model.optionalVars);
		copy.parent = model.parent;
		copy.parentModel = model.parentModel;
		copy.parentRequiredVars = model.parentRequiredVars == null ? null : new ArrayList<>(model.parentRequiredVars);
		copy.parentSchema = model.parentSchema;
		copy.parentVars = model.parentVars == null ? null : new ArrayList<>(model.parentVars);
		copy.readOnlyVars = model.readOnlyVars == null ? null : new ArrayList<>(model.readOnlyVars);
		copy.readWriteVars = model.readWriteVars == null ? null : new ArrayList<>(model.readWriteVars);
		copy.requiredVars = model.requiredVars == null ? null : new ArrayList<>(model.requiredVars);
		copy.testCases = model.testCases == null ? null : new HashMap<>(model.testCases);
		copy.title = model.title;
		copy.unescapedDescription = model.unescapedDescription;
		copy.vars = model.vars == null ? null : new ArrayList<>(model.vars);
		copy.vendorExtensions = model.vendorExtensions == null ? null : new HashMap<>(model.vendorExtensions);
		copy.xmlName = model.xmlName;
		copy.xmlNamespace = model.xmlNamespace;
		copy.xmlPrefix = model.xmlPrefix;

		copy.setIsAnyType(model.getIsAnyType());
		copy.setIsModel(model.getIsModel());
		copy.setIsUuid(model.getIsUuid());

		return copy;
	}

	private List<String> getBeanValidation(Schema<?> schema) {
		var annotations = new ArrayList<String>();
		if (!ModelUtils.isNullable(schema)) {
			annotations.add("@jakarta.validation.constraints.NotNull");
		}
		if (ModelUtils.isStringSchema(schema)
				&& !ModelUtils.isByteArraySchema(schema)
				&& !ModelUtils.isBinarySchema(schema)) {
			if (schema.getPattern() != null && !schema.getPattern().isBlank()) {
				annotations.add("@jakarta.validation.constraints.Pattern("
						+ "regexp = \"" + schema.getPattern().replace("\\", "\\\\") + "\")");
			}
			if (ModelUtils.isEmailSchema(schema)) {
				annotations.add("@jakarta.validation.constraints.Email");
			}
			if (schema.getMinLength() != null && schema.getMaxLength() != null) {
				annotations.add("@jakarta.validation.constraints.Size("
						+ "min = " + schema.getMinLength() + ", "
						+ "max = " + schema.getMaxLength() + ")");
			} else if (schema.getMinLength() != null) {
				annotations.add("@jakarta.validation.constraints.Size(min = " + schema.getMinLength() + ")");
			} else if (schema.getMaxLength() != null) {
				annotations.add("@jakarta.validation.constraints.Size(max = " + schema.getMaxLength() + ")");
			}
		} else if (ModelUtils.isNumberSchema(schema)) {
			if (schema.getMinimum() != null) {
				annotations.add("@jakarta.validation.constraints.DecimalMin("
						+ "value = \"" + schema.getMinimum() + "\", "
						+ "inclusive = " + !Optional.ofNullable(schema.getExclusiveMinimum()).orElse(false) + ")");
			}
			if (schema.getMaximum() != null) {
				annotations.add("@jakarta.validation.constraints.DecimalMax("
						+ "value = \"" + schema.getMaximum() + "\", "
						+ "inclusive = " + !Optional.ofNullable(schema.getExclusiveMaximum()).orElse(false) + ")");
			}
		} else if (ModelUtils.isIntegerSchema(schema)) {
			if (schema.getMinimum() != null) {
				annotations.add("@jakarta.validation.constraints.Min(" + schema.getMinimum().longValue() + ")");
			}
			if (schema.getMaximum() != null) {
				annotations.add("@jakarta.validation.constraints.Max(" + schema.getMaximum().longValue() + ")");
			}
		} else if (ModelUtils.isTypeObjectSchema(schema) || schema.getType() == null) {
			annotations.add("@jakarta.validation.Valid");
		}
		return annotations;
	}

	private String removeValidation(String dataType) {
		var tmp = dataType;
		tmp = tmp.replace("@jakarta.validation.Valid ", "");
		tmp = tmp.replace("@jakarta.validation.constraints.NotNull ", "");
		tmp = tmp.replace("@jakarta.validation.constraints.Email ", "");
		return tmp.replaceAll(
				"@jakarta\\.validation\\.constraints\\.(Pattern|Size|DecimalMin|DecimalMax|Min|Max)\\(.*\\) ", "");
	}
}
