/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.operations;

import Cashfree.PG_Latest.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OTPRequestRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public Cashfree.PG_Latest.models.shared.OTPRequest otpRequest;

    public OTPRequestRequest withOTPRequest(Cashfree.PG_Latest.models.shared.OTPRequest otpRequest) {
        this.otpRequest = otpRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=payment_id")
    public String paymentId;

    public OTPRequestRequest withPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-api-version")
    public String xApiVersion;

    public OTPRequestRequest withXApiVersion(String xApiVersion) {
        this.xApiVersion = xApiVersion;
        return this;
    }
    
    public OTPRequestRequest(@JsonProperty("payment_id") String paymentId) {
        this.paymentId = paymentId;
  }
}
