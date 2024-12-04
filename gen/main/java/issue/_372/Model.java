package issue._372;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public class Model {

	@jakarta.validation.constraints.Size(min = 3)
	@com.fasterxml.jackson.annotation.JsonProperty("string")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String string;

	@jakarta.validation.constraints.Min(1)
	@jakarta.validation.constraints.Max(3)
	@com.fasterxml.jackson.annotation.JsonProperty("integer")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer integer;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		Model other = (Model) object;
		return java.util.Objects.equals(string, other.string)
				&& java.util.Objects.equals(integer, other.integer);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(string, integer);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("Model[")
				.append("string=").append(string).append(",")
				.append("integer=").append(integer)
				.append("]")
				.toString();
	}

	// fluent

	public Model string(java.lang.String newString) {
		this.string = newString;
		return this;
	}

	public Model integer(java.lang.Integer newInteger) {
		this.integer = newInteger;
		return this;
	}

	// getter/setter

	public java.lang.String getString() {
		return string;
	}

	public void setString(java.lang.String newString) {
		this.string = newString;
	}

	public java.lang.Integer getInteger() {
		return integer;
	}

	public void setInteger(java.lang.Integer newInteger) {
		this.integer = newInteger;
	}
}
