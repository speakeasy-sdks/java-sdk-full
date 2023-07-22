/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LinkNotifyEntity {
    /**
     * If "true", Cashfree will send email on customer_email
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("send_email")
    public Boolean sendEmail;

    public LinkNotifyEntity withSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }
    
    /**
     * If "true", Cashfree will send sms on customer_phone
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("send_sms")
    public Boolean sendSms;

    public LinkNotifyEntity withSendSms(Boolean sendSms) {
        this.sendSms = sendSms;
        return this;
    }
    
    public LinkNotifyEntity(){}
}