package testmodel.nomicronaut;

@com.fasterxml.jackson.databind.annotation.JsonDeserialize(as = OneOfImplementor2.class)
public final class OneOfImplementor2 implements OneOfInterface {

	@com.fasterxml.jackson.annotation.JsonProperty("property")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Double property;

	@Override
	public java.lang.String getType() {
		return "Implementation2";
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
		OneOfImplementor2 other = (OneOfImplementor2) object;
		return java.util.Objects.equals(property, other.property);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(property);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("OneOfImplementor2[")
				.append("property=").append(property)
				.append("]")
				.toString();
	}

	// fluent

	public OneOfImplementor2 property(java.lang.Double newProperty) {
		this.property = newProperty;
		return this;
	}

	// getter/setter

	public java.lang.Double getProperty() {
		return property;
	}

	public void setProperty(java.lang.Double newProperty) {
		this.property = newProperty;
	}
}
