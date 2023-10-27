package issue._315;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class ServiceScopesEntry extends java.util.ArrayList<Credential> {


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
		return java.util.Objects.hash(super.hashCode());
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("ServiceScopesEntry[")
				.append("super").append(super.toString())
				.append("]")
				.toString();
	}
}
