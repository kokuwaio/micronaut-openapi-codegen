package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

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

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
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

