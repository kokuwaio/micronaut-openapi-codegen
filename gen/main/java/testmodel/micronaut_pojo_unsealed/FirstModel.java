package testmodel.micronaut_pojo_unsealed;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(as = FirstModel.class)
public class FirstModel implements OneOfModel {

	@com.fasterxml.jackson.annotation.JsonProperty("type")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String type;

	@com.fasterxml.jackson.annotation.JsonProperty("first")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String first;

	@jakarta.validation.Valid
	@com.fasterxml.jackson.annotation.JsonProperty("secondLevel")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private SecondLevelModel secondLevel;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		FirstModel other = (FirstModel) object;
		return java.util.Objects.equals(type, other.type)
				&& java.util.Objects.equals(first, other.first)
				&& java.util.Objects.equals(secondLevel, other.secondLevel);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(type, first, secondLevel);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("FirstModel[")
				.append("type=").append(type).append(",")
				.append("first=").append(first).append(",")
				.append("secondLevel=").append(secondLevel)
				.append("]")
				.toString();
	}

	// fluent

	public FirstModel type(java.lang.String newType) {
		this.type = newType;
		return this;
	}

	public FirstModel first(java.lang.String newFirst) {
		this.first = newFirst;
		return this;
	}

	public FirstModel secondLevel(SecondLevelModel newSecondLevel) {
		this.secondLevel = newSecondLevel;
		return this;
	}

	// getter/setter

	public java.lang.String getType() {
		return type;
	}

	public void setType(java.lang.String newType) {
		this.type = newType;
	}

	public java.lang.String getFirst() {
		return first;
	}

	public void setFirst(java.lang.String newFirst) {
		this.first = newFirst;
	}

	public SecondLevelModel getSecondLevel() {
		return secondLevel;
	}

	public void setSecondLevel(SecondLevelModel newSecondLevel) {
		this.secondLevel = newSecondLevel;
	}
}
