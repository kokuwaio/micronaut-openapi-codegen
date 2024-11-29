package issue._331;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public class ModelInteger {

	@com.fasterxml.jackson.annotation.JsonProperty("withoutValidation")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.Integer> withoutValidation;

	@com.fasterxml.jackson.annotation.JsonProperty("withMinimum")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Min(3) Integer> withMinimum;

	@com.fasterxml.jackson.annotation.JsonProperty("withMaximum")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Max(4) Integer> withMaximum;

	@com.fasterxml.jackson.annotation.JsonProperty("withMinimumAndMaximum")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Min(3) @jakarta.validation.constraints.Max(4) Integer> withMinimumAndMaximum;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ModelInteger other = (ModelInteger) object;
		return java.util.Objects.equals(withoutValidation, other.withoutValidation)
				&& java.util.Objects.equals(withMinimum, other.withMinimum)
				&& java.util.Objects.equals(withMaximum, other.withMaximum)
				&& java.util.Objects.equals(withMinimumAndMaximum, other.withMinimumAndMaximum);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(withoutValidation, withMinimum, withMaximum, withMinimumAndMaximum);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("ModelInteger[")
				.append("withoutValidation=").append(withoutValidation).append(",")
				.append("withMinimum=").append(withMinimum).append(",")
				.append("withMaximum=").append(withMaximum).append(",")
				.append("withMinimumAndMaximum=").append(withMinimumAndMaximum)
				.append("]")
				.toString();
	}

	// fluent

	public ModelInteger withoutValidation(java.util.List<java.lang.Integer> newWithoutValidation) {
		this.withoutValidation = newWithoutValidation;
		return this;
	}
	
	public ModelInteger addWithoutValidationItem(java.lang.Integer withoutValidationItem) {
		if (this.withoutValidation == null) {
			this.withoutValidation = new java.util.ArrayList<>();
		}
		this.withoutValidation.add(withoutValidationItem);
		return this;
	}

	public ModelInteger removeWithoutValidationItem(java.lang.Integer withoutValidationItem) {
		if (this.withoutValidation != null) {
			this.withoutValidation.remove(withoutValidationItem);
		}
		return this;
	}

	public ModelInteger withMinimum(java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Min(3) Integer> newWithMinimum) {
		this.withMinimum = newWithMinimum;
		return this;
	}
	
	public ModelInteger addWithMinimumItem(java.lang.Integer withMinimumItem) {
		if (this.withMinimum == null) {
			this.withMinimum = new java.util.ArrayList<>();
		}
		this.withMinimum.add(withMinimumItem);
		return this;
	}

	public ModelInteger removeWithMinimumItem(java.lang.Integer withMinimumItem) {
		if (this.withMinimum != null) {
			this.withMinimum.remove(withMinimumItem);
		}
		return this;
	}

	public ModelInteger withMaximum(java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Max(4) Integer> newWithMaximum) {
		this.withMaximum = newWithMaximum;
		return this;
	}
	
	public ModelInteger addWithMaximumItem(java.lang.Integer withMaximumItem) {
		if (this.withMaximum == null) {
			this.withMaximum = new java.util.ArrayList<>();
		}
		this.withMaximum.add(withMaximumItem);
		return this;
	}

	public ModelInteger removeWithMaximumItem(java.lang.Integer withMaximumItem) {
		if (this.withMaximum != null) {
			this.withMaximum.remove(withMaximumItem);
		}
		return this;
	}

	public ModelInteger withMinimumAndMaximum(java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Min(3) @jakarta.validation.constraints.Max(4) Integer> newWithMinimumAndMaximum) {
		this.withMinimumAndMaximum = newWithMinimumAndMaximum;
		return this;
	}
	
	public ModelInteger addWithMinimumAndMaximumItem(java.lang.Integer withMinimumAndMaximumItem) {
		if (this.withMinimumAndMaximum == null) {
			this.withMinimumAndMaximum = new java.util.ArrayList<>();
		}
		this.withMinimumAndMaximum.add(withMinimumAndMaximumItem);
		return this;
	}

	public ModelInteger removeWithMinimumAndMaximumItem(java.lang.Integer withMinimumAndMaximumItem) {
		if (this.withMinimumAndMaximum != null) {
			this.withMinimumAndMaximum.remove(withMinimumAndMaximumItem);
		}
		return this;
	}

	// getter/setter

	public java.util.List<java.lang.Integer> getWithoutValidation() {
		return withoutValidation;
	}

	public void setWithoutValidation(java.util.List<java.lang.Integer> newWithoutValidation) {
		this.withoutValidation = newWithoutValidation;
	}

	public java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Min(3) Integer> getWithMinimum() {
		return withMinimum;
	}

	public void setWithMinimum(java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Min(3) Integer> newWithMinimum) {
		this.withMinimum = newWithMinimum;
	}

	public java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Max(4) Integer> getWithMaximum() {
		return withMaximum;
	}

	public void setWithMaximum(java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Max(4) Integer> newWithMaximum) {
		this.withMaximum = newWithMaximum;
	}

	public java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Min(3) @jakarta.validation.constraints.Max(4) Integer> getWithMinimumAndMaximum() {
		return withMinimumAndMaximum;
	}

	public void setWithMinimumAndMaximum(java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Min(3) @jakarta.validation.constraints.Max(4) Integer> newWithMinimumAndMaximum) {
		this.withMinimumAndMaximum = newWithMinimumAndMaximum;
	}
}
