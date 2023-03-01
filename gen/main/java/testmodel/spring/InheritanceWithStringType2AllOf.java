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
 * InheritanceWithStringType2AllOf
 */
@java.lang.SuppressWarnings("all")

@JsonTypeName("InheritanceWithStringType2_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InheritanceWithStringType2AllOf {

  @JsonProperty("c")
  private String c;

  public InheritanceWithStringType2AllOf c(String c) {
    this.c = c;
    return this;
  }

  /**
   * Get c
   * @return c
  */
  
  public String getC() {
    return c;
  }

  public void setC(String c) {
    this.c = c;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithStringType2AllOf inheritanceWithStringType2AllOf = (InheritanceWithStringType2AllOf) o;
    return Objects.equals(this.c, inheritanceWithStringType2AllOf.c);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithStringType2AllOf {\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
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

