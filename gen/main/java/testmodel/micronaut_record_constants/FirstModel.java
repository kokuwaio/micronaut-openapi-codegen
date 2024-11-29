package testmodel.micronaut_record_constants;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record FirstModel(

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String type,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_FIRST)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String first,

	@io.micronaut.core.annotation.Nullable
	@jakarta.validation.Valid
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_SECOND_LEVEL)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	SecondLevelModel secondLevel) implements OneOfModel {

	public static final java.lang.String JSON_PROPERTY_TYPE = "type";
	public static final java.lang.String JSON_PROPERTY_FIRST = "first";
	public static final java.lang.String JSON_PROPERTY_SECOND_LEVEL = "secondLevel";
}
