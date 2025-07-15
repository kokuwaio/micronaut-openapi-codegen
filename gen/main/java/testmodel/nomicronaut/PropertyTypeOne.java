package testmodel.nomicronaut;

@com.fasterxml.jackson.databind.annotation.JsonDeserialize(as = PropertyTypeOne.class)
public final class PropertyTypeOne implements AdditionalPropertiesModelValue {

	@com.fasterxml.jackson.annotation.JsonProperty("type")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private Type type;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		PropertyTypeOne other = (PropertyTypeOne) object;
		return java.util.Objects.equals(type, other.type);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(type);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("PropertyTypeOne[")
				.append("type=").append(type)
				.append("]")
				.toString();
	}

	// fluent

	public PropertyTypeOne type(Type newType) {
		this.type = newType;
		return this;
	}

	// getter/setter

	public Type getType() {
		return type;
	}

	public void setType(Type newType) {
		this.type = newType;
	}

public enum Type {

	ONE("one");

	public static final java.lang.String ONE_VALUE = "one";

	private final java.lang.String value;

	private Type(java.lang.String value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static Type toEnum(java.lang.String value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<Type> toOptional(java.lang.String value) {
		return java.util.Arrays
				.stream(values())
				.filter(e -> e.value.equals(value))
				.findAny();
	}

	@com.fasterxml.jackson.annotation.JsonValue
	public java.lang.String getValue() {
		return value;
	}
}
}
