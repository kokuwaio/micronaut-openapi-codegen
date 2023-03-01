package testmodel.jaxrs;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("InheritanceWithoutType2_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")@java.lang.SuppressWarnings("all")

public class InheritanceWithoutType2AllOf   {
  private @Valid String g;

  /**
   **/
  public InheritanceWithoutType2AllOf g(String g) {
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
    InheritanceWithoutType2AllOf inheritanceWithoutType2AllOf = (InheritanceWithoutType2AllOf) o;
    return Objects.equals(this.g, inheritanceWithoutType2AllOf.g);
  }

  @Override
  public int hashCode() {
    return Objects.hash(g);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithoutType2AllOf {\n");
    
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

