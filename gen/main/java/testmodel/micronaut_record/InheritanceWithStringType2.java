package testmodel.micronaut_record;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record InheritanceWithStringType2(

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty("a")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String a,

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty("c")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String c) implements InheritanceWithStringType {

	@Override
	public java.lang.String type() {
		return "Inheritance2";
	}
}
