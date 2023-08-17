package testmodel.nomicronaut;

@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY, property = InheritanceWithoutType.JSON_DISCRIMINATOR)
@com.fasterxml.jackson.annotation.JsonSubTypes({
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithoutType1.class, name = "Inheritance1"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithoutType2.class, name = "Inheritance2")
})
public sealed interface InheritanceWithoutType permits InheritanceWithoutType1, InheritanceWithoutType2 {

	java.lang.String JSON_DISCRIMINATOR = "type";
	java.lang.String JSON_PROPERTY_E = "e";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_DISCRIMINATOR)
	java.lang.String getType();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_E)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String getE();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_E)
	void setE(java.lang.String newE);
}
