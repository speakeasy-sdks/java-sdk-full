/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class DiscountDetails {
    /**
     * Type of discount
     */
    @JsonProperty("discount_type")
    public DiscountDetailsDiscountType discountType;

    public DiscountDetails withDiscountType(DiscountDetailsDiscountType discountType) {
        this.discountType = discountType;
        return this;
    }
    
    /**
     * Value of Discount.
     */
    @JsonProperty("discount_value")
    public String discountValue;

    public DiscountDetails withDiscountValue(String discountValue) {
        this.discountValue = discountValue;
        return this;
    }
    
    /**
     * Maximum Value of Discount allowed.
     */
    @JsonProperty("max_discount_amount")
    public String maxDiscountAmount;

    public DiscountDetails withMaxDiscountAmount(String maxDiscountAmount) {
        this.maxDiscountAmount = maxDiscountAmount;
        return this;
    }
    
    public DiscountDetails(@JsonProperty("discount_type") DiscountDetailsDiscountType discountType, @JsonProperty("discount_value") String discountValue, @JsonProperty("max_discount_amount") String maxDiscountAmount) {
        this.discountType = discountType;
        this.discountValue = discountValue;
        this.maxDiscountAmount = maxDiscountAmount;
  }
}
