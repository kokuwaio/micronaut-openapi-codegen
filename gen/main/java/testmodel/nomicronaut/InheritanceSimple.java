package testmodel.nomicronaut;

public class InheritanceSimple {
	public static final java.lang.String JSON_PROPERTY_FOO = "foo";

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_FOO)
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
		InheritanceSimple other = (InheritanceSimple) object;
		return java.util.Objects.equals(foo, other.foo);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(foo);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceSimple[")
				.append("foo=").append(foo)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceSimple foo(java.lang.String newFoo) {
		this.foo = newFoo;
		return this;
	}


	public java.lang.String getFoo() {
		return foo;
	}

	public void setFoo(java.lang.String newFoo) {
		this.foo = newFoo;
	}
}

