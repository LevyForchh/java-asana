/*
 * Asana
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.asana.models.gen;

import java.util.Objects;
import java.util.Arrays;
import com.asana.models.gen.BatchRequestActionOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * An action object for use in a batch request.
 */
@Schema(description = "An action object for use in a batch request.")

public class BatchRequestAction {
  @SerializedName("relative_path")
  private String relativePath = null;

  /**
   * The HTTP method you wish to emulate for the action.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    GET("get"),
    POST("post"),
    PUT("put"),
    DELETE("delete"),
    PATCH("patch"),
    HEAD("head");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MethodEnum fromValue(String text) {
      for (MethodEnum b : MethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MethodEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("method")
  private MethodEnum method = null;

  @SerializedName("data")
  private Object data = null;

  @SerializedName("options")
  private BatchRequestActionOptions options = null;


  public BatchRequestAction relativePath(String relativePath) {
    this.relativePath = relativePath;
    return this;
  }

   /**
   * The path of the desired endpoint relative to the API’s base URL. Query parameters are not accepted here; put them in &#x60;data&#x60; instead.
   * @return relativePath
  **/
  @Schema(example = "/tasks/123", required = true, description = "The path of the desired endpoint relative to the API’s base URL. Query parameters are not accepted here; put them in `data` instead.")
  public String getRelativePath() {
    return relativePath;
  }

  public void setRelativePath(String relativePath) {
    this.relativePath = relativePath;
  }

  public BatchRequestAction method(MethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * The HTTP method you wish to emulate for the action.
   * @return method
  **/
  @Schema(example = "get", required = true, description = "The HTTP method you wish to emulate for the action.")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public BatchRequestAction data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * For &#x60;GET&#x60; requests, this should be a map of query parameters you would have normally passed in the URL. Options and pagination are not accepted here; put them in &#x60;options&#x60; instead. For &#x60;POST&#x60;, &#x60;PATCH&#x60;, and &#x60;PUT&#x60; methods, this should be the content you would have normally put in the data field of the body.
   * @return data
  **/
  @Schema(example = "{\"assignee\":\"me\",\"workspace\":\"1337\"}", description = "For `GET` requests, this should be a map of query parameters you would have normally passed in the URL. Options and pagination are not accepted here; put them in `options` instead. For `POST`, `PATCH`, and `PUT` methods, this should be the content you would have normally put in the data field of the body.")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public BatchRequestAction options(BatchRequestActionOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @Schema(description = "")
  public BatchRequestActionOptions getOptions() {
    return options;
  }

  public void setOptions(BatchRequestActionOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequestAction batchRequestAction = (BatchRequestAction) o;
    return Objects.equals(this.relativePath, batchRequestAction.relativePath) &&
        Objects.equals(this.method, batchRequestAction.method) &&
        Objects.equals(this.data, batchRequestAction.data) &&
        Objects.equals(this.options, batchRequestAction.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relativePath, method, data, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequestAction {\n");
    
    sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}