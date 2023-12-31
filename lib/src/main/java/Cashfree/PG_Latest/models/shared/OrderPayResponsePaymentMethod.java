/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * OrderPayResponsePaymentMethod - One of ["upi", "netbanking", "card", "app", "cardless_emi", "paylater"] 
 */
public enum OrderPayResponsePaymentMethod {
    NETBANKING("netbanking"),
    CARD("card"),
    UPI("upi"),
    APP("app"),
    CARDLESS_EMI("cardless_emi"),
    PAYLATER("paylater");

    @JsonValue
    public final String value;

    private OrderPayResponsePaymentMethod(String value) {
        this.value = value;
    }
}
