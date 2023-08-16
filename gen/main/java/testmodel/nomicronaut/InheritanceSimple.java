package testmodel.nomicronaut;

@com.fasterxml.jackson.databind.annotation.JsonDeserialize(as = InheritanceSimpleDefault.class)
public interface InheritanceSimple {

	java.lang.String JSON_PROPERTY_FOO = "foo";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_FOO)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	java.lang.String getFoo();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_FOO)
	void setFoo(java.lang.String newFoo);
}
