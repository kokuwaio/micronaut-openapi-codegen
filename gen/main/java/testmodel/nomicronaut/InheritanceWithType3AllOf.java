package testmodel.nomicronaut;


public class InheritanceWithType3AllOf {

	public static final java.lang.String JSON_PROPERTY_C = "c";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_C)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String c;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		InheritanceWithType3AllOf other = (InheritanceWithType3AllOf) object;
		return java.util.Objects.equals(c, other.c);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(c);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithType3AllOf[")
				.append("c=").append(c)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithType3AllOf c(java.lang.String newC) {
		this.c = newC;
		return this;
	}

	// getter/setter

	public java.lang.String getC() {
		return c;
	}

	public void setC(java.lang.String newC) {
		this.c = newC;
	}
}
