# SipTeleportServiceApi

All URIs are relative to *https://api.subspace.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sipTeleportServiceCreate**](SipTeleportServiceApi.md#sipTeleportServiceCreate) | **POST** /v1/sip-teleports | CreateSipTeleport
[**sipTeleportServiceDelete**](SipTeleportServiceApi.md#sipTeleportServiceDelete) | **DELETE** /v1/sip-teleports/{id} | DeleteSipTeleport
[**sipTeleportServiceGet**](SipTeleportServiceApi.md#sipTeleportServiceGet) | **GET** /v1/sip-teleports/{id} | GetSipTeleport
[**sipTeleportServiceList**](SipTeleportServiceApi.md#sipTeleportServiceList) | **GET** /v1/sip-teleports | ListSipTeleports
[**sipTeleportServiceUpdate**](SipTeleportServiceApi.md#sipTeleportServiceUpdate) | **PUT** /v1/sip-teleports/{id} | UpdateSipTeleport


<a name="sipTeleportServiceCreate"></a>
# **sipTeleportServiceCreate**
> V1SipTeleportResponse sipTeleportServiceCreate()

CreateSipTeleport

CreateSipTeleport creates a new SIP Teleport

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
    try {
      V1SipTeleportResponse result = apiInstance.sipTeleportServiceCreate();
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
This endpoint does not need any parameter.

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
**401** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the resource does not exist. |  -  |
**0** | An unexpected error response. |  -  |

<a name="sipTeleportServiceDelete"></a>
# **sipTeleportServiceDelete**
> V1SipTeleportResponse sipTeleportServiceDelete(id)

DeleteSipTeleport

DeleteSipTeleport deletes an existing SIP Teleport, specified by its id

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
**401** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the resource does not exist. |  -  |
**0** | An unexpected error response. |  -  |

<a name="sipTeleportServiceGet"></a>
# **sipTeleportServiceGet**
> V1SipTeleportResponse sipTeleportServiceGet(id)

GetSipTeleport

GetSipTeleport fetches the details of a specific SIP Teleport, specified by its id

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
**200** | A successful response. |  -  |
**401** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the resource does not exist. |  -  |
**0** | An unexpected error response. |  -  |

<a name="sipTeleportServiceList"></a>
# **sipTeleportServiceList**
> V1ListSipTeleportResponse sipTeleportServiceList(before, limit)

ListSipTeleports

ListSipTeleports lists all SIP Teleports

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
**401** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the resource does not exist. |  -  |
**0** | An unexpected error response. |  -  |

<a name="sipTeleportServiceUpdate"></a>
# **sipTeleportServiceUpdate**
> V1SipTeleportResponse sipTeleportServiceUpdate(id)

UpdateSipTeleport

UpdateSipTeleport updates an existing SIP Teleport, specified by its id

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
      V1SipTeleportResponse result = apiInstance.sipTeleportServiceUpdate(id);
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
**401** | Returned when the user does not have permission to access the resource. |  -  |
**404** | Returned when the resource does not exist. |  -  |
**0** | An unexpected error response. |  -  |

