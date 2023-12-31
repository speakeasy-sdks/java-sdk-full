/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class EligibilityCardlessEMIResponse {
    
    public String contentType;

    public EligibilityCardlessEMIResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public Cashfree.PG_Latest.models.shared.EligibleCardlessEMIEntity[] eligibleCardlessEMIEntities;

    public EligibilityCardlessEMIResponse withEligibleCardlessEMIEntities(Cashfree.PG_Latest.models.shared.EligibleCardlessEMIEntity[] eligibleCardlessEMIEntities) {
        this.eligibleCardlessEMIEntities = eligibleCardlessEMIEntities;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public EligibilityCardlessEMIResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    
    public Integer statusCode;

    public EligibilityCardlessEMIResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public EligibilityCardlessEMIResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public EligibilityCardlessEMIResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
