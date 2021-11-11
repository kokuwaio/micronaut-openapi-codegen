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
 * InheritanceWithStringType2AllOf
 */
@java.lang.SuppressWarnings("all")

@JsonTypeName("InheritanceWithStringType2_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InheritanceWithStringType2AllOf {

  @JsonProperty("b")
  private String b;

  public InheritanceWithStringType2AllOf b(String b) {
    this.b = b;
    return this;
  }

  /**
   * Get b
   * @return b
  */
  
  @Schema(name = "b", required = false)
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
    InheritanceWithStringType2AllOf inheritanceWithStringType2AllOf = (InheritanceWithStringType2AllOf) o;
    return Objects.equals(this.b, inheritanceWithStringType2AllOf.b);
  }

  @Override
  public int hashCode() {
    return Objects.hash(b);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithStringType2AllOf {\n");
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

