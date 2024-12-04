package testmodel.micronaut_record;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record InheritanceExtended(

	@jakarta.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty("foo")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	java.lang.String foo,

	@jakarta.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty("bar")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	java.lang.String bar) implements InheritanceSimple {}
