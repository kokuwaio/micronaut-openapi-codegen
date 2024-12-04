package testmodel.micronaut_pojo;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public final class InheritanceWithoutType2 implements InheritanceWithoutType {

	@com.fasterxml.jackson.annotation.JsonProperty("e")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String e;

	@com.fasterxml.jackson.annotation.JsonProperty("g")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String g;

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
		InheritanceWithoutType2 other = (InheritanceWithoutType2) object;
		return java.util.Objects.equals(e, other.e)
				&& java.util.Objects.equals(g, other.g);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(e, g);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("InheritanceWithoutType2[")
				.append("e=").append(e).append(",")
				.append("g=").append(g)
				.append("]")
				.toString();
	}

	// fluent

	public InheritanceWithoutType2 e(java.lang.String newE) {
		this.e = newE;
		return this;
	}

	public InheritanceWithoutType2 g(java.lang.String newG) {
		this.g = newG;
		return this;
	}

	// getter/setter

	public java.lang.String getE() {
		return e;
	}

	public void setE(java.lang.String newE) {
		this.e = newE;
	}

	public java.lang.String getG() {
		return g;
	}

	public void setG(java.lang.String newG) {
		this.g = newG;
	}
}
