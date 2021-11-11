package testmodel.nomicronaut;


public class InheritanceWithType2 extends InheritanceWithType {

	public static final java.lang.String JSON_PROPERTY_B = "b";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_B)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String b;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		InheritanceWithType2 other = (InheritanceWithType2) object;
		return java.util.Objects.equals(b, other.b)
				&& super.equals(object);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(b, super.hashCode());
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithType2[")
				.append("super").append(super.toString())
				.append("b=").append(b)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithType2 b(java.lang.String newB) {
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
