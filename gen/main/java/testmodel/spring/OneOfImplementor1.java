package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * OneOfImplementor1
 */
@java.lang.SuppressWarnings("all")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: stable")
public class OneOfImplementor1 implements OneOfInterface {

  private @Nullable String property;

  private @Nullable String type;

  public OneOfImplementor1 property(@Nullable String property) {
    this.property = property;
    return this;
  }

  /**
   * Get property
   * @return property
   */
  
  @JsonProperty("property")
  public @Nullable String getProperty() {
    return property;
  }

  public void setProperty(@Nullable String property) {
    this.property = property;
  }

  public OneOfImplementor1 type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  public void setType(@Nullable String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneOfImplementor1 oneOfImplementor1 = (OneOfImplementor1) o;
    return Objects.equals(this.property, oneOfImplementor1.property) &&
        Objects.equals(this.type, oneOfImplementor1.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneOfImplementor1 {\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

