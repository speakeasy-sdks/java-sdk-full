/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateOfferBackendRequest {
    @JsonProperty("offer_details")
    public OfferDetails offerDetails;

    public CreateOfferBackendRequest withOfferDetails(OfferDetails offerDetails) {
        this.offerDetails = offerDetails;
        return this;
    }
    
    @JsonProperty("offer_meta")
    public OfferMeta offerMeta;

    public CreateOfferBackendRequest withOfferMeta(OfferMeta offerMeta) {
        this.offerMeta = offerMeta;
        return this;
    }
    
    @JsonProperty("offer_tnc")
    public OfferTnc offerTnc;

    public CreateOfferBackendRequest withOfferTnc(OfferTnc offerTnc) {
        this.offerTnc = offerTnc;
        return this;
    }
    
    @JsonProperty("offer_validations")
    public OfferValidations offerValidations;

    public CreateOfferBackendRequest withOfferValidations(OfferValidations offerValidations) {
        this.offerValidations = offerValidations;
        return this;
    }
    
    public CreateOfferBackendRequest(@JsonProperty("offer_details") OfferDetails offerDetails, @JsonProperty("offer_meta") OfferMeta offerMeta, @JsonProperty("offer_tnc") OfferTnc offerTnc, @JsonProperty("offer_validations") OfferValidations offerValidations) {
        this.offerDetails = offerDetails;
        this.offerMeta = offerMeta;
        this.offerTnc = offerTnc;
        this.offerValidations = offerValidations;
  }
}
