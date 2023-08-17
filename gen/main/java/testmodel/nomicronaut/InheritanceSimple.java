package testmodel.nomicronaut;

@com.fasterxml.jackson.databind.annotation.JsonDeserialize(as = InheritanceSimpleDefault.class)
public sealed interface InheritanceSimple permits InheritanceExtended, InheritanceSimpleDefault {


	@com.fasterxml.jackson.annotation.JsonProperty("foo")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	java.lang.String getFoo();

	@com.fasterxml.jackson.annotation.JsonProperty("foo")
	void setFoo(java.lang.String newFoo);
}
