/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.operations;

import Cashfree.PG_Latest.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FetchSpecificSavedInstrumentRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=customer_id")
    public String customerId;

    public FetchSpecificSavedInstrumentRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=instrument_id")
    public String instrumentId;

    public FetchSpecificSavedInstrumentRequest withInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-api-version")
    public String xApiVersion;

    public FetchSpecificSavedInstrumentRequest withXApiVersion(String xApiVersion) {
        this.xApiVersion = xApiVersion;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-client-id")
    public String xClientId;

    public FetchSpecificSavedInstrumentRequest withXClientId(String xClientId) {
        this.xClientId = xClientId;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-client-secret")
    public String xClientSecret;

    public FetchSpecificSavedInstrumentRequest withXClientSecret(String xClientSecret) {
        this.xClientSecret = xClientSecret;
        return this;
    }
    
    public FetchSpecificSavedInstrumentRequest(@JsonProperty("customer_id") String customerId, @JsonProperty("instrument_id") String instrumentId, @JsonProperty("x-client-id") String xClientId, @JsonProperty("x-client-secret") String xClientSecret) {
        this.customerId = customerId;
        this.instrumentId = instrumentId;
        this.xClientId = xClientId;
        this.xClientSecret = xClientSecret;
  }
}
