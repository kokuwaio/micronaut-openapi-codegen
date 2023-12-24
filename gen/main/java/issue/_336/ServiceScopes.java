package issue._336;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class ServiceScopes {

	public static final java.lang.String JSON_PROPERTY_FOO = "foo";
	public static final java.lang.String JSON_PROPERTY_BAR = "bar";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_FOO)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String foo;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_BAR)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String bar;

    private java.util.Map<java.lang.String, java.lang.String> additionalProperties;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ServiceScopes other = (ServiceScopes) object;
		return java.util.Objects.equals(this.additionalProperties, other.additionalProperties) && java.util.Objects.equals(foo, other.foo)
				&& java.util.Objects.equals(bar, other.bar);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(this.additionalProperties, , foo, bar);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("ServiceScopes[")
				.append("additionalProperties=").append(this.additionalProperties)
				.append("foo=").append(foo).append(",")
				.append("bar=").append(bar)
				.append("]")
				.toString();
	}

	// fluent

	public ServiceScopes foo(java.lang.String newFoo) {
		this.foo = newFoo;
		return this;
	}

	public ServiceScopes bar(java.lang.String newBar) {
		this.bar = newBar;
		return this;
	}

	@com.fasterxml.jackson.annotation.JsonAnyGetter
	public java.util.Map<java.lang.String, java.lang.String> getAdditionalProperties() {
		return additionalProperties;
	}

	@com.fasterxml.jackson.annotation.JsonAnySetter
	public void setAdditionalProperties(java.lang.String propertyKey, java.lang.String value) {
		if (this.additionalProperties == null) {
					this.additionalProperties = new java.util.HashMap<>();
				}
		this.additionalProperties.put(propertyKey, value);
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
