package testmodel.micronaut_pojo_unsealed;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(as = InheritanceSimpleDefault.class)
public interface InheritanceSimple {


	@com.fasterxml.jackson.annotation.JsonProperty("foo")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	java.lang.String getFoo();

	@com.fasterxml.jackson.annotation.JsonProperty("foo")
	void setFoo(java.lang.String newFoo);
}
