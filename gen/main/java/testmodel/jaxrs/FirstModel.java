package testmodel.jaxrs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import testmodel.jaxrs.SecondLevelModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("FirstModel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")@java.lang.SuppressWarnings("all")

public class FirstModel   {
  private @Valid String type;
  private @Valid String first;
  private @Valid SecondLevelModel secondLevel;

  /**
   **/
  public FirstModel type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
  public FirstModel first(String first) {
    this.first = first;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("first")
  public String getFirst() {
    return first;
  }

  @JsonProperty("first")
  public void setFirst(String first) {
    this.first = first;
  }

  /**
   **/
  public FirstModel secondLevel(SecondLevelModel secondLevel) {
    this.secondLevel = secondLevel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("secondLevel")
  public SecondLevelModel getSecondLevel() {
    return secondLevel;
  }

  @JsonProperty("secondLevel")
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

