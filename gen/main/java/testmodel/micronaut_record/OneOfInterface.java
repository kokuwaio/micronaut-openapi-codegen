package testmodel.micronaut_record;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY, property = OneOfInterface.JSON_DISCRIMINATOR)
@com.fasterxml.jackson.annotation.JsonSubTypes({
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OneOfImplementor1.class, name = "Implementation1"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OneOfImplementor2.class, name = "Implementation2"),
})
public sealed interface OneOfInterface permits OneOfImplementor1, OneOfImplementor2 {

	java.lang.String JSON_DISCRIMINATOR = "type";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_DISCRIMINATOR)
	java.lang.String type();
}
