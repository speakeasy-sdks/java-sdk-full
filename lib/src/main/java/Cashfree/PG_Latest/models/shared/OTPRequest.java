/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class OTPRequest {
    /**
     * The action for this workflow. Could be either SUBMIT_OTP or RESEND_OTP
     */
    @JsonProperty("action")
    public OTPRequestAction action;

    public OTPRequest withAction(OTPRequestAction action) {
        this.action = action;
        return this;
    }
    
    /**
     * OTP to be submitted
     */
    @JsonProperty("otp")
    public String otp;

    public OTPRequest withOtp(String otp) {
        this.otp = otp;
        return this;
    }
    
    public OTPRequest(@JsonProperty("action") OTPRequestAction action, @JsonProperty("otp") String otp) {
        this.action = action;
        this.otp = otp;
  }
}
