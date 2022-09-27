package testmodel.examples;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class SecondLevelOneModel implements SecondLevelModel {
	public static final java.lang.String JSON_PROPERTY_TYPE = "type";
	public static final java.lang.String JSON_PROPERTY_ONE = "one";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_TYPE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String type;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ONE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String one;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		SecondLevelOneModel other = (SecondLevelOneModel) object;
		return java.util.Objects.equals(type, other.type)
				&& java.util.Objects.equals(one, other.one);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(type, one);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("SecondLevelOneModel[")
				.append("type=").append(type).append(",")
				.append("one=").append(one)
				.append("]")
				.toString();
	}

	// fluent

	public SecondLevelOneModel type(java.lang.String newType) {
		this.type = newType;
		return this;
	}

	public SecondLevelOneModel one(java.lang.String newOne) {
		this.one = newOne;
		return this;
	}


	public java.lang.String getType() {
		return type;
	}

	public void setType(java.lang.String newType) {
		this.type = newType;
	}

	public java.lang.String getOne() {
		return one;
	}

	public void setOne(java.lang.String newOne) {
		this.one = newOne;
	}
}

