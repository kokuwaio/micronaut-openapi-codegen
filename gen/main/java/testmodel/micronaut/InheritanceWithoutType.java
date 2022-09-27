package testmodel.micronaut;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY, property = InheritanceWithoutType.JSON_DISCRIMINATOR)
@com.fasterxml.jackson.annotation.JsonSubTypes({
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithoutType1.class, name = "Inheritance1"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithoutType2.class, name = "Inheritance2"),
})
@io.micronaut.core.annotation.Introspected
public abstract class InheritanceWithoutType {
	public static final java.lang.String JSON_PROPERTY_E = "e";
	public static final String JSON_DISCRIMINATOR = "type";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_E)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String e;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_DISCRIMINATOR)
	public abstract java.lang.String getType();

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		InheritanceWithoutType other = (InheritanceWithoutType) object;
		return java.util.Objects.equals(e, other.e)
				&& java.util.Objects.equals(getType(), other.getType());
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(e, getType());
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithoutType[")
				.append("e=").append(e)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithoutType e(java.lang.String newE) {
		this.e = newE;
		return this;
	}
	// getter/setter


	public java.lang.String getE() {
		return e;
	}

	public void setE(java.lang.String newE) {
		this.e = newE;
	}
}

