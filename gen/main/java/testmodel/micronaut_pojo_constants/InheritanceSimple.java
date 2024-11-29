package testmodel.micronaut_pojo_constants;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(as = InheritanceSimpleDefault.class)
public sealed interface InheritanceSimple permits InheritanceExtended, InheritanceSimpleDefault {

	java.lang.String JSON_PROPERTY_FOO = "foo";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_FOO)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	java.lang.String getFoo();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_FOO)
	void setFoo(java.lang.String newFoo);
}
