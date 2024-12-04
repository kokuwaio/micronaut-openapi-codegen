package issue._356;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public final class Child implements Parent {

	@com.fasterxml.jackson.annotation.JsonProperty("name")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String name;

	@com.fasterxml.jackson.annotation.JsonProperty("code")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer code;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		Child other = (Child) object;
		return java.util.Objects.equals(name, other.name)
				&& java.util.Objects.equals(code, other.code);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(name, code);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("Child[")
				.append("name=").append(name).append(",")
				.append("code=").append(code)
				.append("]")
				.toString();
	}

	// fluent

	public Child name(java.lang.String newName) {
		this.name = newName;
		return this;
	}

	public Child code(java.lang.Integer newCode) {
		this.code = newCode;
		return this;
	}

	// getter/setter

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String newName) {
		this.name = newName;
	}

	public java.lang.Integer getCode() {
		return code;
	}

	public void setCode(java.lang.Integer newCode) {
		this.code = newCode;
	}
}
