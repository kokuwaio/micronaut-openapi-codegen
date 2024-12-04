package testmodel.micronaut_pojo_nullable;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.DEDUCTION, visible = true)
@com.fasterxml.jackson.annotation.JsonSubTypes({
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SecondLevelOneModel.class),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SecondLevelTwoModel.class)
})
public sealed interface SecondLevelModel extends OneOfModel permits SecondLevelOneModel, SecondLevelTwoModel {}
