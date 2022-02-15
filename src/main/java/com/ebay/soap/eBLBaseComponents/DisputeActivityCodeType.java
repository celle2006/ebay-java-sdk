
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeActivityCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeActivityCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SellerAddInformation"/>
 *     &lt;enumeration value="SellerCompletedTransaction"/>
 *     &lt;enumeration value="CameToAgreementNeedFVFCredit"/>
 *     &lt;enumeration value="SellerEndCommunication"/>
 *     &lt;enumeration value="MutualAgreementOrNoBuyerResponse"/>
 *     &lt;enumeration value="SellerOffersRefund"/>
 *     &lt;enumeration value="SellerShippedItem"/>
 *     &lt;enumeration value="SellerComment"/>
 *     &lt;enumeration value="SellerPaymentNotReceived"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisputeActivityCodeType")
@XmlEnum
public enum DisputeActivityCodeType {


    /**
     * 
     * 						This value can be used if the seller wants to add information about the Unpaid Item case. If this enum value is used, the information that the seller wants to add to the case should be passed in as a text string into the corresponding <strong>MessageText</strong> field. 
     * 					
     * 
     */
    @XmlEnumValue("SellerAddInformation")
    SELLER_ADD_INFORMATION("SellerAddInformation"),

    /**
     * 
     * 						This value can be used if the buyer has paid for the item or the seller otherwise does not need to
     * 						pursue the Unpaid Item case any longer. 
     * 					
     * 
     */
    @XmlEnumValue("SellerCompletedTransaction")
    SELLER_COMPLETED_TRANSACTION("SellerCompletedTransaction"),

    /**
     * 
     * 						This value can be used if the seller has made an agreement with the buyer, and is requesting that eBay reimburse him/her for the variable portion of the Final Value Fee charged for the order line item.
     * 					
     * 
     */
    @XmlEnumValue("CameToAgreementNeedFVFCredit")
    CAME_TO_AGREEMENT_NEED_FVF_CREDIT("CameToAgreementNeedFVFCredit"),

    /**
     * 
     * 						This value can be used if the seller wants to end communication or stop waiting for the
     * 						buyer to pay. 
     * 					
     * 
     */
    @XmlEnumValue("SellerEndCommunication")
    SELLER_END_COMMUNICATION("SellerEndCommunication"),

    /**
     * 
     * 						This value can be used if the seller and buyer have agree to mutually cancel the order, or if the buyer has not responded to the Unpaid Item case after four days. 
     * 					
     * 
     */
    @XmlEnumValue("MutualAgreementOrNoBuyerResponse")
    MUTUAL_AGREEMENT_OR_NO_BUYER_RESPONSE("MutualAgreementOrNoBuyerResponse"),

    /**
     * 
     * 						This value is no longer applicable and should not be used, as it only pertains to <i>Item Not Received</i> and <i>Significantly Not As Described</i>
     * 						disputes initiated through PayPal, and those disputes are no longer supported by the <b>AddDisputeResponse</b>. 
     * 					
     * 
     */
    @XmlEnumValue("SellerOffersRefund")
    SELLER_OFFERS_REFUND("SellerOffersRefund"),

    /**
     * 
     * 						This value is no longer applicable and should not be used, as it only pertains to <i>Item Not Received</i> and <i>Significantly Not As Described</i>
     * 						disputes initiated through PayPal, and those disputes are no longer supported by the <b>AddDisputeResponse</b>. 
     * 					
     * 
     */
    @XmlEnumValue("SellerShippedItem")
    SELLER_SHIPPED_ITEM("SellerShippedItem"),

    /**
     * 
     * 						This value is no longer applicable and should not be used, as it only pertains to <i>Item Not Received</i> and <i>Significantly Not As Described</i>
     * 						disputes initiated through PayPal, and those disputes are no longer supported by the <b>AddDisputeResponse</b>. 
     * 					
     * 
     */
    @XmlEnumValue("SellerComment")
    SELLER_COMMENT("SellerComment"),

    /**
     * 
     * 						This value is no longer applicable and should not be used, as it only pertains to <i>Item Not Received</i> and <i>Significantly Not As Described</i>
     * 						disputes initiated through PayPal, and those disputes are no longer supported by the <b>AddDisputeResponse</b>. 
     * 					
     * 
     */
    @XmlEnumValue("SellerPaymentNotReceived")
    SELLER_PAYMENT_NOT_RECEIVED("SellerPaymentNotReceived"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeActivityCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeActivityCodeType fromValue(String v) {
        for (DisputeActivityCodeType c: DisputeActivityCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
