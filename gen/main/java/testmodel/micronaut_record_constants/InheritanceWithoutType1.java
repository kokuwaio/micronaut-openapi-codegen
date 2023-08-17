package testmodel.micronaut_record_constants;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record InheritanceWithoutType1(

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_E)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String e,

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_F)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String f) implements InheritanceWithoutType {

	public static final java.lang.String JSON_PROPERTY_F = "f";

	@Override
	public java.lang.String type() {
		return "Inheritance1";
	}
}
