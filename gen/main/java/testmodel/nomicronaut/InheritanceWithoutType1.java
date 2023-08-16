package testmodel.nomicronaut;

public class InheritanceWithoutType1 implements InheritanceWithoutType {

	public static final java.lang.String JSON_PROPERTY_F = "f";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_E)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String e;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_F)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String f;

	@Override
	public java.lang.String getType() {
		return "Inheritance1";
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
		InheritanceWithoutType1 other = (InheritanceWithoutType1) object;
		return java.util.Objects.equals(e, other.e)
				&& java.util.Objects.equals(f, other.f);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(e, f);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithoutType1[")
				.append("e=").append(e).append(",")
				.append("f=").append(f)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithoutType1 e(java.lang.String newE) {
		this.e = newE;
		return this;
	}

	public InheritanceWithoutType1 f(java.lang.String newF) {
		this.f = newF;
		return this;
	}

	// getter/setter

	public java.lang.String getE() {
		return e;
	}

	public void setE(java.lang.String newE) {
		this.e = newE;
	}

	public java.lang.String getF() {
		return f;
	}

	public void setF(java.lang.String newF) {
		this.f = newF;
	}
}
