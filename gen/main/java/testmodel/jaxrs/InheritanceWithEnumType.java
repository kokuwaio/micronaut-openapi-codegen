package testmodel.jaxrs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import testmodel.jaxrs.InheritanceWithEnumTypeEnum;
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
  @JsonSubTypes.Type(value = InheritanceWithEnumType1.class, name = "Inheritance1"),
  @JsonSubTypes.Type(value = InheritanceWithEnumType2.class, name = "Inheritance2"),
  @JsonSubTypes.Type(value = InheritanceWithEnumType3.class, name = "Inheritance3"),
})


@JsonTypeName("InheritanceWithEnumType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: stable")@java.lang.SuppressWarnings("all")

public class InheritanceWithEnumType   {
  private InheritanceWithEnumTypeEnum type;

  public InheritanceWithEnumType() {
  }

  /**
   **/
  public InheritanceWithEnumType type(InheritanceWithEnumTypeEnum type) {
    this.type = type;
    return this;
  }

  
  @JsonProperty("type")
  public InheritanceWithEnumTypeEnum getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(InheritanceWithEnumTypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithEnumType inheritanceWithEnumType = (InheritanceWithEnumType) o;
    return Objects.equals(this.type, inheritanceWithEnumType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithEnumType {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

