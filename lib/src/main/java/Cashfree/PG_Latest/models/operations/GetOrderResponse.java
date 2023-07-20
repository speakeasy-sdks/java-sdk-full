/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetOrderResponse {
    
    public String contentType;

    public GetOrderResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Any bad or invalid request will lead to following error object
     */
    
    public Cashfree.PG_Latest.models.shared.ErrorResponse errorResponse;

    public GetOrderResponse withErrorResponse(Cashfree.PG_Latest.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public GetOrderResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    /**
     * OK
     */
    
    public Cashfree.PG_Latest.models.shared.OrdersEntity ordersEntity;

    public GetOrderResponse withOrdersEntity(Cashfree.PG_Latest.models.shared.OrdersEntity ordersEntity) {
        this.ordersEntity = ordersEntity;
        return this;
    }
    
    
    public Integer statusCode;

    public GetOrderResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetOrderResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetOrderResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
