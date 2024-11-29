package testmodel.micronaut_record_constants;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record InheritanceExtended(

	@jakarta.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_FOO)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	java.lang.String foo,

	@jakarta.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_BAR)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	java.lang.String bar) implements InheritanceSimple {

	public static final java.lang.String JSON_PROPERTY_BAR = "bar";
}
