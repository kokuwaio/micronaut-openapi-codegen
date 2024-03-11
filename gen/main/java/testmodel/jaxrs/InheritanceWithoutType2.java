package testmodel.jaxrs;

import testmodel.jaxrs.InheritanceWithoutType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("InheritanceWithoutType2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: stable")@java.lang.SuppressWarnings("all")

public class InheritanceWithoutType2 extends InheritanceWithoutType  {
  private @Valid String g;

  /**
   **/
  public InheritanceWithoutType2 g(String g) {
    this.g = g;
    return this;
  }

  
  @JsonProperty("g")
  public String getG() {
    return g;
  }

  @JsonProperty("g")
  public void setG(String g) {
    this.g = g;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithoutType2 inheritanceWithoutType2 = (InheritanceWithoutType2) o;
    return Objects.equals(this.g, inheritanceWithoutType2.g) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(g, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithoutType2 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    g: ").append(toIndentedString(g)).append("\n");
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

