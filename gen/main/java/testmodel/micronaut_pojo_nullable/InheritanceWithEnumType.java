package testmodel.micronaut_pojo_nullable;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY, property = "type")
@com.fasterxml.jackson.annotation.JsonSubTypes({
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithEnumType1.class, name = "Inheritance1"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithEnumType2.class, name = "Inheritance2"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithEnumType3.class, name = "Inheritance3")
})
public sealed interface InheritanceWithEnumType permits InheritanceWithEnumType1, InheritanceWithEnumType2, InheritanceWithEnumType3 {

	@com.fasterxml.jackson.annotation.JsonProperty("type")
	InheritanceWithEnumTypeEnum getType();
}
