package testmodel.jaxrs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import testmodel.jaxrs.InheritanceWithoutType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("InheritanceWithoutType1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")@java.lang.SuppressWarnings("all")

public class InheritanceWithoutType1 extends InheritanceWithoutType  {
  private @Valid String f;

  /**
   **/
  public InheritanceWithoutType1 f(String f) {
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
    InheritanceWithoutType1 inheritanceWithoutType1 = (InheritanceWithoutType1) o;
    return Objects.equals(this.f, inheritanceWithoutType1.f) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(f, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithoutType1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

