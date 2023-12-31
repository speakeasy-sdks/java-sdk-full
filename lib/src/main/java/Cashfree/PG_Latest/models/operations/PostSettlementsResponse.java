/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PostSettlementsResponse {
    
    public String contentType;

    public PostSettlementsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Any bad or invalid request will lead to following error object
     */
    
    public Cashfree.PG_Latest.models.shared.ErrorResponse errorResponse;

    public PostSettlementsResponse withErrorResponse(Cashfree.PG_Latest.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public Cashfree.PG_Latest.models.shared.FetchSettlement fetchSettlement;

    public PostSettlementsResponse withFetchSettlement(Cashfree.PG_Latest.models.shared.FetchSettlement fetchSettlement) {
        this.fetchSettlement = fetchSettlement;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public PostSettlementsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    
    public Integer statusCode;

    public PostSettlementsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PostSettlementsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PostSettlementsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
