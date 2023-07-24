/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TerminalDetails - OK
 */

public class TerminalDetails {
    /**
     * The internal id that you use to map the terminal in your internal system
     */
    @JsonProperty("terminal_id")
    public String terminalId;

    public TerminalDetails withTerminalId(String terminalId) {
        this.terminalId = terminalId;
        return this;
    }
    
    /**
     * Phone no assigned to the terminal
     */
    @JsonProperty("terminal_phone_no")
    public String terminalPhoneNo;

    public TerminalDetails withTerminalPhoneNo(String terminalPhoneNo) {
        this.terminalPhoneNo = terminalPhoneNo;
        return this;
    }
    
    /**
     * To identify the type of terminal product in use, in this case it is SPOS
     */
    @JsonProperty("terminal_type")
    public String terminalType;

    public TerminalDetails withTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    
    public TerminalDetails(@JsonProperty("terminal_id") String terminalId, @JsonProperty("terminal_phone_no") String terminalPhoneNo, @JsonProperty("terminal_type") String terminalType) {
        this.terminalId = terminalId;
        this.terminalPhoneNo = terminalPhoneNo;
        this.terminalType = terminalType;
  }
}
