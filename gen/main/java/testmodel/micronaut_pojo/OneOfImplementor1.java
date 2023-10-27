package testmodel.micronaut_pojo;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class OneOfImplementor1 implements OneOfInterface {

	public static final java.lang.String JSON_PROPERTY_PROPERTY = "property";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_PROPERTY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String property;

	@Override
	public java.lang.String getType() {
		return "Implementation1";
	}

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		OneOfImplementor1 other = (OneOfImplementor1) object;
		return java.util.Objects.equals(property, other.property)
				&& super.equals(object);
	}

	@Override
	public int hashCode() {
		return 31 * super.hashCode() + java.util.Objects.hash(property, super.hashCode());
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("OneOfImplementor1[")
				.append("super").append(super.toString())
				.append("property=").append(property)
				.append("]")
				.toString();
	}

	// fluent

	public OneOfImplementor1 property(java.lang.String newProperty) {
		this.property = newProperty;
		return this;
	}

	// getter/setter

	public java.lang.String getProperty() {
		return property;
	}

	public void setProperty(java.lang.String newProperty) {
		this.property = newProperty;
	}
}
