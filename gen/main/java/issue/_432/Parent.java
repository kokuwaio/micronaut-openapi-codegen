package issue._432;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(as = ParentDefault.class)
public sealed interface Parent permits Child, ParentDefault {


	@com.fasterxml.jackson.annotation.JsonProperty("id")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String getId();

	@com.fasterxml.jackson.annotation.JsonProperty("id")
	void setId(java.lang.String newId);

	@com.fasterxml.jackson.annotation.JsonProperty("state")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	State getState();

	@com.fasterxml.jackson.annotation.JsonProperty("state")
	void setState(State newState);

@io.micronaut.serde.annotation.Serdeable
public enum State {

	ON("on"),
	OFF("off");

	public static final java.lang.String ON_VALUE = "on";
	public static final java.lang.String OFF_VALUE = "off";

	private final java.lang.String value;

	private State(java.lang.String value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static State toEnum(java.lang.String value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<State> toOptional(java.lang.String value) {
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
