package issue._318;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(as = ModelDefaultDto.class)
public sealed interface ModelDto permits UsedAllOfDto, ModelDefaultDto {


	@com.fasterxml.jackson.annotation.JsonProperty("test")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String getTest();

	@com.fasterxml.jackson.annotation.JsonProperty("test")
	void setTest(java.lang.String newTest);
}
