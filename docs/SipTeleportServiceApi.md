# SipTeleportServiceApi

All URIs are relative to *https://api.subspace.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sipTeleportServiceCreate**](SipTeleportServiceApi.md#sipTeleportServiceCreate) | **POST** /v1/sip-teleports | 
[**sipTeleportServiceDelete**](SipTeleportServiceApi.md#sipTeleportServiceDelete) | **DELETE** /v1/sip-teleports/{id} | 
[**sipTeleportServiceGet**](SipTeleportServiceApi.md#sipTeleportServiceGet) | **GET** /v1/sip-teleports/{id} | 
[**sipTeleportServiceList**](SipTeleportServiceApi.md#sipTeleportServiceList) | **GET** /v1/sip-teleports | 
[**sipTeleportServiceUpdate**](SipTeleportServiceApi.md#sipTeleportServiceUpdate) | **PUT** /v1/sip-teleports/{id} | 


<a name="sipTeleportServiceCreate"></a>
# **sipTeleportServiceCreate**
> V1SipTeleportResponse sipTeleportServiceCreate(v1CreateSipTeleport, idempotencyKey)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SipTeleportServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.subspace.com");
    
    // Configure OAuth2 access token for authorization: accessCode
    OAuth accessCode = (OAuth) defaultClient.getAuthentication("accessCode");
    accessCode.setAccessToken("YOUR ACCESS TOKEN");

    SipTeleportServiceApi apiInstance = new SipTeleportServiceApi(defaultClient);
    V1CreateSipTeleport v1CreateSipTeleport = new V1CreateSipTeleport(); // V1CreateSipTeleport | Required parameters to create a new SIPTeleport
    String idempotencyKey = "idempotencyKey_example"; // String | Value is the returned etag of a get request.  If a retry sends an Idempotency-Key that has been seen before, the existing teleport is returned with the status code of 200
    try {
      V1SipTeleportResponse result = apiInstance.sipTeleportServiceCreate(v1CreateSipTeleport, idempotencyKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SipTeleportServiceApi#sipTeleportServiceCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **v1CreateSipTeleport** | [**V1CreateSipTeleport**](V1CreateSipTeleport.md)| Required parameters to create a new SIPTeleport |
 **idempotencyKey** | **String**| Value is the returned etag of a get request.  If a retry sends an Idempotency-Key that has been seen before, the existing teleport is returned with the status code of 200 | [optional]

### Return type

[**V1SipTeleportResponse**](V1SipTeleportResponse.md)

### Authorization

[accessCode](../README.md#accessCode)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="sipTeleportServiceDelete"></a>
# **sipTeleportServiceDelete**
> V1SipTeleportResponse sipTeleportServiceDelete(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SipTeleportServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.subspace.com");
    
    // Configure OAuth2 access token for authorization: accessCode
    OAuth accessCode = (OAuth) defaultClient.getAuthentication("accessCode");
    accessCode.setAccessToken("YOUR ACCESS TOKEN");

    SipTeleportServiceApi apiInstance = new SipTeleportServiceApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      V1SipTeleportResponse result = apiInstance.sipTeleportServiceDelete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SipTeleportServiceApi#sipTeleportServiceDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**V1SipTeleportResponse**](V1SipTeleportResponse.md)

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

<a name="sipTeleportServiceGet"></a>
# **sipTeleportServiceGet**
> V1SipTeleportResponse sipTeleportServiceGet(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SipTeleportServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.subspace.com");
    
    // Configure OAuth2 access token for authorization: accessCode
    OAuth accessCode = (OAuth) defaultClient.getAuthentication("accessCode");
    accessCode.setAccessToken("YOUR ACCESS TOKEN");

    SipTeleportServiceApi apiInstance = new SipTeleportServiceApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      V1SipTeleportResponse result = apiInstance.sipTeleportServiceGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SipTeleportServiceApi#sipTeleportServiceGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**V1SipTeleportResponse**](V1SipTeleportResponse.md)

### Authorization

[accessCode](../README.md#accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  * ETag - Include in the headers of a subsequent PUT to avoid concurrency issues <br>  |
**400** | Bad request |  -  |
**401** | Access token is missing or invalid |  -  |
**402** | Quota exceeded |  -  |
**403** | Not authorized |  -  |
**404** | Returned when the resource does not exist. |  -  |
**429** | Too many client requests |  -  |
**0** | An unexpected error response. |  -  |

<a name="sipTeleportServiceList"></a>
# **sipTeleportServiceList**
> V1ListSipTeleportResponse sipTeleportServiceList(before, limit)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SipTeleportServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.subspace.com");
    
    // Configure OAuth2 access token for authorization: accessCode
    OAuth accessCode = (OAuth) defaultClient.getAuthentication("accessCode");
    accessCode.setAccessToken("YOUR ACCESS TOKEN");

    SipTeleportServiceApi apiInstance = new SipTeleportServiceApi(defaultClient);
    String before = "before_example"; // String | 
    Long limit = 56L; // Long | 
    try {
      V1ListSipTeleportResponse result = apiInstance.sipTeleportServiceList(before, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SipTeleportServiceApi#sipTeleportServiceList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **before** | **String**|  | [optional]
 **limit** | **Long**|  | [optional]

### Return type

[**V1ListSipTeleportResponse**](V1ListSipTeleportResponse.md)

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

<a name="sipTeleportServiceUpdate"></a>
# **sipTeleportServiceUpdate**
> V1SipTeleportResponse sipTeleportServiceUpdate(id, v1UpdateSipTeleport)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SipTeleportServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.subspace.com");
    
    // Configure OAuth2 access token for authorization: accessCode
    OAuth accessCode = (OAuth) defaultClient.getAuthentication("accessCode");
    accessCode.setAccessToken("YOUR ACCESS TOKEN");

    SipTeleportServiceApi apiInstance = new SipTeleportServiceApi(defaultClient);
    String id = "id_example"; // String | 
    V1UpdateSipTeleport v1UpdateSipTeleport = new V1UpdateSipTeleport(); // V1UpdateSipTeleport | Parameters to update an existing SIPTeleport, minimum requirement of one of them defined to update
    try {
      V1SipTeleportResponse result = apiInstance.sipTeleportServiceUpdate(id, v1UpdateSipTeleport);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SipTeleportServiceApi#sipTeleportServiceUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **v1UpdateSipTeleport** | [**V1UpdateSipTeleport**](V1UpdateSipTeleport.md)| Parameters to update an existing SIPTeleport, minimum requirement of one of them defined to update |

### Return type

[**V1SipTeleportResponse**](V1SipTeleportResponse.md)

### Authorization

[accessCode](../README.md#accessCode)

### HTTP request headers

 - **Content-Type**: application/json
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

