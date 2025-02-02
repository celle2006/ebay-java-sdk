
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeFilterTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeFilterTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AllInvolvedDisputes"/>
 *     &lt;enumeration value="DisputesAwaitingMyResponse"/>
 *     &lt;enumeration value="DisputesAwaitingOtherPartyResponse"/>
 *     &lt;enumeration value="AllInvolvedClosedDisputes"/>
 *     &lt;enumeration value="EligibleForCredit"/>
 *     &lt;enumeration value="UnpaidItemDisputes"/>
 *     &lt;enumeration value="ItemNotReceivedDisputes"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisputeFilterTypeCodeType")
@XmlEnum
public enum DisputeFilterTypeCodeType {


    /**
     * 
     * 						If used, this filter returns all open and closed Unpaid Item cases that involve the caller as a buyer
     * 						or seller. This is the default value if the <b>DisputeFilterType</b> field is not used in the  <b>GetUserDisputes</b> request.
     * 					
     * 
     */
    @XmlEnumValue("AllInvolvedDisputes")
    ALL_INVOLVED_DISPUTES("AllInvolvedDisputes"),

    /**
     * 
     * 						If used, this filter returns all open Unpaid Item cases that involve the caller as a buyer
     * 						or seller and are awaiting a response from the caller. This is the default <b>DisputeFilterType</b> value. In other words, if no <b>DisputeFilterType</b> field is used in the request, only those disputes where the caller's response is due are returned.
     * 					
     * 
     */
    @XmlEnumValue("DisputesAwaitingMyResponse")
    DISPUTES_AWAITING_MY_RESPONSE("DisputesAwaitingMyResponse"),

    /**
     * 
     * 						If used, this filter returns all open Unpaid Item cases that involve the caller as a buyer or seller and are awaiting a response from the other party.
     * 					
     * 
     */
    @XmlEnumValue("DisputesAwaitingOtherPartyResponse")
    DISPUTES_AWAITING_OTHER_PARTY_RESPONSE("DisputesAwaitingOtherPartyResponse"),

    /**
     * 
     * 						If used, this filter returns all closed Unpaid Item cases that involve the caller as a buyer
     * 						or seller.
     * 					
     * 
     */
    @XmlEnumValue("AllInvolvedClosedDisputes")
    ALL_INVOLVED_CLOSED_DISPUTES("AllInvolvedClosedDisputes"),

    /**
     * 
     * 						If used, this filter returns all Unpaid Item cases that involve the caller as a buyer
     * 						or seller and are eligible for a Final Value Fee credit, regardless of
     * 						whether or not the credit will/has been granted.
     * 					
     * 
     */
    @XmlEnumValue("EligibleForCredit")
    ELIGIBLE_FOR_CREDIT("EligibleForCredit"),

    /**
     * 
     * 						If used, this filter returns all open and closed Unpaid Item cases that
     * 						involve the caller as a buyer or seller.
     * 					
     * 
     */
    @XmlEnumValue("UnpaidItemDisputes")
    UNPAID_ITEM_DISPUTES("UnpaidItemDisputes"),

    /**
     * 
     * 						This enumeration value is deprecated, and should not longer be used since PayPal INR disputes no longer exist.
     * 					
     * 
     */
    @XmlEnumValue("ItemNotReceivedDisputes")
    ITEM_NOT_RECEIVED_DISPUTES("ItemNotReceivedDisputes"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeFilterTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeFilterTypeCodeType fromValue(String v) {
        for (DisputeFilterTypeCodeType c: DisputeFilterTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
