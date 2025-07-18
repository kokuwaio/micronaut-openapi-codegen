package issue._318;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(as = ModelDefaultDto.class)
public final class ModelDefaultDto implements ModelDto {

	@com.fasterxml.jackson.annotation.JsonProperty("test")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String test;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ModelDefaultDto other = (ModelDefaultDto) object;
		return java.util.Objects.equals(test, other.test);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(test);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("ModelDefaultDto[")
				.append("test=").append(test)
				.append("]")
				.toString();
	}

	// fluent

	public ModelDefaultDto test(java.lang.String newTest) {
		this.test = newTest;
		return this;
	}

	// getter/setter

	public java.lang.String getTest() {
		return test;
	}

	public void setTest(java.lang.String newTest) {
		this.test = newTest;
	}
}
