package testmodel.jaxrs;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("InheritanceWithoutType1_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")@java.lang.SuppressWarnings("all")

public class InheritanceWithoutType1AllOf   {
  
  private @Valid String f;

  /**
   **/
  public InheritanceWithoutType1AllOf f(String f) {
    this.f = f;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("f")
  public String getF() {
    return f;
  }

  @JsonProperty("f")
  public void setF(String f) {
    this.f = f;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithoutType1AllOf inheritanceWithoutType1AllOf = (InheritanceWithoutType1AllOf) o;
    return Objects.equals(this.f, inheritanceWithoutType1AllOf.f);
  }

  @Override
  public int hashCode() {
    return Objects.hash(f);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithoutType1AllOf {\n");
    
    sb.append("    f: ").append(toIndentedString(f)).append("\n");
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

