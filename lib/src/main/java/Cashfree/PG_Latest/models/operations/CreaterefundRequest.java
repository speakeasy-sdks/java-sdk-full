/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.operations;

import Cashfree.PG_Latest.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreaterefundRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public Cashfree.PG_Latest.models.shared.CreateRefundRequest createRefundRequest;

    public CreaterefundRequest withCreateRefundRequest(Cashfree.PG_Latest.models.shared.CreateRefundRequest createRefundRequest) {
        this.createRefundRequest = createRefundRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=order_id")
    public String orderId;

    public CreaterefundRequest withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-api-version")
    public String xApiVersion;

    public CreaterefundRequest withXApiVersion(String xApiVersion) {
        this.xApiVersion = xApiVersion;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-client-id")
    public String xClientId;

    public CreaterefundRequest withXClientId(String xClientId) {
        this.xClientId = xClientId;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-client-secret")
    public String xClientSecret;

    public CreaterefundRequest withXClientSecret(String xClientSecret) {
        this.xClientSecret = xClientSecret;
        return this;
    }
    
    public CreaterefundRequest(@JsonProperty("order_id") String orderId, @JsonProperty("x-client-id") String xClientId, @JsonProperty("x-client-secret") String xClientSecret) {
        this.orderId = orderId;
        this.xClientId = xClientId;
        this.xClientSecret = xClientSecret;
  }
}
