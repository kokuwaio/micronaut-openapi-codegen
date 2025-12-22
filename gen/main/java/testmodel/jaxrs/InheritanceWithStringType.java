package testmodel.jaxrs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
  @JsonSubTypes.Type(value = InheritanceWithStringType1.class, name = "Inheritance1"),
  @JsonSubTypes.Type(value = InheritanceWithStringType2.class, name = "Inheritance2"),
})


@JsonTypeName("InheritanceWithStringType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: stable")@java.lang.SuppressWarnings("all")

public class InheritanceWithStringType   {
  private String type;
  private String a;

  public InheritanceWithStringType() {
  }

  /**
   **/
  public InheritanceWithStringType type(String type) {
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
  public InheritanceWithStringType a(String a) {
    this.a = a;
    return this;
  }

  
  @JsonProperty("a")
  public String getA() {
    return a;
  }

  @JsonProperty("a")
  public void setA(String a) {
    this.a = a;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithStringType inheritanceWithStringType = (InheritanceWithStringType) o;
    return Objects.equals(this.type, inheritanceWithStringType.type) &&
        Objects.equals(this.a, inheritanceWithStringType.a);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, a);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithStringType {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    a: ").append(toIndentedString(a)).append("\n");
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

