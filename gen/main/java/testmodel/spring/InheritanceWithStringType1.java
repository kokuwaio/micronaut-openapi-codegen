package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import testmodel.spring.InheritanceWithStringType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * InheritanceWithStringType1
 */
@java.lang.SuppressWarnings("all")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InheritanceWithStringType1 extends InheritanceWithStringType {

  private String b;

  public InheritanceWithStringType1 b(String b) {
    this.b = b;
    return this;
  }

  /**
   * Get b
   * @return b
  */
  
  @JsonProperty("b")
  public String getB() {
    return b;
  }

  public void setB(String b) {
    this.b = b;
  }


  public InheritanceWithStringType1 type(String type) {
    super.setType(type);
    return this;
  }

  public InheritanceWithStringType1 a(String a) {
    super.setA(a);
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
    InheritanceWithStringType1 inheritanceWithStringType1 = (InheritanceWithStringType1) o;
    return Objects.equals(this.b, inheritanceWithStringType1.b) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(b, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithStringType1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

