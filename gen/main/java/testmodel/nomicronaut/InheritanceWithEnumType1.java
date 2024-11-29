package testmodel.nomicronaut;


public final class InheritanceWithEnumType1 implements InheritanceWithEnumType {

	@com.fasterxml.jackson.annotation.JsonProperty("d")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String d;

	@Override
	public InheritanceWithEnumTypeEnum getType() {
		return InheritanceWithEnumTypeEnum.INHERITANCE1;
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
		InheritanceWithEnumType1 other = (InheritanceWithEnumType1) object;
		return java.util.Objects.equals(d, other.d);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(d);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithEnumType1[")
				.append("d=").append(d)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithEnumType1 d(java.lang.String newD) {
		this.d = newD;
		return this;
	}

	// getter/setter

	public java.lang.String getD() {
		return d;
	}

	public void setD(java.lang.String newD) {
		this.d = newD;
	}
}
