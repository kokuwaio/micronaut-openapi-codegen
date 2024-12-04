package testmodel.micronaut_pojo;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public final class InheritanceWithStringType2 implements InheritanceWithStringType {

	@com.fasterxml.jackson.annotation.JsonProperty("a")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String a;

	@com.fasterxml.jackson.annotation.JsonProperty("c")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String c;

	@Override
	public java.lang.String getType() {
		return "Inheritance2";
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
		InheritanceWithStringType2 other = (InheritanceWithStringType2) object;
		return java.util.Objects.equals(a, other.a)
				&& java.util.Objects.equals(c, other.c);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(a, c);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithStringType2[")
				.append("a=").append(a).append(",")
				.append("c=").append(c)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithStringType2 a(java.lang.String newA) {
		this.a = newA;
		return this;
	}

	public InheritanceWithStringType2 c(java.lang.String newC) {
		this.c = newC;
		return this;
	}

	// getter/setter

	public java.lang.String getA() {
		return a;
	}

	public void setA(java.lang.String newA) {
		this.a = newA;
	}

	public java.lang.String getC() {
		return c;
	}

	public void setC(java.lang.String newC) {
		this.c = newC;
	}
}
