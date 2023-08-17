package testmodel.micronaut_record;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record SecondLevelOneModel(

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String type,

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ONE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String one) implements SecondLevelModel {

	public static final java.lang.String JSON_PROPERTY_TYPE = "type";
	public static final java.lang.String JSON_PROPERTY_ONE = "one";
}
