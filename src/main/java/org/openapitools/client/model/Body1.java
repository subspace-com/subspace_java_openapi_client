/*
 * Subspace Product API
 * # Introduction  The Subspace API is based on REST, has resource-oriented URLs, returns JSON-encoded responses, and returns standard HTTP response codes.  The base URL for the API is:  `https://api.subspace.com/`  # Naming Convention  * Version name currently in use is: *v1*   * Example: `https://api.subspace.com/v1`  # Authentication  ## API Tokens  Subspace authenticates your API requests using JWT Bearer tokens. To use any Subspace API, you must pass a Bearer token with each request. If you do not include your Bearer token when making an API request, or use one that is incorrect or disabled, Subspace returns an error.  Bearer tokens are granted by requesting one (as noted below) and presenting your publishable (client_id) and secret (client_secret) tokens.     Subspace provides two types of API tokens: publishable (client_id) and secret (client_secret).  These are available in the Subspace console.   * **Publishable** API tokens (client_id) are meant solely to identify your account with Subspace, they aren’t secret. They can be published in places like your website JavaScript code, or in an iPhone or Android app.   * **Secret** API tokens (client_secret) should be kept confidential and only stored on your own servers. Your account’s secret API token will allow you to acquire a valid JWT token authorized to perform any API request to Subspace.  ## Getting a JWT Bearer Token  Subspace uses auth0 for JWT token management.  You can acquire a JWT token by utilizing `https://id.subspace.com` and following the instructions in the curl example below.  ## Protecting Your API Tokens    * **JWT tokens have a expiration time of 24 hours.**  Once expired, you will have to use your Subspace private API and public token to request a new one.   * The Subspace private token can be rotated from within the Subspace console.  Rotation may take up to 10 minutes for all systems to update state to invalidate the older token and enable the new one.   * **Keep your secret token safe.** Your secret token can make any API call on behalf of your account, including changes that may impact billing such as enabling pay-as-you-go charges. Do not store your secret token in your version control system. Do not use your secret token outside your web server, such as a browser, mobile app, or distributed file.   * **You may use the Subspace console to acquire an API token.**   * **You may use the Subspace console to disable pay-as-you-go.** This may prevent unexpected charges due to unauthorized or abnormal usage.   * **Do not embed API keys directly in code.** Instead of directly embedding API keys in your application’s code, put them in environment variables, or within include files that are stored separately from the bulk of your code—outside the source repository of your application. Then, if you share your code, the API keys will not be included in the shared files.   * **Do not store API tokens inside your application’s source control.** If you store API tokens in files, keep the files outside your application’s source control system. This is particularly important if you use a public source code management system such as GitHub.   * **Limit access with restricted tokens.** The Subspace console will allow you to specify the IP addresses or referrer URLs associated with each token, reducing the impact of a compromised API token.   * **Use independent API tokens for different apps.** This limits the scope of each token. If an API token is compromised, you can rotate the impacted token without impacting other API tokens.  # Error Codes  Subspace uses HTTP response codes to indicate the success or failure of an API request.   General HTML status codes:   * 2xx Success.    * 4xx Errors based on information provided in the request.   * 5xx Errors on Subspace servers.    # Security  We provide a valid, signed certificate for our API methods. Be sure your connection library supports HTTPS with the SNI extension.  # REST How-To  Making your first REST API call is easy and can be done from your browser.  You will need:   * Your **secret** token and public client token, both found in the Console.   * The URL for the type of data you would like to request.  First, acquire a JWT Bearer Token.  Command line example:          curl --request POST \\          --url \"https://id.subspace.com/oauth/token\" \\          --header 'content-type: application/json' \\          --data '{ \"client_id\": YOURCLIENTID, \"client_secret\": YOURCLIENTSECRET, \"audience\": \"https://api.subspace.com/\", \"grant_type\": \"client_credentials\" }'  REST calls are made up of:   * Base url: Example: `https://api.subspace.com`   * Version: Example: `v1`   * The API Endpoint and any parameters: `accelerators/acc_NDA3MUI5QzUtOTY4MC00Nz` where `acc_NDA3MUI5QzUtOTY4MC00Nz` is a valid accelerator ID   * Accelerator ids are always of the format `acc_NDA3MUI5QzUtOTY4MC00Nz`, with a \"acc_\" prefix followed by 22 characters.   * Project ids are always of the format `prj_00Iaqxjo71vNL1uLKKo5Kn`, with a \"prj_\" prefix followed by 22 characters.   * Token header: All REST requests require a valid JWT Bearer token which should be added as an “Authorization” header to the request:              `Authorization: Bearer YOUR_TOKEN_HERE`    ## Authorization header example  If your API token was “my_api_token”, you would add...      Authorization: Bearer my_api_token      ...to the header.  ## Command line examples  To list your current open packet_accelerators using the token “my_api_token”:      curl -H “Authorization: Bearer my_api_token” https://api.subspace.com/v1/accelerators      Alternately, to get the details of a specific accelerator whose id is 'abcd-ef01-2345':      curl -H “Authorization: Bearer my_api_token” https://api.subspace.com/v1/accelerators/abcd-ef01-2345  # API Versioning  Subspace will release new versions when we make backwards-incompatible changes to the API. We will give advance notice before releasing a new version or retiring an old version.  Backwards compatible changes:   * Adding new response attributes   * Adding new endpoints   * Adding new methods to an existing endpoint   * Adding new query string parameters   * Adding new path parameters   * Adding new webhook events   * Adding new streaming endpoints   * Changing the order of existing response attributes    Versions are added to the base url, for example:   * `https://api.subspace.com/v1`  Current Version is **v1:** `https://api.subspace.com/v1` 
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
 * Body1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-01T21:44:57.762Z[GMT]")
public class Body1 {
  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESTINATION_IP = "destination_ip";
  @SerializedName(SERIALIZED_NAME_DESTINATION_IP)
  private String destinationIp;

  public static final String SERIALIZED_NAME_DESTINATION_PORT = "destination_port";
  @SerializedName(SERIALIZED_NAME_DESTINATION_PORT)
  private Integer destinationPort;


  public Body1 protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * udp or tcp
   * @return protocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "udp or tcp")

  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public Body1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of PacketAccelerator
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of PacketAccelerator")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Body1 destinationIp(String destinationIp) {
    
    this.destinationIp = destinationIp;
    return this;
  }

   /**
   * Destination IP, e.g. 1.2.3.4
   * @return destinationIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Destination IP, e.g. 1.2.3.4")

  public String getDestinationIp() {
    return destinationIp;
  }


  public void setDestinationIp(String destinationIp) {
    this.destinationIp = destinationIp;
  }


  public Body1 destinationPort(Integer destinationPort) {
    
    this.destinationPort = destinationPort;
    return this;
  }

   /**
   * Destination port, e.g. 443
   * @return destinationPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Destination port, e.g. 443")

  public Integer getDestinationPort() {
    return destinationPort;
  }


  public void setDestinationPort(Integer destinationPort) {
    this.destinationPort = destinationPort;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body1 body1 = (Body1) o;
    return Objects.equals(this.protocol, body1.protocol) &&
        Objects.equals(this.name, body1.name) &&
        Objects.equals(this.destinationIp, body1.destinationIp) &&
        Objects.equals(this.destinationPort, body1.destinationPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocol, name, destinationIp, destinationPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body1 {\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    destinationIp: ").append(toIndentedString(destinationIp)).append("\n");
    sb.append("    destinationPort: ").append(toIndentedString(destinationPort)).append("\n");
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

