package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * SecondLevelOneModel
 */
@java.lang.SuppressWarnings("all")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: stable")
public class SecondLevelOneModel implements SecondLevelModel {

  private @Nullable String type;

  private @Nullable String one;

  public SecondLevelOneModel type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SecondLevelOneModel one(String one) {
    this.one = one;
    return this;
  }

  /**
   * Get one
   * @return one
   */
  
  @JsonProperty("one")
  public String getOne() {
    return one;
  }

  public void setOne(String one) {
    this.one = one;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecondLevelOneModel secondLevelOneModel = (SecondLevelOneModel) o;
    return Objects.equals(this.type, secondLevelOneModel.type) &&
        Objects.equals(this.one, secondLevelOneModel.one);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, one);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondLevelOneModel {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    one: ").append(toIndentedString(one)).append("\n");
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

