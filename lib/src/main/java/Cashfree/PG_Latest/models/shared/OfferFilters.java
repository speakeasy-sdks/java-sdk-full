/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OfferFilters {
    /**
     * Array of offer_type to be filtered.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("offer_type")
    public OfferType[] offerType;

    public OfferFilters withOfferType(OfferType[] offerType) {
        this.offerType = offerType;
        return this;
    }
    
    public OfferFilters(){}
}
