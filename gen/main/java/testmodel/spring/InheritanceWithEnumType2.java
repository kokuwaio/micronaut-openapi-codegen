package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import testmodel.spring.InheritanceWithEnumType;
import testmodel.spring.InheritanceWithEnumTypeEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * InheritanceWithEnumType2
 */
@java.lang.SuppressWarnings("all")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: stable")
public class InheritanceWithEnumType2 extends InheritanceWithEnumType {

  private @Nullable String e;

  public InheritanceWithEnumType2 e(@Nullable String e) {
    this.e = e;
    return this;
  }

  /**
   * Get e
   * @return e
   */
  
  @JsonProperty("e")
  public @Nullable String getE() {
    return e;
  }

  public void setE(@Nullable String e) {
    this.e = e;
  }


  public InheritanceWithEnumType2 type(InheritanceWithEnumTypeEnum type) {
    super.type(type);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithEnumType2 inheritanceWithEnumType2 = (InheritanceWithEnumType2) o;
    return Objects.equals(this.e, inheritanceWithEnumType2.e) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(e, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithEnumType2 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

