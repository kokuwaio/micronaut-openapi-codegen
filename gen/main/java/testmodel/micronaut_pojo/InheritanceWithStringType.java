package testmodel.micronaut_pojo;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY, property = InheritanceWithStringType.JSON_DISCRIMINATOR)
@com.fasterxml.jackson.annotation.JsonSubTypes({
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithStringType1.class, name = "Inheritance1"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithStringType2.class, name = "Inheritance2")
})
@io.micronaut.core.annotation.Introspected
public abstract class InheritanceWithStringType {

	public static final java.lang.String JSON_PROPERTY_A = "a";
	public static final java.lang.String JSON_DISCRIMINATOR = "type";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_A)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String a;

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
		InheritanceWithStringType other = (InheritanceWithStringType) object;
		return java.util.Objects.equals(a, other.a)
				&& java.util.Objects.equals(getType(), other.getType());
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(a, getType());
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithStringType[")
				.append("a=").append(a)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithStringType a(java.lang.String newA) {
		this.a = newA;
		return this;
	}

	// getter/setter

	public java.lang.String getA() {
		return a;
	}

	public void setA(java.lang.String newA) {
		this.a = newA;
	}
}
