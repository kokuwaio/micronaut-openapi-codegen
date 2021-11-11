package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import testmodel.spring.InheritanceWithType;
import testmodel.spring.InheritanceWithType1AllOf;
import testmodel.spring.InheritanceWithTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * InheritanceWithType1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")@java.lang.SuppressWarnings("all")

public class InheritanceWithType1 extends InheritanceWithType  {
  @JsonProperty("a")
  private String a;

  public InheritanceWithType1 a(String a) {
    this.a = a;
    return this;
  }

  /**
   * Get a
   * @return a
  */
  @ApiModelProperty(value = "")


  public String getA() {
    return a;
  }

  public void setA(String a) {
    this.a = a;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithType1 inheritanceWithType1 = (InheritanceWithType1) o;
    return Objects.equals(this.a, inheritanceWithType1.a) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(a, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithType1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    a: ").append(toIndentedString(a)).append("\n");
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

