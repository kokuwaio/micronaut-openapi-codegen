package testmodel.micronaut_record_constants;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record OneOfImplementor2(

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_PROPERTY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.Double property) implements OneOfInterface {

	public static final java.lang.String JSON_PROPERTY_PROPERTY = "property";

	@Override
	public java.lang.String type() {
		return "Implementation2";
	}
}
