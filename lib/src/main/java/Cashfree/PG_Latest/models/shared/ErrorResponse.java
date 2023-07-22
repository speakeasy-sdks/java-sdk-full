/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ErrorResponse - Any bad or invalid request will lead to following error object
 */

public class ErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public String code;

    public ErrorResponse withCode(String code) {
        this.code = code;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;

    public ErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    /**
     * One of ["invalid_request_error", "authentication_error", "rate_limit_error", "validation_error", "api_error"]
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public ErrorResponseType type;

    public ErrorResponse withType(ErrorResponseType type) {
        this.type = type;
        return this;
    }
    
    public ErrorResponse(){}
}