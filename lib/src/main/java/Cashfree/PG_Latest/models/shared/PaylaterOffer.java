/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PaylaterOffer {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    public String provider;

    public PaylaterOffer withProvider(String provider) {
        this.provider = provider;
        return this;
    }
    
    public PaylaterOffer(){}
}
