package testmodel.micronaut_pojo;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.DEDUCTION, visible = true)
@com.fasterxml.jackson.annotation.JsonSubTypes({
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SecondLevelOneModel.class),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SecondLevelTwoModel.class)})
public interface SecondLevelModel extends OneOfModel {}
