package testmodel.jaxrs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import testmodel.jaxrs.SecondLevelOneModel;
import testmodel.jaxrs.SecondLevelTwoModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SecondLevelModel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")@java.lang.SuppressWarnings("all")

public class SecondLevelModel   {
  private @Valid String type;
  private @Valid String one;
  private @Valid String two;

  /**
   **/
  public SecondLevelModel type(String type) {
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
  public SecondLevelModel one(String one) {
    this.one = one;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("one")
  public String getOne() {
    return one;
  }

  @JsonProperty("one")
  public void setOne(String one) {
    this.one = one;
  }

  /**
   **/
  public SecondLevelModel two(String two) {
    this.two = two;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    SecondLevelModel secondLevelModel = (SecondLevelModel) o;
    return Objects.equals(this.type, secondLevelModel.type) &&
        Objects.equals(this.one, secondLevelModel.one) &&
        Objects.equals(this.two, secondLevelModel.two);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, one, two);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondLevelModel {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    one: ").append(toIndentedString(one)).append("\n");
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

