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
 * InheritanceExtendedAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")@java.lang.SuppressWarnings("all")

public class InheritanceExtendedAllOf   {
  @JsonProperty("bar")
  private String bar;

  public InheritanceExtendedAllOf bar(String bar) {
    this.bar = bar;
    return this;
  }

  /**
   * Get bar
   * @return bar
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getBar() {
    return bar;
  }

  public void setBar(String bar) {
    this.bar = bar;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceExtendedAllOf inheritanceExtendedAllOf = (InheritanceExtendedAllOf) o;
    return Objects.equals(this.bar, inheritanceExtendedAllOf.bar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceExtendedAllOf {\n");
    
    sb.append("    bar: ").append(toIndentedString(bar)).append("\n");
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

