package testmodel.jaxrs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import testmodel.jaxrs.InheritanceWithType;
import testmodel.jaxrs.InheritanceWithType1AllOf;
import testmodel.jaxrs.InheritanceWithTypeEnum;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("InheritanceWithType1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")@java.lang.SuppressWarnings("all")
public class InheritanceWithType1 extends InheritanceWithType  {
  
  private @Valid String a;

  /**
   **/
  public InheritanceWithType1 a(String a) {
    this.a = a;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("a")
  public String getA() {
    return a;
  }

  @JsonProperty("a")
  public void setA(String a) {
    this.a = a;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithType1 inheritanceWithType1 = (InheritanceWithType1) o;
    return Objects.equals(this.a, inheritanceWithType1.a) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(a, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithType1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    a: ").append(toIndentedString(a)).append("\n");
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

