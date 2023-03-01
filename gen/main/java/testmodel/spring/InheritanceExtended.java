package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InheritanceExtended
 */
@java.lang.SuppressWarnings("all")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InheritanceExtended {

  @JsonProperty("foo")
  private String foo;

  @JsonProperty("bar")
  private String bar;

  public InheritanceExtended foo(String foo) {
    this.foo = foo;
    return this;
  }

  /**
   * Get foo
   * @return foo
  */
  @NotNull 
  @Schema(name = "foo", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getFoo() {
    return foo;
  }

  public void setFoo(String foo) {
    this.foo = foo;
  }

  public InheritanceExtended bar(String bar) {
    this.bar = bar;
    return this;
  }

  /**
   * Get bar
   * @return bar
  */
  @NotNull 
  @Schema(name = "bar", requiredMode = Schema.RequiredMode.REQUIRED)
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
    InheritanceExtended inheritanceExtended = (InheritanceExtended) o;
    return Objects.equals(this.foo, inheritanceExtended.foo) &&
        Objects.equals(this.bar, inheritanceExtended.bar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foo, bar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceExtended {\n");
    sb.append("    foo: ").append(toIndentedString(foo)).append("\n");
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

