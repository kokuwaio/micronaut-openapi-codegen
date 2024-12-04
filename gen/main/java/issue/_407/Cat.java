package issue._407;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public final class Cat implements Pet {

	@com.fasterxml.jackson.annotation.JsonProperty("hunts")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Boolean hunts;

	@com.fasterxml.jackson.annotation.JsonProperty("age")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer age;

	@Override
	public PetType getPetType() {
		return PetType.CAT;
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
		Cat other = (Cat) object;
		return java.util.Objects.equals(hunts, other.hunts)
				&& java.util.Objects.equals(age, other.age);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(hunts, age);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("Cat[")
				.append("hunts=").append(hunts).append(",")
				.append("age=").append(age)
				.append("]")
				.toString();
	}

	// fluent

	public Cat hunts(java.lang.Boolean newHunts) {
		this.hunts = newHunts;
		return this;
	}

	public Cat age(java.lang.Integer newAge) {
		this.age = newAge;
		return this;
	}

	// getter/setter

	public java.lang.Boolean getHunts() {
		return hunts;
	}

	public void setHunts(java.lang.Boolean newHunts) {
		this.hunts = newHunts;
	}

	public java.lang.Integer getAge() {
		return age;
	}

	public void setAge(java.lang.Integer newAge) {
		this.age = newAge;
	}
}
