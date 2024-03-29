package testapi.modelsuffix;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public class ParameterModelVO {

	@com.fasterxml.jackson.annotation.JsonProperty("bool")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String bool;

	@com.fasterxml.jackson.annotation.JsonProperty("string")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String string;

	@com.fasterxml.jackson.annotation.JsonProperty("number")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Double number;

	@com.fasterxml.jackson.annotation.JsonProperty("integer")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer integer;

	@com.fasterxml.jackson.annotation.JsonProperty("uuid")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.UUID uuid;

	@com.fasterxml.jackson.annotation.JsonProperty("date")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.time.LocalDate date;

	@com.fasterxml.jackson.annotation.JsonProperty("dateTime")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.time.Instant dateTime;

	@com.fasterxml.jackson.annotation.JsonProperty("a")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> a;

	@com.fasterxml.jackson.annotation.JsonProperty("b")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.util.@jakarta.validation.constraints.NotNull UUID> b;

	@com.fasterxml.jackson.annotation.JsonProperty("c")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.@jakarta.validation.constraints.NotNull Integer> c;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ParameterModelVO other = (ParameterModelVO) object;
		return java.util.Objects.equals(bool, other.bool)
				&& java.util.Objects.equals(string, other.string)
				&& java.util.Objects.equals(number, other.number)
				&& java.util.Objects.equals(integer, other.integer)
				&& java.util.Objects.equals(uuid, other.uuid)
				&& java.util.Objects.equals(date, other.date)
				&& java.util.Objects.equals(dateTime, other.dateTime)
				&& java.util.Objects.equals(a, other.a)
				&& java.util.Objects.equals(b, other.b)
				&& java.util.Objects.equals(c, other.c);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(bool, string, number, integer, uuid, date, dateTime, a, b, c);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("ParameterModelVO[")
				.append("bool=").append(bool).append(",")
				.append("string=").append(string).append(",")
				.append("number=").append(number).append(",")
				.append("integer=").append(integer).append(",")
				.append("uuid=").append(uuid).append(",")
				.append("date=").append(date).append(",")
				.append("dateTime=").append(dateTime).append(",")
				.append("a=").append(a).append(",")
				.append("b=").append(b).append(",")
				.append("c=").append(c)
				.append("]")
				.toString();
	}

	// fluent

	public ParameterModelVO bool(java.lang.String newBool) {
		this.bool = newBool;
		return this;
	}

	public ParameterModelVO string(java.lang.String newString) {
		this.string = newString;
		return this;
	}

	public ParameterModelVO number(java.lang.Double newNumber) {
		this.number = newNumber;
		return this;
	}

	public ParameterModelVO integer(java.lang.Integer newInteger) {
		this.integer = newInteger;
		return this;
	}

	public ParameterModelVO uuid(java.util.UUID newUuid) {
		this.uuid = newUuid;
		return this;
	}

	public ParameterModelVO date(java.time.LocalDate newDate) {
		this.date = newDate;
		return this;
	}

	public ParameterModelVO dateTime(java.time.Instant newDateTime) {
		this.dateTime = newDateTime;
		return this;
	}

	public ParameterModelVO a(java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> newA) {
		this.a = newA;
		return this;
	}
	
	public ParameterModelVO addAItem(java.lang.String aItem) {
		if (this.a == null) {
			this.a = new java.util.ArrayList<>();
		}
		this.a.add(aItem);
		return this;
	}

	public ParameterModelVO removeAItem(java.lang.String aItem) {
		if (this.a != null) {
			this.a.remove(aItem);
		}
		return this;
	}

	public ParameterModelVO b(java.util.List<java.util.@jakarta.validation.constraints.NotNull UUID> newB) {
		this.b = newB;
		return this;
	}
	
	public ParameterModelVO addBItem(java.util.UUID bItem) {
		if (this.b == null) {
			this.b = new java.util.ArrayList<>();
		}
		this.b.add(bItem);
		return this;
	}

	public ParameterModelVO removeBItem(java.util.UUID bItem) {
		if (this.b != null) {
			this.b.remove(bItem);
		}
		return this;
	}

	public ParameterModelVO c(java.util.List<java.lang.@jakarta.validation.constraints.NotNull Integer> newC) {
		this.c = newC;
		return this;
	}
	
	public ParameterModelVO addCItem(java.lang.Integer cItem) {
		if (this.c == null) {
			this.c = new java.util.ArrayList<>();
		}
		this.c.add(cItem);
		return this;
	}

	public ParameterModelVO removeCItem(java.lang.Integer cItem) {
		if (this.c != null) {
			this.c.remove(cItem);
		}
		return this;
	}

	// getter/setter

	public java.lang.String getBool() {
		return bool;
	}

	public void setBool(java.lang.String newBool) {
		this.bool = newBool;
	}

	public java.lang.String getString() {
		return string;
	}

	public void setString(java.lang.String newString) {
		this.string = newString;
	}

	public java.lang.Double getNumber() {
		return number;
	}

	public void setNumber(java.lang.Double newNumber) {
		this.number = newNumber;
	}

	public java.lang.Integer getInteger() {
		return integer;
	}

	public void setInteger(java.lang.Integer newInteger) {
		this.integer = newInteger;
	}

	public java.util.UUID getUuid() {
		return uuid;
	}

	public void setUuid(java.util.UUID newUuid) {
		this.uuid = newUuid;
	}

	public java.time.LocalDate getDate() {
		return date;
	}

	public void setDate(java.time.LocalDate newDate) {
		this.date = newDate;
	}

	public java.time.Instant getDateTime() {
		return dateTime;
	}

	public void setDateTime(java.time.Instant newDateTime) {
		this.dateTime = newDateTime;
	}

	public java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> getA() {
		return a;
	}

	public void setA(java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> newA) {
		this.a = newA;
	}

	public java.util.List<java.util.@jakarta.validation.constraints.NotNull UUID> getB() {
		return b;
	}

	public void setB(java.util.List<java.util.@jakarta.validation.constraints.NotNull UUID> newB) {
		this.b = newB;
	}

	public java.util.List<java.lang.@jakarta.validation.constraints.NotNull Integer> getC() {
		return c;
	}

	public void setC(java.util.List<java.lang.@jakarta.validation.constraints.NotNull Integer> newC) {
		this.c = newC;
	}
}
