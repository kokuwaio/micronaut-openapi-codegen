package issue._363._true;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public enum EnumWithPrefix {

	FOO("aaa_foo"),
	BAR("aaa_bar");

	public static final java.lang.String FOO_VALUE = "aaa_foo";
	public static final java.lang.String BAR_VALUE = "aaa_bar";

	private final java.lang.String value;

	private EnumWithPrefix(java.lang.String value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static EnumWithPrefix toEnum(java.lang.String value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<EnumWithPrefix> toOptional(java.lang.String value) {
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
