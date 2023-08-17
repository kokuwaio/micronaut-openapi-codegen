package testmodel.micronaut_pojo_unsealed;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY, property = InheritanceWithEnumType.JSON_DISCRIMINATOR)
@com.fasterxml.jackson.annotation.JsonSubTypes({
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithEnumType1.class, name = "Inheritance1"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithEnumType2.class, name = "Inheritance2"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithEnumType3.class, name = "Inheritance3")
})
public interface InheritanceWithEnumType {

	java.lang.String JSON_DISCRIMINATOR = "type";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_DISCRIMINATOR)
	InheritanceWithEnumTypeEnum getType();
}
