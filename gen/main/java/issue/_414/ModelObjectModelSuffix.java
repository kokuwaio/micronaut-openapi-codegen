package issue._414;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public class ModelObjectModelSuffix {

	@com.fasterxml.jackson.annotation.JsonProperty("a")
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
		ModelObjectModelSuffix other = (ModelObjectModelSuffix) object;
		return java.util.Objects.equals(a, other.a);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(a);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("ModelObjectModelSuffix[")
				.append("a=").append(a)
				.append("]")
				.toString();
	}

	// fluent

	public ModelObjectModelSuffix a(java.lang.String newA) {
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
