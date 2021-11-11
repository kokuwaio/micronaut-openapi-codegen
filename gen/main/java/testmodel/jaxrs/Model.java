package testmodel.jaxrs;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")@java.lang.SuppressWarnings("all")
public class Model   {
  
  private @Valid Integer id;
  private @Valid String name;
  private @Valid LocalDate date;
  private @Valid OffsetDateTime dateTime;
  private @Valid BigDecimal number;
  private @Valid File binary;
  private @Valid byte[] bytes;
  private @Valid Object any = null;
  private @Valid List<String> array = new ArrayList<>();
  private @Valid Set<String> set = new LinkedHashSet<>();
  private @Valid Map<String, String> map = new HashMap<>();
  private @Valid List<String> optionalArray = new ArrayList<>();
  private @Valid Set<String> optionalSet = new LinkedHashSet<>();
  private @Valid Map<String, String> optionalMap = new HashMap<>();
  private @Valid String nullableString;
  private @Valid List<String> nullableArray = new ArrayList<>();
  private @Valid Set<String> nullableSet = new LinkedHashSet<>();
  private @Valid Map<String, String> nullableMap = new HashMap<>();
  private @Valid String defaultString = "defaultStringValue";
  private @Valid Long defaultInteger = 1234l;
  private @Valid String defaultNullable = "defaultNullableValue";

  /**
   **/
  public Model id(Integer id) {
    this.id = id;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Integer id) {
    this.id = id;
  }

/**
   **/
  public Model name(String name) {
    this.name = name;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
 @Size(max=36)  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

/**
   **/
  public Model date(LocalDate date) {
    this.date = date;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }

  @JsonProperty("date")
  public void setDate(LocalDate date) {
    this.date = date;
  }

/**
   **/
  public Model dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("date-time")
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  @JsonProperty("date-time")
  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

/**
   **/
  public Model number(BigDecimal number) {
    this.number = number;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("number")
  public BigDecimal getNumber() {
    return number;
  }

  @JsonProperty("number")
  public void setNumber(BigDecimal number) {
    this.number = number;
  }

/**
   **/
  public Model binary(File binary) {
    this.binary = binary;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("binary")
  public File getBinary() {
    return binary;
  }

  @JsonProperty("binary")
  public void setBinary(File binary) {
    this.binary = binary;
  }

/**
   **/
  public Model bytes(byte[] bytes) {
    this.bytes = bytes;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("bytes")
  public byte[] getBytes() {
    return bytes;
  }

  @JsonProperty("bytes")
  public void setBytes(byte[] bytes) {
    this.bytes = bytes;
  }

/**
   **/
  public Model any(Object any) {
    this.any = any;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("any")
  public Object getAny() {
    return any;
  }

  @JsonProperty("any")
  public void setAny(Object any) {
    this.any = any;
  }

/**
   **/
  public Model array(List<String> array) {
    this.array = array;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("array")
  @NotNull
  public List<String> getArray() {
    return array;
  }

  @JsonProperty("array")
  public void setArray(List<String> array) {
    this.array = array;
  }

  public Model addArrayItem(String arrayItem) {
    if (this.array == null) {
      this.array = new ArrayList<>();
    }

    this.array.add(arrayItem);
    return this;
  }

  public Model removeArrayItem(String arrayItem) {
    if (arrayItem != null && this.array != null) {
      this.array.remove(arrayItem);
    }

    return this;
  }
/**
   **/
  public Model set(Set<String> set) {
    this.set = set;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("set")
  @NotNull
  public Set<String> getSet() {
    return set;
  }

  @JsonProperty("set")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setSet(Set<String> set) {
    this.set = set;
  }

  public Model addSetItem(String setItem) {
    if (this.set == null) {
      this.set = new LinkedHashSet<>();
    }

    this.set.add(setItem);
    return this;
  }

  public Model removeSetItem(String setItem) {
    if (setItem != null && this.set != null) {
      this.set.remove(setItem);
    }

    return this;
  }
/**
   **/
  public Model map(Map<String, String> map) {
    this.map = map;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("map")
  @NotNull
  public Map<String, String> getMap() {
    return map;
  }

  @JsonProperty("map")
  public void setMap(Map<String, String> map) {
    this.map = map;
  }

  public Model putMapItem(String key, String mapItem) {
    if (this.map == null) {
      this.map = new HashMap<>();
    }

    this.map.put(key, mapItem);
    return this;
  }

  public Model removeMapItem(String mapItem) {
    if (mapItem != null && this.map != null) {
      this.map.remove(mapItem);
    }

    return this;
  }
/**
   **/
  public Model optionalArray(List<String> optionalArray) {
    this.optionalArray = optionalArray;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("optionalArray")
  public List<String> getOptionalArray() {
    return optionalArray;
  }

  @JsonProperty("optionalArray")
  public void setOptionalArray(List<String> optionalArray) {
    this.optionalArray = optionalArray;
  }

  public Model addOptionalArrayItem(String optionalArrayItem) {
    if (this.optionalArray == null) {
      this.optionalArray = new ArrayList<>();
    }

    this.optionalArray.add(optionalArrayItem);
    return this;
  }

  public Model removeOptionalArrayItem(String optionalArrayItem) {
    if (optionalArrayItem != null && this.optionalArray != null) {
      this.optionalArray.remove(optionalArrayItem);
    }

    return this;
  }
/**
   **/
  public Model optionalSet(Set<String> optionalSet) {
    this.optionalSet = optionalSet;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("optionalSet")
  public Set<String> getOptionalSet() {
    return optionalSet;
  }

  @JsonProperty("optionalSet")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOptionalSet(Set<String> optionalSet) {
    this.optionalSet = optionalSet;
  }

  public Model addOptionalSetItem(String optionalSetItem) {
    if (this.optionalSet == null) {
      this.optionalSet = new LinkedHashSet<>();
    }

    this.optionalSet.add(optionalSetItem);
    return this;
  }

  public Model removeOptionalSetItem(String optionalSetItem) {
    if (optionalSetItem != null && this.optionalSet != null) {
      this.optionalSet.remove(optionalSetItem);
    }

    return this;
  }
/**
   **/
  public Model optionalMap(Map<String, String> optionalMap) {
    this.optionalMap = optionalMap;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("optionalMap")
  public Map<String, String> getOptionalMap() {
    return optionalMap;
  }

  @JsonProperty("optionalMap")
  public void setOptionalMap(Map<String, String> optionalMap) {
    this.optionalMap = optionalMap;
  }

  public Model putOptionalMapItem(String key, String optionalMapItem) {
    if (this.optionalMap == null) {
      this.optionalMap = new HashMap<>();
    }

    this.optionalMap.put(key, optionalMapItem);
    return this;
  }

  public Model removeOptionalMapItem(String optionalMapItem) {
    if (optionalMapItem != null && this.optionalMap != null) {
      this.optionalMap.remove(optionalMapItem);
    }

    return this;
  }
/**
   **/
  public Model nullableString(String nullableString) {
    this.nullableString = nullableString;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("nullableString")
  public String getNullableString() {
    return nullableString;
  }

  @JsonProperty("nullableString")
  public void setNullableString(String nullableString) {
    this.nullableString = nullableString;
  }

/**
   **/
  public Model nullableArray(List<String> nullableArray) {
    this.nullableArray = nullableArray;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("nullableArray")
  public List<String> getNullableArray() {
    return nullableArray;
  }

  @JsonProperty("nullableArray")
  public void setNullableArray(List<String> nullableArray) {
    this.nullableArray = nullableArray;
  }

  public Model addNullableArrayItem(String nullableArrayItem) {
    if (this.nullableArray == null) {
      this.nullableArray = new ArrayList<>();
    }

    this.nullableArray.add(nullableArrayItem);
    return this;
  }

  public Model removeNullableArrayItem(String nullableArrayItem) {
    if (nullableArrayItem != null && this.nullableArray != null) {
      this.nullableArray.remove(nullableArrayItem);
    }

    return this;
  }
/**
   **/
  public Model nullableSet(Set<String> nullableSet) {
    this.nullableSet = nullableSet;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("nullableSet")
  public Set<String> getNullableSet() {
    return nullableSet;
  }

  @JsonProperty("nullableSet")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setNullableSet(Set<String> nullableSet) {
    this.nullableSet = nullableSet;
  }

  public Model addNullableSetItem(String nullableSetItem) {
    if (this.nullableSet == null) {
      this.nullableSet = new LinkedHashSet<>();
    }

    this.nullableSet.add(nullableSetItem);
    return this;
  }

  public Model removeNullableSetItem(String nullableSetItem) {
    if (nullableSetItem != null && this.nullableSet != null) {
      this.nullableSet.remove(nullableSetItem);
    }

    return this;
  }
/**
   **/
  public Model nullableMap(Map<String, String> nullableMap) {
    this.nullableMap = nullableMap;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("nullableMap")
  public Map<String, String> getNullableMap() {
    return nullableMap;
  }

  @JsonProperty("nullableMap")
  public void setNullableMap(Map<String, String> nullableMap) {
    this.nullableMap = nullableMap;
  }

  public Model putNullableMapItem(String key, String nullableMapItem) {
    if (this.nullableMap == null) {
      this.nullableMap = new HashMap<>();
    }

    this.nullableMap.put(key, nullableMapItem);
    return this;
  }

  public Model removeNullableMapItem(String nullableMapItem) {
    if (nullableMapItem != null && this.nullableMap != null) {
      this.nullableMap.remove(nullableMapItem);
    }

    return this;
  }
/**
   **/
  public Model defaultString(String defaultString) {
    this.defaultString = defaultString;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultString")
  public String getDefaultString() {
    return defaultString;
  }

  @JsonProperty("defaultString")
  public void setDefaultString(String defaultString) {
    this.defaultString = defaultString;
  }

/**
   **/
  public Model defaultInteger(Long defaultInteger) {
    this.defaultInteger = defaultInteger;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultInteger")
  public Long getDefaultInteger() {
    return defaultInteger;
  }

  @JsonProperty("defaultInteger")
  public void setDefaultInteger(Long defaultInteger) {
    this.defaultInteger = defaultInteger;
  }

/**
   **/
  public Model defaultNullable(String defaultNullable) {
    this.defaultNullable = defaultNullable;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("defaultNullable")
  public String getDefaultNullable() {
    return defaultNullable;
  }

  @JsonProperty("defaultNullable")
  public void setDefaultNullable(String defaultNullable) {
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
        Objects.equals(this.bytes, model.bytes) &&
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

  @Override
  public int hashCode() {
    return Objects.hash(id, name, date, dateTime, number, binary, bytes, any, array, set, map, optionalArray, optionalSet, optionalMap, nullableString, nullableArray, nullableSet, nullableMap, defaultString, defaultInteger, defaultNullable);
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

