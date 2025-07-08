package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * OneOfImplementor2
 */
@java.lang.SuppressWarnings("all")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: stable")
public class OneOfImplementor2 implements OneOfInterface {

  private @Nullable BigDecimal property;

  private @Nullable String type;

  public OneOfImplementor2 property(@Nullable BigDecimal property) {
    this.property = property;
    return this;
  }

  /**
   * Get property
   * @return property
   */
  @Valid 
  @JsonProperty("property")
  public @Nullable BigDecimal getProperty() {
    return property;
  }

  public void setProperty(@Nullable BigDecimal property) {
    this.property = property;
  }

  public OneOfImplementor2 type(@Nullable String type) {
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
    OneOfImplementor2 oneOfImplementor2 = (OneOfImplementor2) o;
    return Objects.equals(this.property, oneOfImplementor2.property) &&
        Objects.equals(this.type, oneOfImplementor2.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneOfImplementor2 {\n");
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

