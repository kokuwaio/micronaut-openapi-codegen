package testmodel.nomicronaut;

public final class OneOfImplementor1 implements OneOfInterface {

	@com.fasterxml.jackson.annotation.JsonProperty("property")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String property;

	@Override
	public java.lang.String getType() {
		return "Implementation1";
	}

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		OneOfImplementor1 other = (OneOfImplementor1) object;
		return java.util.Objects.equals(property, other.property);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(property);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("OneOfImplementor1[")
				.append("property=").append(property)
				.append("]")
				.toString();
	}

	// fluent

	public OneOfImplementor1 property(java.lang.String newProperty) {
		this.property = newProperty;
		return this;
	}

	// getter/setter

	public java.lang.String getProperty() {
		return property;
	}

	public void setProperty(java.lang.String newProperty) {
		this.property = newProperty;
	}
}
