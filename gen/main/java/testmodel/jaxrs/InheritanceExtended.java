package testmodel.jaxrs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import testmodel.jaxrs.InheritanceExtendedAllOf;
import testmodel.jaxrs.InheritanceSimple;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("InheritanceExtended")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")@java.lang.SuppressWarnings("all")

public class InheritanceExtended   {
  
  private @Valid String foo;
  private @Valid String bar;

  /**
   **/
  public InheritanceExtended foo(String foo) {
    this.foo = foo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("foo")
  @NotNull
  public String getFoo() {
    return foo;
  }

  @JsonProperty("foo")
  public void setFoo(String foo) {
    this.foo = foo;
  }

/**
   **/
  public InheritanceExtended bar(String bar) {
    this.bar = bar;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("bar")
  @NotNull
  public String getBar() {
    return bar;
  }

  @JsonProperty("bar")
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

