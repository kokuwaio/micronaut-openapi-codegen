package org.openapitools.codegen.languages;

import java.io.File;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.openapitools.codegen.CliOption;
import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.CodegenModel;
import org.openapitools.codegen.CodegenOperation;
import org.openapitools.codegen.CodegenProperty;
import org.openapitools.codegen.SupportingFile;
import org.openapitools.codegen.languages.features.BeanValidationFeatures;
import org.openapitools.codegen.languages.features.UseGenericResponseFeatures;
import org.openapitools.codegen.utils.ModelUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.micronaut.core.util.CollectionUtils;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.media.ComposedSchema;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.servers.Server;

public class MicronautCodegen extends AbstractJavaCodegen
		implements BeanValidationFeatures, UseGenericResponseFeatures {

	public static final String CLIENT_ID = "clientId";
	public static final String INTROSPECTED = "introspected";
	public static final String DATETIME_RELAXED = "dateTimeRelaxed";
	public static final String JACKSON_DATABIND_NULLABLE = "jacksonDatabindNullable";
	public static final String OPTIONALS = "useOptionals";
	public static final Map<String, Class<?>> CUSTOM_FORMATS = Map.of(
			"temporal-amount", TemporalAmount.class,
			"period", Period.class,
			"duration", Duration.class,
			"instant", Instant.class,
			"local-date-time", LocalDateTime.class,
			"offset-date-time", OffsetDateTime.class,
			"zoned-date-time", ZonedDateTime.class,
			"local-time", LocalTime.class,
			"offset-time", OffsetTime.class);

	private static final Logger LOGGER = LoggerFactory.getLogger(MicronautCodegen.class);
	private static final String UUID_PATTERN = StringUtils.repeat("[a-f0-9]", 8)
			+ "-" + StringUtils.repeat("[a-f0-9]", 4) + "-" + StringUtils.repeat("[a-f0-9]", 4)
			+ "-" + StringUtils.repeat("[a-f0-9]", 4) + "-" + StringUtils.repeat("[a-f0-9]", 12);
	private boolean generateApiTests = true;
	private boolean dateTimeRelaxed = true;
	private boolean introspected = true;
	private boolean useBeanValidation = true;
	private boolean useGenericResponse = true;
	private boolean jacksonDatabindNullable = true;
	private boolean useOptionals = true;

	public MicronautCodegen() {

		cliOptions.add(CliOption.newBoolean(
				USE_BEANVALIDATION, "Use BeanValidation API annotations", useBeanValidation));
		cliOptions.add(CliOption.newBoolean(USE_GENERIC_RESPONSE, "Use generic response", useGenericResponse));
		cliOptions.add(CliOption.newBoolean(INTROSPECTED, "Add @Introspected to models", introspected));
		cliOptions.add(CliOption.newBoolean(DATETIME_RELAXED, "Relaxed parsing of datetimes.", dateTimeRelaxed));
		cliOptions.add(CliOption.newBoolean(
				JACKSON_DATABIND_NULLABLE, "Add wrapper from jackson-databind-nullable.", jacksonDatabindNullable));
		cliOptions.add(CliOption.newBoolean(SUPPORT_ASYNC, "Use async responses", supportAsync));
		cliOptions.add(CliOption.newString(CLIENT_ID, "ClientId to use."));
		cliOptions.add(CliOption.newBoolean(OPTIONALS, "use optionals instead of @Nullable."));

		// there is no documentation template yet

		apiDocTemplateFiles.remove("api_doc.mustache");
		apiTestTemplateFiles.remove("api_test.mustache");
		modelDocTemplateFiles.remove("model_doc.mustache");

		// parent flags

		dateLibrary = "do not trigger date type selection";
		additionalProperties.put(INTROSPECTED, introspected);
		additionalProperties.put(DATETIME_RELAXED, dateTimeRelaxed);
		additionalProperties.put(USE_BEANVALIDATION, useBeanValidation);
		additionalProperties.put(USE_GENERIC_RESPONSE, useGenericResponse);
		additionalProperties.put(JACKSON_DATABIND_NULLABLE, jacksonDatabindNullable);
		additionalProperties.put(OPTIONALS, useOptionals);
		additionalProperties.put(CodegenConstants.TEMPLATE_DIR, "Micronaut");

		// add custom type mappings

		typeMapping.put("date", LocalDate.class.getName());
		typeMapping.put("DateTime", Instant.class.getName());
		typeMapping.put("array", List.class.getName());
		typeMapping.put("map", Map.class.getName());
		typeMapping.put("boolean", Boolean.class.getName());
		typeMapping.put("string", String.class.getName());
		typeMapping.put("int", Integer.class.getName());
		typeMapping.put("Integer", Integer.class.getName());
		typeMapping.put("long", Long.class.getName());
		typeMapping.put("float", Float.class.getName());
		typeMapping.put("number", Double.class.getName());
		typeMapping.put("BigDecimal", Double.class.getName());
		typeMapping.put("UUID", UUID.class.getName());
		typeMapping.put("URI", URI.class.getName());
		typeMapping.put("file", "byte[]");
		typeMapping.put("AnyType", Object.class.getName());
		typeMapping.put("asyncCompletable", "io.reactivex.Completable");
		typeMapping.put("asyncSingle", "io.reactivex.Single");
		typeMapping.put("asyncMaybe", "io.reactivex.Maybe");
		typeMapping.put("asyncFlowable", "io.reactivex.Flowable");
		instantiationTypes.put("array", ArrayList.class.getName());
		instantiationTypes.put("map", HashMap.class.getName());
	}

	@Override
	public String getName() {
		return "micronaut";
	}

	@Override
	public void processOpts() {

		// reuse api package if other packages are not provided

		apiPackage = (String) additionalProperties.computeIfAbsent(CodegenConstants.API_PACKAGE, k -> "changeMe");
		modelPackage = (String) additionalProperties.computeIfAbsent(CodegenConstants.MODEL_PACKAGE, k -> apiPackage);
		invokerPackage = (String) additionalProperties.computeIfAbsent(CodegenConstants.INVOKER_PACKAGE,
				k -> apiPackage);

		super.processOpts();

		// process flags

		if (additionalProperties.containsKey(INTROSPECTED)) {
			introspected = convertPropertyToBooleanAndWriteBack(INTROSPECTED);
		}
		if (additionalProperties.containsKey(DATETIME_RELAXED)) {
			dateTimeRelaxed = convertPropertyToBooleanAndWriteBack(DATETIME_RELAXED);
		}
		if (additionalProperties.containsKey(USE_BEANVALIDATION)) {
			useBeanValidation = convertPropertyToBooleanAndWriteBack(USE_BEANVALIDATION);
		}
		if (additionalProperties.containsKey(USE_GENERIC_RESPONSE)) {
			useGenericResponse = convertPropertyToBooleanAndWriteBack(USE_GENERIC_RESPONSE);
		}
		if (additionalProperties.containsKey(JACKSON_DATABIND_NULLABLE)) {
			jacksonDatabindNullable = convertPropertyToBooleanAndWriteBack(JACKSON_DATABIND_NULLABLE);
		}
		if (additionalProperties.containsKey(OPTIONALS)) {
			useOptionals = convertPropertyToBooleanAndWriteBack(OPTIONALS);
		}
		if (additionalProperties.containsKey(CodegenConstants.GENERATE_API_TESTS)) {
			generateApiTests = convertPropertyToBooleanAndWriteBack(CodegenConstants.GENERATE_API_TESTS);
		}

		// we do not generate projects, only api, set source and test folder

		projectFolder = "generated-sources";
		projectTestFolder = "generated-test-sources";
		sourceFolder = projectFolder + File.separator + "openapi";
		testFolder = projectTestFolder + File.separator + "openapi";

		// add files to generate

		if (additionalProperties.containsKey(CLIENT_ID)) {
			apiTemplateFiles.put("api_client.mustache", "Client.java");
		}
		if (generateApiTests) {
			apiTestTemplateFiles.put("test.mustache", "Spec.java");
			apiTestTemplateFiles.put("test_client.mustache", "Client.java");
			addSupportingFile(testFolder, invokerPackage, "HttpResponseAssertions");
		}
		if (dateTimeRelaxed && !openAPI.getPaths().isEmpty()) {
			addSupportingFile(sourceFolder, invokerPackage, "TimeTypeConverterRegistrar");
		}
	}

	@Override
	public CodegenOperation fromOperation(String path, String httpMethod, Operation source, List<Server> servers) {

		var operation = super.fromOperation(path, httpMethod, source, servers);
		var extensions = operation.vendorExtensions;

		// get default response with status

		var response = operation.responses.stream()
				.filter(r -> r.isDefault).findAny()
				.orElse(operation.responses.iterator().next());
		if ("0".equals(response.code)) {
			response.code = response.dataType == null ? "204" : "200";
		}
		var responsesWithBody = operation.responses.stream()
				.filter(r -> Integer.valueOf(r.code) < 400)
				.filter(r -> r.dataType != null)
				.count();
		if (responsesWithBody > 1) {
			operation.returnType = null;
		}

		// remove media type */*

		Optional.ofNullable(operation.produces).ifPresent(p -> p.removeIf(m -> "*/*".equals(m.get("mediaType"))));
		Optional.ofNullable(operation.consumes).ifPresent(c -> c.removeIf(m -> "*/*".equals(m.get("mediaType"))));

		// store method and status for micronaut

		extensions.put("httpMethod", httpMethod.toUpperCase().charAt(0) + httpMethod.substring(1).toLowerCase());
		extensions.put("generic", useGenericResponse || response.hasHeaders || responsesWithBody > 1);
		extensions.put("status", HttpStatus.valueOf(Integer.valueOf(response.code)).name());
		operation.responses.forEach(r -> extensions.put("has" + r.code, true));

		// add pattern to path paramters

		if (CollectionUtils.isNotEmpty(operation.pathParams)) {
			for (var param : operation.pathParams) {
				var name = param.paramName;
				if (param.isUuid) {
					operation.path = operation.path.replace("{" + name + "}", "{" + name + ":" + UUID_PATTERN + "}");
				}
				if (param.isString && param.maxLength != null) {
					operation.path = operation.path.replace("{" + name + "}", "{" + name + ":" + param.maxLength + "}");
				}
				if (param.isInteger) {
					operation.path = operation.path.replace("{" + name + "}", "{" + name + ":[0-9]+}");
				}
			}
		}

		// add wildcard for lists for clients (api client & test client)

		var listParams = operation.queryParams.stream().filter(p -> p.isListContainer).collect(Collectors.toList());
		if (!listParams.isEmpty()) {
			extensions.put("path", operation.path + "?" + listParams.stream()
					.map(p -> "{&" + p.baseName + "*}")
					.collect(Collectors.joining()));
		} else {
			extensions.put("path", operation.path);
		}

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
					.map(ApiResponse::getContent) // may be null
					.filter(content -> content.containsKey(MediaType.APPLICATION_JSON_STREAM))
					.isPresent();
			extensions.put("asyncContainer", typeMapping.get("asyncSingle"));
			extensions.put("asyncStream", isStream);
			if (!useGenericResponse) {
				if (isVoid) {
					extensions.put("asyncContainer", typeMapping.get("asyncCompletable"));
				} else if ((boolean) operation.vendorExtensions.getOrDefault("has404", false)) {
					extensions.put("asyncContainer", typeMapping.get("asyncMaybe"));
				}
			}
			if (isStream) {
				extensions.put("asyncContainer", typeMapping.get("asyncFlowable"));
			}
		}

		return operation;
	}

	@Override
	public String getSchemaType(Schema schema) {
		var format = schema.getFormat();
		if (schema instanceof StringSchema && format != null && CUSTOM_FORMATS.containsKey(format)) {
			var type = CUSTOM_FORMATS.get(format).getName();
			LOGGER.warn("Use custom format {} with type {}.", format, type);
			return type;
		}
		if (schema instanceof ComposedSchema) {
			ComposedSchema cs = (ComposedSchema) schema;
			if (CollectionUtils.isNotEmpty(cs.getOneOf())) {
				// ignore embedded oneOf schemas
				return Object.class.getName();
			}
		}
		return super.getSchemaType(schema);
	}

	@Override
	public String toDefaultValue(Schema schema) {
		if (ModelUtils.isArraySchema(schema)) {
			return "new " + instantiationTypes.get("array") + "<>()";
		}
		if (ModelUtils.isMapSchema(schema)) {
			return "new " + instantiationTypes.get("map") + "<>()";
		}
		return super.toDefaultValue(schema);
	}

	@Override
	public Map<String, Object> updateAllModels(Map<String, Object> objs) {
		var superObjs = super.updateAllModels(objs);

		Map<String, CodegenModel> allModels = getAllModels(objs);
		for (CodegenModel model : allModels.values()) {

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
					LOGGER.warn("{} - model in discriminator {} with name {} not found",
							model.name, discriminator.getPropertyName(), mappedModel.getModelName());
					continue;
				}
				if (subModel.parentModel == null) {
					subModel.parentModel = model;
					subModel.parent = model.getClassname();
					LOGGER.warn("{} added missing sub model {}", model.name, subModel.name);
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
	public void postProcessModelProperty(CodegenModel model, CodegenProperty property) {
		super.postProcessModelProperty(model, property);
		if (property.isEnum) {
			// handle maps with emum as value, hono uses this spec (would not recommend this)
			if (property.isMapContainer && property.items != null) {
				property.dataType = property.items.dataType;
				property.datatypeWithEnum = typeMapping.get("map")
						+ "<" + typeMapping.get("string") + ", " + toEnumName(property) + ">";
			}
			if (property.defaultValue != null) {
				property.defaultValue = toEnumName(property) + "."
						+ toEnumVarName(property.defaultValue, property.dataType);
			}
		}
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

	// internal

	void addSupportingFile(String folder, String packageString, String file) {
		String templateFile = "support/" + file + ".mustache";
		String destinationFilename = folder + "/" + packageString.replace(".", "/") + "/" + file + ".java";
		SupportingFile supportingFile = new SupportingFile(templateFile, destinationFilename);
		if (!supportingFiles.contains(supportingFile)) {
			supportingFiles.add(supportingFile);
		}
	}
}
