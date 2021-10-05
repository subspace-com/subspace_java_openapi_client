/*
 * Subspace Product API
 * # Introduction  The Subspace API is based on REST, has resource-oriented URLs, returns JSON-encoded responses, and returns standard HTTP response codes.  The base URL for the API is:  `https://api.subspace.com/`  # Naming Convention  * Version name currently in use is: *v1*   * Example: `https://api.subspace.com/v1`  # Authentication  ## API Tokens  Subspace authenticates your API requests using JWT Bearer tokens. To use any Subspace API, you must pass a Bearer token with each request. If you do not include your Bearer token when making an API request, or use one that is incorrect or disabled, Subspace returns an error.  Bearer tokens are granted by requesting one (as noted below) and presenting your publishable (client_id) and secret (client_secret) tokens.     Subspace provides two types of API tokens: publishable (client_id) and secret (client_secret).  These are available in the Subspace console.   * **Publishable** API tokens (client_id) are meant solely to identify your account with Subspace, they aren’t secret. They can be published in places like your website JavaScript code, or in an iPhone or Android app.   * **Secret** API tokens (client_secret) should be kept confidential and only stored on your own servers. Your account’s secret API token will allow you to acquire a valid JWT token authorized to perform any API request to Subspace.  ## Getting a JWT Bearer Token  Subspace uses auth0 for JWT token management.  You can acquire a JWT token by utilizing `https://id.subspace.com` and following the instructions in the curl example below.  ## Protecting Your API Tokens    * **JWT tokens have a expiration time of 24 hours.**  Once expired, you will have to use your Subspace private API and public token to request a new one.   * The Subspace private token can be rotated from within the Subspace console.  Rotation may take up to 10 minutes for all systems to update state to invalidate the older token and enable the new one.   * **Keep your secret token safe.** Your secret token can make any API call on behalf of your account, including changes that may impact billing such as enabling pay-as-you-go charges. Do not store your secret token in your version control system. Do not use your secret token outside your web server, such as a browser, mobile app, or distributed file.   * **You may use the Subspace console to acquire an API token.**   * **You may use the Subspace console to disable pay-as-you-go.** This may prevent unexpected charges due to unauthorized or abnormal usage.   * **Do not embed API keys directly in code.** Instead of directly embedding API keys in your application’s code, put them in environment variables, or within include files that are stored separately from the bulk of your code—outside the source repository of your application. Then, if you share your code, the API keys will not be included in the shared files.   * **Do not store API tokens inside your application’s source control.** If you store API tokens in files, keep the files outside your application’s source control system. This is particularly important if you use a public source code management system such as GitHub.   * **Limit access with restricted tokens.** The Subspace console will allow you to specify the IP addresses or referrer URLs associated with each token, reducing the impact of a compromised API token.   * **Use independent API tokens for different apps.** This limits the scope of each token. If an API token is compromised, you can rotate the impacted token without impacting other API tokens.  # Error Codes  Subspace uses HTTP response codes to indicate the success or failure of an API request.   General HTML status codes:   * 2xx Success.    * 4xx Errors based on information provided in the request.   * 5xx Errors on Subspace servers.    # Security  We provide a valid, signed certificate for our API methods. Be sure your connection library supports HTTPS with the SNI extension.  # REST How-To  Making your first REST API call is easy and can be done from your browser.  You will need:   * Your **secret** token and public client token, both found in the Console.   * The URL for the type of data you would like to request.  First, acquire a JWT Bearer Token.  Command line example:          curl --request POST \\          --url \"https://id.subspace.com/oauth/token\" \\          --header 'content-type: application/json' \\          --data '{ \"client_id\": \"YOURCLIENTID\", \"client_secret\": \"YOURCLIENTSECRET\", \"audience\": \"https://api.subspace.com/\", \"grant_type\": \"client_credentials\" }'  REST calls are made up of:   * Base url: Example: `https://api.subspace.com`   * Version: Example: `v1`   * The API Endpoint and any parameters: `accelerator/acc_NDA3MUI5QzUtOTY4MC00Nz` where `acc_NDA3MUI5QzUtOTY4MC00Nz` is a valid accelerator ID   * Accelerator ids are always of the format `acc_NDA3MUI5QzUtOTY4MC00Nz`, with a \"acc_\" prefix followed by 22 characters.   * Project ids are always of the format `prj_00Iaqxjo71vNL1uLKKo5Kn`, with a \"prj_\" prefix followed by 22 characters.   * Token header: All REST requests require a valid JWT Bearer token which should be added as an “Authorization” header to the request:              `Authorization: Bearer YOUR_TOKEN_HERE`    ## Authorization header example  If your API token was “my_api_token”, you would add...      Authorization: Bearer my_api_token      ...to the header.  ## Command line examples  To list your current open packet_accelerators using the token “my_api_token”:      curl -H “Authorization: Bearer my_api_token” https://api.subspace.com/v1/accelerator      Alternately, to get the details of a specific accelerator whose id is 'abcd-ef01-2345':      curl -H “Authorization: Bearer my_api_token” https://api.subspace.com/v1/accelerator/abcd-ef01-2345  # API Versioning  Subspace will release new versions when we make backwards-incompatible changes to the API. We will give advance notice before releasing a new version or retiring an old version.  Backwards compatible changes:   * Adding new response attributes   * Adding new endpoints   * Adding new methods to an existing endpoint   * Adding new query string parameters   * Adding new path parameters   * Adding new webhook events   * Adding new streaming endpoints   * Changing the order of existing response attributes    Versions are added to the base url, for example:   * `https://api.subspace.com/v1`  Current Version is **v1:** `https://api.subspace.com/v1` 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sales@subspace.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Body;
import org.openapitools.client.model.Body1;
import org.openapitools.client.model.V1Accelerator;
import org.openapitools.client.model.V1ListAcceleratorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AcceleratorServiceApi {
    private ApiClient localVarApiClient;

    public AcceleratorServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AcceleratorServiceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for acceleratorServiceCreate
     * @param body Required parameters to create a new PacketAccelerator.  NOTE- only subspace_port is optional (required)
     * @param idempotencyKey Value is the returned etag of a get request.  If a retry sends an Idempotency-Key that has been seen before, the existing accelerator is returned with the status code of 200 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Accelerator created </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call acceleratorServiceCreateCall(Body body, String idempotencyKey, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/accelerator";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (idempotencyKey != null) {
            localVarHeaderParams.put("Idempotency-Key", localVarApiClient.parameterToString(idempotencyKey));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "accessCode" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call acceleratorServiceCreateValidateBeforeCall(Body body, String idempotencyKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling acceleratorServiceCreate(Async)");
        }
        

        okhttp3.Call localVarCall = acceleratorServiceCreateCall(body, idempotencyKey, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param body Required parameters to create a new PacketAccelerator.  NOTE- only subspace_port is optional (required)
     * @param idempotencyKey Value is the returned etag of a get request.  If a retry sends an Idempotency-Key that has been seen before, the existing accelerator is returned with the status code of 200 (optional)
     * @return V1Accelerator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Accelerator created </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public V1Accelerator acceleratorServiceCreate(Body body, String idempotencyKey) throws ApiException {
        ApiResponse<V1Accelerator> localVarResp = acceleratorServiceCreateWithHttpInfo(body, idempotencyKey);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param body Required parameters to create a new PacketAccelerator.  NOTE- only subspace_port is optional (required)
     * @param idempotencyKey Value is the returned etag of a get request.  If a retry sends an Idempotency-Key that has been seen before, the existing accelerator is returned with the status code of 200 (optional)
     * @return ApiResponse&lt;V1Accelerator&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Accelerator created </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1Accelerator> acceleratorServiceCreateWithHttpInfo(Body body, String idempotencyKey) throws ApiException {
        okhttp3.Call localVarCall = acceleratorServiceCreateValidateBeforeCall(body, idempotencyKey, null);
        Type localVarReturnType = new TypeToken<V1Accelerator>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param body Required parameters to create a new PacketAccelerator.  NOTE- only subspace_port is optional (required)
     * @param idempotencyKey Value is the returned etag of a get request.  If a retry sends an Idempotency-Key that has been seen before, the existing accelerator is returned with the status code of 200 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Accelerator created </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call acceleratorServiceCreateAsync(Body body, String idempotencyKey, final ApiCallback<V1Accelerator> _callback) throws ApiException {

        okhttp3.Call localVarCall = acceleratorServiceCreateValidateBeforeCall(body, idempotencyKey, _callback);
        Type localVarReturnType = new TypeToken<V1Accelerator>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for acceleratorServiceDelete
     * @param id  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call acceleratorServiceDeleteCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/accelerator/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "accessCode" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call acceleratorServiceDeleteValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling acceleratorServiceDelete(Async)");
        }
        

        okhttp3.Call localVarCall = acceleratorServiceDeleteCall(id, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param id  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public Object acceleratorServiceDelete(String id) throws ApiException {
        ApiResponse<Object> localVarResp = acceleratorServiceDeleteWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param id  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> acceleratorServiceDeleteWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = acceleratorServiceDeleteValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param id  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call acceleratorServiceDeleteAsync(String id, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = acceleratorServiceDeleteValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for acceleratorServiceGet
     * @param id  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  * ETag - Include in the headers of a subsequent PUT to avoid concurrency issues <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call acceleratorServiceGetCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/accelerator/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "accessCode" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call acceleratorServiceGetValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling acceleratorServiceGet(Async)");
        }
        

        okhttp3.Call localVarCall = acceleratorServiceGetCall(id, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param id  (required)
     * @return V1Accelerator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  * ETag - Include in the headers of a subsequent PUT to avoid concurrency issues <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public V1Accelerator acceleratorServiceGet(String id) throws ApiException {
        ApiResponse<V1Accelerator> localVarResp = acceleratorServiceGetWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param id  (required)
     * @return ApiResponse&lt;V1Accelerator&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  * ETag - Include in the headers of a subsequent PUT to avoid concurrency issues <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1Accelerator> acceleratorServiceGetWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = acceleratorServiceGetValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<V1Accelerator>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param id  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  * ETag - Include in the headers of a subsequent PUT to avoid concurrency issues <br>  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call acceleratorServiceGetAsync(String id, final ApiCallback<V1Accelerator> _callback) throws ApiException {

        okhttp3.Call localVarCall = acceleratorServiceGetValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<V1Accelerator>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for acceleratorServiceList
     * @param before  (optional)
     * @param limit  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call acceleratorServiceListCall(String before, Long limit, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/accelerator";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (before != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("before", before));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "accessCode" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call acceleratorServiceListValidateBeforeCall(String before, Long limit, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = acceleratorServiceListCall(before, limit, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param before  (optional)
     * @param limit  (optional)
     * @return V1ListAcceleratorResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public V1ListAcceleratorResponse acceleratorServiceList(String before, Long limit) throws ApiException {
        ApiResponse<V1ListAcceleratorResponse> localVarResp = acceleratorServiceListWithHttpInfo(before, limit);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param before  (optional)
     * @param limit  (optional)
     * @return ApiResponse&lt;V1ListAcceleratorResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1ListAcceleratorResponse> acceleratorServiceListWithHttpInfo(String before, Long limit) throws ApiException {
        okhttp3.Call localVarCall = acceleratorServiceListValidateBeforeCall(before, limit, null);
        Type localVarReturnType = new TypeToken<V1ListAcceleratorResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param before  (optional)
     * @param limit  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call acceleratorServiceListAsync(String before, Long limit, final ApiCallback<V1ListAcceleratorResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = acceleratorServiceListValidateBeforeCall(before, limit, _callback);
        Type localVarReturnType = new TypeToken<V1ListAcceleratorResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for acceleratorServiceUpdate
     * @param id  (required)
     * @param body1 Parameters to update an existing PacketAccelerator, minimum requirement of one of them defined to update (required)
     * @param ifMatch  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Edit conflict </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call acceleratorServiceUpdateCall(String id, Body1 body1, Integer ifMatch, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body1;

        // create path and map variables
        String localVarPath = "/v1/accelerator/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ifMatch != null) {
            localVarHeaderParams.put("If-Match", localVarApiClient.parameterToString(ifMatch));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "accessCode" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call acceleratorServiceUpdateValidateBeforeCall(String id, Body1 body1, Integer ifMatch, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling acceleratorServiceUpdate(Async)");
        }
        
        // verify the required parameter 'body1' is set
        if (body1 == null) {
            throw new ApiException("Missing the required parameter 'body1' when calling acceleratorServiceUpdate(Async)");
        }
        

        okhttp3.Call localVarCall = acceleratorServiceUpdateCall(id, body1, ifMatch, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param id  (required)
     * @param body1 Parameters to update an existing PacketAccelerator, minimum requirement of one of them defined to update (required)
     * @param ifMatch  (optional)
     * @return V1Accelerator
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Edit conflict </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public V1Accelerator acceleratorServiceUpdate(String id, Body1 body1, Integer ifMatch) throws ApiException {
        ApiResponse<V1Accelerator> localVarResp = acceleratorServiceUpdateWithHttpInfo(id, body1, ifMatch);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param id  (required)
     * @param body1 Parameters to update an existing PacketAccelerator, minimum requirement of one of them defined to update (required)
     * @param ifMatch  (optional)
     * @return ApiResponse&lt;V1Accelerator&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Edit conflict </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1Accelerator> acceleratorServiceUpdateWithHttpInfo(String id, Body1 body1, Integer ifMatch) throws ApiException {
        okhttp3.Call localVarCall = acceleratorServiceUpdateValidateBeforeCall(id, body1, ifMatch, null);
        Type localVarReturnType = new TypeToken<V1Accelerator>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param id  (required)
     * @param body1 Parameters to update an existing PacketAccelerator, minimum requirement of one of them defined to update (required)
     * @param ifMatch  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Access token is missing or invalid </td><td>  -  </td></tr>
        <tr><td> 402 </td><td> Quota exceeded </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not authorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned when the resource does not exist. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many client requests </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Edit conflict </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call acceleratorServiceUpdateAsync(String id, Body1 body1, Integer ifMatch, final ApiCallback<V1Accelerator> _callback) throws ApiException {

        okhttp3.Call localVarCall = acceleratorServiceUpdateValidateBeforeCall(id, body1, ifMatch, _callback);
        Type localVarReturnType = new TypeToken<V1Accelerator>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
