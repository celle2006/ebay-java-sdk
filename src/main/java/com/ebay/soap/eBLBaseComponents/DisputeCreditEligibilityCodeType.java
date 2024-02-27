
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeCreditEligibilityCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisputeCreditEligibilityCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="InEligible"/>
 *     &lt;enumeration value="Eligible"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisputeCreditEligibilityCodeType")
@XmlEnum
public enum DisputeCreditEligibilityCodeType {


    /**
     * 
     * 						This value indicates that the seller is not currently eligible for a Final Value Fee credit towards the order line item under dispute.
     * 					
     * 
     */
    @XmlEnumValue("InEligible")
    IN_ELIGIBLE("InEligible"),

    /**
     * 
     * 						This value indicates that the seller is currently eligible for a Final Value Fee credit towards the order line item under dispute.
     * 					
     * 
     */
    @XmlEnumValue("Eligible")
    ELIGIBLE("Eligible"),

    /**
     * 
     * 							Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DisputeCreditEligibilityCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisputeCreditEligibilityCodeType fromValue(String v) {
        for (DisputeCreditEligibilityCodeType c: DisputeCreditEligibilityCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}