/*
 * Subspace Product API
 * # Introduction  The Subspace API is based on REST, has resource-oriented URLs, returns JSON-encoded responses, and returns standardHTTP response codes.  The base URL for the API is `https://api.subspace.com/`  # Naming Convention  **EARLY ACCESS NOTE:** There is no “stable” version yet.  Once there is, the version name **stable** will be used to access the latest stable API version.   * Example: `https://api.subspace.com/stable` * Version name currently in use is: *v1*   * Example: `https://api.subspace.com/v1`  # Authentication  ## API Tokens  Subspace authenticates your API requests using JWT Bearer tokens.  The provided client library requires this JWT to be set before it can be used, by setting the local access token in the local configuration.  This is done by updating the configuration line marked \"YOUR ACCESS TOKEN\" by replacing the text \"YOUR ACCESS TOKEN\" with your JWT Bearer token.  Bearer tokens are granted by requesting one (as noted below) and presenting your publishable (client_id) and secret (client_secret) tokens.     Subspace provides two types of API tokens: publishable (client_id) and secret (client_secret).  These are available in the Subspace console.   * **Publishable** API tokens (client_id) are meant solely to identify your account with Subspace, they aren’t secret. They can be published in places like your website JavaScript code, or in an iPhone or Android app.   * **Secret** API tokens (client_secret) should be kept confidential and only stored on your own servers. Your account’s secret API token will allow you to acquire a valid JWT token authorized to perform any API request to Subspace.  ## Getting a JWT Bearer Token  Subspace uses auth0 for JWT token management.  You can acquire a JWT token by utilizing `https://id.subspace.com` and following the instructions in the curl example below.  ## Protecting Your API Tokens    * **JWT tokens have a expiration time of 24 hours.**  Once expired, you will have to use your Subspace private API and public token to request a new one.   * The Subspace private token can be rotated from within the Subspace console.  Rotation may take up to 10 minutes for all systems to update state to invalidate the older token and enable the new one. * **Keep your secret token safe.** Your secret token can make any API call on behalf of your account, including changes that may impact billing such as enabling pay-as-you-go charges. Do not store your secret token in your version control system. Do not use your secret token outside your web server, such as a browser, mobile app, or distributed file.   * **You may use the Subspace console to acquire an API token.**  * **You may use the Subspace console to disable pay-as-you-go.** This may prevent unexpected charges due to unauthorized or abnormal usage.  **Acquiring a valid JWT**  Command line example: ``` curl --request POST           --url 'https://id.subspace.com/oauth/token'           --header 'content-type: application/json'           --data '{ \"client_id\": YOURCLIENTID, \"client_secret\": YOURCLIENTSECRET, \"audience\": \"https://api.subspace.com/\", \"grant_type\": \"client_credentials\" }' ``` 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sales@subspace.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.V1TransportType;

/**
 * V1TeleportAddresses
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-16T22:06:12.741Z[GMT]")
public class V1TeleportAddresses {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_TRANSPORT_TYPE = "transportType";
  @SerializedName(SERIALIZED_NAME_TRANSPORT_TYPE)
  private V1TransportType transportType = V1TransportType.UDP_TCP;


  public V1TeleportAddresses address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public V1TeleportAddresses transportType(V1TransportType transportType) {
    
    this.transportType = transportType;
    return this;
  }

   /**
   * Get transportType
   * @return transportType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1TransportType getTransportType() {
    return transportType;
  }


  public void setTransportType(V1TransportType transportType) {
    this.transportType = transportType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TeleportAddresses v1TeleportAddresses = (V1TeleportAddresses) o;
    return Objects.equals(this.address, v1TeleportAddresses.address) &&
        Objects.equals(this.transportType, v1TeleportAddresses.transportType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, transportType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TeleportAddresses {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    transportType: ").append(toIndentedString(transportType)).append("\n");
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

