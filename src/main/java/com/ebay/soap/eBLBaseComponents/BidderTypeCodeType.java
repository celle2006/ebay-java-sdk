
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidderTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BidderTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AllBidder"/>
 *     &lt;enumeration value="HighBidder"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BidderTypeCodeType")
@XmlEnum
public enum BidderTypeCodeType {


    /**
     * 
     * 					  This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("AllBidder")
    ALL_BIDDER("AllBidder"),

    /**
     * 
     * 					  This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("HighBidder")
    HIGH_BIDDER("HighBidder"),

    /**
     * 
     * 					  This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    BidderTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidderTypeCodeType fromValue(String v) {
        for (BidderTypeCodeType c: BidderTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
