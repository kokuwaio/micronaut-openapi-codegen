package testmodel.nomicronaut;

@com.fasterxml.jackson.databind.annotation.JsonDeserialize(as = InheritanceExtended.class)
public final class InheritanceExtended implements InheritanceSimple {

	@jakarta.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty("foo")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String foo;

	@jakarta.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty("bar")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String bar;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		InheritanceExtended other = (InheritanceExtended) object;
		return java.util.Objects.equals(foo, other.foo)
				&& java.util.Objects.equals(bar, other.bar);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(foo, bar);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceExtended[")
				.append("foo=").append(foo).append(",")
				.append("bar=").append(bar)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceExtended foo(java.lang.String newFoo) {
		this.foo = newFoo;
		return this;
	}

	public InheritanceExtended bar(java.lang.String newBar) {
		this.bar = newBar;
		return this;
	}

	// getter/setter

	public java.lang.String getFoo() {
		return foo;
	}

	public void setFoo(java.lang.String newFoo) {
		this.foo = newFoo;
	}

	public java.lang.String getBar() {
		return bar;
	}

	public void setBar(java.lang.String newBar) {
		this.bar = newBar;
	}
}
