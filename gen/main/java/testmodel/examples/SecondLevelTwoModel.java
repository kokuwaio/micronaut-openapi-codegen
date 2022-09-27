package testmodel.examples;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class SecondLevelTwoModel implements SecondLevelModel {
	public static final java.lang.String JSON_PROPERTY_TYPE = "type";
	public static final java.lang.String JSON_PROPERTY_TWO = "two";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String type;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TWO)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String two;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		SecondLevelTwoModel other = (SecondLevelTwoModel) object;
		return java.util.Objects.equals(type, other.type)
				&& java.util.Objects.equals(two, other.two);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(type, two);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("SecondLevelTwoModel[")
				.append("type=").append(type).append(",")
				.append("two=").append(two)
				.append("]")
				.toString();
	}

	// fluent

	public SecondLevelTwoModel type(java.lang.String newType) {
		this.type = newType;
		return this;
	}

	public SecondLevelTwoModel two(java.lang.String newTwo) {
		this.two = newTwo;
		return this;
	}


	public java.lang.String getType() {
		return type;
	}

	public void setType(java.lang.String newType) {
		this.type = newType;
	}

	public java.lang.String getTwo() {
		return two;
	}

	public void setTwo(java.lang.String newTwo) {
		this.two = newTwo;
	}
}

