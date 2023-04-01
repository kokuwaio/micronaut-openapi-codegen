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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EnumerationNumber
 */
@java.lang.SuppressWarnings("all")
@Introspected
public enum EnumerationNumber {
    NUMBER_MINUS_1(new BigDecimal("-1")),
    NUMBER_0(new BigDecimal("0")),
    NUMBER_1(new BigDecimal("1"));

    private BigDecimal value;

    EnumerationNumber(BigDecimal value) {
        this.value = value;
    }

    @JsonValue
    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static EnumerationNumber fromValue(BigDecimal value) {
        for (EnumerationNumber b : EnumerationNumber.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
