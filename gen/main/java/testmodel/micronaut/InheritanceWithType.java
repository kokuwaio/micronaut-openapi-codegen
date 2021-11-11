package testmodel.micronaut;

@io.micronaut.core.annotation.Generated

@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@com.fasterxml.jackson.annotation.JsonSubTypes({
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithType1.class, name = "Inheritance1"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithType2.class, name = "Inheritance2"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InheritanceWithType3.class, name = "Inheritance3"),
})
@io.micronaut.core.annotation.Introspected
public abstract class InheritanceWithType {

	public static final java.lang.String JSON_PROPERTY_TYPE = "type";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private InheritanceWithTypeEnum type;


	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		InheritanceWithType other = (InheritanceWithType) object;
		return java.util.Objects.equals(type, other.type)
				&& java.util.Objects.equals(getType(), other.getType());
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(type, getType());
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithType[")
				.append("type=").append(type)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithType type(InheritanceWithTypeEnum newType) {
		this.type = newType;
		return this;
	}

	// getter/setter

	public InheritanceWithTypeEnum getType() {
		return type;
	}

	public void setType(InheritanceWithTypeEnum newType) {
		this.type = newType;
	}
}
