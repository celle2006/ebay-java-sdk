
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueFormatCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueFormatCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="FullDate"/>
 *     &lt;enumeration value="PartialDate"/>
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValueFormatCodeType")
@XmlEnum
public enum ValueFormatCodeType {


    /**
     * 
     * 						This enumeration value indicates that a full date is used, including the month, day, and year in the following format:
     * 						'<em>YYYYMMDD</em>'
     * 					
     * 
     */
    @XmlEnumValue("FullDate")
    FULL_DATE("FullDate"),

    /**
     * 
     * 						This enumeration value indicates that a partial date is used, including the month and year in the following format: '<em>YYYYMM</em>'
     * 					
     * 
     */
    @XmlEnumValue("PartialDate")
    PARTIAL_DATE("PartialDate"),

    /**
     * 
     * 						This enumeration value indicates that only the year is returned in the following format: '<em>YYYY</em>'
     * 					
     * 
     */
    @XmlEnumValue("Year")
    YEAR("Year"),

    /**
     * 
     * 						Reserved for future or internal use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ValueFormatCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueFormatCodeType fromValue(String v) {
        for (ValueFormatCodeType c: ValueFormatCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
