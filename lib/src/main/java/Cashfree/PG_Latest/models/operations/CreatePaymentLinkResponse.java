/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CreatePaymentLinkResponse {
    
    public String contentType;

    public CreatePaymentLinkResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public CreatePaymentLinkResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    /**
     * Payment Link created
     */
    
    public Cashfree.PG_Latest.models.shared.LinkResponse linkResponse;

    public CreatePaymentLinkResponse withLinkResponse(Cashfree.PG_Latest.models.shared.LinkResponse linkResponse) {
        this.linkResponse = linkResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public CreatePaymentLinkResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public CreatePaymentLinkResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public CreatePaymentLinkResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
