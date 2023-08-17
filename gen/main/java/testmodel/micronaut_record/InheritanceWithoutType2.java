package testmodel.micronaut_record;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record InheritanceWithoutType2(

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_E)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String e,

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_G)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String g) implements InheritanceWithoutType {

	public static final java.lang.String JSON_PROPERTY_G = "g";

	@Override
	public java.lang.String type() {
		return "Inheritance2";
	}
}
