package testmodel.micronaut_pojo_nullable;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class InheritanceWithStringType2 extends InheritanceWithStringType {

	public static final java.lang.String JSON_PROPERTY_C = "c";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_C)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String c;

	@Override
	public java.lang.String getType() {
		return "Inheritance2";
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
		InheritanceWithStringType2 other = (InheritanceWithStringType2) object;
		return java.util.Objects.equals(c, other.c)
				&& super.equals(object);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(c, super.hashCode());
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithStringType2[")
				.append("super").append(super.toString())
				.append("c=").append(c)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithStringType2 c(java.lang.String newC) {
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
