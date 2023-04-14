package testmodel.micronaut_pojo;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class EnumerationModel {

	public static final java.lang.String JSON_PROPERTY_STRING = "string";
	public static final java.lang.String JSON_PROPERTY_STRING_DEFAULT = "string-default";
	public static final java.lang.String JSON_PROPERTY_EMBEDDED = "embedded";
	public static final java.lang.String JSON_PROPERTY_EMBEDDED_DEFAULT = "embedded-default";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_STRING)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private EnumerationString string;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_STRING_DEFAULT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private EnumerationStringDefault stringDefault = EnumerationStringDefault.THREE;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_EMBEDDED)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private Embedded embedded;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_EMBEDDED_DEFAULT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private EmbeddedDefault embeddedDefault = EmbeddedDefault.FOUR;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		EnumerationModel other = (EnumerationModel) object;
		return java.util.Objects.equals(string, other.string)
				&& java.util.Objects.equals(stringDefault, other.stringDefault)
				&& java.util.Objects.equals(embedded, other.embedded)
				&& java.util.Objects.equals(embeddedDefault, other.embeddedDefault);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(string, stringDefault, embedded, embeddedDefault);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("EnumerationModel[")
				.append("string=").append(string).append(",")
				.append("stringDefault=").append(stringDefault).append(",")
				.append("embedded=").append(embedded).append(",")
				.append("embeddedDefault=").append(embeddedDefault)
				.append("]")
				.toString();
	}

	// fluent

	public EnumerationModel string(EnumerationString newString) {
		this.string = newString;
		return this;
	}

	public EnumerationModel stringDefault(EnumerationStringDefault newStringDefault) {
		this.stringDefault = newStringDefault;
		return this;
	}

	public EnumerationModel embedded(Embedded newEmbedded) {
		this.embedded = newEmbedded;
		return this;
	}

	public EnumerationModel embeddedDefault(EmbeddedDefault newEmbeddedDefault) {
		this.embeddedDefault = newEmbeddedDefault;
		return this;
	}

	// getter/setter

	public EnumerationString getString() {
		return string;
	}

	public void setString(EnumerationString newString) {
		this.string = newString;
	}

	public EnumerationStringDefault getStringDefault() {
		return stringDefault;
	}

	public void setStringDefault(EnumerationStringDefault newStringDefault) {
		this.stringDefault = newStringDefault;
	}

	public Embedded getEmbedded() {
		return embedded;
	}

	public void setEmbedded(Embedded newEmbedded) {
		this.embedded = newEmbedded;
	}

	public EmbeddedDefault getEmbeddedDefault() {
		return embeddedDefault;
	}

	public void setEmbeddedDefault(EmbeddedDefault newEmbeddedDefault) {
		this.embeddedDefault = newEmbeddedDefault;
	}

@io.micronaut.core.annotation.Introspected
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

@io.micronaut.core.annotation.Introspected
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
