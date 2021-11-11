package testmodel.jaxrs;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets InheritanceWithTypeEnum
 */
@java.lang.SuppressWarnings("all")
public enum InheritanceWithTypeEnum {
  
  INHERITANCEWITHTYPE1("InheritanceWithType1"),
  
  INHERITANCEWITHTYPE2("InheritanceWithType2"),
  
  INHERITANCEWITHTYPE3("InheritanceWithType3");

  private String value;

  InheritanceWithTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static InheritanceWithTypeEnum fromValue(String value) {
    for (InheritanceWithTypeEnum b : InheritanceWithTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


