package issue._303;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public class Base {

	@com.fasterxml.jackson.annotation.JsonProperty("mapOfStuff")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private MapConstruct mapOfStuff = new MapConstruct();

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		Base other = (Base) object;
		return java.util.Objects.equals(mapOfStuff, other.mapOfStuff);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(mapOfStuff);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("Base[")
				.append("mapOfStuff=").append(mapOfStuff)
				.append("]")
				.toString();
	}

	// fluent

	public Base mapOfStuff(MapConstruct newMapOfStuff) {
		this.mapOfStuff = newMapOfStuff;
		return this;
	}

	// getter/setter

	public MapConstruct getMapOfStuff() {
		return mapOfStuff;
	}

	public void setMapOfStuff(MapConstruct newMapOfStuff) {
		this.mapOfStuff = newMapOfStuff;
	}
}
