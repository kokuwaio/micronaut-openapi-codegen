package testmodel.micronaut_pojo_unsealed;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public class AdditionalPropertiesModel {

	@com.fasterxml.jackson.annotation.JsonProperty("id")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String id;

	private java.util.Map<java.lang.String, AdditionalPropertiesModelValue> additionalProperties;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		AdditionalPropertiesModel other = (AdditionalPropertiesModel) object;
		return java.util.Objects.equals(id, other.id);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(id);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("AdditionalPropertiesModel[")
				.append("id=").append(id)
				.append("]")
				.toString();
	}

	// fluent

	public AdditionalPropertiesModel id(java.lang.String newId) {
		this.id = newId;
		return this;
	}

	@com.fasterxml.jackson.annotation.JsonAnyGetter
	public java.util.Map<java.lang.String, AdditionalPropertiesModelValue> getAdditionalProperties() {
		return additionalProperties;
	}

	@com.fasterxml.jackson.annotation.JsonAnySetter
	public void setAdditionalProperties(java.lang.String propertyKey, AdditionalPropertiesModelValue value) {
		if (this.additionalProperties == null) {
					this.additionalProperties = new java.util.HashMap<>();
				}
		this.additionalProperties.put(propertyKey, value);
	}

	// getter/setter

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String newId) {
		this.id = newId;
	}
}
