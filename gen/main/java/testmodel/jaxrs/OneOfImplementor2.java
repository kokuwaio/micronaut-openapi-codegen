package testmodel.jaxrs;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("OneOfImplementor2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: stable")@java.lang.SuppressWarnings("all")

public class OneOfImplementor2   {
  private BigDecimal property;

  /**
   **/
  public OneOfImplementor2 property(BigDecimal property) {
    this.property = property;
    return this;
  }

  
  @JsonProperty("property")
  @Valid public BigDecimal getProperty() {
    return property;
  }

  @JsonProperty("property")
  public void setProperty(BigDecimal property) {
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
    OneOfImplementor2 oneOfImplementor2 = (OneOfImplementor2) o;
    return Objects.equals(this.property, oneOfImplementor2.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneOfImplementor2 {\n");
    
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

