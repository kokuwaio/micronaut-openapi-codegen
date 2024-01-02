package issue._331;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class ModelString {

	public static final java.lang.String JSON_PROPERTY_WITHOUT_VALIDATION = "withoutValidation";
	public static final java.lang.String JSON_PROPERTY_WITH_ENUM = "withEnum";
	public static final java.lang.String JSON_PROPERTY_WITH_EMAIL = "withEmail";
	public static final java.lang.String JSON_PROPERTY_WITH_PATTERN = "withPattern";
	public static final java.lang.String JSON_PROPERTY_WITH_MINIMUM = "withMinimum";
	public static final java.lang.String JSON_PROPERTY_WITH_MAXIMUM = "withMaximum";
	public static final java.lang.String JSON_PROPERTY_WITH_MINIMUM_AND_MAXIMUM = "withMinimumAndMaximum";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_WITHOUT_VALIDATION)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.String> withoutValidation;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_WITH_ENUM)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<@javax.validation.constraints.NotNull StringWithEnum> withEnum;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_WITH_EMAIL)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Email String> withEmail;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_WITH_PATTERN)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Pattern(regexp = "^\\.[0-9]{3}$") String> withPattern;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_WITH_MINIMUM)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(min = 3) String> withMinimum;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_WITH_MAXIMUM)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(max = 4) String> withMaximum;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_WITH_MINIMUM_AND_MAXIMUM)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(min = 3, max = 4) String> withMinimumAndMaximum;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ModelString other = (ModelString) object;
		return java.util.Objects.equals(withoutValidation, other.withoutValidation)
				&& java.util.Objects.equals(withEnum, other.withEnum)
				&& java.util.Objects.equals(withEmail, other.withEmail)
				&& java.util.Objects.equals(withPattern, other.withPattern)
				&& java.util.Objects.equals(withMinimum, other.withMinimum)
				&& java.util.Objects.equals(withMaximum, other.withMaximum)
				&& java.util.Objects.equals(withMinimumAndMaximum, other.withMinimumAndMaximum);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(withoutValidation, withEnum, withEmail, withPattern, withMinimum, withMaximum, withMinimumAndMaximum);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("ModelString[")
				.append("withoutValidation=").append(withoutValidation).append(",")
				.append("withEnum=").append(withEnum).append(",")
				.append("withEmail=").append(withEmail).append(",")
				.append("withPattern=").append(withPattern).append(",")
				.append("withMinimum=").append(withMinimum).append(",")
				.append("withMaximum=").append(withMaximum).append(",")
				.append("withMinimumAndMaximum=").append(withMinimumAndMaximum)
				.append("]")
				.toString();
	}

	// fluent

	public ModelString withoutValidation(java.util.List<java.lang.String> newWithoutValidation) {
		this.withoutValidation = newWithoutValidation;
		return this;
	}
	
	public ModelString addWithoutValidationItem(java.lang.String withoutValidationItem) {
		if (this.withoutValidation == null) {
			this.withoutValidation = new java.util.ArrayList<>();
		}
		this.withoutValidation.add(withoutValidationItem);
		return this;
	}

	public ModelString removeWithoutValidationItem(java.lang.String withoutValidationItem) {
		if (this.withoutValidation != null) {
			this.withoutValidation.remove(withoutValidationItem);
		}
		return this;
	}

	public ModelString withEnum(java.util.List<@javax.validation.constraints.NotNull StringWithEnum> newWithEnum) {
		this.withEnum = newWithEnum;
		return this;
	}
	
	public ModelString addWithEnumItem(StringWithEnum withEnumItem) {
		if (this.withEnum == null) {
			this.withEnum = new java.util.ArrayList<>();
		}
		this.withEnum.add(withEnumItem);
		return this;
	}

	public ModelString removeWithEnumItem(StringWithEnum withEnumItem) {
		if (this.withEnum != null) {
			this.withEnum.remove(withEnumItem);
		}
		return this;
	}

	public ModelString withEmail(java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Email String> newWithEmail) {
		this.withEmail = newWithEmail;
		return this;
	}
	
	public ModelString addWithEmailItem(java.lang.String withEmailItem) {
		if (this.withEmail == null) {
			this.withEmail = new java.util.ArrayList<>();
		}
		this.withEmail.add(withEmailItem);
		return this;
	}

	public ModelString removeWithEmailItem(java.lang.String withEmailItem) {
		if (this.withEmail != null) {
			this.withEmail.remove(withEmailItem);
		}
		return this;
	}

	public ModelString withPattern(java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Pattern(regexp = "^\\.[0-9]{3}$") String> newWithPattern) {
		this.withPattern = newWithPattern;
		return this;
	}
	
	public ModelString addWithPatternItem(java.lang.String withPatternItem) {
		if (this.withPattern == null) {
			this.withPattern = new java.util.ArrayList<>();
		}
		this.withPattern.add(withPatternItem);
		return this;
	}

	public ModelString removeWithPatternItem(java.lang.String withPatternItem) {
		if (this.withPattern != null) {
			this.withPattern.remove(withPatternItem);
		}
		return this;
	}

	public ModelString withMinimum(java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(min = 3) String> newWithMinimum) {
		this.withMinimum = newWithMinimum;
		return this;
	}
	
	public ModelString addWithMinimumItem(java.lang.String withMinimumItem) {
		if (this.withMinimum == null) {
			this.withMinimum = new java.util.ArrayList<>();
		}
		this.withMinimum.add(withMinimumItem);
		return this;
	}

	public ModelString removeWithMinimumItem(java.lang.String withMinimumItem) {
		if (this.withMinimum != null) {
			this.withMinimum.remove(withMinimumItem);
		}
		return this;
	}

	public ModelString withMaximum(java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(max = 4) String> newWithMaximum) {
		this.withMaximum = newWithMaximum;
		return this;
	}
	
	public ModelString addWithMaximumItem(java.lang.String withMaximumItem) {
		if (this.withMaximum == null) {
			this.withMaximum = new java.util.ArrayList<>();
		}
		this.withMaximum.add(withMaximumItem);
		return this;
	}

	public ModelString removeWithMaximumItem(java.lang.String withMaximumItem) {
		if (this.withMaximum != null) {
			this.withMaximum.remove(withMaximumItem);
		}
		return this;
	}

	public ModelString withMinimumAndMaximum(java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(min = 3, max = 4) String> newWithMinimumAndMaximum) {
		this.withMinimumAndMaximum = newWithMinimumAndMaximum;
		return this;
	}
	
	public ModelString addWithMinimumAndMaximumItem(java.lang.String withMinimumAndMaximumItem) {
		if (this.withMinimumAndMaximum == null) {
			this.withMinimumAndMaximum = new java.util.ArrayList<>();
		}
		this.withMinimumAndMaximum.add(withMinimumAndMaximumItem);
		return this;
	}

	public ModelString removeWithMinimumAndMaximumItem(java.lang.String withMinimumAndMaximumItem) {
		if (this.withMinimumAndMaximum != null) {
			this.withMinimumAndMaximum.remove(withMinimumAndMaximumItem);
		}
		return this;
	}

	// getter/setter

	public java.util.List<java.lang.String> getWithoutValidation() {
		return withoutValidation;
	}

	public void setWithoutValidation(java.util.List<java.lang.String> newWithoutValidation) {
		this.withoutValidation = newWithoutValidation;
	}

	public java.util.List<@javax.validation.constraints.NotNull StringWithEnum> getWithEnum() {
		return withEnum;
	}

	public void setWithEnum(java.util.List<@javax.validation.constraints.NotNull StringWithEnum> newWithEnum) {
		this.withEnum = newWithEnum;
	}

	public java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Email String> getWithEmail() {
		return withEmail;
	}

	public void setWithEmail(java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Email String> newWithEmail) {
		this.withEmail = newWithEmail;
	}

	public java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Pattern(regexp = "^\\.[0-9]{3}$") String> getWithPattern() {
		return withPattern;
	}

	public void setWithPattern(java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Pattern(regexp = "^\\.[0-9]{3}$") String> newWithPattern) {
		this.withPattern = newWithPattern;
	}

	public java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(min = 3) String> getWithMinimum() {
		return withMinimum;
	}

	public void setWithMinimum(java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(min = 3) String> newWithMinimum) {
		this.withMinimum = newWithMinimum;
	}

	public java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(max = 4) String> getWithMaximum() {
		return withMaximum;
	}

	public void setWithMaximum(java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(max = 4) String> newWithMaximum) {
		this.withMaximum = newWithMaximum;
	}

	public java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(min = 3, max = 4) String> getWithMinimumAndMaximum() {
		return withMinimumAndMaximum;
	}

	public void setWithMinimumAndMaximum(java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(min = 3, max = 4) String> newWithMinimumAndMaximum) {
		this.withMinimumAndMaximum = newWithMinimumAndMaximum;
	}
}
