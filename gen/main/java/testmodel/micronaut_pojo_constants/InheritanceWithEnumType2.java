package testmodel.micronaut_pojo_constants;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(as = InheritanceWithEnumType2.class)
public final class InheritanceWithEnumType2 implements InheritanceWithEnumType {

	public static final java.lang.String JSON_PROPERTY_E = "e";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_E)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String e;

	@Override
	public InheritanceWithEnumTypeEnum getType() {
		return InheritanceWithEnumTypeEnum.INHERITANCE2;
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
		InheritanceWithEnumType2 other = (InheritanceWithEnumType2) object;
		return java.util.Objects.equals(e, other.e);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(e);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithEnumType2[")
				.append("e=").append(e)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithEnumType2 e(java.lang.String newE) {
		this.e = newE;
		return this;
	}

	// getter/setter

	public java.lang.String getE() {
		return e;
	}

	public void setE(java.lang.String newE) {
		this.e = newE;
	}
}
