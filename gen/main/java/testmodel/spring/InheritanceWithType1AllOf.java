package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * InheritanceWithType1AllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")@java.lang.SuppressWarnings("all")

public class InheritanceWithType1AllOf   {
  @JsonProperty("a")
  private String a;

  public InheritanceWithType1AllOf a(String a) {
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
    InheritanceWithType1AllOf inheritanceWithType1AllOf = (InheritanceWithType1AllOf) o;
    return Objects.equals(this.a, inheritanceWithType1AllOf.a);
  }

  @Override
  public int hashCode() {
    return Objects.hash(a);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithType1AllOf {\n");
    
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

