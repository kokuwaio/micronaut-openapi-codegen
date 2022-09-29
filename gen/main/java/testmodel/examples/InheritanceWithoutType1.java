package testmodel.examples;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class InheritanceWithoutType1 extends InheritanceWithoutType {

	public static final java.lang.String JSON_PROPERTY_F = "f";

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
		return java.util.Objects.equals(f, other.f)
				&& super.equals(object);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(f, super.hashCode());
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithoutType1[")
				.append("super").append(super.toString())
				.append("f=").append(f)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithoutType1 f(java.lang.String newF) {
		this.f = newF;
		return this;
	}

	// getter/setter

	public java.lang.String getF() {
		return f;
	}

	public void setF(java.lang.String newF) {
		this.f = newF;
	}
}
