/*
 * Spec for api tests.
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package testmodel.micronaut_java;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.micronaut.http.multipart.CompletedFileUpload;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import testmodel.micronaut_java.EnumerationModel;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Model
 */
@JsonPropertyOrder({
  Model.JSON_PROPERTY_ID,
  Model.JSON_PROPERTY_ID_WITH_EXAMPLE,
  Model.JSON_PROPERTY_ID_WITH_DEFAULT,
  Model.JSON_PROPERTY_NAME,
  Model.JSON_PROPERTY_NAME_WITH_EXAMPLE,
  Model.JSON_PROPERTY_NAME_WITH_DEFAULT,
  Model.JSON_PROPERTY_DATE,
  Model.JSON_PROPERTY_DATE_WITH_EXAMPLE,
  Model.JSON_PROPERTY_DATE_TIME,
  Model.JSON_PROPERTY_DATE_TIME_WITH_EXAMPLE,
  Model.JSON_PROPERTY_NUMBER,
  Model.JSON_PROPERTY_BINARY,
  Model.JSON_PROPERTY_BYTES,
  Model.JSON_PROPERTY_ANY,
  Model.JSON_PROPERTY_ARRAY,
  Model.JSON_PROPERTY_ARRAY_WITH_EXAMPLE,
  Model.JSON_PROPERTY_SET,
  Model.JSON_PROPERTY_SET_WITH_EXAMPLES,
  Model.JSON_PROPERTY_MAP,
  Model.JSON_PROPERTY_MAP_WITH_EXAMPLE,
  Model.JSON_PROPERTY_OPTIONAL_ARRAY,
  Model.JSON_PROPERTY_OPTIONAL_SET,
  Model.JSON_PROPERTY_OPTIONAL_MAP,
  Model.JSON_PROPERTY_NULLABLE_STRING,
  Model.JSON_PROPERTY_NULLABLE_ARRAY,
  Model.JSON_PROPERTY_NULLABLE_SET,
  Model.JSON_PROPERTY_DEFAULT_STRING,
  Model.JSON_PROPERTY_DEFAULT_INTEGER,
  Model.JSON_PROPERTY_DEFAULT_LONG,
  Model.JSON_PROPERTY_DEFAULT_NULLABLE,
  Model.JSON_PROPERTY_REFERENED_MODEL
})
@JsonTypeName("Model")
@java.lang.SuppressWarnings("all")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", comments = "Generator version: stable")
@Introspected
public class Model {
    public static final String JSON_PROPERTY_ID = "id";
    private Integer id;

    public static final String JSON_PROPERTY_ID_WITH_EXAMPLE = "idWithExample";
    private Integer idWithExample;

    public static final String JSON_PROPERTY_ID_WITH_DEFAULT = "idWithDefault";
    private Integer idWithDefault = 32;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_NAME_WITH_EXAMPLE = "nameWithExample";
    private String nameWithExample;

    public static final String JSON_PROPERTY_NAME_WITH_DEFAULT = "nameWithDefault";
    private String nameWithDefault = "MyDefaultName";

    public static final String JSON_PROPERTY_DATE = "date";
    private LocalDate date;

    public static final String JSON_PROPERTY_DATE_WITH_EXAMPLE = "dateWithExample";
    private LocalDate dateWithExample;

    public static final String JSON_PROPERTY_DATE_TIME = "date-time";
    private OffsetDateTime dateTime;

    public static final String JSON_PROPERTY_DATE_TIME_WITH_EXAMPLE = "date-timeWithExample";
    private OffsetDateTime dateTimeWithExample;

    public static final String JSON_PROPERTY_NUMBER = "number";
    private BigDecimal number;

    public static final String JSON_PROPERTY_BINARY = "binary";
    private CompletedFileUpload binary;

    public static final String JSON_PROPERTY_BYTES = "bytes";
    private byte[] bytes;

    public static final String JSON_PROPERTY_ANY = "any";
    private Object any = null;

    public static final String JSON_PROPERTY_ARRAY = "array";
    private List<String> array = new ArrayList<>();

    public static final String JSON_PROPERTY_ARRAY_WITH_EXAMPLE = "arrayWithExample";
    private List<String> arrayWithExample = null;

    public static final String JSON_PROPERTY_SET = "set";
    private Set<String> set = new LinkedHashSet<>();

    public static final String JSON_PROPERTY_SET_WITH_EXAMPLES = "setWithExamples";
    private Set<String> setWithExamples = null;

    public static final String JSON_PROPERTY_MAP = "map";
    private Map<String, String> map = new HashMap<>();

    public static final String JSON_PROPERTY_MAP_WITH_EXAMPLE = "mapWithExample";
    private Map<String, String> mapWithExample = null;

    public static final String JSON_PROPERTY_OPTIONAL_ARRAY = "optionalArray";
    private List<String> optionalArray = null;

    public static final String JSON_PROPERTY_OPTIONAL_SET = "optionalSet";
    private Set<String> optionalSet = null;

    public static final String JSON_PROPERTY_OPTIONAL_MAP = "optionalMap";
    private Map<String, String> optionalMap = null;

    public static final String JSON_PROPERTY_NULLABLE_STRING = "nullableString";
    private String nullableString;

    public static final String JSON_PROPERTY_NULLABLE_ARRAY = "nullableArray";
    private List<String> nullableArray = null;

    public static final String JSON_PROPERTY_NULLABLE_SET = "nullableSet";
    private Set<String> nullableSet = null;

    public static final String JSON_PROPERTY_DEFAULT_STRING = "defaultString";
    private String defaultString = "defaultStringValue";

    public static final String JSON_PROPERTY_DEFAULT_INTEGER = "defaultInteger";
    private Integer defaultInteger = 1234;

    public static final String JSON_PROPERTY_DEFAULT_LONG = "defaultLong";
    private Long defaultLong = 5678l;

    public static final String JSON_PROPERTY_DEFAULT_NULLABLE = "defaultNullable";
    private String defaultNullable = "defaultNullableValue";

    public static final String JSON_PROPERTY_REFERENED_MODEL = "referenedModel";
    private EnumerationModel referenedModel;

    public Model(String name, List<String> array, Set<String> set, Map<String, String> map) {
        this.name = name;
        this.array = array;
        this.set = set;
        this.map = map;
    }

    public Model id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(Integer id) {
        this.id = id;
    }

    public Model idWithExample(Integer idWithExample) {
        this.idWithExample = idWithExample;
        return this;
    }

    /**
     * Get idWithExample
     * @return idWithExample
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ID_WITH_EXAMPLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getIdWithExample() {
        return idWithExample;
    }

    @JsonProperty(JSON_PROPERTY_ID_WITH_EXAMPLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIdWithExample(Integer idWithExample) {
        this.idWithExample = idWithExample;
    }

    public Model idWithDefault(Integer idWithDefault) {
        this.idWithDefault = idWithDefault;
        return this;
    }

    /**
     * Get idWithDefault
     * @return idWithDefault
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ID_WITH_DEFAULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getIdWithDefault() {
        return idWithDefault;
    }

    @JsonProperty(JSON_PROPERTY_ID_WITH_DEFAULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIdWithDefault(Integer idWithDefault) {
        this.idWithDefault = idWithDefault;
    }

    public Model name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     **/
    @NotNull
    @Size(max=36)
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    public Model nameWithExample(String nameWithExample) {
        this.nameWithExample = nameWithExample;
        return this;
    }

    /**
     * Get nameWithExample
     * @return nameWithExample
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_NAME_WITH_EXAMPLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getNameWithExample() {
        return nameWithExample;
    }

    @JsonProperty(JSON_PROPERTY_NAME_WITH_EXAMPLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNameWithExample(String nameWithExample) {
        this.nameWithExample = nameWithExample;
    }

    public Model nameWithDefault(String nameWithDefault) {
        this.nameWithDefault = nameWithDefault;
        return this;
    }

    /**
     * Get nameWithDefault
     * @return nameWithDefault
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_NAME_WITH_DEFAULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getNameWithDefault() {
        return nameWithDefault;
    }

    @JsonProperty(JSON_PROPERTY_NAME_WITH_DEFAULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNameWithDefault(String nameWithDefault) {
        this.nameWithDefault = nameWithDefault;
    }

    public Model date(LocalDate date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     * @return date
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public LocalDate getDate() {
        return date;
    }

    @JsonProperty(JSON_PROPERTY_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Model dateWithExample(LocalDate dateWithExample) {
        this.dateWithExample = dateWithExample;
        return this;
    }

    /**
     * Get dateWithExample
     * @return dateWithExample
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DATE_WITH_EXAMPLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public LocalDate getDateWithExample() {
        return dateWithExample;
    }

    @JsonProperty(JSON_PROPERTY_DATE_WITH_EXAMPLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public void setDateWithExample(LocalDate dateWithExample) {
        this.dateWithExample = dateWithExample;
    }

    public Model dateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Get dateTime
     * @return dateTime
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DATE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    @JsonProperty(JSON_PROPERTY_DATE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Model dateTimeWithExample(OffsetDateTime dateTimeWithExample) {
        this.dateTimeWithExample = dateTimeWithExample;
        return this;
    }

    /**
     * Get dateTimeWithExample
     * @return dateTimeWithExample
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DATE_TIME_WITH_EXAMPLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getDateTimeWithExample() {
        return dateTimeWithExample;
    }

    @JsonProperty(JSON_PROPERTY_DATE_TIME_WITH_EXAMPLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setDateTimeWithExample(OffsetDateTime dateTimeWithExample) {
        this.dateTimeWithExample = dateTimeWithExample;
    }

    public Model number(BigDecimal number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     * @return number
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getNumber() {
        return number;
    }

    @JsonProperty(JSON_PROPERTY_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public Model binary(CompletedFileUpload binary) {
        this.binary = binary;
        return this;
    }

    /**
     * Get binary
     * @return binary
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_BINARY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CompletedFileUpload getBinary() {
        return binary;
    }

    @JsonProperty(JSON_PROPERTY_BINARY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBinary(CompletedFileUpload binary) {
        this.binary = binary;
    }

    public Model bytes(byte[] bytes) {
        this.bytes = bytes;
        return this;
    }

    /**
     * Get bytes
     * @return bytes
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_BYTES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public byte[] getBytes() {
        return bytes;
    }

    @JsonProperty(JSON_PROPERTY_BYTES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public Model any(Object any) {
        this.any = any;
        return this;
    }

    /**
     * Get any
     * @return any
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ANY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getAny() {
        return any;
    }

    @JsonProperty(JSON_PROPERTY_ANY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAny(Object any) {
        this.any = any;
    }

    public Model array(List<String> array) {
        this.array = array;
        return this;
    }

    public Model addArrayItem(String arrayItem) {
        this.array.add(arrayItem);
        return this;
    }

    /**
     * Get array
     * @return array
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_ARRAY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getArray() {
        return array;
    }

    @JsonProperty(JSON_PROPERTY_ARRAY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setArray(List<String> array) {
        this.array = array;
    }

    public Model arrayWithExample(List<String> arrayWithExample) {
        this.arrayWithExample = arrayWithExample;
        return this;
    }

    public Model addArrayWithExampleItem(String arrayWithExampleItem) {
        if (this.arrayWithExample == null) {
            this.arrayWithExample = new ArrayList<>();
        }
        this.arrayWithExample.add(arrayWithExampleItem);
        return this;
    }

    /**
     * Get arrayWithExample
     * @return arrayWithExample
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ARRAY_WITH_EXAMPLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getArrayWithExample() {
        return arrayWithExample;
    }

    @JsonProperty(JSON_PROPERTY_ARRAY_WITH_EXAMPLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setArrayWithExample(List<String> arrayWithExample) {
        this.arrayWithExample = arrayWithExample;
    }

    public Model set(Set<String> set) {
        this.set = set;
        return this;
    }

    public Model addSetItem(String setItem) {
        this.set.add(setItem);
        return this;
    }

    /**
     * Get set
     * @return set
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_SET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Set<String> getSet() {
        return set;
    }

    @JsonProperty(JSON_PROPERTY_SET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
       @JsonDeserialize(as = LinkedHashSet.class)
    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Model setWithExamples(Set<String> setWithExamples) {
        this.setWithExamples = setWithExamples;
        return this;
    }

    public Model addSetWithExamplesItem(String setWithExamplesItem) {
        if (this.setWithExamples == null) {
            this.setWithExamples = new LinkedHashSet<>();
        }
        this.setWithExamples.add(setWithExamplesItem);
        return this;
    }

    /**
     * Get setWithExamples
     * @return setWithExamples
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SET_WITH_EXAMPLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Set<String> getSetWithExamples() {
        return setWithExamples;
    }

    @JsonProperty(JSON_PROPERTY_SET_WITH_EXAMPLES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       @JsonDeserialize(as = LinkedHashSet.class)
    public void setSetWithExamples(Set<String> setWithExamples) {
        this.setWithExamples = setWithExamples;
    }

    public Model map(Map<String, String> map) {
        this.map = map;
        return this;
    }

    public Model putMapItem(String key, String mapItem) {
        this.map.put(key, mapItem);
        return this;
  }

    /**
     * Get map
     * @return map
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_MAP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Map<String, String> getMap() {
        return map;
    }

    @JsonProperty(JSON_PROPERTY_MAP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Model mapWithExample(Map<String, String> mapWithExample) {
        this.mapWithExample = mapWithExample;
        return this;
    }

    public Model putMapWithExampleItem(String key, String mapWithExampleItem) {
        if (this.mapWithExample == null) {
            this.mapWithExample = new HashMap<>();
        }
        this.mapWithExample.put(key, mapWithExampleItem);
        return this;
  }

    /**
     * Get mapWithExample
     * @return mapWithExample
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_MAP_WITH_EXAMPLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, String> getMapWithExample() {
        return mapWithExample;
    }

    @JsonProperty(JSON_PROPERTY_MAP_WITH_EXAMPLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMapWithExample(Map<String, String> mapWithExample) {
        this.mapWithExample = mapWithExample;
    }

    public Model optionalArray(List<String> optionalArray) {
        this.optionalArray = optionalArray;
        return this;
    }

    public Model addOptionalArrayItem(String optionalArrayItem) {
        if (this.optionalArray == null) {
            this.optionalArray = new ArrayList<>();
        }
        this.optionalArray.add(optionalArrayItem);
        return this;
    }

    /**
     * Get optionalArray
     * @return optionalArray
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_OPTIONAL_ARRAY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getOptionalArray() {
        return optionalArray;
    }

    @JsonProperty(JSON_PROPERTY_OPTIONAL_ARRAY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOptionalArray(List<String> optionalArray) {
        this.optionalArray = optionalArray;
    }

    public Model optionalSet(Set<String> optionalSet) {
        this.optionalSet = optionalSet;
        return this;
    }

    public Model addOptionalSetItem(String optionalSetItem) {
        if (this.optionalSet == null) {
            this.optionalSet = new LinkedHashSet<>();
        }
        this.optionalSet.add(optionalSetItem);
        return this;
    }

    /**
     * Get optionalSet
     * @return optionalSet
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_OPTIONAL_SET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Set<String> getOptionalSet() {
        return optionalSet;
    }

    @JsonProperty(JSON_PROPERTY_OPTIONAL_SET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       @JsonDeserialize(as = LinkedHashSet.class)
    public void setOptionalSet(Set<String> optionalSet) {
        this.optionalSet = optionalSet;
    }

    public Model optionalMap(Map<String, String> optionalMap) {
        this.optionalMap = optionalMap;
        return this;
    }

    public Model putOptionalMapItem(String key, String optionalMapItem) {
        if (this.optionalMap == null) {
            this.optionalMap = new HashMap<>();
        }
        this.optionalMap.put(key, optionalMapItem);
        return this;
  }

    /**
     * Get optionalMap
     * @return optionalMap
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_OPTIONAL_MAP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, String> getOptionalMap() {
        return optionalMap;
    }

    @JsonProperty(JSON_PROPERTY_OPTIONAL_MAP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOptionalMap(Map<String, String> optionalMap) {
        this.optionalMap = optionalMap;
    }

    public Model nullableString(String nullableString) {
        this.nullableString = nullableString;
        return this;
    }

    /**
     * Get nullableString
     * @return nullableString
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_NULLABLE_STRING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getNullableString() {
        return nullableString;
    }

    @JsonProperty(JSON_PROPERTY_NULLABLE_STRING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNullableString(String nullableString) {
        this.nullableString = nullableString;
    }

    public Model nullableArray(List<String> nullableArray) {
        this.nullableArray = nullableArray;
        return this;
    }

    public Model addNullableArrayItem(String nullableArrayItem) {
        if (this.nullableArray == null) {
            this.nullableArray = new ArrayList<>();
        }
        this.nullableArray.add(nullableArrayItem);
        return this;
    }

    /**
     * Get nullableArray
     * @return nullableArray
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_NULLABLE_ARRAY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getNullableArray() {
        return nullableArray;
    }

    @JsonProperty(JSON_PROPERTY_NULLABLE_ARRAY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNullableArray(List<String> nullableArray) {
        this.nullableArray = nullableArray;
    }

    public Model nullableSet(Set<String> nullableSet) {
        this.nullableSet = nullableSet;
        return this;
    }

    public Model addNullableSetItem(String nullableSetItem) {
        if (this.nullableSet == null) {
            this.nullableSet = new LinkedHashSet<>();
        }
        this.nullableSet.add(nullableSetItem);
        return this;
    }

    /**
     * Get nullableSet
     * @return nullableSet
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_NULLABLE_SET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Set<String> getNullableSet() {
        return nullableSet;
    }

    @JsonProperty(JSON_PROPERTY_NULLABLE_SET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNullableSet(Set<String> nullableSet) {
        this.nullableSet = nullableSet;
    }

    public Model defaultString(String defaultString) {
        this.defaultString = defaultString;
        return this;
    }

    /**
     * Get defaultString
     * @return defaultString
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DEFAULT_STRING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDefaultString() {
        return defaultString;
    }

    @JsonProperty(JSON_PROPERTY_DEFAULT_STRING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDefaultString(String defaultString) {
        this.defaultString = defaultString;
    }

    public Model defaultInteger(Integer defaultInteger) {
        this.defaultInteger = defaultInteger;
        return this;
    }

    /**
     * Get defaultInteger
     * @return defaultInteger
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DEFAULT_INTEGER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getDefaultInteger() {
        return defaultInteger;
    }

    @JsonProperty(JSON_PROPERTY_DEFAULT_INTEGER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDefaultInteger(Integer defaultInteger) {
        this.defaultInteger = defaultInteger;
    }

    public Model defaultLong(Long defaultLong) {
        this.defaultLong = defaultLong;
        return this;
    }

    /**
     * Get defaultLong
     * @return defaultLong
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DEFAULT_LONG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getDefaultLong() {
        return defaultLong;
    }

    @JsonProperty(JSON_PROPERTY_DEFAULT_LONG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDefaultLong(Long defaultLong) {
        this.defaultLong = defaultLong;
    }

    public Model defaultNullable(String defaultNullable) {
        this.defaultNullable = defaultNullable;
        return this;
    }

    /**
     * Get defaultNullable
     * @return defaultNullable
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_DEFAULT_NULLABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDefaultNullable() {
        return defaultNullable;
    }

    @JsonProperty(JSON_PROPERTY_DEFAULT_NULLABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDefaultNullable(String defaultNullable) {
        this.defaultNullable = defaultNullable;
    }

    public Model referenedModel(EnumerationModel referenedModel) {
        this.referenedModel = referenedModel;
        return this;
    }

    /**
     * Get referenedModel
     * @return referenedModel
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_REFERENED_MODEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public EnumerationModel getReferenedModel() {
        return referenedModel;
    }

    @JsonProperty(JSON_PROPERTY_REFERENED_MODEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReferenedModel(EnumerationModel referenedModel) {
        this.referenedModel = referenedModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Model model = (Model) o;
        return Objects.equals(this.id, model.id) &&
            Objects.equals(this.idWithExample, model.idWithExample) &&
            Objects.equals(this.idWithDefault, model.idWithDefault) &&
            Objects.equals(this.name, model.name) &&
            Objects.equals(this.nameWithExample, model.nameWithExample) &&
            Objects.equals(this.nameWithDefault, model.nameWithDefault) &&
            Objects.equals(this.date, model.date) &&
            Objects.equals(this.dateWithExample, model.dateWithExample) &&
            Objects.equals(this.dateTime, model.dateTime) &&
            Objects.equals(this.dateTimeWithExample, model.dateTimeWithExample) &&
            Objects.equals(this.number, model.number) &&
            Objects.equals(this.binary, model.binary) &&
            Arrays.equals(this.bytes, model.bytes) &&
            Objects.equals(this.any, model.any) &&
            Objects.equals(this.array, model.array) &&
            Objects.equals(this.arrayWithExample, model.arrayWithExample) &&
            Objects.equals(this.set, model.set) &&
            Objects.equals(this.setWithExamples, model.setWithExamples) &&
            Objects.equals(this.map, model.map) &&
            Objects.equals(this.mapWithExample, model.mapWithExample) &&
            Objects.equals(this.optionalArray, model.optionalArray) &&
            Objects.equals(this.optionalSet, model.optionalSet) &&
            Objects.equals(this.optionalMap, model.optionalMap) &&
            Objects.equals(this.nullableString, model.nullableString) &&
            Objects.equals(this.nullableArray, model.nullableArray) &&
            Objects.equals(this.nullableSet, model.nullableSet) &&
            Objects.equals(this.defaultString, model.defaultString) &&
            Objects.equals(this.defaultInteger, model.defaultInteger) &&
            Objects.equals(this.defaultLong, model.defaultLong) &&
            Objects.equals(this.defaultNullable, model.defaultNullable) &&
            Objects.equals(this.referenedModel, model.referenedModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idWithExample, idWithDefault, name, nameWithExample, nameWithDefault, date, dateWithExample, dateTime, dateTimeWithExample, number, binary, Arrays.hashCode(bytes), any, array, arrayWithExample, set, setWithExamples, map, mapWithExample, optionalArray, optionalSet, optionalMap, nullableString, nullableArray, nullableSet, defaultString, defaultInteger, defaultLong, defaultNullable, referenedModel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Model {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    idWithExample: ").append(toIndentedString(idWithExample)).append("\n");
        sb.append("    idWithDefault: ").append(toIndentedString(idWithDefault)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameWithExample: ").append(toIndentedString(nameWithExample)).append("\n");
        sb.append("    nameWithDefault: ").append(toIndentedString(nameWithDefault)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    dateWithExample: ").append(toIndentedString(dateWithExample)).append("\n");
        sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
        sb.append("    dateTimeWithExample: ").append(toIndentedString(dateTimeWithExample)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
        sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
        sb.append("    any: ").append(toIndentedString(any)).append("\n");
        sb.append("    array: ").append(toIndentedString(array)).append("\n");
        sb.append("    arrayWithExample: ").append(toIndentedString(arrayWithExample)).append("\n");
        sb.append("    set: ").append(toIndentedString(set)).append("\n");
        sb.append("    setWithExamples: ").append(toIndentedString(setWithExamples)).append("\n");
        sb.append("    map: ").append(toIndentedString(map)).append("\n");
        sb.append("    mapWithExample: ").append(toIndentedString(mapWithExample)).append("\n");
        sb.append("    optionalArray: ").append(toIndentedString(optionalArray)).append("\n");
        sb.append("    optionalSet: ").append(toIndentedString(optionalSet)).append("\n");
        sb.append("    optionalMap: ").append(toIndentedString(optionalMap)).append("\n");
        sb.append("    nullableString: ").append(toIndentedString(nullableString)).append("\n");
        sb.append("    nullableArray: ").append(toIndentedString(nullableArray)).append("\n");
        sb.append("    nullableSet: ").append(toIndentedString(nullableSet)).append("\n");
        sb.append("    defaultString: ").append(toIndentedString(defaultString)).append("\n");
        sb.append("    defaultInteger: ").append(toIndentedString(defaultInteger)).append("\n");
        sb.append("    defaultLong: ").append(toIndentedString(defaultLong)).append("\n");
        sb.append("    defaultNullable: ").append(toIndentedString(defaultNullable)).append("\n");
        sb.append("    referenedModel: ").append(toIndentedString(referenedModel)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

