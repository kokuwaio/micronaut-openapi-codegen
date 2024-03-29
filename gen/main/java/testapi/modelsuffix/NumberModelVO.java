package testapi.modelsuffix;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public class NumberModelVO {

	@com.fasterxml.jackson.annotation.JsonProperty("bar")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Double bar;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		NumberModelVO other = (NumberModelVO) object;
		return java.util.Objects.equals(bar, other.bar);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(bar);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("NumberModelVO[")
				.append("bar=").append(bar)
				.append("]")
				.toString();
	}

	// fluent

	public NumberModelVO bar(java.lang.Double newBar) {
		this.bar = newBar;
		return this;
	}

	// getter/setter

	public java.lang.Double getBar() {
		return bar;
	}

	public void setBar(java.lang.Double newBar) {
		this.bar = newBar;
	}
}
