/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class OfferMeta {
    /**
     * Unique identifier for the Offer.
     */
    @JsonProperty("offer_code")
    public String offerCode;

    public OfferMeta withOfferCode(String offerCode) {
        this.offerCode = offerCode;
        return this;
    }
    
    /**
     * Description for the Offer.
     */
    @JsonProperty("offer_description")
    public String offerDescription;

    public OfferMeta withOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
        return this;
    }
    
    /**
     * Expiry Time for the Offer
     */
    @JsonProperty("offer_end_time")
    public String offerEndTime;

    public OfferMeta withOfferEndTime(String offerEndTime) {
        this.offerEndTime = offerEndTime;
        return this;
    }
    
    /**
     * Start Time for the Offer
     */
    @JsonProperty("offer_start_time")
    public String offerStartTime;

    public OfferMeta withOfferStartTime(String offerStartTime) {
        this.offerStartTime = offerStartTime;
        return this;
    }
    
    /**
     * Title for the Offer.
     */
    @JsonProperty("offer_title")
    public String offerTitle;

    public OfferMeta withOfferTitle(String offerTitle) {
        this.offerTitle = offerTitle;
        return this;
    }
    
    public OfferMeta(@JsonProperty("offer_code") String offerCode, @JsonProperty("offer_description") String offerDescription, @JsonProperty("offer_end_time") String offerEndTime, @JsonProperty("offer_start_time") String offerStartTime, @JsonProperty("offer_title") String offerTitle) {
        this.offerCode = offerCode;
        this.offerDescription = offerDescription;
        this.offerEndTime = offerEndTime;
        this.offerStartTime = offerStartTime;
        this.offerTitle = offerTitle;
  }
}