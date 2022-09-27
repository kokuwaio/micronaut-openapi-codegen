package testmodel.micronaut;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.core.annotation.Introspected
public class Model {
	public static final java.lang.String JSON_PROPERTY_ID = "id";
	public static final java.lang.String JSON_PROPERTY_ID_WITH_EXAMPLE = "idWithExample";
	public static final java.lang.String JSON_PROPERTY_ID_WITH_DEFAULT = "idWithDefault";
	public static final java.lang.String JSON_PROPERTY_NAME = "name";
	public static final java.lang.String JSON_PROPERTY_NAME_WITH_EXAMPLE = "nameWithExample";
	public static final java.lang.String JSON_PROPERTY_NAME_WITH_DEFAULT = "nameWithDefault";
	public static final java.lang.String JSON_PROPERTY_DATE = "date";
	public static final java.lang.String JSON_PROPERTY_DATE_WITH_EXAMPLE = "dateWithExample";
	public static final java.lang.String JSON_PROPERTY_DATE_TIME = "date-time";
	public static final java.lang.String JSON_PROPERTY_DATE_TIME_WITH_EXAMPLE = "date-timeWithExample";
	public static final java.lang.String JSON_PROPERTY_NUMBER = "number";
	public static final java.lang.String JSON_PROPERTY_BINARY = "binary";
	public static final java.lang.String JSON_PROPERTY_BYTES = "bytes";
	public static final java.lang.String JSON_PROPERTY_ANY = "any";
	public static final java.lang.String JSON_PROPERTY_ARRAY = "array";
	public static final java.lang.String JSON_PROPERTY_ARRAY_WITH_EXAMPLE = "arrayWithExample";
	public static final java.lang.String JSON_PROPERTY_SET = "set";
	public static final java.lang.String JSON_PROPERTY_SET_WITH_EXAMPLES = "setWithExamples";
	public static final java.lang.String JSON_PROPERTY_MAP = "map";
	public static final java.lang.String JSON_PROPERTY_MAP_WITH_EXAMPLE = "mapWithExample";
	public static final java.lang.String JSON_PROPERTY_OPTIONAL_ARRAY = "optionalArray";
	public static final java.lang.String JSON_PROPERTY_OPTIONAL_SET = "optionalSet";
	public static final java.lang.String JSON_PROPERTY_OPTIONAL_MAP = "optionalMap";
	public static final java.lang.String JSON_PROPERTY_NULLABLE_STRING = "nullableString";
	public static final java.lang.String JSON_PROPERTY_NULLABLE_ARRAY = "nullableArray";
	public static final java.lang.String JSON_PROPERTY_NULLABLE_SET = "nullableSet";
	public static final java.lang.String JSON_PROPERTY_NULLABLE_MAP = "nullableMap";
	public static final java.lang.String JSON_PROPERTY_DEFAULT_STRING = "defaultString";
	public static final java.lang.String JSON_PROPERTY_DEFAULT_INTEGER = "defaultInteger";
	public static final java.lang.String JSON_PROPERTY_DEFAULT_NULLABLE = "defaultNullable";
	public static final java.lang.String JSON_PROPERTY_REFERENED_MODEL = "referenedModel";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer id;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID_WITH_EXAMPLE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer idWithExample;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ID_WITH_DEFAULT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Integer idWithDefault = 32;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 36)
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NAME)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.lang.String name;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NAME_WITH_EXAMPLE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String nameWithExample;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NAME_WITH_DEFAULT)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String nameWithDefault;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DATE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.time.LocalDate date;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DATE_WITH_EXAMPLE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.time.LocalDate dateWithExample;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DATE_TIME)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.time.Instant dateTime;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DATE_TIME_WITH_EXAMPLE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.time.Instant dateTimeWithExample;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NUMBER)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Double number;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_BINARY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private byte[] binary;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_BYTES)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private byte[] bytes;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ANY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private org.openapitools.jackson.nullable.JsonNullable<java.lang.Object> any = org.openapitools.jackson.nullable.JsonNullable.of(null);

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ARRAY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.util.List<java.lang.String> array = new java.util.ArrayList<>();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_ARRAY_WITH_EXAMPLE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.String> arrayWithExample;

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_SET)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.util.Set<java.lang.String> set = new java.util.LinkedHashSet<>();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_SET_WITH_EXAMPLES)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Set<java.lang.String> setWithExamples;

	@javax.validation.constraints.NotNull
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_MAP)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	private java.util.Map<String, java.lang.String> map = new java.util.HashMap<>();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_MAP_WITH_EXAMPLE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Map<String, java.lang.String> mapWithExample;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_OPTIONAL_ARRAY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.List<java.lang.String> optionalArray;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_OPTIONAL_SET)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Set<java.lang.String> optionalSet;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_OPTIONAL_MAP)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.util.Map<String, java.lang.String> optionalMap;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NULLABLE_STRING)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private org.openapitools.jackson.nullable.JsonNullable<java.lang.String> nullableString = org.openapitools.jackson.nullable.JsonNullable.undefined();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NULLABLE_ARRAY)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private org.openapitools.jackson.nullable.JsonNullable<java.util.List<java.lang.String>> nullableArray = org.openapitools.jackson.nullable.JsonNullable.undefined();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NULLABLE_SET)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private org.openapitools.jackson.nullable.JsonNullable<java.util.Set<java.lang.String>> nullableSet = org.openapitools.jackson.nullable.JsonNullable.undefined();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_NULLABLE_MAP)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private org.openapitools.jackson.nullable.JsonNullable<java.util.Map<String, java.lang.String>> nullableMap = org.openapitools.jackson.nullable.JsonNullable.undefined();

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DEFAULT_STRING)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.String defaultString = "defaultStringValue";

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DEFAULT_INTEGER)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	private java.lang.Long defaultInteger = 1234l;

	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_DEFAULT_NULLABLE)
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT)
	private org.openapitools.jackson.nullable.JsonNullable<java.lang.String> defaultNullable = org.openapitools.jackson.nullable.JsonNullable.of("defaultNullableValue");

	@javax.validation.Valid
	@com.fasterxml.jackson.annotation.JsonProperty(JSON_PROPERTY_REFERENED_MODEL)
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
				&& java.util.Objects.equals(nullableMap, other.nullableMap)
				&& java.util.Objects.equals(defaultString, other.defaultString)
				&& java.util.Objects.equals(defaultInteger, other.defaultInteger)
				&& java.util.Objects.equals(defaultNullable, other.defaultNullable)
				&& java.util.Objects.equals(referenedModel, other.referenedModel);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(id, idWithExample, idWithDefault, name, nameWithExample, nameWithDefault, date, dateWithExample, dateTime, dateTimeWithExample, number, java.util.Arrays.hashCode(binary), java.util.Arrays.hashCode(bytes), any, array, arrayWithExample, set, setWithExamples, map, mapWithExample, optionalArray, optionalSet, optionalMap, nullableString, nullableArray, nullableSet, nullableMap, defaultString, defaultInteger, defaultNullable, referenedModel);
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
				.append("nullableMap=").append(nullableMap).append(",")
				.append("defaultString=").append(defaultString).append(",")
				.append("defaultInteger=").append(defaultInteger).append(",")
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

	public Model any(org.openapitools.jackson.nullable.JsonNullable<java.lang.Object> newAny) {
		this.any = newAny;
		return this;
	}

	public Model array(java.util.List<java.lang.String> newArray) {
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

	public Model arrayWithExample(java.util.List<java.lang.String> newArrayWithExample) {
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

	public Model set(java.util.Set<java.lang.String> newSet) {
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

	public Model setWithExamples(java.util.Set<java.lang.String> newSetWithExamples) {
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

	public Model optionalArray(java.util.List<java.lang.String> newOptionalArray) {
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

	public Model optionalSet(java.util.Set<java.lang.String> newOptionalSet) {
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

	public Model nullableString(org.openapitools.jackson.nullable.JsonNullable<java.lang.String> newNullableString) {
		this.nullableString = newNullableString;
		return this;
	}

	public Model nullableArray(org.openapitools.jackson.nullable.JsonNullable<java.util.List<java.lang.String>> newNullableArray) {
		this.nullableArray = newNullableArray;
		return this;
	}
	
	public Model addNullableArrayItem(java.lang.String nullableArrayItem) {
		if (this.nullableArray == null || !this.nullableArray.isPresent()) {
			this.nullableArray = org.openapitools.jackson.nullable.JsonNullable.<java.util.List<java.lang.String>>of(new java.util.ArrayList<>());
		}
		this.nullableArray.get().add(nullableArrayItem);
		return this;
	}

	public Model removeNullableArrayItem(java.lang.String nullableArrayItem) {
		if (this.nullableArray != null && this.nullableArray.isPresent()) {
			this.nullableArray.get().remove(nullableArrayItem);
		}
		return this;
	}

	public Model nullableSet(org.openapitools.jackson.nullable.JsonNullable<java.util.Set<java.lang.String>> newNullableSet) {
		this.nullableSet = newNullableSet;
		return this;
	}
	
	public Model addNullableSetItem(java.lang.String nullableSetItem) {
		if (this.nullableSet == null || !this.nullableSet.isPresent()) {
			this.nullableSet = org.openapitools.jackson.nullable.JsonNullable.<java.util.Set<java.lang.String>>of(new java.util.LinkedHashSet<>());
		}
		this.nullableSet.get().add(nullableSetItem);
		return this;
	}

	public Model removeNullableSetItem(java.lang.String nullableSetItem) {
		if (this.nullableSet != null && this.nullableSet.isPresent()) {
			this.nullableSet.get().remove(nullableSetItem);
		}
		return this;
	}

	public Model nullableMap(org.openapitools.jackson.nullable.JsonNullable<java.util.Map<String, java.lang.String>> newNullableMap) {
		this.nullableMap = newNullableMap;
		return this;
	}
	
	public Model putNullableMapItem(java.lang.String key, java.lang.String nullableMapItem) {
		if (this.nullableMap == null || !this.nullableMap.isPresent()) {
			this.nullableMap = org.openapitools.jackson.nullable.JsonNullable.<java.util.Map<String, java.lang.String>>of(new java.util.HashMap<>());
		}
		this.nullableMap.get().put(key, nullableMapItem);
		return this;
	}

	public Model removeNullableMapItem(java.lang.String key) {
		if (this.nullableMap != null && this.nullableMap.isPresent()) {
			this.nullableMap.get().remove(key);
		}
		return this;
	}

	public Model defaultString(java.lang.String newDefaultString) {
		this.defaultString = newDefaultString;
		return this;
	}

	public Model defaultInteger(java.lang.Long newDefaultInteger) {
		this.defaultInteger = newDefaultInteger;
		return this;
	}

	public Model defaultNullable(org.openapitools.jackson.nullable.JsonNullable<java.lang.String> newDefaultNullable) {
		this.defaultNullable = newDefaultNullable;
		return this;
	}

	public Model referenedModel(EnumerationModel newReferenedModel) {
		this.referenedModel = newReferenedModel;
		return this;
	}


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

	public org.openapitools.jackson.nullable.JsonNullable<java.lang.Object> getAny() {
		return any;
	}

	public void setAny(org.openapitools.jackson.nullable.JsonNullable<java.lang.Object> newAny) {
		this.any = newAny;
	}

	public java.util.List<java.lang.String> getArray() {
		return array;
	}

	public void setArray(java.util.List<java.lang.String> newArray) {
		this.array = newArray;
	}

	public java.util.List<java.lang.String> getArrayWithExample() {
		return arrayWithExample;
	}

	public void setArrayWithExample(java.util.List<java.lang.String> newArrayWithExample) {
		this.arrayWithExample = newArrayWithExample;
	}

	public java.util.Set<java.lang.String> getSet() {
		return set;
	}

	public void setSet(java.util.Set<java.lang.String> newSet) {
		this.set = newSet;
	}

	public java.util.Set<java.lang.String> getSetWithExamples() {
		return setWithExamples;
	}

	public void setSetWithExamples(java.util.Set<java.lang.String> newSetWithExamples) {
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

	public java.util.List<java.lang.String> getOptionalArray() {
		return optionalArray;
	}

	public void setOptionalArray(java.util.List<java.lang.String> newOptionalArray) {
		this.optionalArray = newOptionalArray;
	}

	public java.util.Set<java.lang.String> getOptionalSet() {
		return optionalSet;
	}

	public void setOptionalSet(java.util.Set<java.lang.String> newOptionalSet) {
		this.optionalSet = newOptionalSet;
	}

	public java.util.Map<String, java.lang.String> getOptionalMap() {
		return optionalMap;
	}

	public void setOptionalMap(java.util.Map<String, java.lang.String> newOptionalMap) {
		this.optionalMap = newOptionalMap;
	}

	public org.openapitools.jackson.nullable.JsonNullable<java.lang.String> getNullableString() {
		return nullableString;
	}

	public void setNullableString(org.openapitools.jackson.nullable.JsonNullable<java.lang.String> newNullableString) {
		this.nullableString = newNullableString;
	}

	public org.openapitools.jackson.nullable.JsonNullable<java.util.List<java.lang.String>> getNullableArray() {
		return nullableArray;
	}

	public void setNullableArray(org.openapitools.jackson.nullable.JsonNullable<java.util.List<java.lang.String>> newNullableArray) {
		this.nullableArray = newNullableArray;
	}

	public org.openapitools.jackson.nullable.JsonNullable<java.util.Set<java.lang.String>> getNullableSet() {
		return nullableSet;
	}

	public void setNullableSet(org.openapitools.jackson.nullable.JsonNullable<java.util.Set<java.lang.String>> newNullableSet) {
		this.nullableSet = newNullableSet;
	}

	public org.openapitools.jackson.nullable.JsonNullable<java.util.Map<String, java.lang.String>> getNullableMap() {
		return nullableMap;
	}

	public void setNullableMap(org.openapitools.jackson.nullable.JsonNullable<java.util.Map<String, java.lang.String>> newNullableMap) {
		this.nullableMap = newNullableMap;
	}

	public java.lang.String getDefaultString() {
		return defaultString;
	}

	public void setDefaultString(java.lang.String newDefaultString) {
		this.defaultString = newDefaultString;
	}

	public java.lang.Long getDefaultInteger() {
		return defaultInteger;
	}

	public void setDefaultInteger(java.lang.Long newDefaultInteger) {
		this.defaultInteger = newDefaultInteger;
	}

	public org.openapitools.jackson.nullable.JsonNullable<java.lang.String> getDefaultNullable() {
		return defaultNullable;
	}

	public void setDefaultNullable(org.openapitools.jackson.nullable.JsonNullable<java.lang.String> newDefaultNullable) {
		this.defaultNullable = newDefaultNullable;
	}

	public EnumerationModel getReferenedModel() {
		return referenedModel;
	}

	public void setReferenedModel(EnumerationModel newReferenedModel) {
		this.referenedModel = newReferenedModel;
	}
}

