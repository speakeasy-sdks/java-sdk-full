/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * FetchAllSavedInstrumentsInstrumentType - type to instrument to query
 */
public enum FetchAllSavedInstrumentsInstrumentType {
    CARD("card");

    @JsonValue
    public final String value;

    private FetchAllSavedInstrumentsInstrumentType(String value) {
        this.value = value;
    }
}
