package testmodel.micronaut_record_constants;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record Model(

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.Integer id,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID_WITH_EXAMPLE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.Integer idWithExample,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID_WITH_DEFAULT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.Integer idWithDefault,

	@jakarta.validation.constraints.NotNull
	@jakarta.validation.constraints.Size(max = 36)
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NAME)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	java.lang.String name,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NAME_WITH_EXAMPLE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String nameWithExample,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NAME_WITH_DEFAULT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String nameWithDefault,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DATE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.time.LocalDate date,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DATE_WITH_EXAMPLE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.time.LocalDate dateWithExample,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DATE_TIME)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.time.Instant dateTime,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DATE_TIME_WITH_EXAMPLE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.time.Instant dateTimeWithExample,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NUMBER)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.Double number,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_BINARY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	byte[] binary,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_BYTES)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	byte[] bytes,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ANY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	org.openapitools.jackson.nullable.JsonNullable<java.lang.Object> any,

	@jakarta.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ARRAY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> array,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ARRAY_WITH_EXAMPLE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> arrayWithExample,

	@jakarta.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_SET)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> set,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_SET_WITH_EXAMPLES)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> setWithExamples,

	@jakarta.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_MAP)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	java.util.Map<String, java.lang.String> map,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_MAP_WITH_EXAMPLE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.util.Map<String, java.lang.String> mapWithExample,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_OPTIONAL_ARRAY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> optionalArray,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_OPTIONAL_SET)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> optionalSet,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_OPTIONAL_MAP)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.util.Map<String, java.lang.String> optionalMap,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NULLABLE_STRING)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	org.openapitools.jackson.nullable.JsonNullable<java.lang.String> nullableString,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NULLABLE_ARRAY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	org.openapitools.jackson.nullable.JsonNullable<java.util.List<java.lang.@jakarta.validation.constraints.NotNull String>> nullableArray,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NULLABLE_SET)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	org.openapitools.jackson.nullable.JsonNullable<java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String>> nullableSet,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DEFAULT_STRING)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String defaultString,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DEFAULT_INTEGER)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.Integer defaultInteger,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DEFAULT_LONG)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.Long defaultLong,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DEFAULT_NULLABLE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	org.openapitools.jackson.nullable.JsonNullable<java.lang.String> defaultNullable,

	@io.micronaut.core.annotation.Nullable
	@jakarta.validation.Valid
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_REFERENED_MODEL)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	EnumerationModel referenedModel) {

	public static final java.lang.String JSON_PROPERTY_ID = "id";
	public static final java.lang.String JSON_PROPERTY_ID_WITH_EXAMPLE = "idWithExample";
	public static final java.lang.String JSON_PROPERTY_ID_WITH_DEFAULT = "idWithDefault";
	public static final java.lang.String JSON_PROPERTY_NAME = "name";
	public static final java.lang.String JSON_PROPERTY_NAME_WITH_EXAMPLE = "nameWithExample";
	public static final java.lang.String JSON_PROPERTY_NAME_WITH_DEFAULT = "nameWithDefault";
	public static final java.lang.String JSON_PROPERTY_DATE = "date";
	public static final java.lang.String JSON_PROPERTY_DATE_WITH_EXAMPLE = "dateWithExample";
	public static final java.lang.String JSON_PROPERTY_DATE_TIME = "date-time";
	public static final java.lang.String JSON_PROPERTY_DATE_TIME_WITH_EXAMPLE = "date-timeWithExample";
	public static final java.lang.String JSON_PROPERTY_NUMBER = "number";
	public static final java.lang.String JSON_PROPERTY_BINARY = "binary";
	public static final java.lang.String JSON_PROPERTY_BYTES = "bytes";
	public static final java.lang.String JSON_PROPERTY_ANY = "any";
	public static final java.lang.String JSON_PROPERTY_ARRAY = "array";
	public static final java.lang.String JSON_PROPERTY_ARRAY_WITH_EXAMPLE = "arrayWithExample";
	public static final java.lang.String JSON_PROPERTY_SET = "set";
	public static final java.lang.String JSON_PROPERTY_SET_WITH_EXAMPLES = "setWithExamples";
	public static final java.lang.String JSON_PROPERTY_MAP = "map";
	public static final java.lang.String JSON_PROPERTY_MAP_WITH_EXAMPLE = "mapWithExample";
	public static final java.lang.String JSON_PROPERTY_OPTIONAL_ARRAY = "optionalArray";
	public static final java.lang.String JSON_PROPERTY_OPTIONAL_SET = "optionalSet";
	public static final java.lang.String JSON_PROPERTY_OPTIONAL_MAP = "optionalMap";
	public static final java.lang.String JSON_PROPERTY_NULLABLE_STRING = "nullableString";
	public static final java.lang.String JSON_PROPERTY_NULLABLE_ARRAY = "nullableArray";
	public static final java.lang.String JSON_PROPERTY_NULLABLE_SET = "nullableSet";
	public static final java.lang.String JSON_PROPERTY_DEFAULT_STRING = "defaultString";
	public static final java.lang.String JSON_PROPERTY_DEFAULT_INTEGER = "defaultInteger";
	public static final java.lang.String JSON_PROPERTY_DEFAULT_LONG = "defaultLong";
	public static final java.lang.String JSON_PROPERTY_DEFAULT_NULLABLE = "defaultNullable";
	public static final java.lang.String JSON_PROPERTY_REFERENED_MODEL = "referenedModel";
}
