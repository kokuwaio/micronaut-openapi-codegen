package issue._331;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public class ModelNumber {

	@com.fasterxml.jackson.annotation.JsonProperty("withoutValidation")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<@jakarta.validation.Valid java.lang.Double> withoutValidation;

	@com.fasterxml.jackson.annotation.JsonProperty("withMinimum")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<@jakarta.validation.Valid java.lang.Double> withMinimum;

	@com.fasterxml.jackson.annotation.JsonProperty("withMinimumExclusiveFalse")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<@jakarta.validation.Valid java.lang.Double> withMinimumExclusiveFalse;

	@com.fasterxml.jackson.annotation.JsonProperty("withMinimumExclusiveTrue")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<@jakarta.validation.Valid java.lang.Double> withMinimumExclusiveTrue;

	@com.fasterxml.jackson.annotation.JsonProperty("withMaximum")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<@jakarta.validation.Valid java.lang.Double> withMaximum;

	@com.fasterxml.jackson.annotation.JsonProperty("withMaximumExclusiveFalse")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<@jakarta.validation.Valid java.lang.Double> withMaximumExclusiveFalse;

	@com.fasterxml.jackson.annotation.JsonProperty("withMaximumExclusiveTrue")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<@jakarta.validation.Valid java.lang.Double> withMaximumExclusiveTrue;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ModelNumber other = (ModelNumber) object;
		return java.util.Objects.equals(withoutValidation, other.withoutValidation)
				&& java.util.Objects.equals(withMinimum, other.withMinimum)
				&& java.util.Objects.equals(withMinimumExclusiveFalse, other.withMinimumExclusiveFalse)
				&& java.util.Objects.equals(withMinimumExclusiveTrue, other.withMinimumExclusiveTrue)
				&& java.util.Objects.equals(withMaximum, other.withMaximum)
				&& java.util.Objects.equals(withMaximumExclusiveFalse, other.withMaximumExclusiveFalse)
				&& java.util.Objects.equals(withMaximumExclusiveTrue, other.withMaximumExclusiveTrue);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(withoutValidation, withMinimum, withMinimumExclusiveFalse, withMinimumExclusiveTrue, withMaximum, withMaximumExclusiveFalse, withMaximumExclusiveTrue);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("ModelNumber[")
				.append("withoutValidation=").append(withoutValidation).append(",")
				.append("withMinimum=").append(withMinimum).append(",")
				.append("withMinimumExclusiveFalse=").append(withMinimumExclusiveFalse).append(",")
				.append("withMinimumExclusiveTrue=").append(withMinimumExclusiveTrue).append(",")
				.append("withMaximum=").append(withMaximum).append(",")
				.append("withMaximumExclusiveFalse=").append(withMaximumExclusiveFalse).append(",")
				.append("withMaximumExclusiveTrue=").append(withMaximumExclusiveTrue)
				.append("]")
				.toString();
	}

	// fluent

	public ModelNumber withoutValidation(java.util.List<@jakarta.validation.Valid java.lang.Double> newWithoutValidation) {
		this.withoutValidation = newWithoutValidation;
		return this;
	}
	
	public ModelNumber addWithoutValidationItem(java.lang.Double withoutValidationItem) {
		if (this.withoutValidation == null) {
			this.withoutValidation = new java.util.ArrayList<>();
		}
		this.withoutValidation.add(withoutValidationItem);
		return this;
	}

	public ModelNumber removeWithoutValidationItem(java.lang.Double withoutValidationItem) {
		if (this.withoutValidation != null) {
			this.withoutValidation.remove(withoutValidationItem);
		}
		return this;
	}

	public ModelNumber withMinimum(java.util.List<@jakarta.validation.Valid java.lang.Double> newWithMinimum) {
		this.withMinimum = newWithMinimum;
		return this;
	}
	
	public ModelNumber addWithMinimumItem(java.lang.Double withMinimumItem) {
		if (this.withMinimum == null) {
			this.withMinimum = new java.util.ArrayList<>();
		}
		this.withMinimum.add(withMinimumItem);
		return this;
	}

	public ModelNumber removeWithMinimumItem(java.lang.Double withMinimumItem) {
		if (this.withMinimum != null) {
			this.withMinimum.remove(withMinimumItem);
		}
		return this;
	}

	public ModelNumber withMinimumExclusiveFalse(java.util.List<@jakarta.validation.Valid java.lang.Double> newWithMinimumExclusiveFalse) {
		this.withMinimumExclusiveFalse = newWithMinimumExclusiveFalse;
		return this;
	}
	
	public ModelNumber addWithMinimumExclusiveFalseItem(java.lang.Double withMinimumExclusiveFalseItem) {
		if (this.withMinimumExclusiveFalse == null) {
			this.withMinimumExclusiveFalse = new java.util.ArrayList<>();
		}
		this.withMinimumExclusiveFalse.add(withMinimumExclusiveFalseItem);
		return this;
	}

	public ModelNumber removeWithMinimumExclusiveFalseItem(java.lang.Double withMinimumExclusiveFalseItem) {
		if (this.withMinimumExclusiveFalse != null) {
			this.withMinimumExclusiveFalse.remove(withMinimumExclusiveFalseItem);
		}
		return this;
	}

	public ModelNumber withMinimumExclusiveTrue(java.util.List<@jakarta.validation.Valid java.lang.Double> newWithMinimumExclusiveTrue) {
		this.withMinimumExclusiveTrue = newWithMinimumExclusiveTrue;
		return this;
	}
	
	public ModelNumber addWithMinimumExclusiveTrueItem(java.lang.Double withMinimumExclusiveTrueItem) {
		if (this.withMinimumExclusiveTrue == null) {
			this.withMinimumExclusiveTrue = new java.util.ArrayList<>();
		}
		this.withMinimumExclusiveTrue.add(withMinimumExclusiveTrueItem);
		return this;
	}

	public ModelNumber removeWithMinimumExclusiveTrueItem(java.lang.Double withMinimumExclusiveTrueItem) {
		if (this.withMinimumExclusiveTrue != null) {
			this.withMinimumExclusiveTrue.remove(withMinimumExclusiveTrueItem);
		}
		return this;
	}

	public ModelNumber withMaximum(java.util.List<@jakarta.validation.Valid java.lang.Double> newWithMaximum) {
		this.withMaximum = newWithMaximum;
		return this;
	}
	
	public ModelNumber addWithMaximumItem(java.lang.Double withMaximumItem) {
		if (this.withMaximum == null) {
			this.withMaximum = new java.util.ArrayList<>();
		}
		this.withMaximum.add(withMaximumItem);
		return this;
	}

	public ModelNumber removeWithMaximumItem(java.lang.Double withMaximumItem) {
		if (this.withMaximum != null) {
			this.withMaximum.remove(withMaximumItem);
		}
		return this;
	}

	public ModelNumber withMaximumExclusiveFalse(java.util.List<@jakarta.validation.Valid java.lang.Double> newWithMaximumExclusiveFalse) {
		this.withMaximumExclusiveFalse = newWithMaximumExclusiveFalse;
		return this;
	}
	
	public ModelNumber addWithMaximumExclusiveFalseItem(java.lang.Double withMaximumExclusiveFalseItem) {
		if (this.withMaximumExclusiveFalse == null) {
			this.withMaximumExclusiveFalse = new java.util.ArrayList<>();
		}
		this.withMaximumExclusiveFalse.add(withMaximumExclusiveFalseItem);
		return this;
	}

	public ModelNumber removeWithMaximumExclusiveFalseItem(java.lang.Double withMaximumExclusiveFalseItem) {
		if (this.withMaximumExclusiveFalse != null) {
			this.withMaximumExclusiveFalse.remove(withMaximumExclusiveFalseItem);
		}
		return this;
	}

	public ModelNumber withMaximumExclusiveTrue(java.util.List<@jakarta.validation.Valid java.lang.Double> newWithMaximumExclusiveTrue) {
		this.withMaximumExclusiveTrue = newWithMaximumExclusiveTrue;
		return this;
	}
	
	public ModelNumber addWithMaximumExclusiveTrueItem(java.lang.Double withMaximumExclusiveTrueItem) {
		if (this.withMaximumExclusiveTrue == null) {
			this.withMaximumExclusiveTrue = new java.util.ArrayList<>();
		}
		this.withMaximumExclusiveTrue.add(withMaximumExclusiveTrueItem);
		return this;
	}

	public ModelNumber removeWithMaximumExclusiveTrueItem(java.lang.Double withMaximumExclusiveTrueItem) {
		if (this.withMaximumExclusiveTrue != null) {
			this.withMaximumExclusiveTrue.remove(withMaximumExclusiveTrueItem);
		}
		return this;
	}

	// getter/setter

	public java.util.List<@jakarta.validation.Valid java.lang.Double> getWithoutValidation() {
		return withoutValidation;
	}

	public void setWithoutValidation(java.util.List<@jakarta.validation.Valid java.lang.Double> newWithoutValidation) {
		this.withoutValidation = newWithoutValidation;
	}

	public java.util.List<@jakarta.validation.Valid java.lang.Double> getWithMinimum() {
		return withMinimum;
	}

	public void setWithMinimum(java.util.List<@jakarta.validation.Valid java.lang.Double> newWithMinimum) {
		this.withMinimum = newWithMinimum;
	}

	public java.util.List<@jakarta.validation.Valid java.lang.Double> getWithMinimumExclusiveFalse() {
		return withMinimumExclusiveFalse;
	}

	public void setWithMinimumExclusiveFalse(java.util.List<@jakarta.validation.Valid java.lang.Double> newWithMinimumExclusiveFalse) {
		this.withMinimumExclusiveFalse = newWithMinimumExclusiveFalse;
	}

	public java.util.List<@jakarta.validation.Valid java.lang.Double> getWithMinimumExclusiveTrue() {
		return withMinimumExclusiveTrue;
	}

	public void setWithMinimumExclusiveTrue(java.util.List<@jakarta.validation.Valid java.lang.Double> newWithMinimumExclusiveTrue) {
		this.withMinimumExclusiveTrue = newWithMinimumExclusiveTrue;
	}

	public java.util.List<@jakarta.validation.Valid java.lang.Double> getWithMaximum() {
		return withMaximum;
	}

	public void setWithMaximum(java.util.List<@jakarta.validation.Valid java.lang.Double> newWithMaximum) {
		this.withMaximum = newWithMaximum;
	}

	public java.util.List<@jakarta.validation.Valid java.lang.Double> getWithMaximumExclusiveFalse() {
		return withMaximumExclusiveFalse;
	}

	public void setWithMaximumExclusiveFalse(java.util.List<@jakarta.validation.Valid java.lang.Double> newWithMaximumExclusiveFalse) {
		this.withMaximumExclusiveFalse = newWithMaximumExclusiveFalse;
	}

	public java.util.List<@jakarta.validation.Valid java.lang.Double> getWithMaximumExclusiveTrue() {
		return withMaximumExclusiveTrue;
	}

	public void setWithMaximumExclusiveTrue(java.util.List<@jakarta.validation.Valid java.lang.Double> newWithMaximumExclusiveTrue) {
		this.withMaximumExclusiveTrue = newWithMaximumExclusiveTrue;
	}
}
