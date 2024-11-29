package testmodel.micronaut_pojo;


@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public class Model {

	@com.fasterxml.jackson.annotation.JsonProperty("id")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer id;

	@com.fasterxml.jackson.annotation.JsonProperty("idWithExample")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer idWithExample;

	@com.fasterxml.jackson.annotation.JsonProperty("idWithDefault")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer idWithDefault = 32;

	@jakarta.validation.constraints.NotNull
	@jakarta.validation.constraints.Size(max = 36)
	@com.fasterxml.jackson.annotation.JsonProperty("name")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String name;

	@com.fasterxml.jackson.annotation.JsonProperty("nameWithExample")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String nameWithExample;

	@com.fasterxml.jackson.annotation.JsonProperty("nameWithDefault")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String nameWithDefault = "MyDefaultName";

	@com.fasterxml.jackson.annotation.JsonProperty("date")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.time.LocalDate date;

	@com.fasterxml.jackson.annotation.JsonProperty("dateWithExample")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.time.LocalDate dateWithExample;

	@com.fasterxml.jackson.annotation.JsonProperty("date-time")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.time.Instant dateTime;

	@com.fasterxml.jackson.annotation.JsonProperty("date-timeWithExample")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.time.Instant dateTimeWithExample;

	@com.fasterxml.jackson.annotation.JsonProperty("number")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Double number;

	@com.fasterxml.jackson.annotation.JsonProperty("binary")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private byte[] binary;

	@com.fasterxml.jackson.annotation.JsonProperty("bytes")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private byte[] bytes;

	@com.fasterxml.jackson.annotation.JsonProperty("any")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private java.lang.Object any;

	@jakarta.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty("array")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> array = new java.util.ArrayList<>();

	@com.fasterxml.jackson.annotation.JsonProperty("arrayWithExample")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> arrayWithExample;

	@jakarta.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty("set")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> set = new java.util.LinkedHashSet<>();

	@com.fasterxml.jackson.annotation.JsonProperty("setWithExamples")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> setWithExamples;

	@jakarta.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty("map")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.util.Map<String, java.lang.String> map = new java.util.HashMap<>();

	@com.fasterxml.jackson.annotation.JsonProperty("mapWithExample")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Map<String, java.lang.String> mapWithExample;

	@com.fasterxml.jackson.annotation.JsonProperty("optionalArray")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> optionalArray;

	@com.fasterxml.jackson.annotation.JsonProperty("optionalSet")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> optionalSet;

	@com.fasterxml.jackson.annotation.JsonProperty("optionalMap")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Map<String, java.lang.String> optionalMap;

	@com.fasterxml.jackson.annotation.JsonProperty("nullableString")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private java.lang.String nullableString;

	@com.fasterxml.jackson.annotation.JsonProperty("nullableArray")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> nullableArray;

	@com.fasterxml.jackson.annotation.JsonProperty("nullableSet")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> nullableSet;

	@com.fasterxml.jackson.annotation.JsonProperty("defaultString")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String defaultString = "defaultStringValue";

	@com.fasterxml.jackson.annotation.JsonProperty("defaultInteger")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer defaultInteger = 1234;

	@com.fasterxml.jackson.annotation.JsonProperty("defaultLong")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Long defaultLong = 5678l;

	@com.fasterxml.jackson.annotation.JsonProperty("defaultNullable")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private java.lang.String defaultNullable;

	@jakarta.validation.Valid
	@com.fasterxml.jackson.annotation.JsonProperty("referenedModel")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private EnumerationModel referenedModel;

	// methods

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object == null || getClass() != object.getClass()) {
			return false;
		}
		Model other = (Model) object;
		return java.util.Objects.equals(id, other.id)
				&& java.util.Objects.equals(idWithExample, other.idWithExample)
				&& java.util.Objects.equals(idWithDefault, other.idWithDefault)
				&& java.util.Objects.equals(name, other.name)
				&& java.util.Objects.equals(nameWithExample, other.nameWithExample)
				&& java.util.Objects.equals(nameWithDefault, other.nameWithDefault)
				&& java.util.Objects.equals(date, other.date)
				&& java.util.Objects.equals(dateWithExample, other.dateWithExample)
				&& java.util.Objects.equals(dateTime, other.dateTime)
				&& java.util.Objects.equals(dateTimeWithExample, other.dateTimeWithExample)
				&& java.util.Objects.equals(number, other.number)
				&& java.util.Arrays.equals(binary, other.binary)
				&& java.util.Arrays.equals(bytes, other.bytes)
				&& java.util.Objects.equals(any, other.any)
				&& java.util.Objects.equals(array, other.array)
				&& java.util.Objects.equals(arrayWithExample, other.arrayWithExample)
				&& java.util.Objects.equals(set, other.set)
				&& java.util.Objects.equals(setWithExamples, other.setWithExamples)
				&& java.util.Objects.equals(map, other.map)
				&& java.util.Objects.equals(mapWithExample, other.mapWithExample)
				&& java.util.Objects.equals(optionalArray, other.optionalArray)
				&& java.util.Objects.equals(optionalSet, other.optionalSet)
				&& java.util.Objects.equals(optionalMap, other.optionalMap)
				&& java.util.Objects.equals(nullableString, other.nullableString)
				&& java.util.Objects.equals(nullableArray, other.nullableArray)
				&& java.util.Objects.equals(nullableSet, other.nullableSet)
				&& java.util.Objects.equals(defaultString, other.defaultString)
				&& java.util.Objects.equals(defaultInteger, other.defaultInteger)
				&& java.util.Objects.equals(defaultLong, other.defaultLong)
				&& java.util.Objects.equals(defaultNullable, other.defaultNullable)
				&& java.util.Objects.equals(referenedModel, other.referenedModel);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(id, idWithExample, idWithDefault, name, nameWithExample, nameWithDefault, date, dateWithExample, dateTime, dateTimeWithExample, number, java.util.Arrays.hashCode(binary), java.util.Arrays.hashCode(bytes), any, array, arrayWithExample, set, setWithExamples, map, mapWithExample, optionalArray, optionalSet, optionalMap, nullableString, nullableArray, nullableSet, defaultString, defaultInteger, defaultLong, defaultNullable, referenedModel);
	}

	@Override
	public java.lang.String toString() {
		return new java.lang.StringBuilder()
				.append("Model[")
				.append("id=").append(id).append(",")
				.append("idWithExample=").append(idWithExample).append(",")
				.append("idWithDefault=").append(idWithDefault).append(",")
				.append("name=").append(name).append(",")
				.append("nameWithExample=").append(nameWithExample).append(",")
				.append("nameWithDefault=").append(nameWithDefault).append(",")
				.append("date=").append(date).append(",")
				.append("dateWithExample=").append(dateWithExample).append(",")
				.append("dateTime=").append(dateTime).append(",")
				.append("dateTimeWithExample=").append(dateTimeWithExample).append(",")
				.append("number=").append(number).append(",")
				.append("binary=").append(binary).append(",")
				.append("bytes.length=").append(bytes == null ? null : bytes.length).append(",")
				.append("any=").append(any).append(",")
				.append("array=").append(array).append(",")
				.append("arrayWithExample=").append(arrayWithExample).append(",")
				.append("set=").append(set).append(",")
				.append("setWithExamples=").append(setWithExamples).append(",")
				.append("map=").append(map).append(",")
				.append("mapWithExample=").append(mapWithExample).append(",")
				.append("optionalArray=").append(optionalArray).append(",")
				.append("optionalSet=").append(optionalSet).append(",")
				.append("optionalMap=").append(optionalMap).append(",")
				.append("nullableString=").append(nullableString).append(",")
				.append("nullableArray=").append(nullableArray).append(",")
				.append("nullableSet=").append(nullableSet).append(",")
				.append("defaultString=").append(defaultString).append(",")
				.append("defaultInteger=").append(defaultInteger).append(",")
				.append("defaultLong=").append(defaultLong).append(",")
				.append("defaultNullable=").append(defaultNullable).append(",")
				.append("referenedModel=").append(referenedModel)
				.append("]")
				.toString();
	}

	// fluent

	public Model id(java.lang.Integer newId) {
		this.id = newId;
		return this;
	}

	public Model idWithExample(java.lang.Integer newIdWithExample) {
		this.idWithExample = newIdWithExample;
		return this;
	}

	public Model idWithDefault(java.lang.Integer newIdWithDefault) {
		this.idWithDefault = newIdWithDefault;
		return this;
	}

	public Model name(java.lang.String newName) {
		this.name = newName;
		return this;
	}

	public Model nameWithExample(java.lang.String newNameWithExample) {
		this.nameWithExample = newNameWithExample;
		return this;
	}

	public Model nameWithDefault(java.lang.String newNameWithDefault) {
		this.nameWithDefault = newNameWithDefault;
		return this;
	}

	public Model date(java.time.LocalDate newDate) {
		this.date = newDate;
		return this;
	}

	public Model dateWithExample(java.time.LocalDate newDateWithExample) {
		this.dateWithExample = newDateWithExample;
		return this;
	}

	public Model dateTime(java.time.Instant newDateTime) {
		this.dateTime = newDateTime;
		return this;
	}

	public Model dateTimeWithExample(java.time.Instant newDateTimeWithExample) {
		this.dateTimeWithExample = newDateTimeWithExample;
		return this;
	}

	public Model number(java.lang.Double newNumber) {
		this.number = newNumber;
		return this;
	}

	public Model binary(byte[] newBinary) {
		this.binary = newBinary;
		return this;
	}

	public Model bytes(byte[] newBytes) {
		this.bytes = newBytes;
		return this;
	}

	public Model any(java.lang.Object newAny) {
		this.any = newAny;
		return this;
	}

	public Model array(java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> newArray) {
		this.array = newArray;
		return this;
	}
	
	public Model addArrayItem(java.lang.String arrayItem) {
		if (this.array == null) {
			this.array = new java.util.ArrayList<>();
		}
		this.array.add(arrayItem);
		return this;
	}

	public Model removeArrayItem(java.lang.String arrayItem) {
		if (this.array != null) {
			this.array.remove(arrayItem);
		}
		return this;
	}

	public Model arrayWithExample(java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> newArrayWithExample) {
		this.arrayWithExample = newArrayWithExample;
		return this;
	}
	
	public Model addArrayWithExampleItem(java.lang.String arrayWithExampleItem) {
		if (this.arrayWithExample == null) {
			this.arrayWithExample = new java.util.ArrayList<>();
		}
		this.arrayWithExample.add(arrayWithExampleItem);
		return this;
	}

	public Model removeArrayWithExampleItem(java.lang.String arrayWithExampleItem) {
		if (this.arrayWithExample != null) {
			this.arrayWithExample.remove(arrayWithExampleItem);
		}
		return this;
	}

	public Model set(java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> newSet) {
		this.set = newSet;
		return this;
	}
	
	public Model addSetItem(java.lang.String setItem) {
		if (this.set == null) {
			this.set = new java.util.LinkedHashSet<>();
		}
		this.set.add(setItem);
		return this;
	}

	public Model removeSetItem(java.lang.String setItem) {
		if (this.set != null) {
			this.set.remove(setItem);
		}
		return this;
	}

	public Model setWithExamples(java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> newSetWithExamples) {
		this.setWithExamples = newSetWithExamples;
		return this;
	}
	
	public Model addSetWithExamplesItem(java.lang.String setWithExamplesItem) {
		if (this.setWithExamples == null) {
			this.setWithExamples = new java.util.LinkedHashSet<>();
		}
		this.setWithExamples.add(setWithExamplesItem);
		return this;
	}

	public Model removeSetWithExamplesItem(java.lang.String setWithExamplesItem) {
		if (this.setWithExamples != null) {
			this.setWithExamples.remove(setWithExamplesItem);
		}
		return this;
	}

	public Model map(java.util.Map<String, java.lang.String> newMap) {
		this.map = newMap;
		return this;
	}
	
	public Model putMapItem(java.lang.String key, java.lang.String mapItem) {
		if (this.map == null) {
			this.map = new java.util.HashMap<>();
		}
		this.map.put(key, mapItem);
		return this;
	}

	public Model removeMapItem(java.lang.String key) {
		if (this.map != null) {
			this.map.remove(key);
		}
		return this;
	}

	public Model mapWithExample(java.util.Map<String, java.lang.String> newMapWithExample) {
		this.mapWithExample = newMapWithExample;
		return this;
	}
	
	public Model putMapWithExampleItem(java.lang.String key, java.lang.String mapWithExampleItem) {
		if (this.mapWithExample == null) {
			this.mapWithExample = new java.util.HashMap<>();
		}
		this.mapWithExample.put(key, mapWithExampleItem);
		return this;
	}

	public Model removeMapWithExampleItem(java.lang.String key) {
		if (this.mapWithExample != null) {
			this.mapWithExample.remove(key);
		}
		return this;
	}

	public Model optionalArray(java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> newOptionalArray) {
		this.optionalArray = newOptionalArray;
		return this;
	}
	
	public Model addOptionalArrayItem(java.lang.String optionalArrayItem) {
		if (this.optionalArray == null) {
			this.optionalArray = new java.util.ArrayList<>();
		}
		this.optionalArray.add(optionalArrayItem);
		return this;
	}

	public Model removeOptionalArrayItem(java.lang.String optionalArrayItem) {
		if (this.optionalArray != null) {
			this.optionalArray.remove(optionalArrayItem);
		}
		return this;
	}

	public Model optionalSet(java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> newOptionalSet) {
		this.optionalSet = newOptionalSet;
		return this;
	}
	
	public Model addOptionalSetItem(java.lang.String optionalSetItem) {
		if (this.optionalSet == null) {
			this.optionalSet = new java.util.LinkedHashSet<>();
		}
		this.optionalSet.add(optionalSetItem);
		return this;
	}

	public Model removeOptionalSetItem(java.lang.String optionalSetItem) {
		if (this.optionalSet != null) {
			this.optionalSet.remove(optionalSetItem);
		}
		return this;
	}

	public Model optionalMap(java.util.Map<String, java.lang.String> newOptionalMap) {
		this.optionalMap = newOptionalMap;
		return this;
	}
	
	public Model putOptionalMapItem(java.lang.String key, java.lang.String optionalMapItem) {
		if (this.optionalMap == null) {
			this.optionalMap = new java.util.HashMap<>();
		}
		this.optionalMap.put(key, optionalMapItem);
		return this;
	}

	public Model removeOptionalMapItem(java.lang.String key) {
		if (this.optionalMap != null) {
			this.optionalMap.remove(key);
		}
		return this;
	}

	public Model nullableString(java.lang.String newNullableString) {
		this.nullableString = newNullableString;
		return this;
	}

	public Model nullableArray(java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> newNullableArray) {
		this.nullableArray = newNullableArray;
		return this;
	}
	
	public Model addNullableArrayItem(java.lang.String nullableArrayItem) {
		if (this.nullableArray == null) {
			this.nullableArray = new java.util.ArrayList<>();
		}
		this.nullableArray.add(nullableArrayItem);
		return this;
	}

	public Model removeNullableArrayItem(java.lang.String nullableArrayItem) {
		if (this.nullableArray != null) {
			this.nullableArray.remove(nullableArrayItem);
		}
		return this;
	}

	public Model nullableSet(java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> newNullableSet) {
		this.nullableSet = newNullableSet;
		return this;
	}
	
	public Model addNullableSetItem(java.lang.String nullableSetItem) {
		if (this.nullableSet == null) {
			this.nullableSet = new java.util.LinkedHashSet<>();
		}
		this.nullableSet.add(nullableSetItem);
		return this;
	}

	public Model removeNullableSetItem(java.lang.String nullableSetItem) {
		if (this.nullableSet != null) {
			this.nullableSet.remove(nullableSetItem);
		}
		return this;
	}

	public Model defaultString(java.lang.String newDefaultString) {
		this.defaultString = newDefaultString;
		return this;
	}

	public Model defaultInteger(java.lang.Integer newDefaultInteger) {
		this.defaultInteger = newDefaultInteger;
		return this;
	}

	public Model defaultLong(java.lang.Long newDefaultLong) {
		this.defaultLong = newDefaultLong;
		return this;
	}

	public Model defaultNullable(java.lang.String newDefaultNullable) {
		this.defaultNullable = newDefaultNullable;
		return this;
	}

	public Model referenedModel(EnumerationModel newReferenedModel) {
		this.referenedModel = newReferenedModel;
		return this;
	}

	// getter/setter

	public java.lang.Integer getId() {
		return id;
	}

	public void setId(java.lang.Integer newId) {
		this.id = newId;
	}

	public java.lang.Integer getIdWithExample() {
		return idWithExample;
	}

	public void setIdWithExample(java.lang.Integer newIdWithExample) {
		this.idWithExample = newIdWithExample;
	}

	public java.lang.Integer getIdWithDefault() {
		return idWithDefault;
	}

	public void setIdWithDefault(java.lang.Integer newIdWithDefault) {
		this.idWithDefault = newIdWithDefault;
	}

	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String newName) {
		this.name = newName;
	}

	public java.lang.String getNameWithExample() {
		return nameWithExample;
	}

	public void setNameWithExample(java.lang.String newNameWithExample) {
		this.nameWithExample = newNameWithExample;
	}

	public java.lang.String getNameWithDefault() {
		return nameWithDefault;
	}

	public void setNameWithDefault(java.lang.String newNameWithDefault) {
		this.nameWithDefault = newNameWithDefault;
	}

	public java.time.LocalDate getDate() {
		return date;
	}

	public void setDate(java.time.LocalDate newDate) {
		this.date = newDate;
	}

	public java.time.LocalDate getDateWithExample() {
		return dateWithExample;
	}

	public void setDateWithExample(java.time.LocalDate newDateWithExample) {
		this.dateWithExample = newDateWithExample;
	}

	public java.time.Instant getDateTime() {
		return dateTime;
	}

	public void setDateTime(java.time.Instant newDateTime) {
		this.dateTime = newDateTime;
	}

	public java.time.Instant getDateTimeWithExample() {
		return dateTimeWithExample;
	}

	public void setDateTimeWithExample(java.time.Instant newDateTimeWithExample) {
		this.dateTimeWithExample = newDateTimeWithExample;
	}

	public java.lang.Double getNumber() {
		return number;
	}

	public void setNumber(java.lang.Double newNumber) {
		this.number = newNumber;
	}

	public byte[] getBinary() {
		return binary;
	}

	public void setBinary(byte[] newBinary) {
		this.binary = newBinary;
	}

	public byte[] getBytes() {
		return bytes;
	}

	public void setBytes(byte[] newBytes) {
		this.bytes = newBytes;
	}

	public java.lang.Object getAny() {
		return any;
	}

	public void setAny(java.lang.Object newAny) {
		this.any = newAny;
	}

	public java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> getArray() {
		return array;
	}

	public void setArray(java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> newArray) {
		this.array = newArray;
	}

	public java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> getArrayWithExample() {
		return arrayWithExample;
	}

	public void setArrayWithExample(java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> newArrayWithExample) {
		this.arrayWithExample = newArrayWithExample;
	}

	public java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> getSet() {
		return set;
	}

	public void setSet(java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> newSet) {
		this.set = newSet;
	}

	public java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> getSetWithExamples() {
		return setWithExamples;
	}

	public void setSetWithExamples(java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> newSetWithExamples) {
		this.setWithExamples = newSetWithExamples;
	}

	public java.util.Map<String, java.lang.String> getMap() {
		return map;
	}

	public void setMap(java.util.Map<String, java.lang.String> newMap) {
		this.map = newMap;
	}

	public java.util.Map<String, java.lang.String> getMapWithExample() {
		return mapWithExample;
	}

	public void setMapWithExample(java.util.Map<String, java.lang.String> newMapWithExample) {
		this.mapWithExample = newMapWithExample;
	}

	public java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> getOptionalArray() {
		return optionalArray;
	}

	public void setOptionalArray(java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> newOptionalArray) {
		this.optionalArray = newOptionalArray;
	}

	public java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> getOptionalSet() {
		return optionalSet;
	}

	public void setOptionalSet(java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> newOptionalSet) {
		this.optionalSet = newOptionalSet;
	}

	public java.util.Map<String, java.lang.String> getOptionalMap() {
		return optionalMap;
	}

	public void setOptionalMap(java.util.Map<String, java.lang.String> newOptionalMap) {
		this.optionalMap = newOptionalMap;
	}

	public java.lang.String getNullableString() {
		return nullableString;
	}

	public void setNullableString(java.lang.String newNullableString) {
		this.nullableString = newNullableString;
	}

	public java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> getNullableArray() {
		return nullableArray;
	}

	public void setNullableArray(java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> newNullableArray) {
		this.nullableArray = newNullableArray;
	}

	public java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> getNullableSet() {
		return nullableSet;
	}

	public void setNullableSet(java.util.Set<java.lang.@jakarta.validation.constraints.NotNull String> newNullableSet) {
		this.nullableSet = newNullableSet;
	}

	public java.lang.String getDefaultString() {
		return defaultString;
	}

	public void setDefaultString(java.lang.String newDefaultString) {
		this.defaultString = newDefaultString;
	}

	public java.lang.Integer getDefaultInteger() {
		return defaultInteger;
	}

	public void setDefaultInteger(java.lang.Integer newDefaultInteger) {
		this.defaultInteger = newDefaultInteger;
	}

	public java.lang.Long getDefaultLong() {
		return defaultLong;
	}

	public void setDefaultLong(java.lang.Long newDefaultLong) {
		this.defaultLong = newDefaultLong;
	}

	public java.lang.String getDefaultNullable() {
		return defaultNullable;
	}

	public void setDefaultNullable(java.lang.String newDefaultNullable) {
		this.defaultNullable = newDefaultNullable;
	}

	public EnumerationModel getReferenedModel() {
		return referenedModel;
	}

	public void setReferenedModel(EnumerationModel newReferenedModel) {
		this.referenedModel = newReferenedModel;
	}
}
