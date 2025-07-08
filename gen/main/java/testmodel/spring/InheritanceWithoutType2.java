package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import testmodel.spring.InheritanceWithoutType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * InheritanceWithoutType2
 */
@java.lang.SuppressWarnings("all")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: stable")
public class InheritanceWithoutType2 extends InheritanceWithoutType {

  private @Nullable String g;

  public InheritanceWithoutType2 g(@Nullable String g) {
    this.g = g;
    return this;
  }

  /**
   * Get g
   * @return g
   */
  
  @JsonProperty("g")
  public @Nullable String getG() {
    return g;
  }

  public void setG(@Nullable String g) {
    this.g = g;
  }


  public InheritanceWithoutType2 e(String e) {
    super.e(e);
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
    InheritanceWithoutType2 inheritanceWithoutType2 = (InheritanceWithoutType2) o;
    return Objects.equals(this.g, inheritanceWithoutType2.g) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(g, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithoutType2 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

