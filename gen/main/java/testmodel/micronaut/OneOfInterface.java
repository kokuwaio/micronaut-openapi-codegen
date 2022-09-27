package testmodel.micronaut;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.annotation.JsonSubTypes({
   @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OneOfImplementor1.class),
   @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OneOfImplementor2.class)})
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY, property = OneOfInterface.JSON_DISCRIMINATOR)
public interface OneOfInterface
{
   	String JSON_DISCRIMINATOR = "type"; 

   	@com.fasterxml.jackson.annotation.JsonProperty(JSON_DISCRIMINATOR)
    java.lang.String getType();
}

