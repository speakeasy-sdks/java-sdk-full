/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class PostSettlementReconResponse {
    
    public String contentType;

    public PostSettlementReconResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Any bad or invalid request will lead to following error object
     */
    
    public Cashfree.PG_Latest.models.shared.ErrorResponse errorResponse;

    public PostSettlementReconResponse withErrorResponse(Cashfree.PG_Latest.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public Cashfree.PG_Latest.models.shared.FetchSettlementRecon fetchSettlementRecon;

    public PostSettlementReconResponse withFetchSettlementRecon(Cashfree.PG_Latest.models.shared.FetchSettlementRecon fetchSettlementRecon) {
        this.fetchSettlementRecon = fetchSettlementRecon;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public PostSettlementReconResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    
    public Integer statusCode;

    public PostSettlementReconResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PostSettlementReconResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PostSettlementReconResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
