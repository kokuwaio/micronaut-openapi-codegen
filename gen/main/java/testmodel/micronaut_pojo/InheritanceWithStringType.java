package testmodel.micronaut_pojo;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY, property = "type")
@com.fasterxml.jackson.annotation.JsonSubTypes({
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithStringType1.class, name = "Inheritance1"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithStringType2.class, name = "Inheritance2")
})
public sealed interface InheritanceWithStringType permits InheritanceWithStringType1, InheritanceWithStringType2 {

	@com.fasterxml.jackson.annotation.JsonProperty("type")
	java.lang.String getType();

	@com.fasterxml.jackson.annotation.JsonProperty("a")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String getA();

	@com.fasterxml.jackson.annotation.JsonProperty("a")
	void setA(java.lang.String newA);
}
