package testmodel.jaxrs;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OneOfImplementor1")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: stable")@java.lang.SuppressWarnings("all")

public class OneOfImplementor1   {
  private @Valid String property;

  /**
   **/
  public OneOfImplementor1 property(String property) {
    this.property = property;
    return this;
  }

  
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }

  @JsonProperty("property")
  public void setProperty(String property) {
    this.property = property;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneOfImplementor1 oneOfImplementor1 = (OneOfImplementor1) o;
    return Objects.equals(this.property, oneOfImplementor1.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneOfImplementor1 {\n");
    
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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

