# WebRtcCdnServiceApi

All URIs are relative to *https://api.subspace.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webRtcCdnServiceGetWebRtcCdn**](WebRtcCdnServiceApi.md#webRtcCdnServiceGetWebRtcCdn) | **POST** /v1/webrtc-cdn | 


<a name="webRtcCdnServiceGetWebRtcCdn"></a>
# **webRtcCdnServiceGetWebRtcCdn**
> V1WebRtcCdnResponse webRtcCdnServiceGetWebRtcCdn()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WebRtcCdnServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.subspace.com");
    
    // Configure OAuth2 access token for authorization: accessCode
    OAuth accessCode = (OAuth) defaultClient.getAuthentication("accessCode");
    accessCode.setAccessToken("YOUR ACCESS TOKEN");

    WebRtcCdnServiceApi apiInstance = new WebRtcCdnServiceApi(defaultClient);
    try {
      V1WebRtcCdnResponse result = apiInstance.webRtcCdnServiceGetWebRtcCdn();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebRtcCdnServiceApi#webRtcCdnServiceGetWebRtcCdn");
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

[**V1WebRtcCdnResponse**](V1WebRtcCdnResponse.md)

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

