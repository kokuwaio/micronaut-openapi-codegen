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

    /**
     * Convert a String into Integer, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static EnumerationInteger fromString(String s) {
      for (EnumerationInteger b : EnumerationInteger.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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


