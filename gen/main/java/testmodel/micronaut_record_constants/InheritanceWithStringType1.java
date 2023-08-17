package testmodel.micronaut_record_constants;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record InheritanceWithStringType1(

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_A)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String a,

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_B)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String b) implements InheritanceWithStringType {

	public static final java.lang.String JSON_PROPERTY_B = "b";

	@Override
	public java.lang.String type() {
		return "Inheritance1";
	}
}
