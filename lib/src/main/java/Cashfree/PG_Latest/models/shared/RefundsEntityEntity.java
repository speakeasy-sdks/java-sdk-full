/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * RefundsEntityEntity - Type of object
 */
public enum RefundsEntityEntity {
    REFUND("refund");

    @JsonValue
    public final String value;

    private RefundsEntityEntity(String value) {
        this.value = value;
    }
}
