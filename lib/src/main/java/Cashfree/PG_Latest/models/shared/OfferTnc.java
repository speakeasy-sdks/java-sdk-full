/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class OfferTnc {
    /**
     * TnC Type for the Offer. It can be either `text` or `link`
     */
    @JsonProperty("offer_tnc_type")
    public OfferTncOfferTncType offerTncType;

    public OfferTnc withOfferTncType(OfferTncOfferTncType offerTncType) {
        this.offerTncType = offerTncType;
        return this;
    }
    
    /**
     * TnC for the Offer.
     */
    @JsonProperty("offer_tnc_value")
    public String offerTncValue;

    public OfferTnc withOfferTncValue(String offerTncValue) {
        this.offerTncValue = offerTncValue;
        return this;
    }
    
    public OfferTnc(@JsonProperty("offer_tnc_type") OfferTncOfferTncType offerTncType, @JsonProperty("offer_tnc_value") String offerTncValue) {
        this.offerTncType = offerTncType;
        this.offerTncValue = offerTncValue;
  }
}