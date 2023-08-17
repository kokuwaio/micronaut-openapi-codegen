package testmodel.micronaut_record;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record EnumerationModel(

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_STRING)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	EnumerationString string,

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_STRING_DEFAULT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	EnumerationStringDefault stringDefault,

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_EMBEDDED)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	Embedded embedded,

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_EMBEDDED_DEFAULT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	EmbeddedDefault embeddedDefault) {

	public static final java.lang.String JSON_PROPERTY_STRING = "string";
	public static final java.lang.String JSON_PROPERTY_STRING_DEFAULT = "string-default";
	public static final java.lang.String JSON_PROPERTY_EMBEDDED = "embedded";
	public static final java.lang.String JSON_PROPERTY_EMBEDDED_DEFAULT = "embedded-default";

public enum Embedded {

	FIRST("first"),
	SECOND("second");

	public static final java.lang.String FIRST_VALUE = "first";
	public static final java.lang.String SECOND_VALUE = "second";

	private final java.lang.String value;

	private Embedded(java.lang.String value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static Embedded toEnum(java.lang.String value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<Embedded> toOptional(java.lang.String value) {
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

public enum EmbeddedDefault {

	THREE("three"),
	FOUR("four");

	public static final java.lang.String THREE_VALUE = "three";
	public static final java.lang.String FOUR_VALUE = "four";

	private final java.lang.String value;

	private EmbeddedDefault(java.lang.String value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static EmbeddedDefault toEnum(java.lang.String value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<EmbeddedDefault> toOptional(java.lang.String value) {
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
