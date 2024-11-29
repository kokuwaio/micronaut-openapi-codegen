package testmodel.micronaut_record;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record InheritanceWithEnumType3() implements InheritanceWithEnumType {

	@Override
	public InheritanceWithEnumTypeEnum type() {
		return InheritanceWithEnumTypeEnum.INHERITANCE3;
	}
}
