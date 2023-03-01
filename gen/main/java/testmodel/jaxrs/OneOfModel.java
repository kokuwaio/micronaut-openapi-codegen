package testmodel.jaxrs;

import testmodel.jaxrs.FirstModel;
import testmodel.jaxrs.SecondLevelModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OneOfModel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")@java.lang.SuppressWarnings("all")

public class OneOfModel   {
  private @Valid String type;
  private @Valid String first;
  private @Valid SecondLevelModel secondLevel;
  private @Valid String one;
  private @Valid String two;

  /**
   **/
  public OneOfModel type(String type) {
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
  public OneOfModel first(String first) {
    this.first = first;
    return this;
  }

  
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
  public OneOfModel secondLevel(SecondLevelModel secondLevel) {
    this.secondLevel = secondLevel;
    return this;
  }

  
  @JsonProperty("secondLevel")
  public SecondLevelModel getSecondLevel() {
    return secondLevel;
  }

  @JsonProperty("secondLevel")
  public void setSecondLevel(SecondLevelModel secondLevel) {
    this.secondLevel = secondLevel;
  }

  /**
   **/
  public OneOfModel one(String one) {
    this.one = one;
    return this;
  }

  
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
  public OneOfModel two(String two) {
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
    OneOfModel oneOfModel = (OneOfModel) o;
    return Objects.equals(this.type, oneOfModel.type) &&
        Objects.equals(this.first, oneOfModel.first) &&
        Objects.equals(this.secondLevel, oneOfModel.secondLevel) &&
        Objects.equals(this.one, oneOfModel.one) &&
        Objects.equals(this.two, oneOfModel.two);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, first, secondLevel, one, two);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneOfModel {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    secondLevel: ").append(toIndentedString(secondLevel)).append("\n");
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

