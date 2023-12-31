/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EMIPlansArray {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    public String currency;

    public EMIPlansArray withCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emi")
    public Long emi;

    public EMIPlansArray withEmi(Long emi) {
        this.emi = emi;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("interest_rate")
    public Long interestRate;

    public EMIPlansArray withInterestRate(Long interestRate) {
        this.interestRate = interestRate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tenure")
    public Long tenure;

    public EMIPlansArray withTenure(Long tenure) {
        this.tenure = tenure;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_amount")
    public Long totalAmount;

    public EMIPlansArray withTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_interest")
    public Long totalInterest;

    public EMIPlansArray withTotalInterest(Long totalInterest) {
        this.totalInterest = totalInterest;
        return this;
    }
    
    public EMIPlansArray(){}
}
