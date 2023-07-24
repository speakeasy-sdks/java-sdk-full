/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.operations;

import Cashfree.PG_Latest.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CancelPaymentLinkRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=link_id")
    public String linkId;

    public CancelPaymentLinkRequest withLinkId(String linkId) {
        this.linkId = linkId;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-api-version")
    public String xApiVersion;

    public CancelPaymentLinkRequest withXApiVersion(String xApiVersion) {
        this.xApiVersion = xApiVersion;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-client-id")
    public String xClientId;

    public CancelPaymentLinkRequest withXClientId(String xClientId) {
        this.xClientId = xClientId;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-client-secret")
    public String xClientSecret;

    public CancelPaymentLinkRequest withXClientSecret(String xClientSecret) {
        this.xClientSecret = xClientSecret;
        return this;
    }
    
    public CancelPaymentLinkRequest(@JsonProperty("link_id") String linkId, @JsonProperty("x-client-id") String xClientId, @JsonProperty("x-client-secret") String xClientSecret) {
        this.linkId = linkId;
        this.xClientId = xClientId;
        this.xClientSecret = xClientSecret;
  }
}
