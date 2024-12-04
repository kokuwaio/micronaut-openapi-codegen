package testmodel.jaxrs;

import testmodel.jaxrs.InheritanceWithStringType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("InheritanceWithStringType1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: stable")@java.lang.SuppressWarnings("all")

public class InheritanceWithStringType1 extends InheritanceWithStringType  {
  private String b;

  /**
   **/
  public InheritanceWithStringType1 b(String b) {
    this.b = b;
    return this;
  }

  
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
    InheritanceWithStringType1 inheritanceWithStringType1 = (InheritanceWithStringType1) o;
    return Objects.equals(this.b, inheritanceWithStringType1.b) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(b, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithStringType1 {\n");
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

