package testmodel.jaxrs;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import testmodel.jaxrs.InheritanceWithTypeEnum;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = InheritanceWithType1.class, name = "Inheritance1"),
  @JsonSubTypes.Type(value = InheritanceWithType2.class, name = "Inheritance2"),
  @JsonSubTypes.Type(value = InheritanceWithType3.class, name = "Inheritance3"),
})


@JsonTypeName("InheritanceWithType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")@java.lang.SuppressWarnings("all")
public class InheritanceWithType   {
  
  private @Valid InheritanceWithTypeEnum type;

  /**
   **/
  public InheritanceWithType type(InheritanceWithTypeEnum type) {
    this.type = type;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public InheritanceWithTypeEnum getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(InheritanceWithTypeEnum type) {
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
    InheritanceWithType inheritanceWithType = (InheritanceWithType) o;
    return Objects.equals(this.type, inheritanceWithType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithType {\n");
    
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
