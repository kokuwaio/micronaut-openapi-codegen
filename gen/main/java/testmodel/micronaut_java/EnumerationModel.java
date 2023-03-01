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
import testmodel.micronaut_java.EnumerationString;
import testmodel.micronaut_java.EnumerationStringDefault;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * EnumerationModel
 */
@JsonPropertyOrder({
  EnumerationModel.JSON_PROPERTY_STRING,
  EnumerationModel.JSON_PROPERTY_STRING_DEFAULT,
  EnumerationModel.JSON_PROPERTY_EMBEDDED,
  EnumerationModel.JSON_PROPERTY_EMBEDDED_DEFAULT
})
@JsonTypeName("EnumerationModel")
@java.lang.SuppressWarnings("all")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen")
@Introspected
public class EnumerationModel {
    public static final String JSON_PROPERTY_STRING = "string";
    private EnumerationString string;

    public static final String JSON_PROPERTY_STRING_DEFAULT = "string-default";
    private EnumerationStringDefault stringDefault = EnumerationStringDefault.THREE;

    /**
     * Gets or Sets embedded
     */
    @java.lang.SuppressWarnings("all")
    public enum EmbeddedEnum {
        FIRST("first"),
        SECOND("second");

        private String value;

        EmbeddedEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EmbeddedEnum fromValue(String value) {
            for (EmbeddedEnum b : EmbeddedEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_EMBEDDED = "embedded";
    private EmbeddedEnum embedded;

    /**
     * Gets or Sets embeddedDefault
     */
    @java.lang.SuppressWarnings("all")
    public enum EmbeddedDefaultEnum {
        THREE("three"),
        FOUR("four");

        private String value;

        EmbeddedDefaultEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EmbeddedDefaultEnum fromValue(String value) {
            for (EmbeddedDefaultEnum b : EmbeddedDefaultEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_EMBEDDED_DEFAULT = "embedded-default";
    private EmbeddedDefaultEnum embeddedDefault = EmbeddedDefaultEnum.FOUR;

    public EnumerationModel() {
    }

    public EnumerationModel string(EnumerationString string) {
        this.string = string;
        return this;
    }

    /**
     * Get string
     * @return string
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_STRING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public EnumerationString getString() {
        return string;
    }

    @JsonProperty(JSON_PROPERTY_STRING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setString(EnumerationString string) {
        this.string = string;
    }

    public EnumerationModel stringDefault(EnumerationStringDefault stringDefault) {
        this.stringDefault = stringDefault;
        return this;
    }

    /**
     * Get stringDefault
     * @return stringDefault
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_STRING_DEFAULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public EnumerationStringDefault getStringDefault() {
        return stringDefault;
    }

    @JsonProperty(JSON_PROPERTY_STRING_DEFAULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStringDefault(EnumerationStringDefault stringDefault) {
        this.stringDefault = stringDefault;
    }

    public EnumerationModel embedded(EmbeddedEnum embedded) {
        this.embedded = embedded;
        return this;
    }

    /**
     * Get embedded
     * @return embedded
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EMBEDDED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public EmbeddedEnum getEmbedded() {
        return embedded;
    }

    @JsonProperty(JSON_PROPERTY_EMBEDDED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEmbedded(EmbeddedEnum embedded) {
        this.embedded = embedded;
    }

    public EnumerationModel embeddedDefault(EmbeddedDefaultEnum embeddedDefault) {
        this.embeddedDefault = embeddedDefault;
        return this;
    }

    /**
     * Get embeddedDefault
     * @return embeddedDefault
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_EMBEDDED_DEFAULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public EmbeddedDefaultEnum getEmbeddedDefault() {
        return embeddedDefault;
    }

    @JsonProperty(JSON_PROPERTY_EMBEDDED_DEFAULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEmbeddedDefault(EmbeddedDefaultEnum embeddedDefault) {
        this.embeddedDefault = embeddedDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnumerationModel enumerationModel = (EnumerationModel) o;
        return Objects.equals(this.string, enumerationModel.string) &&
            Objects.equals(this.stringDefault, enumerationModel.stringDefault) &&
            Objects.equals(this.embedded, enumerationModel.embedded) &&
            Objects.equals(this.embeddedDefault, enumerationModel.embeddedDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string, stringDefault, embedded, embeddedDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnumerationModel {\n");
        sb.append("    string: ").append(toIndentedString(string)).append("\n");
        sb.append("    stringDefault: ").append(toIndentedString(stringDefault)).append("\n");
        sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
        sb.append("    embeddedDefault: ").append(toIndentedString(embeddedDefault)).append("\n");
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
