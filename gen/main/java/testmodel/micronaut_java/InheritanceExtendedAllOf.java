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

package testmodel.micronaut_java;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * InheritanceExtendedAllOf
 */
@JsonPropertyOrder({
  InheritanceExtendedAllOf.JSON_PROPERTY_BAR
})
@JsonTypeName("InheritanceExtended_allOf")
@java.lang.SuppressWarnings("all")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen")
@Introspected
public class InheritanceExtendedAllOf {
    public static final String JSON_PROPERTY_BAR = "bar";
    private String bar;

    public InheritanceExtendedAllOf(String bar) {
        this.bar = bar;
    }

    public InheritanceExtendedAllOf bar(String bar) {
        this.bar = bar;
        return this;
    }

    /**
     * Get bar
     * @return bar
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_BAR)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBar() {
        return bar;
    }

    @JsonProperty(JSON_PROPERTY_BAR)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
