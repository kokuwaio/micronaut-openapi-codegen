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
 * InheritanceWithEnumType2AllOf
 */
@java.lang.SuppressWarnings("all")

@JsonTypeName("InheritanceWithEnumType2_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InheritanceWithEnumType2AllOf {

  @JsonProperty("e")
  private String e;

  public InheritanceWithEnumType2AllOf e(String e) {
    this.e = e;
    return this;
  }

  /**
   * Get e
   * @return e
  */
  
  @Schema(name = "e", required = false)
  public String getE() {
    return e;
  }

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
    InheritanceWithEnumType2AllOf inheritanceWithEnumType2AllOf = (InheritanceWithEnumType2AllOf) o;
    return Objects.equals(this.e, inheritanceWithEnumType2AllOf.e);
  }

  @Override
  public int hashCode() {
    return Objects.hash(e);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithEnumType2AllOf {\n");
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

