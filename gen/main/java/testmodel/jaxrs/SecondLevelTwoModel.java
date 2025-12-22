package testmodel.jaxrs;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("SecondLevelTwoModel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: stable")@java.lang.SuppressWarnings("all")

public class SecondLevelTwoModel   {
  private String type;
  private String two;

  public SecondLevelTwoModel() {
  }

  /**
   **/
  public SecondLevelTwoModel type(String type) {
    this.type = type;
    return this;
  }

  
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public SecondLevelTwoModel two(String two) {
    this.two = two;
    return this;
  }

  
  @JsonProperty("two")
  public String getTwo() {
    return two;
  }

  @JsonProperty("two")
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

