package issue._414;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
public enum ModelPrefixModelEnumModelSuffix {

	FOO("foo"),
	BAR("bar");

	public static final java.lang.String FOO_VALUE = "foo";
	public static final java.lang.String BAR_VALUE = "bar";

	private final java.lang.String value;

	private ModelPrefixModelEnumModelSuffix(java.lang.String value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static ModelPrefixModelEnumModelSuffix toEnum(java.lang.String value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<ModelPrefixModelEnumModelSuffix> toOptional(java.lang.String value) {
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
