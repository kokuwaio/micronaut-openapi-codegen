package testmodel.micronaut_record;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record InheritanceWithEnumType2(

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty("e")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String e) implements InheritanceWithEnumType {

	@Override
	public InheritanceWithEnumTypeEnum type() {
		return InheritanceWithEnumTypeEnum.INHERITANCE2;
	}
}
