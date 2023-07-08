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
 * InheritanceWithStringType2
 */
@java.lang.SuppressWarnings("all")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InheritanceWithStringType2 extends InheritanceWithStringType {

  private String c;

  public InheritanceWithStringType2 c(String c) {
    this.c = c;
    return this;
  }

  /**
   * Get c
   * @return c
  */
  
  @JsonProperty("c")
  public String getC() {
    return c;
  }

  public void setC(String c) {
    this.c = c;
  }


  public InheritanceWithStringType2 type(String type) {
    super.setType(type);
    return this;
  }

  public InheritanceWithStringType2 a(String a) {
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
    InheritanceWithStringType2 inheritanceWithStringType2 = (InheritanceWithStringType2) o;
    return Objects.equals(this.c, inheritanceWithStringType2.c) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithStringType2 {\n");
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

