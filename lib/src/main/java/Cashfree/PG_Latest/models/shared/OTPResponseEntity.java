/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OTPResponseEntity - This is the response shared when merchant inovkes the OTP submit or resend API
 */

public class OTPResponseEntity {
    /**
     * The action that was invoked for this request.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("action")
    public OTPResponseEntityAction action;

    public OTPResponseEntity withAction(OTPResponseEntityAction action) {
        this.action = action;
        return this;
    }
    
    /**
     * Status of the is action. Will be either failed or successful. If the action is successful, you should still call the authorization status to verify the final payment status.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authenticate_status")
    public OTPResponseEntityAuthenticateStatus authenticateStatus;

    public OTPResponseEntity withAuthenticateStatus(OTPResponseEntityAuthenticateStatus authenticateStatus) {
        this.authenticateStatus = authenticateStatus;
        return this;
    }
    
    /**
     * The payment id for which this request was sent
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cf_payment_id")
    public Double cfPaymentId;

    public OTPResponseEntity withCfPaymentId(Double cfPaymentId) {
        this.cfPaymentId = cfPaymentId;
        return this;
    }
    
    /**
     * Human readable message which describes the status in more detail
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_message")
    public String paymentMessage;

    public OTPResponseEntity withPaymentMessage(String paymentMessage) {
        this.paymentMessage = paymentMessage;
        return this;
    }
    
    public OTPResponseEntity(){}
}
