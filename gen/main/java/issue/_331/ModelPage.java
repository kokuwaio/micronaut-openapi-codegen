package issue._331;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public class ModelPage {

	@com.fasterxml.jackson.annotation.JsonProperty("array")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<@jakarta.validation.constraints.NotNull @jakarta.validation.Valid ModelComplex> array;

	@com.fasterxml.jackson.annotation.JsonProperty("set")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Set<@jakarta.validation.constraints.NotNull @jakarta.validation.Valid ModelComplex> set;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ModelPage other = (ModelPage) object;
		return java.util.Objects.equals(array, other.array)
				&& java.util.Objects.equals(set, other.set);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(array, set);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("ModelPage[")
				.append("array=").append(array).append(",")
				.append("set=").append(set)
				.append("]")
				.toString();
	}

	// fluent

	public ModelPage array(java.util.List<@jakarta.validation.constraints.NotNull @jakarta.validation.Valid ModelComplex> newArray) {
		this.array = newArray;
		return this;
	}
	
	public ModelPage addArrayItem(ModelComplex arrayItem) {
		if (this.array == null) {
			this.array = new java.util.ArrayList<>();
		}
		this.array.add(arrayItem);
		return this;
	}

	public ModelPage removeArrayItem(ModelComplex arrayItem) {
		if (this.array != null) {
			this.array.remove(arrayItem);
		}
		return this;
	}

	public ModelPage set(java.util.Set<@jakarta.validation.constraints.NotNull @jakarta.validation.Valid ModelComplex> newSet) {
		this.set = newSet;
		return this;
	}
	
	public ModelPage addSetItem(ModelComplex setItem) {
		if (this.set == null) {
			this.set = new java.util.LinkedHashSet<>();
		}
		this.set.add(setItem);
		return this;
	}

	public ModelPage removeSetItem(ModelComplex setItem) {
		if (this.set != null) {
			this.set.remove(setItem);
		}
		return this;
	}

	// getter/setter

	public java.util.List<@jakarta.validation.constraints.NotNull @jakarta.validation.Valid ModelComplex> getArray() {
		return array;
	}

	public void setArray(java.util.List<@jakarta.validation.constraints.NotNull @jakarta.validation.Valid ModelComplex> newArray) {
		this.array = newArray;
	}

	public java.util.Set<@jakarta.validation.constraints.NotNull @jakarta.validation.Valid ModelComplex> getSet() {
		return set;
	}

	public void setSet(java.util.Set<@jakarta.validation.constraints.NotNull @jakarta.validation.Valid ModelComplex> newSet) {
		this.set = newSet;
	}
}
