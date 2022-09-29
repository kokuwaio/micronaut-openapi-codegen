package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SecondLevelTwoModel
 */
@java.lang.SuppressWarnings("all")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SecondLevelTwoModel implements SecondLevelModel {

  @JsonProperty("type")
  private String type;

  @JsonProperty("two")
  private String two;

  public SecondLevelTwoModel type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", required = false)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SecondLevelTwoModel two(String two) {
    this.two = two;
    return this;
  }

  /**
   * Get two
   * @return two
  */
  
  @Schema(name = "two", required = false)
  public String getTwo() {
    return two;
  }

  public void setTwo(String two) {
    this.two = two;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecondLevelTwoModel secondLevelTwoModel = (SecondLevelTwoModel) o;
    return Objects.equals(this.type, secondLevelTwoModel.type) &&
        Objects.equals(this.two, secondLevelTwoModel.two);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, two);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondLevelTwoModel {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    two: ").append(toIndentedString(two)).append("\n");
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

