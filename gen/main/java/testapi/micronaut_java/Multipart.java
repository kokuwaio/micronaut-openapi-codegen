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

package testapi.micronaut_java;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Multipart
 */
@JsonPropertyOrder({
  Multipart.JSON_PROPERTY_ORDER_ID,
  Multipart.JSON_PROPERTY_USER_ID,
  Multipart.JSON_PROPERTY_FILE_NAME,
  Multipart.JSON_PROPERTY_FILE
})
@JsonTypeName("Multipart")
@java.lang.SuppressWarnings("all")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen")
@Introspected
public class Multipart {
    public static final String JSON_PROPERTY_ORDER_ID = "orderId";
    private Integer orderId;

    public static final String JSON_PROPERTY_USER_ID = "userId";
    private Integer userId;

    public static final String JSON_PROPERTY_FILE_NAME = "fileName";
    private String fileName;

    public static final String JSON_PROPERTY_FILE = "file";
    private byte[] _file;

    public Multipart() {
    }

    public Multipart orderId(Integer orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Get orderId
     * @return orderId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ORDER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getOrderId() {
        return orderId;
    }

    @JsonProperty(JSON_PROPERTY_ORDER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Multipart userId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     * @return userId
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_USER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty(JSON_PROPERTY_USER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Multipart fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get fileName
     * @return fileName
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_FILE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFileName() {
        return fileName;
    }

    @JsonProperty(JSON_PROPERTY_FILE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Multipart _file(byte[] _file) {
        this._file = _file;
        return this;
    }

    /**
     * Get _file
     * @return _file
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_FILE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public byte[] getFile() {
        return _file;
    }

    @JsonProperty(JSON_PROPERTY_FILE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFile(byte[] _file) {
        this._file = _file;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Multipart multipart = (Multipart) o;
        return Objects.equals(this.orderId, multipart.orderId) &&
            Objects.equals(this.userId, multipart.userId) &&
            Objects.equals(this.fileName, multipart.fileName) &&
            Arrays.equals(this._file, multipart._file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, userId, fileName, Arrays.hashCode(_file));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Multipart {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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

