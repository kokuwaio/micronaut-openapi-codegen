package issue._303;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public class EmbeddedValue {

	@com.fasterxml.jackson.annotation.JsonProperty("type")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String type;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		EmbeddedValue other = (EmbeddedValue) object;
		return java.util.Objects.equals(type, other.type);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(type);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("EmbeddedValue[")
				.append("type=").append(type)
				.append("]")
				.toString();
	}

	// fluent

	public EmbeddedValue type(java.lang.String newType) {
		this.type = newType;
		return this;
	}

	// getter/setter

	public java.lang.String getType() {
		return type;
	}

	public void setType(java.lang.String newType) {
		this.type = newType;
	}
}
