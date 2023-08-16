package testmodel.micronaut_pojo;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public class InheritanceWithEnumType3 implements InheritanceWithEnumType {

	@Override
	public InheritanceWithEnumTypeEnum getType() {
		return InheritanceWithEnumTypeEnum.INHERITANCE3;
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
		return super.equals(object);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash();
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithEnumType3[")
				.append("]")
				.toString();
	}
}
