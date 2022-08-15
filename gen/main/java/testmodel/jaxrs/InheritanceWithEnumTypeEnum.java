package testmodel.jaxrs;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets InheritanceWithEnumTypeEnum
 */
@java.lang.SuppressWarnings("all")
public enum InheritanceWithEnumTypeEnum {
  
  INHERITANCE1("Inheritance1"),
  
  INHERITANCE2("Inheritance2"),
  
  INHERITANCE3("Inheritance3");

  private String value;

  InheritanceWithEnumTypeEnum(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static InheritanceWithEnumTypeEnum fromString(String s) {
      for (InheritanceWithEnumTypeEnum b : InheritanceWithEnumTypeEnum.values()) {
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
  public static InheritanceWithEnumTypeEnum fromValue(String value) {
    for (InheritanceWithEnumTypeEnum b : InheritanceWithEnumTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


