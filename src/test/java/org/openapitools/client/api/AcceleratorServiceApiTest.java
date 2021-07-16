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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Body;
import org.openapitools.client.model.Body1;
import org.openapitools.client.model.RpcStatus;
import org.openapitools.client.model.V1Accelerator;
import org.openapitools.client.model.V1ListAcceleratorsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AcceleratorServiceApi
 */
@Ignore
public class AcceleratorServiceApiTest {

    private final AcceleratorServiceApi api = new AcceleratorServiceApi();

    
    /**
     * CreateAccelerator
     *
     * CreateAccelerator generates a new PacketAccelerator
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acceleratorServiceCreateTest() throws ApiException {
        Body body = null;
        String idempotencyKey = null;
        V1Accelerator response = api.acceleratorServiceCreate(body, idempotencyKey);

        // TODO: test validations
    }
    
    /**
     * DeleteAccelerator
     *
     * DeleteAccelerator deletes the given PacketAccelerator, specified by its id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acceleratorServiceDeleteTest() throws ApiException {
        String id = null;
        Object response = api.acceleratorServiceDelete(id);

        // TODO: test validations
    }
    
    /**
     * GetAccelerator
     *
     * GetAccelerator returns the details of a given PacketAccelerator, specified by its id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acceleratorServiceGetTest() throws ApiException {
        String id = null;
        V1Accelerator response = api.acceleratorServiceGet(id);

        // TODO: test validations
    }
    
    /**
     * ListAccelerators
     *
     * ListAccelerators returns a list of all existing PacketAccelerators.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acceleratorServiceListTest() throws ApiException {
        String before = null;
        Long limit = null;
        String q = null;
        V1ListAcceleratorsResponse response = api.acceleratorServiceList(before, limit, q);

        // TODO: test validations
    }
    
    /**
     * UpdateAccelerator
     *
     * UpdateAccelerator updates an existing accelerator, specified by its id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acceleratorServiceUpdateTest() throws ApiException {
        String id = null;
        Body1 body1 = null;
        Integer ifMatch = null;
        V1Accelerator response = api.acceleratorServiceUpdate(id, body1, ifMatch);

        // TODO: test validations
    }
    
}
