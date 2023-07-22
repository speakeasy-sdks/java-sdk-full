/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OfferNB {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("netbanking")
    public NBOffer netbanking;

    public OfferNB withNetbanking(NBOffer netbanking) {
        this.netbanking = netbanking;
        return this;
    }
    
    public OfferNB(){}
}
