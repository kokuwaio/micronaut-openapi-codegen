package issue._407;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY, property = "petType")
@com.fasterxml.jackson.annotation.JsonSubTypes({
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = Cat.class, name = "Cat"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = Dog.class, name = "Dog")
})
public sealed interface Pet permits Cat, Dog {

	@com.fasterxml.jackson.annotation.JsonProperty("petType")
	PetType getPetType();
}
