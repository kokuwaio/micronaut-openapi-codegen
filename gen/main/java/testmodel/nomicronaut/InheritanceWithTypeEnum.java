package testmodel.nomicronaut;


public enum InheritanceWithTypeEnum {

	INHERITANCEWITHTYPE1("InheritanceWithType1"),
	INHERITANCEWITHTYPE2("InheritanceWithType2"),
	INHERITANCEWITHTYPE3("InheritanceWithType3");

	public static final java.lang.String INHERITANCEWITHTYPE1_VALUE = "InheritanceWithType1";
	public static final java.lang.String INHERITANCEWITHTYPE2_VALUE = "InheritanceWithType2";
	public static final java.lang.String INHERITANCEWITHTYPE3_VALUE = "InheritanceWithType3";

	private final java.lang.String value;

	private InheritanceWithTypeEnum(java.lang.String value) {
		this.value = value;
	}

	@com.fasterxml.jackson.annotation.JsonCreator
	public static InheritanceWithTypeEnum toEnum(java.lang.String value) {
		return toOptional(value).orElseThrow(() -> new IllegalArgumentException("Unknown value '" + value + "'."));
	}

	public static java.util.Optional<InheritanceWithTypeEnum> toOptional(java.lang.String value) {
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
