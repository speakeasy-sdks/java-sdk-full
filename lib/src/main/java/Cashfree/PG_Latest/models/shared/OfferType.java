/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OfferType {
    DISCOUNT("DISCOUNT"),
    CASHBACK("CASHBACK"),
    DISCOUNT_AND_CASHBACK("DISCOUNT_AND_CASHBACK"),
    NO_COST_EMI("NO_COST_EMI");

    @JsonValue
    public final String value;

    private OfferType(String value) {
        this.value = value;
    }
}
