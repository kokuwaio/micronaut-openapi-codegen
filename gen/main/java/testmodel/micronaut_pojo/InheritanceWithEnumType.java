package testmodel.micronaut_pojo;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY, property = InheritanceWithEnumType.JSON_DISCRIMINATOR)
@com.fasterxml.jackson.annotation.JsonSubTypes({
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithEnumType1.class, name = "Inheritance1"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithEnumType2.class, name = "Inheritance2"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithEnumType3.class, name = "Inheritance3"),
})
@io.micronaut.core.annotation.Introspected
public abstract class InheritanceWithEnumType {

	public static final String JSON_DISCRIMINATOR = "type";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_DISCRIMINATOR)
	public abstract InheritanceWithEnumTypeEnum getType();

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		InheritanceWithEnumType other = (InheritanceWithEnumType) object;
		return java.util.Objects.equals(getType(), other.getType());
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(getType());
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithEnumType[")
				.append("]")
				.toString();
	}

	// fluent

	// getter/setter
}
