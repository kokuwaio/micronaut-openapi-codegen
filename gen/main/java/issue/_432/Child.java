package issue._432;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public final class Child implements Parent {

	@com.fasterxml.jackson.annotation.JsonProperty("id")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String id;

	@com.fasterxml.jackson.annotation.JsonProperty("state")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private State state;

	@com.fasterxml.jackson.annotation.JsonProperty("name")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String name;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		Child other = (Child) object;
		return java.util.Objects.equals(id, other.id)
				&& java.util.Objects.equals(state, other.state)
				&& java.util.Objects.equals(name, other.name);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(id, state, name);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("Child[")
				.append("id=").append(id).append(",")
				.append("state=").append(state).append(",")
				.append("name=").append(name)
				.append("]")
				.toString();
	}

	// fluent

	public Child id(java.lang.String newId) {
		this.id = newId;
		return this;
	}

	public Child state(State newState) {
		this.state = newState;
		return this;
	}

	public Child name(java.lang.String newName) {
		this.name = newName;
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

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String newName) {
		this.name = newName;
	}
}
