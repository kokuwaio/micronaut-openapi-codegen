package testmodel.nomicronaut;

public class InheritanceWithEnumType3 extends InheritanceWithEnumType {

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
				.append("super").append(super.toString())
				.append("]")
				.toString();
	}

	// fluent

}

