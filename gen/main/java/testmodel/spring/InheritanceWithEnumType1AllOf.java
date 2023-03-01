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
 * InheritanceWithEnumType1AllOf
 */
@java.lang.SuppressWarnings("all")

@JsonTypeName("InheritanceWithEnumType1_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InheritanceWithEnumType1AllOf {

  @JsonProperty("d")
  private String d;

  public InheritanceWithEnumType1AllOf d(String d) {
    this.d = d;
    return this;
  }

  /**
   * Get d
   * @return d
  */
  
  public String getD() {
    return d;
  }

  public void setD(String d) {
    this.d = d;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithEnumType1AllOf inheritanceWithEnumType1AllOf = (InheritanceWithEnumType1AllOf) o;
    return Objects.equals(this.d, inheritanceWithEnumType1AllOf.d);
  }

  @Override
  public int hashCode() {
    return Objects.hash(d);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithEnumType1AllOf {\n");
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
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

