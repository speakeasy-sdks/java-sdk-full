/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class OfferUPI {
    @JsonProperty("upi")
    public UPIOffer upi;

    public OfferUPI withUpi(UPIOffer upi) {
        this.upi = upi;
        return this;
    }
    
    public OfferUPI(@JsonProperty("upi") UPIOffer upi) {
        this.upi = upi;
  }
}
