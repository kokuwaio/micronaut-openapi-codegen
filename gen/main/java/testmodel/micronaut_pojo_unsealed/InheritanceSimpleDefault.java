package testmodel.micronaut_pojo_unsealed;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(as = InheritanceSimpleDefault.class)
public class InheritanceSimpleDefault implements InheritanceSimple {

	@jakarta.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty("foo")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String foo;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		InheritanceSimpleDefault other = (InheritanceSimpleDefault) object;
		return java.util.Objects.equals(foo, other.foo);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(foo);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceSimpleDefault[")
				.append("foo=").append(foo)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceSimpleDefault foo(java.lang.String newFoo) {
		this.foo = newFoo;
		return this;
	}

	// getter/setter

	public java.lang.String getFoo() {
		return foo;
	}

	public void setFoo(java.lang.String newFoo) {
		this.foo = newFoo;
	}
}
