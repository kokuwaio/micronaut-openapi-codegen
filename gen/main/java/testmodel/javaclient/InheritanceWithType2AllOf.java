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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InheritanceWithType2AllOf
 */
@JsonPropertyOrder({
  InheritanceWithType2AllOf.JSON_PROPERTY_B
})
@JsonTypeName("InheritanceWithType2_allOf")
@java.lang.SuppressWarnings("all")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InheritanceWithType2AllOf {
  public static final String JSON_PROPERTY_B = "b";
  private String b;

  public InheritanceWithType2AllOf() { 
  }

  public InheritanceWithType2AllOf b(String b) {
    
    this.b = b;
    return this;
  }

   /**
   * Get b
   * @return b
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getB() {
    return b;
  }


  @JsonProperty(JSON_PROPERTY_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
