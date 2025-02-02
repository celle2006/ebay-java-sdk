
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodSearchCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodSearchCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PayPal"/>
 *     &lt;enumeration value="PaisaPay"/>
 *     &lt;enumeration value="PayPalOrPaisaPay"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="PaisaPayEscrowEMI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodSearchCodeType")
@XmlEnum
public enum PaymentMethodSearchCodeType {


    /**
     * 
     * 					 	This enumeration value indicates that the item may be purchased using PayPal as the payment method.
     * 				  
     * 
     */
    @XmlEnumValue("PayPal")
    PAY_PAL("PayPal"),

    /**
     * 
     * 					  PaisaPay is no longer a supported payment method, so this value is no longer applicable.
     * 					  
     * 					
     * 
     */
    @XmlEnumValue("PaisaPay")
    PAISA_PAY("PaisaPay"),

    /**
     * 
     * 					  PaisaPay is no longer a supported payment method, so this value is no longer applicable.
     * 					  
     * 					 
     * 
     */
    @XmlEnumValue("PayPalOrPaisaPay")
    PAY_PAL_OR_PAISA_PAY("PayPalOrPaisaPay"),

    /**
     * 
     * 						This enumeration value is reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 					  PaisaPay is no longer a supported payment method, so this value is no longer applicable.
     * 					  
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayEscrowEMI")
    PAISA_PAY_ESCROW_EMI("PaisaPayEscrowEMI");
    private final String value;

    PaymentMethodSearchCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodSearchCodeType fromValue(String v) {
        for (PaymentMethodSearchCodeType c: PaymentMethodSearchCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
