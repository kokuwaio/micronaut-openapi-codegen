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
 * InheritanceWithoutType2AllOf
 */
@java.lang.SuppressWarnings("all")

@JsonTypeName("InheritanceWithoutType2_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InheritanceWithoutType2AllOf {

  @JsonProperty("g")
  private String g;

  public InheritanceWithoutType2AllOf g(String g) {
    this.g = g;
    return this;
  }

  /**
   * Get g
   * @return g
  */
  
  public String getG() {
    return g;
  }

  public void setG(String g) {
    this.g = g;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithoutType2AllOf inheritanceWithoutType2AllOf = (InheritanceWithoutType2AllOf) o;
    return Objects.equals(this.g, inheritanceWithoutType2AllOf.g);
  }

  @Override
  public int hashCode() {
    return Objects.hash(g);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithoutType2AllOf {\n");
    sb.append("    g: ").append(toIndentedString(g)).append("\n");
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

