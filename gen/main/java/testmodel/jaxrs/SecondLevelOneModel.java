package testmodel.jaxrs;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SecondLevelOneModel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: stable")@java.lang.SuppressWarnings("all")

public class SecondLevelOneModel   {
  private @Valid String type;
  private @Valid String one;

  /**
   **/
  public SecondLevelOneModel type(String type) {
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
  public SecondLevelOneModel one(String one) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecondLevelOneModel secondLevelOneModel = (SecondLevelOneModel) o;
    return Objects.equals(this.type, secondLevelOneModel.type) &&
        Objects.equals(this.one, secondLevelOneModel.one);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, one);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondLevelOneModel {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    one: ").append(toIndentedString(one)).append("\n");
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

