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
 * InheritanceWithType2AllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")@java.lang.SuppressWarnings("all")

public class InheritanceWithType2AllOf   {
  @JsonProperty("b")
  private String b;

  public InheritanceWithType2AllOf b(String b) {
    this.b = b;
    return this;
  }

  /**
   * Get b
   * @return b
  */
  @ApiModelProperty(value = "")


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
    InheritanceWithType2AllOf inheritanceWithType2AllOf = (InheritanceWithType2AllOf) o;
    return Objects.equals(this.b, inheritanceWithType2AllOf.b);
  }

  @Override
  public int hashCode() {
    return Objects.hash(b);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithType2AllOf {\n");
    
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
