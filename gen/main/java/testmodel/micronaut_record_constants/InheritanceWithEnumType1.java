package testmodel.micronaut_record_constants;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record InheritanceWithEnumType1(

	@io.micronaut.core.annotation.Nullable
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_D)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String d) implements InheritanceWithEnumType {

	public static final java.lang.String JSON_PROPERTY_D = "d";

	@Override
	public InheritanceWithEnumTypeEnum type() {
		return InheritanceWithEnumTypeEnum.INHERITANCE1;
	}
}
