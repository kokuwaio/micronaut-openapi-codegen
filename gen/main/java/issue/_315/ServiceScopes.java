package issue._315;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class ServiceScopes {


    private java.util.Map<java.lang.String, ServiceScopesEntry> additionalProperties;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ServiceScopes other = (ServiceScopes) object;
		return java.util.Objects.equals(this.additionalProperties, other.additionalProperties);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(this.additionalProperties);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("ServiceScopes[")
				.append("additionalProperties=").append(this.additionalProperties)
				.append("]")
				.toString();
	}
	@com.fasterxml.jackson.annotation.JsonAnyGetter
	public java.util.Map<java.lang.String, ServiceScopesEntry> getAdditionalProperties() {
		return additionalProperties;
	}

	@com.fasterxml.jackson.annotation.JsonAnySetter
	public void setAdditionalProperties(java.lang.String propertyKey, ServiceScopesEntry value) {
		if (this.additionalProperties == null) {
					this.additionalProperties = new java.util.HashMap<>();
				}
		this.additionalProperties.put(propertyKey, value);
	}

}
