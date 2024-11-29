package testmodel.micronaut_pojo_unsealed;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public class PropertyTypeTwo implements AdditionalPropertiesModelValue {

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
		PropertyTypeTwo other = (PropertyTypeTwo) object;
		return java.util.Objects.equals(type, other.type);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(type);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("PropertyTypeTwo[")
				.append("type=").append(type)
				.append("]")
				.toString();
	}

	// fluent

	public PropertyTypeTwo type(Type newType) {
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

@io.micronaut.serde.annotation.Serdeable
public enum Type {

	TWO("two");

	public static final java.lang.String TWO_VALUE = "two";

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
