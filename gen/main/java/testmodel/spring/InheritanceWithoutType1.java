package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import testmodel.spring.InheritanceWithoutType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InheritanceWithoutType1
 */
@java.lang.SuppressWarnings("all")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InheritanceWithoutType1 extends InheritanceWithoutType {

  @JsonProperty("f")
  private String f;

  public InheritanceWithoutType1 f(String f) {
    this.f = f;
    return this;
  }

  /**
   * Get f
   * @return f
  */
  
  @Schema(name = "f", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getF() {
    return f;
  }

  public void setF(String f) {
    this.f = f;
  }

  public InheritanceWithoutType1 e(String e) {
    super.setE(e);
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
    InheritanceWithoutType1 inheritanceWithoutType1 = (InheritanceWithoutType1) o;
    return Objects.equals(this.f, inheritanceWithoutType1.f) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(f, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithoutType1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    f: ").append(toIndentedString(f)).append("\n");
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

