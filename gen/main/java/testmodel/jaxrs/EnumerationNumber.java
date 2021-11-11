package testmodel.jaxrs;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

    /**
     * Convert a String into BigDecimal, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static EnumerationNumber fromString(String s) {
      for (EnumerationNumber b : EnumerationNumber.values()) {
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
  public static EnumerationNumber fromValue(BigDecimal value) {
    for (EnumerationNumber b : EnumerationNumber.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


