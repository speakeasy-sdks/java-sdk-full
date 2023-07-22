/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetallrefundsfororderResponse {
    
    public String contentType;

    public GetallrefundsfororderResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Any bad or invalid request will lead to following error object
     */
    
    public Cashfree.PG_Latest.models.shared.ErrorResponse errorResponse;

    public GetallrefundsfororderResponse withErrorResponse(Cashfree.PG_Latest.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public GetallrefundsfororderResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    /**
     * OK
     */
    
    public Cashfree.PG_Latest.models.shared.RefundsEntity[] refundsEntities;

    public GetallrefundsfororderResponse withRefundsEntities(Cashfree.PG_Latest.models.shared.RefundsEntity[] refundsEntities) {
        this.refundsEntities = refundsEntities;
        return this;
    }
    
    
    public Integer statusCode;

    public GetallrefundsfororderResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetallrefundsfororderResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetallrefundsfororderResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}