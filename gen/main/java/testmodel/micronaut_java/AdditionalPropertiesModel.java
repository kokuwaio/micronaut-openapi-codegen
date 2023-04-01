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
import java.util.HashMap;
import java.util.Map;
import testmodel.micronaut_java.AdditionalPropertiesModelValue;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * AdditionalPropertiesModel
 */
@JsonPropertyOrder({
  AdditionalPropertiesModel.JSON_PROPERTY_ID
})
@JsonTypeName("AdditionalPropertiesModel")
@java.lang.SuppressWarnings("all")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen")
@Introspected
public class AdditionalPropertiesModel extends HashMap<String, AdditionalPropertiesModelValue> {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public AdditionalPropertiesModel() {
        super();
    }

    public AdditionalPropertiesModel id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdditionalPropertiesModel additionalPropertiesModel = (AdditionalPropertiesModel) o;
        return Objects.equals(this.id, additionalPropertiesModel.id) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdditionalPropertiesModel {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

