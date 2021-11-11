package testmodel.jaxrs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import testmodel.jaxrs.InheritanceWithType;
import testmodel.jaxrs.InheritanceWithType2AllOf;
import testmodel.jaxrs.InheritanceWithTypeEnum;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("InheritanceWithType2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")@java.lang.SuppressWarnings("all")
public class InheritanceWithType2 extends InheritanceWithType  {
  
  private @Valid String b;

  /**
   **/
  public InheritanceWithType2 b(String b) {
    this.b = b;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("b")
  public String getB() {
    return b;
  }

  @JsonProperty("b")
  public void setB(String b) {
    this.b = b;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithType2 inheritanceWithType2 = (InheritanceWithType2) o;
    return Objects.equals(this.b, inheritanceWithType2.b) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(b, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithType2 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    b: ").append(toIndentedString(b)).append("\n");
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

