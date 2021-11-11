package testmodel.jaxrs;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EnumerationString
 */
@java.lang.SuppressWarnings("all")
public enum EnumerationString {
  
  ONE("one"),
  
  TWO("two");

  private String value;

  EnumerationString(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EnumerationString fromValue(String value) {
    for (EnumerationString b : EnumerationString.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


