/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CardlessEMI {
    /**
     * The channel for cardless EMI is always `link`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channel")
    public String channel;

    public CardlessEMI withChannel(String channel) {
        this.channel = channel;
        return this;
    }
    
    /**
     * EMI tenure for the selected provider. This is mandatory when provider is one of [`hdfc`, `icici`, `cashe`, `idfc`, `kotak`]
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emi_tenure")
    public Long emiTenure;

    public CardlessEMI withEmiTenure(Long emiTenure) {
        this.emiTenure = emiTenure;
        return this;
    }
    
    /**
     * Customers phone number for this payment instrument. If the customer is not eligible you will receive a 400 error with type as 'invalid_request_error' and code as 'invalid_request_error'
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    public String phone;

    public CardlessEMI withPhone(String phone) {
        this.phone = phone;
        return this;
    }
    
    /**
     * One of [`flexmoney`, `zestmoney`, `hdfc`, `icici`, `cashe`, `idfc`, `kotak`]
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    public CardlessEMIProvider provider;

    public CardlessEMI withProvider(CardlessEMIProvider provider) {
        this.provider = provider;
        return this;
    }
    
    public CardlessEMI(){}
}