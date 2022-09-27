package testmodel.examples;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class InheritanceWithEnumType1 extends InheritanceWithEnumType {
	public static final java.lang.String JSON_PROPERTY_D = "d";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_D)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String d;

	@Override
	public InheritanceWithEnumTypeEnum getType() {
		return InheritanceWithEnumTypeEnum.INHERITANCE1;
	}

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		InheritanceWithEnumType1 other = (InheritanceWithEnumType1) object;
		return java.util.Objects.equals(d, other.d)
				&& super.equals(object);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(d, super.hashCode());
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithEnumType1[")
				.append("super").append(super.toString())
				.append("d=").append(d)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithEnumType1 d(java.lang.String newD) {
		this.d = newD;
		return this;
	}


	public java.lang.String getD() {
		return d;
	}

	public void setD(java.lang.String newD) {
		this.d = newD;
	}
}

