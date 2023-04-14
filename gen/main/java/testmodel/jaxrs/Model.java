package testmodel.jaxrs;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.File;
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
import testmodel.jaxrs.EnumerationModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")@java.lang.SuppressWarnings("all")

public class Model   {
  private @Valid Integer id;
  private @Valid Integer idWithExample;
  private @Valid Integer idWithDefault = 32;
  private @Valid String name;
  private @Valid String nameWithExample;
  private @Valid String nameWithDefault = "MyDefaultName";
  private @Valid LocalDate date;
  private @Valid LocalDate dateWithExample;
  private @Valid OffsetDateTime dateTime;
  private @Valid OffsetDateTime dateTimeWithExample;
  private @Valid BigDecimal number;
  private @Valid File binary;
  private @Valid byte[] bytes;
  private @Valid Object any = null;
  private @Valid List<String> array = new ArrayList<>();
  private @Valid List<String> arrayWithExample;
  private @Valid Set<String> set = new LinkedHashSet<>();
  private @Valid Set<String> setWithExamples;
  private @Valid Map<String, String> map = new HashMap<>();
  private @Valid Map<String, String> mapWithExample = new HashMap<>();
  private @Valid List<String> optionalArray;
  private @Valid Set<String> optionalSet;
  private @Valid Map<String, String> optionalMap = new HashMap<>();
  private @Valid String nullableString;
  private @Valid List<String> nullableArray;
  private @Valid Set<String> nullableSet;
  private @Valid String defaultString = "defaultStringValue";
  private @Valid Integer defaultInteger = 1234;
  private @Valid Long defaultLong = 5678l;
  private @Valid String defaultNullable = "defaultNullableValue";
  private @Valid EnumerationModel referenedModel;

  /**
   **/
  public Model id(Integer id) {
    this.id = id;
    return this;
  }

  
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
  public Model idWithExample(Integer idWithExample) {
    this.idWithExample = idWithExample;
    return this;
  }

  
  @JsonProperty("idWithExample")
  public Integer getIdWithExample() {
    return idWithExample;
  }

  @JsonProperty("idWithExample")
  public void setIdWithExample(Integer idWithExample) {
    this.idWithExample = idWithExample;
  }

  /**
   **/
  public Model idWithDefault(Integer idWithDefault) {
    this.idWithDefault = idWithDefault;
    return this;
  }

  
  @JsonProperty("idWithDefault")
  public Integer getIdWithDefault() {
    return idWithDefault;
  }

  @JsonProperty("idWithDefault")
  public void setIdWithDefault(Integer idWithDefault) {
    this.idWithDefault = idWithDefault;
  }

  /**
   **/
  public Model name(String name) {
    this.name = name;
    return this;
  }

  
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
  public Model nameWithExample(String nameWithExample) {
    this.nameWithExample = nameWithExample;
    return this;
  }

  
  @JsonProperty("nameWithExample")
  public String getNameWithExample() {
    return nameWithExample;
  }

  @JsonProperty("nameWithExample")
  public void setNameWithExample(String nameWithExample) {
    this.nameWithExample = nameWithExample;
  }

  /**
   **/
  public Model nameWithDefault(String nameWithDefault) {
    this.nameWithDefault = nameWithDefault;
    return this;
  }

  
  @JsonProperty("nameWithDefault")
  public String getNameWithDefault() {
    return nameWithDefault;
  }

  @JsonProperty("nameWithDefault")
  public void setNameWithDefault(String nameWithDefault) {
    this.nameWithDefault = nameWithDefault;
  }

  /**
   **/
  public Model date(LocalDate date) {
    this.date = date;
    return this;
  }

  
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
  public Model dateWithExample(LocalDate dateWithExample) {
    this.dateWithExample = dateWithExample;
    return this;
  }

  
  @JsonProperty("dateWithExample")
  public LocalDate getDateWithExample() {
    return dateWithExample;
  }

  @JsonProperty("dateWithExample")
  public void setDateWithExample(LocalDate dateWithExample) {
    this.dateWithExample = dateWithExample;
  }

  /**
   **/
  public Model dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  
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
  public Model dateTimeWithExample(OffsetDateTime dateTimeWithExample) {
    this.dateTimeWithExample = dateTimeWithExample;
    return this;
  }

  
  @JsonProperty("date-timeWithExample")
  public OffsetDateTime getDateTimeWithExample() {
    return dateTimeWithExample;
  }

  @JsonProperty("date-timeWithExample")
  public void setDateTimeWithExample(OffsetDateTime dateTimeWithExample) {
    this.dateTimeWithExample = dateTimeWithExample;
  }

  /**
   **/
  public Model number(BigDecimal number) {
    this.number = number;
    return this;
  }

  
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
  public Model arrayWithExample(List<String> arrayWithExample) {
    this.arrayWithExample = arrayWithExample;
    return this;
  }

  
  @JsonProperty("arrayWithExample")
  public List<String> getArrayWithExample() {
    return arrayWithExample;
  }

  @JsonProperty("arrayWithExample")
  public void setArrayWithExample(List<String> arrayWithExample) {
    this.arrayWithExample = arrayWithExample;
  }

  public Model addArrayWithExampleItem(String arrayWithExampleItem) {
    if (this.arrayWithExample == null) {
      this.arrayWithExample = new ArrayList<>();
    }

    this.arrayWithExample.add(arrayWithExampleItem);
    return this;
  }

  public Model removeArrayWithExampleItem(String arrayWithExampleItem) {
    if (arrayWithExampleItem != null && this.arrayWithExample != null) {
      this.arrayWithExample.remove(arrayWithExampleItem);
    }

    return this;
  }
  /**
   **/
  public Model set(Set<String> set) {
    this.set = set;
    return this;
  }

  
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
  public Model setWithExamples(Set<String> setWithExamples) {
    this.setWithExamples = setWithExamples;
    return this;
  }

  
  @JsonProperty("setWithExamples")
  public Set<String> getSetWithExamples() {
    return setWithExamples;
  }

  @JsonProperty("setWithExamples")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setSetWithExamples(Set<String> setWithExamples) {
    this.setWithExamples = setWithExamples;
  }

  public Model addSetWithExamplesItem(String setWithExamplesItem) {
    if (this.setWithExamples == null) {
      this.setWithExamples = new LinkedHashSet<>();
    }

    this.setWithExamples.add(setWithExamplesItem);
    return this;
  }

  public Model removeSetWithExamplesItem(String setWithExamplesItem) {
    if (setWithExamplesItem != null && this.setWithExamples != null) {
      this.setWithExamples.remove(setWithExamplesItem);
    }

    return this;
  }
  /**
   **/
  public Model map(Map<String, String> map) {
    this.map = map;
    return this;
  }

  
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
  public Model mapWithExample(Map<String, String> mapWithExample) {
    this.mapWithExample = mapWithExample;
    return this;
  }

  
  @JsonProperty("mapWithExample")
  public Map<String, String> getMapWithExample() {
    return mapWithExample;
  }

  @JsonProperty("mapWithExample")
  public void setMapWithExample(Map<String, String> mapWithExample) {
    this.mapWithExample = mapWithExample;
  }

  public Model putMapWithExampleItem(String key, String mapWithExampleItem) {
    if (this.mapWithExample == null) {
      this.mapWithExample = new HashMap<>();
    }

    this.mapWithExample.put(key, mapWithExampleItem);
    return this;
  }

  public Model removeMapWithExampleItem(String mapWithExampleItem) {
    if (mapWithExampleItem != null && this.mapWithExample != null) {
      this.mapWithExample.remove(mapWithExampleItem);
    }

    return this;
  }
  /**
   **/
  public Model optionalArray(List<String> optionalArray) {
    this.optionalArray = optionalArray;
    return this;
  }

  
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

  
  @JsonProperty("nullableSet")
  public Set<String> getNullableSet() {
    return nullableSet;
  }

  @JsonProperty("nullableSet")
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
  public Model defaultString(String defaultString) {
    this.defaultString = defaultString;
    return this;
  }

  
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
  public Model defaultInteger(Integer defaultInteger) {
    this.defaultInteger = defaultInteger;
    return this;
  }

  
  @JsonProperty("defaultInteger")
  public Integer getDefaultInteger() {
    return defaultInteger;
  }

  @JsonProperty("defaultInteger")
  public void setDefaultInteger(Integer defaultInteger) {
    this.defaultInteger = defaultInteger;
  }

  /**
   **/
  public Model defaultLong(Long defaultLong) {
    this.defaultLong = defaultLong;
    return this;
  }

  
  @JsonProperty("defaultLong")
  public Long getDefaultLong() {
    return defaultLong;
  }

  @JsonProperty("defaultLong")
  public void setDefaultLong(Long defaultLong) {
    this.defaultLong = defaultLong;
  }

  /**
   **/
  public Model defaultNullable(String defaultNullable) {
    this.defaultNullable = defaultNullable;
    return this;
  }

  
  @JsonProperty("defaultNullable")
  public String getDefaultNullable() {
    return defaultNullable;
  }

  @JsonProperty("defaultNullable")
  public void setDefaultNullable(String defaultNullable) {
    this.defaultNullable = defaultNullable;
  }

  /**
   **/
  public Model referenedModel(EnumerationModel referenedModel) {
    this.referenedModel = referenedModel;
    return this;
  }

  
  @JsonProperty("referenedModel")
  public EnumerationModel getReferenedModel() {
    return referenedModel;
  }

  @JsonProperty("referenedModel")
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

