/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PaymentMethodNetBankingInPaymentsEntity {
    @JsonProperty("channel")
    public String channel;

    public PaymentMethodNetBankingInPaymentsEntity withChannel(String channel) {
        this.channel = channel;
        return this;
    }
    
    @JsonProperty("netbanking_bank_code")
    public String netbankingBankCode;

    public PaymentMethodNetBankingInPaymentsEntity withNetbankingBankCode(String netbankingBankCode) {
        this.netbankingBankCode = netbankingBankCode;
        return this;
    }
    
    @JsonProperty("netbanking_bank_name")
    public String netbankingBankName;

    public PaymentMethodNetBankingInPaymentsEntity withNetbankingBankName(String netbankingBankName) {
        this.netbankingBankName = netbankingBankName;
        return this;
    }
    
    public PaymentMethodNetBankingInPaymentsEntity(@JsonProperty("channel") String channel, @JsonProperty("netbanking_bank_code") String netbankingBankCode, @JsonProperty("netbanking_bank_name") String netbankingBankName) {
        this.channel = channel;
        this.netbankingBankCode = netbankingBankCode;
        this.netbankingBankName = netbankingBankName;
  }
}