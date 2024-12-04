package issue._331;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public class ModelComplex {

	@jakarta.validation.constraints.Size(max = 4)
	@com.fasterxml.jackson.annotation.JsonProperty("string")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String string;

	@com.fasterxml.jackson.annotation.JsonProperty("stringWithoutValidation")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private org.openapitools.jackson.nullable.JsonNullable<java.lang.String> stringWithoutValidation = org.openapitools.jackson.nullable.JsonNullable.undefined();

	@com.fasterxml.jackson.annotation.JsonProperty("stringWithEmail")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String stringWithEmail;

	@jakarta.validation.constraints.Pattern(regexp = "^\\.[0-9]{3}$")
	@com.fasterxml.jackson.annotation.JsonProperty("stringWithPattern")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String stringWithPattern;

	@jakarta.validation.constraints.Size(min = 3)
	@com.fasterxml.jackson.annotation.JsonProperty("stringWithMinimum")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String stringWithMinimum;

	@jakarta.validation.constraints.Size(max = 4)
	@com.fasterxml.jackson.annotation.JsonProperty("stringWithMaximum")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String stringWithMaximum;

	@jakarta.validation.constraints.Size(min = 3, max = 4)
	@com.fasterxml.jackson.annotation.JsonProperty("stringWithMinimumAndMaximum")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String stringWithMinimumAndMaximum;

	@com.fasterxml.jackson.annotation.JsonProperty("integerWithoutValidation")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private org.openapitools.jackson.nullable.JsonNullable<java.lang.Integer> integerWithoutValidation = org.openapitools.jackson.nullable.JsonNullable.undefined();

	@jakarta.validation.constraints.Min(3)
	@com.fasterxml.jackson.annotation.JsonProperty("integerWithMinimum")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer integerWithMinimum;

	@jakarta.validation.constraints.Max(4)
	@com.fasterxml.jackson.annotation.JsonProperty("integerWithMaximum")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer integerWithMaximum;

	@jakarta.validation.constraints.Min(3)
	@jakarta.validation.constraints.Max(4)
	@com.fasterxml.jackson.annotation.JsonProperty("integerWithMinimumAndMaximum")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer integerWithMinimumAndMaximum;

	@com.fasterxml.jackson.annotation.JsonProperty("numberWithoutValidation")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private org.openapitools.jackson.nullable.JsonNullable<java.lang.Double> numberWithoutValidation = org.openapitools.jackson.nullable.JsonNullable.undefined();

	@jakarta.validation.constraints.DecimalMin(value = "3.11111", inclusive = true)
	@com.fasterxml.jackson.annotation.JsonProperty("numberWithMinimum")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Double numberWithMinimum;

	@jakarta.validation.constraints.DecimalMin(value = "3.11112", inclusive = true)
	@com.fasterxml.jackson.annotation.JsonProperty("numberWithMinimumExclusiveFalse")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Double numberWithMinimumExclusiveFalse;

	@jakarta.validation.constraints.DecimalMin(value = "3.11113", inclusive = false)
	@com.fasterxml.jackson.annotation.JsonProperty("numberWithMinimumExclusiveTrue")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Double numberWithMinimumExclusiveTrue;

	@jakarta.validation.constraints.DecimalMax(value = "4.22221", inclusive = true)
	@com.fasterxml.jackson.annotation.JsonProperty("numberWithMaximum")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Double numberWithMaximum;

	@jakarta.validation.constraints.DecimalMax(value = "4.22222", inclusive = true)
	@com.fasterxml.jackson.annotation.JsonProperty("numberWithMaximumExclusiveFalse")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Double numberWithMaximumExclusiveFalse;

	@jakarta.validation.constraints.DecimalMax(value = "4.22223", inclusive = false)
	@com.fasterxml.jackson.annotation.JsonProperty("numberWithMaximumExclusiveTrue")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Double numberWithMaximumExclusiveTrue;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ModelComplex other = (ModelComplex) object;
		return java.util.Objects.equals(string, other.string)
				&& java.util.Objects.equals(stringWithoutValidation, other.stringWithoutValidation)
				&& java.util.Objects.equals(stringWithEmail, other.stringWithEmail)
				&& java.util.Objects.equals(stringWithPattern, other.stringWithPattern)
				&& java.util.Objects.equals(stringWithMinimum, other.stringWithMinimum)
				&& java.util.Objects.equals(stringWithMaximum, other.stringWithMaximum)
				&& java.util.Objects.equals(stringWithMinimumAndMaximum, other.stringWithMinimumAndMaximum)
				&& java.util.Objects.equals(integerWithoutValidation, other.integerWithoutValidation)
				&& java.util.Objects.equals(integerWithMinimum, other.integerWithMinimum)
				&& java.util.Objects.equals(integerWithMaximum, other.integerWithMaximum)
				&& java.util.Objects.equals(integerWithMinimumAndMaximum, other.integerWithMinimumAndMaximum)
				&& java.util.Objects.equals(numberWithoutValidation, other.numberWithoutValidation)
				&& java.util.Objects.equals(numberWithMinimum, other.numberWithMinimum)
				&& java.util.Objects.equals(numberWithMinimumExclusiveFalse, other.numberWithMinimumExclusiveFalse)
				&& java.util.Objects.equals(numberWithMinimumExclusiveTrue, other.numberWithMinimumExclusiveTrue)
				&& java.util.Objects.equals(numberWithMaximum, other.numberWithMaximum)
				&& java.util.Objects.equals(numberWithMaximumExclusiveFalse, other.numberWithMaximumExclusiveFalse)
				&& java.util.Objects.equals(numberWithMaximumExclusiveTrue, other.numberWithMaximumExclusiveTrue);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(string, stringWithoutValidation, stringWithEmail, stringWithPattern, stringWithMinimum, stringWithMaximum, stringWithMinimumAndMaximum, integerWithoutValidation, integerWithMinimum, integerWithMaximum, integerWithMinimumAndMaximum, numberWithoutValidation, numberWithMinimum, numberWithMinimumExclusiveFalse, numberWithMinimumExclusiveTrue, numberWithMaximum, numberWithMaximumExclusiveFalse, numberWithMaximumExclusiveTrue);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("ModelComplex[")
				.append("string=").append(string).append(",")
				.append("stringWithoutValidation=").append(stringWithoutValidation).append(",")
				.append("stringWithEmail=").append(stringWithEmail).append(",")
				.append("stringWithPattern=").append(stringWithPattern).append(",")
				.append("stringWithMinimum=").append(stringWithMinimum).append(",")
				.append("stringWithMaximum=").append(stringWithMaximum).append(",")
				.append("stringWithMinimumAndMaximum=").append(stringWithMinimumAndMaximum).append(",")
				.append("integerWithoutValidation=").append(integerWithoutValidation).append(",")
				.append("integerWithMinimum=").append(integerWithMinimum).append(",")
				.append("integerWithMaximum=").append(integerWithMaximum).append(",")
				.append("integerWithMinimumAndMaximum=").append(integerWithMinimumAndMaximum).append(",")
				.append("numberWithoutValidation=").append(numberWithoutValidation).append(",")
				.append("numberWithMinimum=").append(numberWithMinimum).append(",")
				.append("numberWithMinimumExclusiveFalse=").append(numberWithMinimumExclusiveFalse).append(",")
				.append("numberWithMinimumExclusiveTrue=").append(numberWithMinimumExclusiveTrue).append(",")
				.append("numberWithMaximum=").append(numberWithMaximum).append(",")
				.append("numberWithMaximumExclusiveFalse=").append(numberWithMaximumExclusiveFalse).append(",")
				.append("numberWithMaximumExclusiveTrue=").append(numberWithMaximumExclusiveTrue)
				.append("]")
				.toString();
	}

	// fluent

	public ModelComplex string(java.lang.String newString) {
		this.string = newString;
		return this;
	}

	public ModelComplex stringWithoutValidation(org.openapitools.jackson.nullable.JsonNullable<java.lang.String> newStringWithoutValidation) {
		this.stringWithoutValidation = newStringWithoutValidation;
		return this;
	}

	public ModelComplex stringWithEmail(java.lang.String newStringWithEmail) {
		this.stringWithEmail = newStringWithEmail;
		return this;
	}

	public ModelComplex stringWithPattern(java.lang.String newStringWithPattern) {
		this.stringWithPattern = newStringWithPattern;
		return this;
	}

	public ModelComplex stringWithMinimum(java.lang.String newStringWithMinimum) {
		this.stringWithMinimum = newStringWithMinimum;
		return this;
	}

	public ModelComplex stringWithMaximum(java.lang.String newStringWithMaximum) {
		this.stringWithMaximum = newStringWithMaximum;
		return this;
	}

	public ModelComplex stringWithMinimumAndMaximum(java.lang.String newStringWithMinimumAndMaximum) {
		this.stringWithMinimumAndMaximum = newStringWithMinimumAndMaximum;
		return this;
	}

	public ModelComplex integerWithoutValidation(org.openapitools.jackson.nullable.JsonNullable<java.lang.Integer> newIntegerWithoutValidation) {
		this.integerWithoutValidation = newIntegerWithoutValidation;
		return this;
	}

	public ModelComplex integerWithMinimum(java.lang.Integer newIntegerWithMinimum) {
		this.integerWithMinimum = newIntegerWithMinimum;
		return this;
	}

	public ModelComplex integerWithMaximum(java.lang.Integer newIntegerWithMaximum) {
		this.integerWithMaximum = newIntegerWithMaximum;
		return this;
	}

	public ModelComplex integerWithMinimumAndMaximum(java.lang.Integer newIntegerWithMinimumAndMaximum) {
		this.integerWithMinimumAndMaximum = newIntegerWithMinimumAndMaximum;
		return this;
	}

	public ModelComplex numberWithoutValidation(org.openapitools.jackson.nullable.JsonNullable<java.lang.Double> newNumberWithoutValidation) {
		this.numberWithoutValidation = newNumberWithoutValidation;
		return this;
	}

	public ModelComplex numberWithMinimum(java.lang.Double newNumberWithMinimum) {
		this.numberWithMinimum = newNumberWithMinimum;
		return this;
	}

	public ModelComplex numberWithMinimumExclusiveFalse(java.lang.Double newNumberWithMinimumExclusiveFalse) {
		this.numberWithMinimumExclusiveFalse = newNumberWithMinimumExclusiveFalse;
		return this;
	}

	public ModelComplex numberWithMinimumExclusiveTrue(java.lang.Double newNumberWithMinimumExclusiveTrue) {
		this.numberWithMinimumExclusiveTrue = newNumberWithMinimumExclusiveTrue;
		return this;
	}

	public ModelComplex numberWithMaximum(java.lang.Double newNumberWithMaximum) {
		this.numberWithMaximum = newNumberWithMaximum;
		return this;
	}

	public ModelComplex numberWithMaximumExclusiveFalse(java.lang.Double newNumberWithMaximumExclusiveFalse) {
		this.numberWithMaximumExclusiveFalse = newNumberWithMaximumExclusiveFalse;
		return this;
	}

	public ModelComplex numberWithMaximumExclusiveTrue(java.lang.Double newNumberWithMaximumExclusiveTrue) {
		this.numberWithMaximumExclusiveTrue = newNumberWithMaximumExclusiveTrue;
		return this;
	}

	// getter/setter

	public java.lang.String getString() {
		return string;
	}

	public void setString(java.lang.String newString) {
		this.string = newString;
	}

	public org.openapitools.jackson.nullable.JsonNullable<java.lang.String> getStringWithoutValidation() {
		return stringWithoutValidation;
	}

	public void setStringWithoutValidation(org.openapitools.jackson.nullable.JsonNullable<java.lang.String> newStringWithoutValidation) {
		this.stringWithoutValidation = newStringWithoutValidation;
	}

	public java.lang.String getStringWithEmail() {
		return stringWithEmail;
	}

	public void setStringWithEmail(java.lang.String newStringWithEmail) {
		this.stringWithEmail = newStringWithEmail;
	}

	public java.lang.String getStringWithPattern() {
		return stringWithPattern;
	}

	public void setStringWithPattern(java.lang.String newStringWithPattern) {
		this.stringWithPattern = newStringWithPattern;
	}

	public java.lang.String getStringWithMinimum() {
		return stringWithMinimum;
	}

	public void setStringWithMinimum(java.lang.String newStringWithMinimum) {
		this.stringWithMinimum = newStringWithMinimum;
	}

	public java.lang.String getStringWithMaximum() {
		return stringWithMaximum;
	}

	public void setStringWithMaximum(java.lang.String newStringWithMaximum) {
		this.stringWithMaximum = newStringWithMaximum;
	}

	public java.lang.String getStringWithMinimumAndMaximum() {
		return stringWithMinimumAndMaximum;
	}

	public void setStringWithMinimumAndMaximum(java.lang.String newStringWithMinimumAndMaximum) {
		this.stringWithMinimumAndMaximum = newStringWithMinimumAndMaximum;
	}

	public org.openapitools.jackson.nullable.JsonNullable<java.lang.Integer> getIntegerWithoutValidation() {
		return integerWithoutValidation;
	}

	public void setIntegerWithoutValidation(org.openapitools.jackson.nullable.JsonNullable<java.lang.Integer> newIntegerWithoutValidation) {
		this.integerWithoutValidation = newIntegerWithoutValidation;
	}

	public java.lang.Integer getIntegerWithMinimum() {
		return integerWithMinimum;
	}

	public void setIntegerWithMinimum(java.lang.Integer newIntegerWithMinimum) {
		this.integerWithMinimum = newIntegerWithMinimum;
	}

	public java.lang.Integer getIntegerWithMaximum() {
		return integerWithMaximum;
	}

	public void setIntegerWithMaximum(java.lang.Integer newIntegerWithMaximum) {
		this.integerWithMaximum = newIntegerWithMaximum;
	}

	public java.lang.Integer getIntegerWithMinimumAndMaximum() {
		return integerWithMinimumAndMaximum;
	}

	public void setIntegerWithMinimumAndMaximum(java.lang.Integer newIntegerWithMinimumAndMaximum) {
		this.integerWithMinimumAndMaximum = newIntegerWithMinimumAndMaximum;
	}

	public org.openapitools.jackson.nullable.JsonNullable<java.lang.Double> getNumberWithoutValidation() {
		return numberWithoutValidation;
	}

	public void setNumberWithoutValidation(org.openapitools.jackson.nullable.JsonNullable<java.lang.Double> newNumberWithoutValidation) {
		this.numberWithoutValidation = newNumberWithoutValidation;
	}

	public java.lang.Double getNumberWithMinimum() {
		return numberWithMinimum;
	}

	public void setNumberWithMinimum(java.lang.Double newNumberWithMinimum) {
		this.numberWithMinimum = newNumberWithMinimum;
	}

	public java.lang.Double getNumberWithMinimumExclusiveFalse() {
		return numberWithMinimumExclusiveFalse;
	}

	public void setNumberWithMinimumExclusiveFalse(java.lang.Double newNumberWithMinimumExclusiveFalse) {
		this.numberWithMinimumExclusiveFalse = newNumberWithMinimumExclusiveFalse;
	}

	public java.lang.Double getNumberWithMinimumExclusiveTrue() {
		return numberWithMinimumExclusiveTrue;
	}

	public void setNumberWithMinimumExclusiveTrue(java.lang.Double newNumberWithMinimumExclusiveTrue) {
		this.numberWithMinimumExclusiveTrue = newNumberWithMinimumExclusiveTrue;
	}

	public java.lang.Double getNumberWithMaximum() {
		return numberWithMaximum;
	}

	public void setNumberWithMaximum(java.lang.Double newNumberWithMaximum) {
		this.numberWithMaximum = newNumberWithMaximum;
	}

	public java.lang.Double getNumberWithMaximumExclusiveFalse() {
		return numberWithMaximumExclusiveFalse;
	}

	public void setNumberWithMaximumExclusiveFalse(java.lang.Double newNumberWithMaximumExclusiveFalse) {
		this.numberWithMaximumExclusiveFalse = newNumberWithMaximumExclusiveFalse;
	}

	public java.lang.Double getNumberWithMaximumExclusiveTrue() {
		return numberWithMaximumExclusiveTrue;
	}

	public void setNumberWithMaximumExclusiveTrue(java.lang.Double newNumberWithMaximumExclusiveTrue) {
		this.numberWithMaximumExclusiveTrue = newNumberWithMaximumExclusiveTrue;
	}
}
