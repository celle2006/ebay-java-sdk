
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlatRateInsuranceRangeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlatRateInsuranceRangeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FlatRateInsuranceRange1"/>
 *     &lt;enumeration value="FlatRateInsuranceRange2"/>
 *     &lt;enumeration value="FlatRateInsuranceRange3"/>
 *     &lt;enumeration value="FlatRateInsuranceRange4"/>
 *     &lt;enumeration value="FlatRateInsuranceRange5"/>
 *     &lt;enumeration value="FlatRateInsuranceRange6"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlatRateInsuranceRangeCodeType")
@XmlEnum
public enum FlatRateInsuranceRangeCodeType {


    /**
     * 
     * 						Shipping insurance is no longer applicable or supported in eBay APIs.
     * 					
     * 
     */
    @XmlEnumValue("FlatRateInsuranceRange1")
    FLAT_RATE_INSURANCE_RANGE_1("FlatRateInsuranceRange1"),

    /**
     * 
     * 						Shipping insurance is no longer applicable or supported in eBay APIs.
     * 					
     * 
     */
    @XmlEnumValue("FlatRateInsuranceRange2")
    FLAT_RATE_INSURANCE_RANGE_2("FlatRateInsuranceRange2"),

    /**
     * 
     * 						Shipping insurance is no longer applicable or supported in eBay APIs.
     * 					
     * 
     */
    @XmlEnumValue("FlatRateInsuranceRange3")
    FLAT_RATE_INSURANCE_RANGE_3("FlatRateInsuranceRange3"),

    /**
     * 
     * 						Shipping insurance is no longer applicable or supported in eBay APIs.
     * 					
     * 
     */
    @XmlEnumValue("FlatRateInsuranceRange4")
    FLAT_RATE_INSURANCE_RANGE_4("FlatRateInsuranceRange4"),

    /**
     * 
     * 						Shipping insurance is no longer applicable or supported in eBay APIs.
     * 					
     * 
     */
    @XmlEnumValue("FlatRateInsuranceRange5")
    FLAT_RATE_INSURANCE_RANGE_5("FlatRateInsuranceRange5"),

    /**
     * 
     * 						Shipping insurance is no longer applicable or supported in eBay APIs.
     * 					
     * 
     */
    @XmlEnumValue("FlatRateInsuranceRange6")
    FLAT_RATE_INSURANCE_RANGE_6("FlatRateInsuranceRange6"),

    /**
     * 
     * 						 Shipping insurance is no longer applicable or supported in eBay APIs.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    FlatRateInsuranceRangeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlatRateInsuranceRangeCodeType fromValue(String v) {
        for (FlatRateInsuranceRangeCodeType c: FlatRateInsuranceRangeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
