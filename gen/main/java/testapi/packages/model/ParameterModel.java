package testapi.packages.model;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class ParameterModel {

	public static final java.lang.String JSON_PROPERTY_BOOL = "bool";
	public static final java.lang.String JSON_PROPERTY_STRING = "string";
	public static final java.lang.String JSON_PROPERTY_NUMBER = "number";
	public static final java.lang.String JSON_PROPERTY_INTEGER = "integer";
	public static final java.lang.String JSON_PROPERTY_UUID = "uuid";
	public static final java.lang.String JSON_PROPERTY_DATE = "date";
	public static final java.lang.String JSON_PROPERTY_DATE_TIME = "dateTime";
	public static final java.lang.String JSON_PROPERTY_A = "a";
	public static final java.lang.String JSON_PROPERTY_B = "b";
	public static final java.lang.String JSON_PROPERTY_C = "c";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_BOOL)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String bool;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_STRING)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String string;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NUMBER)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Double number;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_INTEGER)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer integer;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_UUID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.UUID uuid;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DATE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.time.LocalDate date;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DATE_TIME)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.time.Instant dateTime;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_A)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.String> a;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_B)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.util.UUID> b;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_C)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.Integer> c;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		ParameterModel other = (ParameterModel) object;
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
				.append("ParameterModel[")
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

	public ParameterModel bool(java.lang.String newBool) {
		this.bool = newBool;
		return this;
	}

	public ParameterModel string(java.lang.String newString) {
		this.string = newString;
		return this;
	}

	public ParameterModel number(java.lang.Double newNumber) {
		this.number = newNumber;
		return this;
	}

	public ParameterModel integer(java.lang.Integer newInteger) {
		this.integer = newInteger;
		return this;
	}

	public ParameterModel uuid(java.util.UUID newUuid) {
		this.uuid = newUuid;
		return this;
	}

	public ParameterModel date(java.time.LocalDate newDate) {
		this.date = newDate;
		return this;
	}

	public ParameterModel dateTime(java.time.Instant newDateTime) {
		this.dateTime = newDateTime;
		return this;
	}

	public ParameterModel a(java.util.List<java.lang.String> newA) {
		this.a = newA;
		return this;
	}
	
	public ParameterModel addAItem(java.lang.String aItem) {
		if (this.a == null) {
			this.a = new java.util.ArrayList<>();
		}
		this.a.add(aItem);
		return this;
	}

	public ParameterModel removeAItem(java.lang.String aItem) {
		if (this.a != null) {
			this.a.remove(aItem);
		}
		return this;
	}

	public ParameterModel b(java.util.List<java.util.UUID> newB) {
		this.b = newB;
		return this;
	}
	
	public ParameterModel addBItem(java.util.UUID bItem) {
		if (this.b == null) {
			this.b = new java.util.ArrayList<>();
		}
		this.b.add(bItem);
		return this;
	}

	public ParameterModel removeBItem(java.util.UUID bItem) {
		if (this.b != null) {
			this.b.remove(bItem);
		}
		return this;
	}

	public ParameterModel c(java.util.List<java.lang.Integer> newC) {
		this.c = newC;
		return this;
	}
	
	public ParameterModel addCItem(java.lang.Integer cItem) {
		if (this.c == null) {
			this.c = new java.util.ArrayList<>();
		}
		this.c.add(cItem);
		return this;
	}

	public ParameterModel removeCItem(java.lang.Integer cItem) {
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

	public java.util.List<java.lang.String> getA() {
		return a;
	}

	public void setA(java.util.List<java.lang.String> newA) {
		this.a = newA;
	}

	public java.util.List<java.util.UUID> getB() {
		return b;
	}

	public void setB(java.util.List<java.util.UUID> newB) {
		this.b = newB;
	}

	public java.util.List<java.lang.Integer> getC() {
		return c;
	}

	public void setC(java.util.List<java.lang.Integer> newC) {
		this.c = newC;
	}
}
