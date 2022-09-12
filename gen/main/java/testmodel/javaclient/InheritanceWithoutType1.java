/*
 * Spec for api tests.
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package testmodel.javaclient;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import testmodel.javaclient.InheritanceWithoutType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InheritanceWithoutType1
 */
@JsonPropertyOrder({
  InheritanceWithoutType1.JSON_PROPERTY_F
})
@java.lang.SuppressWarnings("all")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InheritanceWithoutType1 extends InheritanceWithoutType {
  public static final String JSON_PROPERTY_F = "f";
  private String f;

  public InheritanceWithoutType1() {

  }

  public InheritanceWithoutType1 f(String f) {
    
    this.f = f;
    return this;
  }

   /**
   * Get f
   * @return f
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_F)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getF() {
    return f;
  }


  @JsonProperty(JSON_PROPERTY_F)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setF(String f) {
    this.f = f;
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

