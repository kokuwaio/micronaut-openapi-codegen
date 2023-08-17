package testmodel.micronaut_record;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record InheritanceWithStringType2(

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_A)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String a,

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_C)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String c) implements InheritanceWithStringType {

	public static final java.lang.String JSON_PROPERTY_C = "c";

	@Override
	public java.lang.String type() {
		return "Inheritance2";
	}
}
