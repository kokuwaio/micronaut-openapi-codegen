package testmodel.micronaut_record_constants;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.DEDUCTION, visible = true)
@com.fasterxml.jackson.annotation.JsonSubTypes({
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = PropertyTypeOne.class),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = PropertyTypeTwo.class)
})
public sealed interface AdditionalPropertiesModelValue permits PropertyTypeOne, PropertyTypeTwo {}
