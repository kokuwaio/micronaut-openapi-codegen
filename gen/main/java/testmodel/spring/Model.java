package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Model
 */
@java.lang.SuppressWarnings("all")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Model {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("date")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate date;

  @JsonProperty("date-time")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateTime;

  @JsonProperty("number")
  private BigDecimal number;

  @JsonProperty("binary")
  private org.springframework.core.io.Resource binary;

  @JsonProperty("bytes")
  private byte[] bytes;

  @JsonProperty("any")
  private JsonNullable<Object> any = JsonNullable.undefined();

  @JsonProperty("array")
  @Valid
  private List<String> array = new ArrayList<>();

  @JsonProperty("set")
  @Valid
  private Set<String> set = new LinkedHashSet<>();

  @JsonProperty("map")
  @Valid
  private Map<String, String> map = new HashMap<>();

  @JsonProperty("optionalArray")
  @Valid
  private List<String> optionalArray = null;

  @JsonProperty("optionalSet")
  @Valid
  private Set<String> optionalSet = null;

  @JsonProperty("optionalMap")
  @Valid
  private Map<String, String> optionalMap = null;

  @JsonProperty("nullableString")
  private JsonNullable<String> nullableString = JsonNullable.undefined();

  @JsonProperty("nullableArray")
  @Valid
  private JsonNullable<List<String>> nullableArray = JsonNullable.undefined();

  @JsonProperty("nullableSet")
  @Valid
  private JsonNullable<Set<String>> nullableSet = JsonNullable.undefined();

  @JsonProperty("nullableMap")
  @Valid
  private JsonNullable<Map<String, String>> nullableMap = JsonNullable.undefined();

  @JsonProperty("defaultString")
  private String defaultString = "defaultStringValue";

  @JsonProperty("defaultInteger")
  private Long defaultInteger = 1234l;

  @JsonProperty("defaultNullable")
  private JsonNullable<String> defaultNullable = JsonNullable.undefined();

  public Model id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Model name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull @Size(max = 36) 
  @Schema(name = "name", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Model date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @Valid 
  @Schema(name = "date", required = false)
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Model dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
  */
  @Valid 
  @Schema(name = "date-time", required = false)
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public Model number(BigDecimal number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  @Valid 
  @Schema(name = "number", required = false)
  public BigDecimal getNumber() {
    return number;
  }

  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  public Model binary(org.springframework.core.io.Resource binary) {
    this.binary = binary;
    return this;
  }

  /**
   * Get binary
   * @return binary
  */
  @Valid 
  @Schema(name = "binary", required = false)
  public org.springframework.core.io.Resource getBinary() {
    return binary;
  }

  public void setBinary(org.springframework.core.io.Resource binary) {
    this.binary = binary;
  }

  public Model bytes(byte[] bytes) {
    this.bytes = bytes;
    return this;
  }

  /**
   * Get bytes
   * @return bytes
  */
  
  @Schema(name = "bytes", required = false)
  public byte[] getBytes() {
    return bytes;
  }

  public void setBytes(byte[] bytes) {
    this.bytes = bytes;
  }

  public Model any(Object any) {
    this.any = JsonNullable.of(any);
    return this;
  }

  /**
   * Get any
   * @return any
  */
  
  @Schema(name = "any", required = false)
  public JsonNullable<Object> getAny() {
    return any;
  }

  public void setAny(JsonNullable<Object> any) {
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
  */
  @NotNull 
  @Schema(name = "array", required = true)
  public List<String> getArray() {
    return array;
  }

  public void setArray(List<String> array) {
    this.array = array;
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
  */
  @NotNull 
  @Schema(name = "set", required = true)
  public Set<String> getSet() {
    return set;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setSet(Set<String> set) {
    this.set = set;
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
  */
  @NotNull 
  @Schema(name = "map", required = true)
  public Map<String, String> getMap() {
    return map;
  }

  public void setMap(Map<String, String> map) {
    this.map = map;
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
  */
  
  @Schema(name = "optionalArray", required = false)
  public List<String> getOptionalArray() {
    return optionalArray;
  }

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
  */
  
  @Schema(name = "optionalSet", required = false)
  public Set<String> getOptionalSet() {
    return optionalSet;
  }

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
  */
  
  @Schema(name = "optionalMap", required = false)
  public Map<String, String> getOptionalMap() {
    return optionalMap;
  }

  public void setOptionalMap(Map<String, String> optionalMap) {
    this.optionalMap = optionalMap;
  }

  public Model nullableString(String nullableString) {
    this.nullableString = JsonNullable.of(nullableString);
    return this;
  }

  /**
   * Get nullableString
   * @return nullableString
  */
  
  @Schema(name = "nullableString", required = false)
  public JsonNullable<String> getNullableString() {
    return nullableString;
  }

  public void setNullableString(JsonNullable<String> nullableString) {
    this.nullableString = nullableString;
  }

  public Model nullableArray(List<String> nullableArray) {
    this.nullableArray = JsonNullable.of(nullableArray);
    return this;
  }

  public Model addNullableArrayItem(String nullableArrayItem) {
    if (this.nullableArray == null || !this.nullableArray.isPresent()) {
      this.nullableArray = JsonNullable.of(new ArrayList<>());
    }
    this.nullableArray.get().add(nullableArrayItem);
    return this;
  }

  /**
   * Get nullableArray
   * @return nullableArray
  */
  
  @Schema(name = "nullableArray", required = false)
  public JsonNullable<List<String>> getNullableArray() {
    return nullableArray;
  }

  public void setNullableArray(JsonNullable<List<String>> nullableArray) {
    this.nullableArray = nullableArray;
  }

  public Model nullableSet(Set<String> nullableSet) {
    this.nullableSet = JsonNullable.of(nullableSet);
    return this;
  }

  public Model addNullableSetItem(String nullableSetItem) {
    if (this.nullableSet == null || !this.nullableSet.isPresent()) {
      this.nullableSet = JsonNullable.of(new LinkedHashSet<>());
    }
    this.nullableSet.get().add(nullableSetItem);
    return this;
  }

  /**
   * Get nullableSet
   * @return nullableSet
  */
  
  @Schema(name = "nullableSet", required = false)
  public JsonNullable<Set<String>> getNullableSet() {
    return nullableSet;
  }

  public void setNullableSet(JsonNullable<Set<String>> nullableSet) {
    this.nullableSet = nullableSet;
  }

  public Model nullableMap(Map<String, String> nullableMap) {
    this.nullableMap = JsonNullable.of(nullableMap);
    return this;
  }

//  public Model putNullableMapItem(String key, String nullableMapItem) {
//    if (this.nullableMap == null) {
//      this.nullableMap = new HashMap<>();
//    }
//    this.nullableMap.put(key, nullableMapItem);
//    return this;
//  }

  /**
   * Get nullableMap
   * @return nullableMap
  */
  
  @Schema(name = "nullableMap", required = false)
  public JsonNullable<Map<String, String>> getNullableMap() {
    return nullableMap;
  }

  public void setNullableMap(JsonNullable<Map<String, String>> nullableMap) {
    this.nullableMap = nullableMap;
  }

  public Model defaultString(String defaultString) {
    this.defaultString = defaultString;
    return this;
  }

  /**
   * Get defaultString
   * @return defaultString
  */
  
  @Schema(name = "defaultString", required = false)
  public String getDefaultString() {
    return defaultString;
  }

  public void setDefaultString(String defaultString) {
    this.defaultString = defaultString;
  }

  public Model defaultInteger(Long defaultInteger) {
    this.defaultInteger = defaultInteger;
    return this;
  }

  /**
   * Get defaultInteger
   * @return defaultInteger
  */
  
  @Schema(name = "defaultInteger", required = false)
  public Long getDefaultInteger() {
    return defaultInteger;
  }

  public void setDefaultInteger(Long defaultInteger) {
    this.defaultInteger = defaultInteger;
  }

  public Model defaultNullable(String defaultNullable) {
    this.defaultNullable = JsonNullable.of(defaultNullable);
    return this;
  }

  /**
   * Get defaultNullable
   * @return defaultNullable
  */
  
  @Schema(name = "defaultNullable", required = false)
  public JsonNullable<String> getDefaultNullable() {
    return defaultNullable;
  }

  public void setDefaultNullable(JsonNullable<String> defaultNullable) {
    this.defaultNullable = defaultNullable;
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
        Objects.equals(this.name, model.name) &&
        Objects.equals(this.date, model.date) &&
        Objects.equals(this.dateTime, model.dateTime) &&
        Objects.equals(this.number, model.number) &&
        Objects.equals(this.binary, model.binary) &&
        Arrays.equals(this.bytes, model.bytes) &&
        Objects.equals(this.any, model.any) &&
        Objects.equals(this.array, model.array) &&
        Objects.equals(this.set, model.set) &&
        Objects.equals(this.map, model.map) &&
        Objects.equals(this.optionalArray, model.optionalArray) &&
        Objects.equals(this.optionalSet, model.optionalSet) &&
        Objects.equals(this.optionalMap, model.optionalMap) &&
        Objects.equals(this.nullableString, model.nullableString) &&
        Objects.equals(this.nullableArray, model.nullableArray) &&
        Objects.equals(this.nullableSet, model.nullableSet) &&
        Objects.equals(this.nullableMap, model.nullableMap) &&
        Objects.equals(this.defaultString, model.defaultString) &&
        Objects.equals(this.defaultInteger, model.defaultInteger) &&
        Objects.equals(this.defaultNullable, model.defaultNullable);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, date, dateTime, number, binary, Arrays.hashCode(bytes), any, array, set, map, optionalArray, optionalSet, optionalMap, nullableString, nullableArray, nullableSet, nullableMap, defaultString, defaultInteger, defaultNullable);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    any: ").append(toIndentedString(any)).append("\n");
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
    sb.append("    set: ").append(toIndentedString(set)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    optionalArray: ").append(toIndentedString(optionalArray)).append("\n");
    sb.append("    optionalSet: ").append(toIndentedString(optionalSet)).append("\n");
    sb.append("    optionalMap: ").append(toIndentedString(optionalMap)).append("\n");
    sb.append("    nullableString: ").append(toIndentedString(nullableString)).append("\n");
    sb.append("    nullableArray: ").append(toIndentedString(nullableArray)).append("\n");
    sb.append("    nullableSet: ").append(toIndentedString(nullableSet)).append("\n");
    sb.append("    nullableMap: ").append(toIndentedString(nullableMap)).append("\n");
    sb.append("    defaultString: ").append(toIndentedString(defaultString)).append("\n");
    sb.append("    defaultInteger: ").append(toIndentedString(defaultInteger)).append("\n");
    sb.append("    defaultNullable: ").append(toIndentedString(defaultNullable)).append("\n");
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

