package issue._303;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public class MapConstruct {

	private java.util.Map<java.lang.String, EmbeddedValue> additionalProperties;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		MapConstruct other = (MapConstruct) object;
		return java.util.Objects.equals(this.additionalProperties, other.additionalProperties)
				&& super.equals(object);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(this.additionalProperties);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("MapConstruct[")
				.append("additionalProperties=").append(this.additionalProperties)
				.append("]")
				.toString();
	}
	@com.fasterxml.jackson.annotation.JsonAnyGetter
	public java.util.Map<java.lang.String, EmbeddedValue> getAdditionalProperties() {
		return additionalProperties;
	}

	@com.fasterxml.jackson.annotation.JsonAnySetter
	public void setAdditionalProperties(java.lang.String propertyKey, EmbeddedValue value) {
		if (this.additionalProperties == null) {
					this.additionalProperties = new java.util.HashMap<>();
				}
		this.additionalProperties.put(propertyKey, value);
	}

}
