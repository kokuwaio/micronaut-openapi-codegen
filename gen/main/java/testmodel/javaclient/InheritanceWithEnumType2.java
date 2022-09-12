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
import testmodel.javaclient.InheritanceWithEnumType;
import testmodel.javaclient.InheritanceWithEnumTypeEnum;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InheritanceWithEnumType2
 */
@JsonPropertyOrder({
  InheritanceWithEnumType2.JSON_PROPERTY_E
})
@java.lang.SuppressWarnings("all")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InheritanceWithEnumType2 extends InheritanceWithEnumType {
  public static final String JSON_PROPERTY_E = "e";
  private String e;

  public InheritanceWithEnumType2() {

  }

  public InheritanceWithEnumType2 e(String e) {
    
    this.e = e;
    return this;
  }

   /**
   * Get e
   * @return e
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getE() {
    return e;
  }


  @JsonProperty(JSON_PROPERTY_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setE(String e) {
    this.e = e;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithEnumType2 inheritanceWithEnumType2 = (InheritanceWithEnumType2) o;
    return Objects.equals(this.e, inheritanceWithEnumType2.e) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(e, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithEnumType2 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
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

