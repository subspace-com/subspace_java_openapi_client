/*
 * Subspace Product API
 * # Introduction  The Subspace API is based on REST, has resource-oriented URLs, returns JSON-encoded responses, and returns standard HTTP response codes.  The base URL for the API is:  `https://api.subspace.com/`  # Naming Convention  * Version name currently in use is: *v1*   * Example: `https://api.subspace.com/v1`  # Authentication  ## API Tokens  Subspace authenticates your API requests using JWT Bearer tokens. To use any Subspace API, you must pass a Bearer token with each request. If you do not include your Bearer token when making an API request, or use one that is incorrect or disabled, Subspace returns an error.  Bearer tokens are granted by requesting one (as noted below) and presenting your publishable (client_id) and secret (client_secret) tokens.     Subspace provides two types of API tokens: publishable (client_id) and secret (client_secret).  These are available in the Subspace console.   * **Publishable** API tokens (client_id) are meant solely to identify your account with Subspace, they aren’t secret. They can be published in places like your website JavaScript code, or in an iPhone or Android app.   * **Secret** API tokens (client_secret) should be kept confidential and only stored on your own servers. Your account’s secret API token will allow you to acquire a valid JWT token authorized to perform any API request to Subspace.  ## Getting a JWT Bearer Token  Subspace uses auth0 for JWT token management.  You can acquire a JWT token by utilizing `https://id.subspace.com` and following the instructions in the curl example below.  ## Protecting Your API Tokens    * **JWT tokens have a expiration time of 24 hours.**  Once expired, you will have to use your Subspace private API and public token to request a new one.   * The Subspace private token can be rotated from within the Subspace console.  Rotation may take up to 10 minutes for all systems to update state to invalidate the older token and enable the new one.   * **Keep your secret token safe.** Your secret token can make any API call on behalf of your account, including changes that may impact billing such as enabling pay-as-you-go charges. Do not store your secret token in your version control system. Do not use your secret token outside your web server, such as a browser, mobile app, or distributed file.   * **You may use the Subspace console to acquire an API token.**   * **You may use the Subspace console to disable pay-as-you-go.** This may prevent unexpected charges due to unauthorized or abnormal usage.   * **Do not embed API keys directly in code.** Instead of directly embedding API keys in your application’s code, put them in environment variables, or within include files that are stored separately from the bulk of your code—outside the source repository of your application. Then, if you share your code, the API keys will not be included in the shared files.   * **Do not store API tokens inside your application’s source control.** If you store API tokens in files, keep the files outside your application’s source control system. This is particularly important if you use a public source code management system such as GitHub.   * **Limit access with restricted tokens.** The Subspace console will allow you to specify the IP addresses or referrer URLs associated with each token, reducing the impact of a compromised API token.   * **Use independent API tokens for different apps.** This limits the scope of each token. If an API token is compromised, you can rotate the impacted token without impacting other API tokens.  # Error Codes  Subspace uses HTTP response codes to indicate the success or failure of an API request.   General HTML status codes:   * 2xx Success.    * 4xx Errors based on information provided in the request.   * 5xx Errors on Subspace servers.    # Security  We provide a valid, signed certificate for our API methods. Be sure your connection library supports HTTPS with the SNI extension.  # REST How-To  Making your first REST API call is easy and can be done from your browser.  You will need:   * Your **secret** token and public client token, both found in the Console.   * The URL for the type of data you would like to request.  First, acquire a JWT Bearer Token.  Command line example:          curl --request POST \\          --url \"https://id.subspace.com/oauth/token\" \\          --header 'content-type: application/json' \\          --data '{ \"client_id\": \"YOURCLIENTID\", \"client_secret\": \"YOURCLIENTSECRET\", \"audience\": \"https://api.subspace.com/\", \"grant_type\": \"client_credentials\" }'  REST calls are made up of:   * Base url: Example: `https://api.subspace.com`   * Version: Example: `v1`   * The API Endpoint and any parameters: `accelerator/acc_NDA3MUI5QzUtOTY4MC00Nz` where `acc_NDA3MUI5QzUtOTY4MC00Nz` is a valid accelerator ID   * Accelerator ids are always of the format `acc_NDA3MUI5QzUtOTY4MC00Nz`, with a \"acc_\" prefix followed by 22 characters.   * Token header: All REST requests require a valid JWT Bearer token which should be added as an “Authorization” header to the request:              `Authorization: Bearer YOUR_TOKEN_HERE`    ## Authorization header example  If your API token was “my_api_token”, you would add...      Authorization: Bearer my_api_token      ...to the header.  ## Command line examples  To list your current open packet_accelerators using the token “my_api_token”:      curl -H “Authorization: Bearer my_api_token” https://api.subspace.com/v1/accelerator      Alternately, to get the details of a specific accelerator whose id is 'abcd-ef01-2345':      curl -H “Authorization: Bearer my_api_token” https://api.subspace.com/v1/accelerator/abcd-ef01-2345  # API Versioning  Subspace will release new versions when we make backwards-incompatible changes to the API. We will give advance notice before releasing a new version or retiring an old version.  Backwards compatible changes:   * Adding new response attributes   * Adding new endpoints   * Adding new methods to an existing endpoint   * Adding new query string parameters   * Adding new path parameters   * Adding new webhook events   * Adding new streaming endpoints   * Changing the order of existing response attributes    Versions are added to the base url, for example:   * `https://api.subspace.com/v1`  Current Version is **v1:** `https://api.subspace.com/v1` 
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

/**
 * V1Accelerator
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-16T21:50:26.375Z[GMT]")
public class V1Accelerator {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESTINATION_IP = "destination_ip";
  @SerializedName(SERIALIZED_NAME_DESTINATION_IP)
  private String destinationIp;

  public static final String SERIALIZED_NAME_DESTINATION_PORT = "destination_port";
  @SerializedName(SERIALIZED_NAME_DESTINATION_PORT)
  private Long destinationPort;

  public static final String SERIALIZED_NAME_SUBSPACE_IPV4 = "subspace_ipv4";
  @SerializedName(SERIALIZED_NAME_SUBSPACE_IPV4)
  private String subspaceIpv4;

  public static final String SERIALIZED_NAME_SUBSPACE_PORT = "subspace_port";
  @SerializedName(SERIALIZED_NAME_SUBSPACE_PORT)
  private Long subspacePort;


  public V1Accelerator id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public V1Accelerator name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1Accelerator destinationIp(String destinationIp) {
    
    this.destinationIp = destinationIp;
    return this;
  }

   /**
   * Get destinationIp
   * @return destinationIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDestinationIp() {
    return destinationIp;
  }


  public void setDestinationIp(String destinationIp) {
    this.destinationIp = destinationIp;
  }


  public V1Accelerator destinationPort(Long destinationPort) {
    
    this.destinationPort = destinationPort;
    return this;
  }

   /**
   * Get destinationPort
   * @return destinationPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getDestinationPort() {
    return destinationPort;
  }


  public void setDestinationPort(Long destinationPort) {
    this.destinationPort = destinationPort;
  }


  public V1Accelerator subspaceIpv4(String subspaceIpv4) {
    
    this.subspaceIpv4 = subspaceIpv4;
    return this;
  }

   /**
   * Get subspaceIpv4
   * @return subspaceIpv4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubspaceIpv4() {
    return subspaceIpv4;
  }


  public void setSubspaceIpv4(String subspaceIpv4) {
    this.subspaceIpv4 = subspaceIpv4;
  }


  public V1Accelerator subspacePort(Long subspacePort) {
    
    this.subspacePort = subspacePort;
    return this;
  }

   /**
   * Get subspacePort
   * @return subspacePort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSubspacePort() {
    return subspacePort;
  }


  public void setSubspacePort(Long subspacePort) {
    this.subspacePort = subspacePort;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Accelerator v1Accelerator = (V1Accelerator) o;
    return Objects.equals(this.id, v1Accelerator.id) &&
        Objects.equals(this.name, v1Accelerator.name) &&
        Objects.equals(this.destinationIp, v1Accelerator.destinationIp) &&
        Objects.equals(this.destinationPort, v1Accelerator.destinationPort) &&
        Objects.equals(this.subspaceIpv4, v1Accelerator.subspaceIpv4) &&
        Objects.equals(this.subspacePort, v1Accelerator.subspacePort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, destinationIp, destinationPort, subspaceIpv4, subspacePort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Accelerator {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    destinationIp: ").append(toIndentedString(destinationIp)).append("\n");
    sb.append("    destinationPort: ").append(toIndentedString(destinationPort)).append("\n");
    sb.append("    subspaceIpv4: ").append(toIndentedString(subspaceIpv4)).append("\n");
    sb.append("    subspacePort: ").append(toIndentedString(subspacePort)).append("\n");
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

