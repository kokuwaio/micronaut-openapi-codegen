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

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = InheritanceWithoutType1.class, name = "Inheritance1"),
  @JsonSubTypes.Type(value = InheritanceWithoutType2.class, name = "Inheritance2"),
})


@JsonTypeName("InheritanceWithoutType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: stable")@java.lang.SuppressWarnings("all")

public class InheritanceWithoutType   {
  private String e;

  /**
   **/
  public InheritanceWithoutType e(String e) {
    this.e = e;
    return this;
  }

  
  @JsonProperty("e")
  public String getE() {
    return e;
  }

  @JsonProperty("e")
  public void setE(String e) {
    this.e = e;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithoutType inheritanceWithoutType = (InheritanceWithoutType) o;
    return Objects.equals(this.e, inheritanceWithoutType.e);
  }

  @Override
  public int hashCode() {
    return Objects.hash(e);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithoutType {\n");
    
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
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

