package testmodel.micronaut;

@io.micronaut.core.annotation.Generated

@io.micronaut.core.annotation.Introspected
public class InheritanceExtendedAllOf {

	public static final java.lang.String JSON_PROPERTY_BAR = "bar";

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_BAR)
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
		InheritanceExtendedAllOf other = (InheritanceExtendedAllOf) object;
		return java.util.Objects.equals(bar, other.bar);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(bar);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceExtendedAllOf[")
				.append("bar=").append(bar)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceExtendedAllOf bar(java.lang.String newBar) {
		this.bar = newBar;
		return this;
	}

	// getter/setter

	public java.lang.String getBar() {
		return bar;
	}

	public void setBar(java.lang.String newBar) {
		this.bar = newBar;
	}
}
