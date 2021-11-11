package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InheritanceWithStringType1AllOf
 */
@java.lang.SuppressWarnings("all")

@JsonTypeName("InheritanceWithStringType1_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InheritanceWithStringType1AllOf {

  @JsonProperty("a")
  private String a;

  public InheritanceWithStringType1AllOf a(String a) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithStringType1AllOf inheritanceWithStringType1AllOf = (InheritanceWithStringType1AllOf) o;
    return Objects.equals(this.a, inheritanceWithStringType1AllOf.a);
  }

  @Override
  public int hashCode() {
    return Objects.hash(a);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithStringType1AllOf {\n");
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

