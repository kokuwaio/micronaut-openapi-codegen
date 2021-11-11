package testmodel.micronaut;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class InheritanceWithoutType2 extends InheritanceWithoutType {

	public static final java.lang.String JSON_PROPERTY_G = "g";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_G)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String g;

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
		InheritanceWithoutType2 other = (InheritanceWithoutType2) object;
		return java.util.Objects.equals(g, other.g)
				&& super.equals(object);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(g, super.hashCode());
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithoutType2[")
				.append("super").append(super.toString())
				.append("g=").append(g)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithoutType2 g(java.lang.String newG) {
		this.g = newG;
		return this;
	}

	// getter/setter

	public java.lang.String getG() {
		return g;
	}

	public void setG(java.lang.String newG) {
		this.g = newG;
	}
}
