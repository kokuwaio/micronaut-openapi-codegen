package testmodel.jaxrs;

import testmodel.jaxrs.InheritanceWithEnumType;
import testmodel.jaxrs.InheritanceWithEnumTypeEnum;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("InheritanceWithEnumType1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")@java.lang.SuppressWarnings("all")

public class InheritanceWithEnumType1 extends InheritanceWithEnumType  {
  private @Valid String d;

  /**
   **/
  public InheritanceWithEnumType1 d(String d) {
    this.d = d;
    return this;
  }

  
  @JsonProperty("d")
  public String getD() {
    return d;
  }

  @JsonProperty("d")
  public void setD(String d) {
    this.d = d;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithEnumType1 inheritanceWithEnumType1 = (InheritanceWithEnumType1) o;
    return Objects.equals(this.d, inheritanceWithEnumType1.d) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(d, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithEnumType1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
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

