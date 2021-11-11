package testmodel.jaxrs;

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



@JsonTypeName("InheritanceWithType3_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")@java.lang.SuppressWarnings("all")
public class InheritanceWithType3AllOf   {
  
  private @Valid String c;

  /**
   **/
  public InheritanceWithType3AllOf c(String c) {
    this.c = c;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("c")
  public String getC() {
    return c;
  }

  @JsonProperty("c")
  public void setC(String c) {
    this.c = c;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithType3AllOf inheritanceWithType3AllOf = (InheritanceWithType3AllOf) o;
    return Objects.equals(this.c, inheritanceWithType3AllOf.c);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithType3AllOf {\n");
    
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
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

