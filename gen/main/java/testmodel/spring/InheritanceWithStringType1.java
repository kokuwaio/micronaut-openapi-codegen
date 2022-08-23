package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import testmodel.spring.InheritanceWithStringType;
import testmodel.spring.InheritanceWithStringType1;
import testmodel.spring.InheritanceWithStringType1AllOf;
import testmodel.spring.InheritanceWithStringType2;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InheritanceWithStringType1
 */
@java.lang.SuppressWarnings("all")

@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = InheritanceWithStringType1.class, name = "Inheritance1"),
  @JsonSubTypes.Type(value = InheritanceWithStringType2.class, name = "Inheritance2")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InheritanceWithStringType1 extends InheritanceWithStringType {

  @JsonProperty("a")
  private String a;

  public InheritanceWithStringType1 a(String a) {
    this.a = a;
    return this;
  }

  /**
   * Get a
   * @return a
  */
  
  @Schema(name = "a", required = false)
  public String getA() {
    return a;
  }

  public void setA(String a) {
    this.a = a;
  }

  public InheritanceWithStringType1 type(String type) {
    super.setType(type);
    return this;
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
    return Objects.equals(this.a, inheritanceWithStringType1.a) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(a, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithStringType1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
