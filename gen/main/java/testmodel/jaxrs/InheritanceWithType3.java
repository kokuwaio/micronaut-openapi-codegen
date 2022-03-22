package testmodel.jaxrs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import testmodel.jaxrs.InheritanceWithType2;
import testmodel.jaxrs.InheritanceWithType3AllOf;
import testmodel.jaxrs.InheritanceWithTypeEnum;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("InheritanceWithType3")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")@java.lang.SuppressWarnings("all")
public class InheritanceWithType3 extends InheritanceWithType2  {
  
  private @Valid String c;

  /**
   **/
  public InheritanceWithType3 c(String c) {
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
    InheritanceWithType3 inheritanceWithType3 = (InheritanceWithType3) o;
    return Objects.equals(this.c, inheritanceWithType3.c) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithType3 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
