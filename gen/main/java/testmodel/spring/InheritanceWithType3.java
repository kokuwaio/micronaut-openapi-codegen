package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import testmodel.spring.InheritanceWithType2;
import testmodel.spring.InheritanceWithType3AllOf;
import testmodel.spring.InheritanceWithTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InheritanceWithType3
 */
@java.lang.SuppressWarnings("all")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InheritanceWithType3 extends InheritanceWithType2  {

  @JsonProperty("c")
  private String c;

  public InheritanceWithType3 c(String c) {
    this.c = c;
    return this;
  }

  /**
   * Get c
   * @return c
  */
  
  @Schema(name = "c", required = false)
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
    InheritanceWithType3 inheritanceWithType3 = (InheritanceWithType3) o;
    return Objects.equals(this.c, inheritanceWithType3.c) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithType3 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

