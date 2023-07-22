/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UPIAuthorizeDetails {
    /**
     * Time by which this authorization should be approved by the customer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("approve_by")
    public String approveBy;

    public UPIAuthorizeDetails withApproveBy(String approveBy) {
        this.approveBy = approveBy;
        return this;
    }
    
    /**
     * This is the time when the UPI mandate will be over. If the mandate has not been executed by this time, the funds will be returned back to the customer after this time.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_time")
    public String endTime;

    public UPIAuthorizeDetails withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    
    /**
     * This is the time when the UPI one time mandate will start
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_time")
    public String startTime;

    public UPIAuthorizeDetails withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    
    public UPIAuthorizeDetails(){}
}