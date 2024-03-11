package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import testmodel.spring.SecondLevelModel;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * FirstModel
 */
@java.lang.SuppressWarnings("all")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: stable")
public class FirstModel implements OneOfModel {

  private String type;

  private String first;

  private SecondLevelModel secondLevel;

  public FirstModel type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FirstModel first(String first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
  */
  
  @JsonProperty("first")
  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public FirstModel secondLevel(SecondLevelModel secondLevel) {
    this.secondLevel = secondLevel;
    return this;
  }

  /**
   * Get secondLevel
   * @return secondLevel
  */
  @Valid 
  @JsonProperty("secondLevel")
  public SecondLevelModel getSecondLevel() {
    return secondLevel;
  }

  public void setSecondLevel(SecondLevelModel secondLevel) {
    this.secondLevel = secondLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirstModel firstModel = (FirstModel) o;
    return Objects.equals(this.type, firstModel.type) &&
        Objects.equals(this.first, firstModel.first) &&
        Objects.equals(this.secondLevel, firstModel.secondLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, first, secondLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirstModel {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    secondLevel: ").append(toIndentedString(secondLevel)).append("\n");
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

