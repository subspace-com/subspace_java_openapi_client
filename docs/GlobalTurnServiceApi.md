# GlobalTurnServiceApi

All URIs are relative to *https://api.subspace.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**globalTurnServiceGetGlobalTurn**](GlobalTurnServiceApi.md#globalTurnServiceGetGlobalTurn) | **POST** /v1/globalturn | 


<a name="globalTurnServiceGetGlobalTurn"></a>
# **globalTurnServiceGetGlobalTurn**
> V1GlobalTurnResponse globalTurnServiceGetGlobalTurn()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GlobalTurnServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.subspace.com");
    
    // Configure OAuth2 access token for authorization: accessCode
    OAuth accessCode = (OAuth) defaultClient.getAuthentication("accessCode");
    accessCode.setAccessToken("YOUR ACCESS TOKEN");

    GlobalTurnServiceApi apiInstance = new GlobalTurnServiceApi(defaultClient);
    try {
      V1GlobalTurnResponse result = apiInstance.globalTurnServiceGetGlobalTurn();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GlobalTurnServiceApi#globalTurnServiceGetGlobalTurn");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**V1GlobalTurnResponse**](V1GlobalTurnResponse.md)

### Authorization

[accessCode](../README.md#accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**400** | Bad request |  -  |
**401** | Access token is missing or invalid |  -  |
**402** | Quota exceeded |  -  |
**403** | Not authorized |  -  |
**404** | Returned when the resource does not exist. |  -  |
**429** | Too many client requests |  -  |
**0** | An unexpected error response. |  -  |

