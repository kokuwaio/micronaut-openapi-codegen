package testmodel.nomicronaut;

public class InheritanceWithStringType1 extends InheritanceWithStringType {

	public static final java.lang.String JSON_PROPERTY_B = "b";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_B)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String b;

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
		InheritanceWithStringType1 other = (InheritanceWithStringType1) object;
		return java.util.Objects.equals(b, other.b)
				&& super.equals(object);
	}

	@Override
	public int hashCode() {
		return 31 * super.hashCode() + java.util.Objects.hash(b, super.hashCode());
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithStringType1[")
				.append("super").append(super.toString())
				.append("b=").append(b)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithStringType1 b(java.lang.String newB) {
		this.b = newB;
		return this;
	}

	// getter/setter

	public java.lang.String getB() {
		return b;
	}

	public void setB(java.lang.String newB) {
		this.b = newB;
	}
}
