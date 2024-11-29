package testmodel.micronaut_pojo_constants;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY, property = InheritanceWithStringType.JSON_DISCRIMINATOR)
@com.fasterxml.jackson.annotation.JsonSubTypes({
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithStringType1.class, name = "Inheritance1"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithStringType2.class, name = "Inheritance2")
})
public sealed interface InheritanceWithStringType permits InheritanceWithStringType1, InheritanceWithStringType2 {

	java.lang.String JSON_DISCRIMINATOR = "type";
	java.lang.String JSON_PROPERTY_A = "a";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_DISCRIMINATOR)
	java.lang.String getType();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_A)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String getA();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_A)
	void setA(java.lang.String newA);
}
