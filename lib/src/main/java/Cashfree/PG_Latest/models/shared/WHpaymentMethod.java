/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class WHpaymentMethod {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("card")
    public WHcard card;

    public WHpaymentMethod withCard(WHcard card) {
        this.card = card;
        return this;
    }
    
    public WHpaymentMethod(){}
}
