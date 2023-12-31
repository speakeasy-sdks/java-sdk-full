/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class WalletOffer {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    public String provider;

    public WalletOffer withProvider(String provider) {
        this.provider = provider;
        return this;
    }
    
    public WalletOffer(){}
}
