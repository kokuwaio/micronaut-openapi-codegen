package testmodel.micronaut_pojo_nullable;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public enum EnumerationNumber {

	NUMBER_MINUS_1(-1D),
	NUMBER_0(0D),
	NUMBER_1(1D);

	public static final java.lang.Double NUMBER_MINUS_1_VALUE = -1D;
	public static final java.lang.Double NUMBER_0_VALUE = 0D;
	public static final java.lang.Double NUMBER_1_VALUE = 1D;

	private final java.lang.Double value;

	private EnumerationNumber(java.lang.Double value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static EnumerationNumber toEnum(java.lang.Double value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<EnumerationNumber> toOptional(java.lang.Double value) {
		return java.util.Arrays
				.stream(values())
				.filter(e -> e.value.equals(value))
				.findAny();
	}

	@com.fasterxml.jackson.annotation.JsonValue
	public java.lang.Double getValue() {
		return value;
	}
}
