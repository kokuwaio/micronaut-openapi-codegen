package testmodel.micronaut_record_constants;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record InheritanceWithEnumType2(

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_E)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String e) implements InheritanceWithEnumType {

	public static final java.lang.String JSON_PROPERTY_E = "e";

	@Override
	public InheritanceWithEnumTypeEnum type() {
		return InheritanceWithEnumTypeEnum.INHERITANCE2;
	}
}
