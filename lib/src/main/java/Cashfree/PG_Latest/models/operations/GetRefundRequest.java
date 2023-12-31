/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.operations;

import Cashfree.PG_Latest.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetRefundRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=order_id")
    public String orderId;

    public GetRefundRequest withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    
    /**
     * Refund Id of the refund you want to fetch.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=refund_id")
    public String refundId;

    public GetRefundRequest withRefundId(String refundId) {
        this.refundId = refundId;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-api-version")
    public String xApiVersion;

    public GetRefundRequest withXApiVersion(String xApiVersion) {
        this.xApiVersion = xApiVersion;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-client-id")
    public String xClientId;

    public GetRefundRequest withXClientId(String xClientId) {
        this.xClientId = xClientId;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-client-secret")
    public String xClientSecret;

    public GetRefundRequest withXClientSecret(String xClientSecret) {
        this.xClientSecret = xClientSecret;
        return this;
    }
    
    public GetRefundRequest(@JsonProperty("order_id") String orderId, @JsonProperty("refund_id") String refundId, @JsonProperty("x-client-id") String xClientId, @JsonProperty("x-client-secret") String xClientSecret) {
        this.orderId = orderId;
        this.refundId = refundId;
        this.xClientId = xClientId;
        this.xClientSecret = xClientSecret;
  }
}
