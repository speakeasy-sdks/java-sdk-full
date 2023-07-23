/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CancelPaymentLinkResponse {
    
    public String contentType;

    public CancelPaymentLinkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public CancelPaymentLinkResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    /**
     * Cannot cancel Payment Link if status is not ACTIVE
     */
    
    public Cashfree.PG_Latest.models.shared.LinkCancelledError linkCancelledError;

    public CancelPaymentLinkResponse withLinkCancelledError(Cashfree.PG_Latest.models.shared.LinkCancelledError linkCancelledError) {
        this.linkCancelledError = linkCancelledError;
        return this;
    }
    
    /**
     * Payment Link cancelled
     */
    
    public Cashfree.PG_Latest.models.shared.LinkCancelledResponse linkCancelledResponse;

    public CancelPaymentLinkResponse withLinkCancelledResponse(Cashfree.PG_Latest.models.shared.LinkCancelledResponse linkCancelledResponse) {
        this.linkCancelledResponse = linkCancelledResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public CancelPaymentLinkResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public CancelPaymentLinkResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public CancelPaymentLinkResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
