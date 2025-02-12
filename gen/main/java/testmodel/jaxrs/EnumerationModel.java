package testmodel.jaxrs;

import testmodel.jaxrs.EnumerationString;
import testmodel.jaxrs.EnumerationStringDefault;
import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("EnumerationModel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", comments = "Generator version: stable")@java.lang.SuppressWarnings("all")

public class EnumerationModel   {
  private EnumerationString string;
  private EnumerationStringDefault stringDefault = EnumerationStringDefault.THREE;
  @java.lang.SuppressWarnings("all")
public enum EmbeddedEnum {

    FIRST(String.valueOf("first")), SECOND(String.valueOf("second"));


    private String value;

    EmbeddedEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static EmbeddedEnum fromString(String s) {
        for (EmbeddedEnum b : EmbeddedEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private EmbeddedEnum embedded;
  @java.lang.SuppressWarnings("all")
public enum EmbeddedDefaultEnum {

    THREE(String.valueOf("three")), FOUR(String.valueOf("four"));


    private String value;

    EmbeddedDefaultEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static EmbeddedDefaultEnum fromString(String s) {
        for (EmbeddedDefaultEnum b : EmbeddedDefaultEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  public EnumerationModel() {
  }

  /**
   **/
  public EnumerationModel string(EnumerationString string) {
    this.string = string;
    return this;
  }

  
  @JsonProperty("string")
  public EnumerationString getString() {
    return string;
  }

  @JsonProperty("string")
  public void setString(EnumerationString string) {
    this.string = string;
  }

  /**
   **/
  public EnumerationModel stringDefault(EnumerationStringDefault stringDefault) {
    this.stringDefault = stringDefault;
    return this;
  }

  
  @JsonProperty("string-default")
  public EnumerationStringDefault getStringDefault() {
    return stringDefault;
  }

  @JsonProperty("string-default")
  public void setStringDefault(EnumerationStringDefault stringDefault) {
    this.stringDefault = stringDefault;
  }

  /**
   **/
  public EnumerationModel embedded(EmbeddedEnum embedded) {
    this.embedded = embedded;
    return this;
  }

  
  @JsonProperty("embedded")
  public EmbeddedEnum getEmbedded() {
    return embedded;
  }

  @JsonProperty("embedded")
  public void setEmbedded(EmbeddedEnum embedded) {
    this.embedded = embedded;
  }

  /**
   **/
  public EnumerationModel embeddedDefault(EmbeddedDefaultEnum embeddedDefault) {
    this.embeddedDefault = embeddedDefault;
    return this;
  }

  
  @JsonProperty("embedded-default")
  public EmbeddedDefaultEnum getEmbeddedDefault() {
    return embeddedDefault;
  }

  @JsonProperty("embedded-default")
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

