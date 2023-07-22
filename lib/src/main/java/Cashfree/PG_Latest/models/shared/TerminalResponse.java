/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TerminalResponse - Terminal created
 */

public class TerminalResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("added_on")
    public String addedOn;

    public TerminalResponse withAddedOn(String addedOn) {
        this.addedOn = addedOn;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cf_terminal_id")
    public String cfTerminalId;

    public TerminalResponse withCfTerminalId(String cfTerminalId) {
        this.cfTerminalId = cfTerminalId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_updated_on")
    public String lastUpdatedOn;

    public TerminalResponse withLastUpdatedOn(String lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("teminal_id")
    public String teminalId;

    public TerminalResponse withTeminalId(String teminalId) {
        this.teminalId = teminalId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terminal_area")
    public String terminalArea;

    public TerminalResponse withTerminalArea(String terminalArea) {
        this.terminalArea = terminalArea;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terminal_name")
    public String terminalName;

    public TerminalResponse withTerminalName(String terminalName) {
        this.terminalName = terminalName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terminal_note")
    public String terminalNote;

    public TerminalResponse withTerminalNote(String terminalNote) {
        this.terminalNote = terminalNote;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terminal_phone_no")
    public String terminalPhoneNo;

    public TerminalResponse withTerminalPhoneNo(String terminalPhoneNo) {
        this.terminalPhoneNo = terminalPhoneNo;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terminal_status")
    public String terminalStatus;

    public TerminalResponse withTerminalStatus(String terminalStatus) {
        this.terminalStatus = terminalStatus;
        return this;
    }
    
    public TerminalResponse(){}
}