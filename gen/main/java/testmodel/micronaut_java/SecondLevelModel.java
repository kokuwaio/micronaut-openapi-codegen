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
import testmodel.micronaut_java.SecondLevelOneModel;
import testmodel.micronaut_java.SecondLevelTwoModel;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * SecondLevelModel
 */
@JsonPropertyOrder({
  SecondLevelModel.JSON_PROPERTY_TYPE,
  SecondLevelModel.JSON_PROPERTY_ONE,
  SecondLevelModel.JSON_PROPERTY_TWO
})
@JsonTypeName("SecondLevelModel")
@java.lang.SuppressWarnings("all")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen")
@Introspected
public class SecondLevelModel {
    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public static final String JSON_PROPERTY_ONE = "one";
    private String one;

    public static final String JSON_PROPERTY_TWO = "two";
    private String two;

    public SecondLevelModel() {
    }

    public SecondLevelModel type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(String type) {
        this.type = type;
    }

    public SecondLevelModel one(String one) {
        this.one = one;
        return this;
    }

    /**
     * Get one
     * @return one
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getOne() {
        return one;
    }

    @JsonProperty(JSON_PROPERTY_ONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOne(String one) {
        this.one = one;
    }

    public SecondLevelModel two(String two) {
        this.two = two;
        return this;
    }

    /**
     * Get two
     * @return two
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TWO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTwo() {
        return two;
    }

    @JsonProperty(JSON_PROPERTY_TWO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTwo(String two) {
        this.two = two;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecondLevelModel secondLevelModel = (SecondLevelModel) o;
        return Objects.equals(this.type, secondLevelModel.type) &&
            Objects.equals(this.one, secondLevelModel.one) &&
            Objects.equals(this.two, secondLevelModel.two);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, one, two);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecondLevelModel {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    one: ").append(toIndentedString(one)).append("\n");
        sb.append("    two: ").append(toIndentedString(two)).append("\n");
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

