/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.operations;

import Cashfree.PG_Latest.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateTerminalsRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public Cashfree.PG_Latest.models.shared.CreateTerminalRequest createTerminalRequest;

    public CreateTerminalsRequest withCreateTerminalRequest(Cashfree.PG_Latest.models.shared.CreateTerminalRequest createTerminalRequest) {
        this.createTerminalRequest = createTerminalRequest;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-api-version")
    public String xApiVersion;

    public CreateTerminalsRequest withXApiVersion(String xApiVersion) {
        this.xApiVersion = xApiVersion;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-client-id")
    public String xClientId;

    public CreateTerminalsRequest withXClientId(String xClientId) {
        this.xClientId = xClientId;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-client-secret")
    public String xClientSecret;

    public CreateTerminalsRequest withXClientSecret(String xClientSecret) {
        this.xClientSecret = xClientSecret;
        return this;
    }
    
    public CreateTerminalsRequest(@JsonProperty("x-client-id") String xClientId, @JsonProperty("x-client-secret") String xClientSecret) {
        this.xClientId = xClientId;
        this.xClientSecret = xClientSecret;
  }
}