package testmodel.jaxrs;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EnumerationInteger
 */
@java.lang.SuppressWarnings("all")
public enum EnumerationInteger {
  
  NUMBER_MINUS_2147483648(-2147483648),
  
  NUMBER_MINUS_1(-1),
  
  NUMBER_0(0),
  
  NUMBER_1(1),
  
  NUMBER_2147483647(2147483647);

  private Integer value;

  EnumerationInteger(Integer value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EnumerationInteger fromValue(Integer value) {
    for (EnumerationInteger b : EnumerationInteger.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


