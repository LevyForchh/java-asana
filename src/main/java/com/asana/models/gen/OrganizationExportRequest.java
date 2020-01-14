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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * An *organization_export* request starts a job to export the complete data of the given Organization.
 */
@Schema(description = "An *organization_export* request starts a job to export the complete data of the given Organization.")

public class OrganizationExportRequest {
  @SerializedName("organization")
  private String organization = null;


  public OrganizationExportRequest(OrganizationExportResponse responseModel) {
    super();
    organization = responseModel.organization;
  }
  public OrganizationExportRequest organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Globally unique identifier for the workspace or organization.
   * @return organization
  **/
  @Schema(example = "1331", description = "Globally unique identifier for the workspace or organization.")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationExportRequest organizationExportRequest = (OrganizationExportRequest) o;
    return Objects.equals(this.organization, organizationExportRequest.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationExportRequest {\n");
    
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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