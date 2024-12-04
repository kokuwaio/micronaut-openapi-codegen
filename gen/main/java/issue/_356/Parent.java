package issue._356;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(as = ParentDefault.class)
public sealed interface Parent permits Child, ParentDefault {


	@com.fasterxml.jackson.annotation.JsonProperty("name")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String getName();

	@com.fasterxml.jackson.annotation.JsonProperty("name")
	void setName(java.lang.String newName);
}
