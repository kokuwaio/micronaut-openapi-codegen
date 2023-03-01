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


import java.util.*;
import javax.annotation.Generated;

/**
 * InheritanceWithStringType1AllOf
 */
@java.lang.SuppressWarnings("all")

@JsonTypeName("InheritanceWithStringType1_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InheritanceWithStringType1AllOf {

  @JsonProperty("b")
  private String b;

  public InheritanceWithStringType1AllOf b(String b) {
    this.b = b;
    return this;
  }

  /**
   * Get b
   * @return b
  */
  
  public String getB() {
    return b;
  }

  public void setB(String b) {
    this.b = b;
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
    return Objects.equals(this.b, inheritanceWithStringType1AllOf.b);
  }

  @Override
  public int hashCode() {
    return Objects.hash(b);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithStringType1AllOf {\n");
    sb.append("    b: ").append(toIndentedString(b)).append("\n");
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

