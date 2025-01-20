package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import testmodel.spring.EnumerationString;
import testmodel.spring.EnumerationStringDefault;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * EnumerationModel
 */
@java.lang.SuppressWarnings("all")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: stable")
public class EnumerationModel {

  private @Nullable EnumerationString string;

  private EnumerationStringDefault stringDefault = EnumerationStringDefault.THREE;

  /**
   * Gets or Sets embedded
   */
  @java.lang.SuppressWarnings("all")
public enum EmbeddedEnum {
    FIRST("first"),
    
    SECOND("second");

    private String value;

    EmbeddedEnum(String value) {
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
    public static EmbeddedEnum fromValue(String value) {
      for (EmbeddedEnum b : EmbeddedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable EmbeddedEnum embedded;

  /**
   * Gets or Sets embeddedDefault
   */
  @java.lang.SuppressWarnings("all")
public enum EmbeddedDefaultEnum {
    THREE("three"),
    
    FOUR("four");

    private String value;

    EmbeddedDefaultEnum(String value) {
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
    public static EmbeddedDefaultEnum fromValue(String value) {
      for (EmbeddedDefaultEnum b : EmbeddedDefaultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private EmbeddedDefaultEnum embeddedDefault = EmbeddedDefaultEnum.FOUR;

  public EnumerationModel string(EnumerationString string) {
    this.string = string;
    return this;
  }

  /**
   * Get string
   * @return string
   */
  @Valid 
  @JsonProperty("string")
  public EnumerationString getString() {
    return string;
  }

  public void setString(EnumerationString string) {
    this.string = string;
  }

  public EnumerationModel stringDefault(EnumerationStringDefault stringDefault) {
    this.stringDefault = stringDefault;
    return this;
  }

  /**
   * Get stringDefault
   * @return stringDefault
   */
  @Valid 
  @JsonProperty("string-default")
  public EnumerationStringDefault getStringDefault() {
    return stringDefault;
  }

  public void setStringDefault(EnumerationStringDefault stringDefault) {
    this.stringDefault = stringDefault;
  }

  public EnumerationModel embedded(EmbeddedEnum embedded) {
    this.embedded = embedded;
    return this;
  }

  /**
   * Get embedded
   * @return embedded
   */
  
  @JsonProperty("embedded")
  public EmbeddedEnum getEmbedded() {
    return embedded;
  }

  public void setEmbedded(EmbeddedEnum embedded) {
    this.embedded = embedded;
  }

  public EnumerationModel embeddedDefault(EmbeddedDefaultEnum embeddedDefault) {
    this.embeddedDefault = embeddedDefault;
    return this;
  }

  /**
   * Get embeddedDefault
   * @return embeddedDefault
   */
  
  @JsonProperty("embedded-default")
  public EmbeddedDefaultEnum getEmbeddedDefault() {
    return embeddedDefault;
  }

  public void setEmbeddedDefault(EmbeddedDefaultEnum embeddedDefault) {
    this.embeddedDefault = embeddedDefault;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumerationModel enumerationModel = (EnumerationModel) o;
    return Objects.equals(this.string, enumerationModel.string) &&
        Objects.equals(this.stringDefault, enumerationModel.stringDefault) &&
        Objects.equals(this.embedded, enumerationModel.embedded) &&
        Objects.equals(this.embeddedDefault, enumerationModel.embeddedDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(string, stringDefault, embedded, embeddedDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumerationModel {\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    stringDefault: ").append(toIndentedString(stringDefault)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    embeddedDefault: ").append(toIndentedString(embeddedDefault)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

