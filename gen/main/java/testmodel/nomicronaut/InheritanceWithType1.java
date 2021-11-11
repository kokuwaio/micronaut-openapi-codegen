package testmodel.nomicronaut;


public class InheritanceWithType1 extends InheritanceWithType {

	public static final java.lang.String JSON_PROPERTY_A = "a";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_A)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String a;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		InheritanceWithType1 other = (InheritanceWithType1) object;
		return java.util.Objects.equals(a, other.a)
				&& super.equals(object);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(a, super.hashCode());
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithType1[")
				.append("super").append(super.toString())
				.append("a=").append(a)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithType1 a(java.lang.String newA) {
		this.a = newA;
		return this;
	}

	// getter/setter

	public java.lang.String getA() {
		return a;
	}

	public void setA(java.lang.String newA) {
		this.a = newA;
	}
}
