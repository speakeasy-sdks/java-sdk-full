/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class NBOffer {
    @JsonProperty("bank_name")
    public String bankName;

    public NBOffer withBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    
    public NBOffer(@JsonProperty("bank_name") String bankName) {
        this.bankName = bankName;
  }
}
