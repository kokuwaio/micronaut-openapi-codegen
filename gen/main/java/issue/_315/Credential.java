package issue._315;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public class Credential {

	@com.fasterxml.jackson.annotation.JsonProperty("dummy")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String dummy;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		Credential other = (Credential) object;
		return java.util.Objects.equals(dummy, other.dummy);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(dummy);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("Credential[")
				.append("dummy=").append(dummy)
				.append("]")
				.toString();
	}

	// fluent

	public Credential dummy(java.lang.String newDummy) {
		this.dummy = newDummy;
		return this;
	}

	// getter/setter

	public java.lang.String getDummy() {
		return dummy;
	}

	public void setDummy(java.lang.String newDummy) {
		this.dummy = newDummy;
	}
}
