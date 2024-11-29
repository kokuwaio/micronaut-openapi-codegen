package testmodel.nomicronaut;


@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY, property = "type")
@com.fasterxml.jackson.annotation.JsonSubTypes({
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OneOfImplementor1.class, name = "Implementation1"),
	@com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OneOfImplementor2.class, name = "Implementation2"),
})
public sealed interface OneOfInterface permits OneOfImplementor1, OneOfImplementor2 {

	@com.fasterxml.jackson.annotation.JsonProperty("type")
	java.lang.String getType();
}
