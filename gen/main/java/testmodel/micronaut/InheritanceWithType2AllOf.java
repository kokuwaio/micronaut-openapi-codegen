package testmodel.micronaut;

@io.micronaut.core.annotation.Generated

@io.micronaut.core.annotation.Introspected
public class InheritanceWithType2AllOf {

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
		InheritanceWithType2AllOf other = (InheritanceWithType2AllOf) object;
		return java.util.Objects.equals(b, other.b);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(b);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithType2AllOf[")
				.append("b=").append(b)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithType2AllOf b(java.lang.String newB) {
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
