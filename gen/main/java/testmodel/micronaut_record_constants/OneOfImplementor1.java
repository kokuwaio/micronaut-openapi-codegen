package testmodel.micronaut_record_constants;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record OneOfImplementor1(

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_PROPERTY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String property) implements OneOfInterface {

	public static final java.lang.String JSON_PROPERTY_PROPERTY = "property";

	@Override
	public java.lang.String type() {
		return "Implementation1";
	}
}
