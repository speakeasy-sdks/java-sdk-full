/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PaymentsEntity - OK
 */

public class PaymentsEntity {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_id")
    public String authId;

    public PaymentsEntity withAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    
    /**
     * The authorization details are present for payments which go through the preauthorization workflow. Or else this parameter will be null.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authorization")
    public AuthorizationInPaymentsEntity authorization;

    public PaymentsEntity withAuthorization(AuthorizationInPaymentsEntity authorization) {
        this.authorization = authorization;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bank_reference")
    public String bankReference;

    public PaymentsEntity withBankReference(String bankReference) {
        this.bankReference = bankReference;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cf_payment_id")
    public Long cfPaymentId;

    public PaymentsEntity withCfPaymentId(Long cfPaymentId) {
        this.cfPaymentId = cfPaymentId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity")
    public String entity;

    public PaymentsEntity withEntity(String entity) {
        this.entity = entity;
        return this;
    }
    
    /**
     * The error details are present only for failed payments
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error_details")
    public ErrorDetailsInPaymentsEntity errorDetails;

    public PaymentsEntity withErrorDetails(ErrorDetailsInPaymentsEntity errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_captured")
    public Boolean isCaptured;

    public PaymentsEntity withIsCaptured(Boolean isCaptured) {
        this.isCaptured = isCaptured;
        return this;
    }
    
    /**
     * Order amount can be different from payment amount if you collect service fee from the customer
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order_amount")
    public Double orderAmount;

    public PaymentsEntity withOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order_id")
    public String orderId;

    public PaymentsEntity withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_amount")
    public Double paymentAmount;

    public PaymentsEntity withPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }
    
    /**
     * This is the time when the payment reaches its terminal state
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_completion_time")
    public String paymentCompletionTime;

    public PaymentsEntity withPaymentCompletionTime(String paymentCompletionTime) {
        this.paymentCompletionTime = paymentCompletionTime;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_currency")
    public String paymentCurrency;

    public PaymentsEntity withPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
        return this;
    }
    
    /**
     * Type of payment group. One of ['upi', 'card', 'app', 'netbanking', 'paylater', 'cardless_emi']
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_group")
    public String paymentGroup;

    public PaymentsEntity withPaymentGroup(String paymentGroup) {
        this.paymentGroup = paymentGroup;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_message")
    public String paymentMessage;

    public PaymentsEntity withPaymentMessage(String paymentMessage) {
        this.paymentMessage = paymentMessage;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_method")
    public PaymentMethodInPaymentsEntity paymentMethod;

    public PaymentsEntity withPaymentMethod(PaymentMethodInPaymentsEntity paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }
    
    /**
     * The transaction status can be one of  ["SUCCESS", "NOT_ATTEMPTED", "FAILED", "USER_DROPPED", "VOID", "CANCELLED", "PENDING"]
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_status")
    public PaymentsEntityPaymentStatus paymentStatus;

    public PaymentsEntity withPaymentStatus(PaymentsEntityPaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }
    
    /**
     * This is the time when the payment was initiated
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_time")
    public String paymentTime;

    public PaymentsEntity withPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
        return this;
    }
    
    public PaymentsEntity(){}
}