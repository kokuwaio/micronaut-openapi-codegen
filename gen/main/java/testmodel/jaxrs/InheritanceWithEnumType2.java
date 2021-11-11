package testmodel.jaxrs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import testmodel.jaxrs.InheritanceWithEnumType;
import testmodel.jaxrs.InheritanceWithEnumType2AllOf;
import testmodel.jaxrs.InheritanceWithEnumTypeEnum;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("InheritanceWithEnumType2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")@java.lang.SuppressWarnings("all")

public class InheritanceWithEnumType2 extends InheritanceWithEnumType  {
  
  private @Valid String e;

  /**
   **/
  public InheritanceWithEnumType2 e(String e) {
    this.e = e;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("e")
  public String getE() {
    return e;
  }

  @JsonProperty("e")
  public void setE(String e) {
    this.e = e;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithEnumType2 inheritanceWithEnumType2 = (InheritanceWithEnumType2) o;
    return Objects.equals(this.e, inheritanceWithEnumType2.e) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(e, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithEnumType2 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
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

