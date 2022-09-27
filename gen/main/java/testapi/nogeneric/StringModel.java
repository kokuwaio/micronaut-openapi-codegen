package testapi.nogeneric;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class StringModel {
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
		StringModel other = (StringModel) object;
		return java.util.Objects.equals(foo, other.foo);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(foo);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("StringModel[")
				.append("foo=").append(foo)
				.append("]")
				.toString();
	}

	// fluent

	public StringModel foo(java.lang.String newFoo) {
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

