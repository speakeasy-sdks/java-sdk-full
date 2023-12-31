/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Card {
    /**
     * Card alias as returned by Cashfree Vault API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("card_alias")
    public String cardAlias;

    public Card withCardAlias(String cardAlias) {
        this.cardAlias = cardAlias;
        return this;
    }
    
    /**
     * One of ["Kotak", "ICICI", "RBL", "BOB", "Standard Chartered"]. Card bank name, required for EMI payments. This is the bank user has selected for EMI
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("card_bank_name")
    public CardCardBankName cardBankName;

    public Card withCardBankName(CardCardBankName cardBankName) {
        this.cardBankName = cardBankName;
        return this;
    }
    
    /**
     * CVV mentioned on the card.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("card_cvv")
    public String cardCvv;

    public Card withCardCvv(String cardCvv) {
        this.cardCvv = cardCvv;
        return this;
    }
    
    /**
     * last 4 digits of original card number. Required only for tokenized card transactions.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("card_display")
    public String cardDisplay;

    public Card withCardDisplay(String cardDisplay) {
        this.cardDisplay = cardDisplay;
        return this;
    }
    
    /**
     * Card expiry month for plain card transactions. Token expiry month for tokenized card transactions.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("card_expiry_mm")
    public String cardExpiryMm;

    public Card withCardExpiryMm(String cardExpiryMm) {
        this.cardExpiryMm = cardExpiryMm;
        return this;
    }
    
    /**
     * Card expiry year for plain card transactions. Token expiry year for tokenized card transactions.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("card_expiry_yy")
    public String cardExpiryYy;

    public Card withCardExpiryYy(String cardExpiryYy) {
        this.cardExpiryYy = cardExpiryYy;
        return this;
    }
    
    /**
     * Customer name mentioned on the card.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("card_holder_name")
    public String cardHolderName;

    public Card withCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
        return this;
    }
    
    /**
     * Customer card number for plain card transactions. Token pan number for tokenized card transactions.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("card_number")
    public String cardNumber;

    public Card withCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }
    
    /**
     * The channel for card payments can be "link" or "post". Post is used for seamless OTP payments where merchant captures OTP on their own page.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channel")
    public CardChannel channel;

    public Card withChannel(CardChannel channel) {
        this.channel = channel;
        return this;
    }
    
    /**
     * cryptogram received from card network. Required only for tokenized card transactions.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cryptogram")
    public String cryptogram;

    public Card withCryptogram(String cryptogram) {
        this.cryptogram = cryptogram;
        return this;
    }
    
    /**
     * EMI tenure selected by the user
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("emi_tenure")
    public Long emiTenure;

    public Card withEmiTenure(Long emiTenure) {
        this.emiTenure = emiTenure;
        return this;
    }
    
    /**
     * instrument id of saved card. Required only to make payment using saved instrument.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("instrument_id")
    public String instrumentId;

    public Card withInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
        return this;
    }
    
    /**
     * TRID issued by card networks. Required only for tokenized card transactions.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("token_requestor_id")
    public String tokenRequestorId;

    public Card withTokenRequestorId(String tokenRequestorId) {
        this.tokenRequestorId = tokenRequestorId;
        return this;
    }
    
    public Card(){}
}
