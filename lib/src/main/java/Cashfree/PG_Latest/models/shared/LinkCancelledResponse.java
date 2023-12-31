/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LinkCancelledResponse - Payment Link cancelled
 */

public class LinkCancelledResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cf_link_id")
    public Long cfLinkId;

    public LinkCancelledResponse withCfLinkId(Long cfLinkId) {
        this.cfLinkId = cfLinkId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_details")
    public LinkCustomerDetailsEntity customerDetails;

    public LinkCancelledResponse withCustomerDetails(LinkCustomerDetailsEntity customerDetails) {
        this.customerDetails = customerDetails;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_amount")
    public Double linkAmount;

    public LinkCancelledResponse withLinkAmount(Double linkAmount) {
        this.linkAmount = linkAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_amount_paid")
    public Double linkAmountPaid;

    public LinkCancelledResponse withLinkAmountPaid(Double linkAmountPaid) {
        this.linkAmountPaid = linkAmountPaid;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_auto_reminders")
    public Boolean linkAutoReminders;

    public LinkCancelledResponse withLinkAutoReminders(Boolean linkAutoReminders) {
        this.linkAutoReminders = linkAutoReminders;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_created_at")
    public String linkCreatedAt;

    public LinkCancelledResponse withLinkCreatedAt(String linkCreatedAt) {
        this.linkCreatedAt = linkCreatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_currency")
    public String linkCurrency;

    public LinkCancelledResponse withLinkCurrency(String linkCurrency) {
        this.linkCurrency = linkCurrency;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_expiry_time")
    public String linkExpiryTime;

    public LinkCancelledResponse withLinkExpiryTime(String linkExpiryTime) {
        this.linkExpiryTime = linkExpiryTime;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_id")
    public String linkId;

    public LinkCancelledResponse withLinkId(String linkId) {
        this.linkId = linkId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_meta")
    public LinkMetaEntity linkMeta;

    public LinkCancelledResponse withLinkMeta(LinkMetaEntity linkMeta) {
        this.linkMeta = linkMeta;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_minimum_partial_amount")
    public Double linkMinimumPartialAmount;

    public LinkCancelledResponse withLinkMinimumPartialAmount(Double linkMinimumPartialAmount) {
        this.linkMinimumPartialAmount = linkMinimumPartialAmount;
        return this;
    }
    
    /**
     * Key-value pair that can be used to store additional information about the entity. Maximum 5 key-value pairs
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_notes")
    public java.util.Map<String, String> linkNotes;

    public LinkCancelledResponse withLinkNotes(java.util.Map<String, String> linkNotes) {
        this.linkNotes = linkNotes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_notify")
    public LinkNotifyEntity linkNotify;

    public LinkCancelledResponse withLinkNotify(LinkNotifyEntity linkNotify) {
        this.linkNotify = linkNotify;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_partial_payments")
    public Boolean linkPartialPayments;

    public LinkCancelledResponse withLinkPartialPayments(Boolean linkPartialPayments) {
        this.linkPartialPayments = linkPartialPayments;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_purpose")
    public String linkPurpose;

    public LinkCancelledResponse withLinkPurpose(String linkPurpose) {
        this.linkPurpose = linkPurpose;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_status")
    public String linkStatus;

    public LinkCancelledResponse withLinkStatus(String linkStatus) {
        this.linkStatus = linkStatus;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("link_url")
    public String linkUrl;

    public LinkCancelledResponse withLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
        return this;
    }
    
    public LinkCancelledResponse(){}
}
