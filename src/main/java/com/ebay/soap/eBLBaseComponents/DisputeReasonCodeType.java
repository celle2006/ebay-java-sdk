
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeReasonCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeReasonCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BuyerHasNotPaid"/>
 *     &lt;enumeration value="TransactionMutuallyCanceled"/>
 *     &lt;enumeration value="ItemNotReceived"/>
 *     &lt;enumeration value="SignificantlyNotAsDescribed"/>
 *     &lt;enumeration value="NoRefund"/>
 *     &lt;enumeration value="ReturnPolicyUnpaidItem"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisputeReasonCodeType")
@XmlEnum
public enum DisputeReasonCodeType {


    /**
     * 
     * 						The seller has opened an Unpaid Item case against the buyer because the buyer has not paid for
     * 						the order line item. A seller can open an <i>Unpaid Item</i> case as early as four days after
     * 						the buyer commits to purchasing the item. 
     * 					
     * 
     */
    @XmlEnumValue("BuyerHasNotPaid")
    BUYER_HAS_NOT_PAID("BuyerHasNotPaid"),

    /**
     * 
     * 						This value indicates that the seller cancelled an order after getting mutual consent from the buyer. This may be due to the buyer requesting that it be cancelled, or it could be that the seller ran out of stock on the item.
     * 					
     * 
     */
    @XmlEnumValue("TransactionMutuallyCanceled")
    TRANSACTION_MUTUALLY_CANCELED("TransactionMutuallyCanceled"),

    /**
     * 
     * 						This enumeration value is no longer applicable since the Dispute calls in Trading API no longer support INR disputes.
     * 					
     * 
     */
    @XmlEnumValue("ItemNotReceived")
    ITEM_NOT_RECEIVED("ItemNotReceived"),

    /**
     * 
     * 						This enumeration value is no longer applicable since the Dispute calls in Trading API no longer support SNAD disputes.
     * 					
     * 
     */
    @XmlEnumValue("SignificantlyNotAsDescribed")
    SIGNIFICANTLY_NOT_AS_DESCRIBED("SignificantlyNotAsDescribed"),

    /**
     * 
     * 						This enumeration value is no longer applicable since the Dispute calls in Trading API only support Unpaid Item cases, and there will be no refund involved.
     * 					
     * 
     */
    @XmlEnumValue("NoRefund")
    NO_REFUND("NoRefund"),

    /**
     * 
     * 						Item was returned and seller was not paid. This value cannot be used in
     * 						<b>AddDispute</b>.
     * 					
     * 
     */
    @XmlEnumValue("ReturnPolicyUnpaidItem")
    RETURN_POLICY_UNPAID_ITEM("ReturnPolicyUnpaidItem"),

    /**
     * 
     * 					Reserved for future or internal use.
     * 				
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeReasonCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeReasonCodeType fromValue(String v) {
        for (DisputeReasonCodeType c: DisputeReasonCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
