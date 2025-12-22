package testmodel.jaxrs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.math.BigDecimal;
import testmodel.jaxrs.OneOfImplementor1;
import testmodel.jaxrs.OneOfImplementor2;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = OneOfImplementor1.class, name = "Implementation1"),
  @JsonSubTypes.Type(value = OneOfImplementor2.class, name = "Implementation2"),
})


@JsonTypeName("OneOfInterface")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: stable")@java.lang.SuppressWarnings("all")

public class OneOfInterface   {
  private String type;
  private BigDecimal property;

  public OneOfInterface() {
  }

  /**
   **/
  public OneOfInterface type(String type) {
    this.type = type;
    return this;
  }

  
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public OneOfInterface property(BigDecimal property) {
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
    OneOfInterface oneOfInterface = (OneOfInterface) o;
    return Objects.equals(this.type, oneOfInterface.type) &&
        Objects.equals(this.property, oneOfInterface.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, property);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneOfInterface {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

