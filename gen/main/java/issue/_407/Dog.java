package issue._407;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(as = Dog.class)
public final class Dog implements Pet {

	@com.fasterxml.jackson.annotation.JsonProperty("bark")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Boolean bark;

	@com.fasterxml.jackson.annotation.JsonProperty("breed")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private Breed breed;

	@Override
	public PetType getPetType() {
		return PetType.DOG;
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
		Dog other = (Dog) object;
		return java.util.Objects.equals(bark, other.bark)
				&& java.util.Objects.equals(breed, other.breed);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(bark, breed);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("Dog[")
				.append("bark=").append(bark).append(",")
				.append("breed=").append(breed)
				.append("]")
				.toString();
	}

	// fluent

	public Dog bark(java.lang.Boolean newBark) {
		this.bark = newBark;
		return this;
	}

	public Dog breed(Breed newBreed) {
		this.breed = newBreed;
		return this;
	}

	// getter/setter

	public java.lang.Boolean getBark() {
		return bark;
	}

	public void setBark(java.lang.Boolean newBark) {
		this.bark = newBark;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed newBreed) {
		this.breed = newBreed;
	}

@io.micronaut.serde.annotation.Serdeable
public enum Breed {

	DINGO("Dingo"),
	HUSKY("Husky"),
	RETRIEVER("Retriever"),
	SHEPHERD("Shepherd");

	public static final java.lang.String DINGO_VALUE = "Dingo";
	public static final java.lang.String HUSKY_VALUE = "Husky";
	public static final java.lang.String RETRIEVER_VALUE = "Retriever";
	public static final java.lang.String SHEPHERD_VALUE = "Shepherd";

	private final java.lang.String value;

	private Breed(java.lang.String value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static Breed toEnum(java.lang.String value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<Breed> toOptional(java.lang.String value) {
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
