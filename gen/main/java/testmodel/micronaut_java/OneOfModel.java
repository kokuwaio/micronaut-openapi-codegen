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
import testmodel.micronaut_java.FirstModel;
import testmodel.micronaut_java.SecondLevelModel;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * OneOfModel
 */
@JsonPropertyOrder({
  OneOfModel.JSON_PROPERTY_TYPE,
  OneOfModel.JSON_PROPERTY_FIRST,
  OneOfModel.JSON_PROPERTY_SECOND_LEVEL,
  OneOfModel.JSON_PROPERTY_ONE,
  OneOfModel.JSON_PROPERTY_TWO
})
@JsonTypeName("OneOfModel")
@java.lang.SuppressWarnings("all")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", comments = "Generator version: stable")
@Introspected
public class OneOfModel {
    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public static final String JSON_PROPERTY_FIRST = "first";
    private String first;

    public static final String JSON_PROPERTY_SECOND_LEVEL = "secondLevel";
    private SecondLevelModel secondLevel;

    public static final String JSON_PROPERTY_ONE = "one";
    private String one;

    public static final String JSON_PROPERTY_TWO = "two";
    private String two;

    public OneOfModel() {
    }

    public OneOfModel type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
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

    public OneOfModel first(String first) {
        this.first = first;
        return this;
    }

    /**
     * Get first
     * @return first
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_FIRST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFirst() {
        return first;
    }

    @JsonProperty(JSON_PROPERTY_FIRST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFirst(String first) {
        this.first = first;
    }

    public OneOfModel secondLevel(SecondLevelModel secondLevel) {
        this.secondLevel = secondLevel;
        return this;
    }

    /**
     * Get secondLevel
     * @return secondLevel
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_SECOND_LEVEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public SecondLevelModel getSecondLevel() {
        return secondLevel;
    }

    @JsonProperty(JSON_PROPERTY_SECOND_LEVEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSecondLevel(SecondLevelModel secondLevel) {
        this.secondLevel = secondLevel;
    }

    public OneOfModel one(String one) {
        this.one = one;
        return this;
    }

    /**
     * Get one
     * @return one
     */
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

    public OneOfModel two(String two) {
        this.two = two;
        return this;
    }

    /**
     * Get two
     * @return two
     */
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
        OneOfModel oneOfModel = (OneOfModel) o;
        return Objects.equals(this.type, oneOfModel.type) &&
            Objects.equals(this.first, oneOfModel.first) &&
            Objects.equals(this.secondLevel, oneOfModel.secondLevel) &&
            Objects.equals(this.one, oneOfModel.one) &&
            Objects.equals(this.two, oneOfModel.two);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, first, secondLevel, one, two);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OneOfModel {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    first: ").append(toIndentedString(first)).append("\n");
        sb.append("    secondLevel: ").append(toIndentedString(secondLevel)).append("\n");
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

