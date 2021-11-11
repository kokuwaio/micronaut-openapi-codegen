package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EnumerationNumber
 */
@java.lang.SuppressWarnings("all")
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

