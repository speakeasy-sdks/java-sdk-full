/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FetchSettlement - OK
 */

public class FetchSettlement {
    /**
     * Specify a value from where you want to fetch the settlement details in the API call.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cursor")
    public String cursor;

    public FetchSettlement withCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public FetchSettlementData[] data;

    public FetchSettlement withData(FetchSettlementData[] data) {
        this.data = data;
        return this;
    }
    
    /**
     * Specify the number of settlements you want to fetch in the API call.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;

    public FetchSettlement withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    public FetchSettlement(){}
}
