package testmodel.micronaut_pojo_unsealed;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY, property = "type")
@com.fasterxml.jackson.annotation.JsonSubTypes({
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithoutType1.class, name = "Inheritance1"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithoutType2.class, name = "Inheritance2")
})
public interface InheritanceWithoutType {

	@com.fasterxml.jackson.annotation.JsonProperty("type")
	java.lang.String getType();

	@com.fasterxml.jackson.annotation.JsonProperty("e")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String getE();

	@com.fasterxml.jackson.annotation.JsonProperty("e")
	void setE(java.lang.String newE);
}
