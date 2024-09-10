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
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * ParameterModel
 */
@JsonPropertyOrder({
  ParameterModel.JSON_PROPERTY_BOOL,
  ParameterModel.JSON_PROPERTY_STRING,
  ParameterModel.JSON_PROPERTY_NUMBER,
  ParameterModel.JSON_PROPERTY_INTEGER,
  ParameterModel.JSON_PROPERTY_UUID,
  ParameterModel.JSON_PROPERTY_DATE,
  ParameterModel.JSON_PROPERTY_DATE_TIME,
  ParameterModel.JSON_PROPERTY_A,
  ParameterModel.JSON_PROPERTY_B,
  ParameterModel.JSON_PROPERTY_C
})
@JsonTypeName("ParameterModel")
@java.lang.SuppressWarnings("all")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", comments = "Generator version: stable")
@Introspected
public class ParameterModel {
    public static final String JSON_PROPERTY_BOOL = "bool";
    private String bool;

    public static final String JSON_PROPERTY_STRING = "string";
    private String string;

    public static final String JSON_PROPERTY_NUMBER = "number";
    private BigDecimal number;

    public static final String JSON_PROPERTY_INTEGER = "integer";
    private Integer integer;

    public static final String JSON_PROPERTY_UUID = "uuid";
    private UUID uuid;

    public static final String JSON_PROPERTY_DATE = "date";
    private LocalDate date;

    public static final String JSON_PROPERTY_DATE_TIME = "dateTime";
    private OffsetDateTime dateTime;

    public static final String JSON_PROPERTY_A = "a";
    private List<String> a = null;

    public static final String JSON_PROPERTY_B = "b";
    private List<UUID> b = null;

    public static final String JSON_PROPERTY_C = "c";
    private List<Integer> c = null;

    public ParameterModel() {
    }

    public ParameterModel bool(String bool) {
        this.bool = bool;
        return this;
    }

    /**
     * Get bool
     * @return bool
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_BOOL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBool() {
        return bool;
    }

    @JsonProperty(JSON_PROPERTY_BOOL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBool(String bool) {
        this.bool = bool;
    }

    public ParameterModel string(String string) {
        this.string = string;
        return this;
    }

    /**
     * Get string
     * @return string
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_STRING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getString() {
        return string;
    }

    @JsonProperty(JSON_PROPERTY_STRING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setString(String string) {
        this.string = string;
    }

    public ParameterModel number(BigDecimal number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     * @return number
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getNumber() {
        return number;
    }

    @JsonProperty(JSON_PROPERTY_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public ParameterModel integer(Integer integer) {
        this.integer = integer;
        return this;
    }

    /**
     * Get integer
     * @return integer
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_INTEGER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getInteger() {
        return integer;
    }

    @JsonProperty(JSON_PROPERTY_INTEGER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public ParameterModel uuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get uuid
     * @return uuid
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_UUID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getUuid() {
        return uuid;
    }

    @JsonProperty(JSON_PROPERTY_UUID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public ParameterModel date(LocalDate date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     * @return date
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public LocalDate getDate() {
        return date;
    }

    @JsonProperty(JSON_PROPERTY_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ParameterModel dateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Get dateTime
     * @return dateTime
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_DATE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    @JsonProperty(JSON_PROPERTY_DATE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public ParameterModel a(List<String> a) {
        this.a = a;
        return this;
    }

    public ParameterModel addAItem(String aItem) {
        if (this.a == null) {
            this.a = new ArrayList<>();
        }
        this.a.add(aItem);
        return this;
    }

    /**
     * Get a
     * @return a
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_A)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getA() {
        return a;
    }

    @JsonProperty(JSON_PROPERTY_A)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setA(List<String> a) {
        this.a = a;
    }

    public ParameterModel b(List<UUID> b) {
        this.b = b;
        return this;
    }

    public ParameterModel addBItem(UUID bItem) {
        if (this.b == null) {
            this.b = new ArrayList<>();
        }
        this.b.add(bItem);
        return this;
    }

    /**
     * Get b
     * @return b
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_B)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<UUID> getB() {
        return b;
    }

    @JsonProperty(JSON_PROPERTY_B)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setB(List<UUID> b) {
        this.b = b;
    }

    public ParameterModel c(List<Integer> c) {
        this.c = c;
        return this;
    }

    public ParameterModel addCItem(Integer cItem) {
        if (this.c == null) {
            this.c = new ArrayList<>();
        }
        this.c.add(cItem);
        return this;
    }

    /**
     * Get c
     * @return c
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_C)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<Integer> getC() {
        return c;
    }

    @JsonProperty(JSON_PROPERTY_C)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setC(List<Integer> c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParameterModel parameterModel = (ParameterModel) o;
        return Objects.equals(this.bool, parameterModel.bool) &&
            Objects.equals(this.string, parameterModel.string) &&
            Objects.equals(this.number, parameterModel.number) &&
            Objects.equals(this.integer, parameterModel.integer) &&
            Objects.equals(this.uuid, parameterModel.uuid) &&
            Objects.equals(this.date, parameterModel.date) &&
            Objects.equals(this.dateTime, parameterModel.dateTime) &&
            Objects.equals(this.a, parameterModel.a) &&
            Objects.equals(this.b, parameterModel.b) &&
            Objects.equals(this.c, parameterModel.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bool, string, number, integer, uuid, date, dateTime, a, b, c);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParameterModel {\n");
        sb.append("    bool: ").append(toIndentedString(bool)).append("\n");
        sb.append("    string: ").append(toIndentedString(string)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    integer: ").append(toIndentedString(integer)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
        sb.append("    a: ").append(toIndentedString(a)).append("\n");
        sb.append("    b: ").append(toIndentedString(b)).append("\n");
        sb.append("    c: ").append(toIndentedString(c)).append("\n");
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

