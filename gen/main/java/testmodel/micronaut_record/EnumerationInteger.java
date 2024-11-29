package testmodel.micronaut_record;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public enum EnumerationInteger {

	NUMBER_MINUS_2147483648(-2147483648),
	NUMBER_MINUS_1(-1),
	NUMBER_0(0),
	NUMBER_1(1),
	NUMBER_2147483647(2147483647);

	public static final java.lang.Integer NUMBER_MINUS_2147483648_VALUE = -2147483648;
	public static final java.lang.Integer NUMBER_MINUS_1_VALUE = -1;
	public static final java.lang.Integer NUMBER_0_VALUE = 0;
	public static final java.lang.Integer NUMBER_1_VALUE = 1;
	public static final java.lang.Integer NUMBER_2147483647_VALUE = 2147483647;

	private final java.lang.Integer value;

	private EnumerationInteger(java.lang.Integer value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static EnumerationInteger toEnum(java.lang.Integer value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<EnumerationInteger> toOptional(java.lang.Integer value) {
		return java.util.Arrays
				.stream(values())
				.filter(e -> e.value.equals(value))
				.findAny();
	}

	@com.fasterxml.jackson.annotation.JsonValue
	public java.lang.Integer getValue() {
		return value;
	}
}
