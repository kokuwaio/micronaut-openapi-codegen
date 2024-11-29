package testmodel.nomicronaut;


public enum InheritanceWithEnumTypeEnum {

	INHERITANCE1("Inheritance1"),
	INHERITANCE2("Inheritance2"),
	INHERITANCE3("Inheritance3");

	public static final java.lang.String INHERITANCE1_VALUE = "Inheritance1";
	public static final java.lang.String INHERITANCE2_VALUE = "Inheritance2";
	public static final java.lang.String INHERITANCE3_VALUE = "Inheritance3";

	private final java.lang.String value;

	private InheritanceWithEnumTypeEnum(java.lang.String value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static InheritanceWithEnumTypeEnum toEnum(java.lang.String value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<InheritanceWithEnumTypeEnum> toOptional(java.lang.String value) {
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
