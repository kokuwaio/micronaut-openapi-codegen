package issue._432;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public final class ParentDefault implements Parent {

	@com.fasterxml.jackson.annotation.JsonProperty("id")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String id;

	@com.fasterxml.jackson.annotation.JsonProperty("state")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private State state;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ParentDefault other = (ParentDefault) object;
		return java.util.Objects.equals(id, other.id)
				&& java.util.Objects.equals(state, other.state);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(id, state);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("ParentDefault[")
				.append("id=").append(id).append(",")
				.append("state=").append(state)
				.append("]")
				.toString();
	}

	// fluent

	public ParentDefault id(java.lang.String newId) {
		this.id = newId;
		return this;
	}

	public ParentDefault state(State newState) {
		this.state = newState;
		return this;
	}

	// getter/setter

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String newId) {
		this.id = newId;
	}

	public State getState() {
		return state;
	}

	public void setState(State newState) {
		this.state = newState;
	}
}
