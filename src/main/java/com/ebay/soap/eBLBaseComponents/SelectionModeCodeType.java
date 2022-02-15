
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectionModeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SelectionModeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Automatic"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Prefilled"/>
 *     &lt;enumeration value="SelectionOnly"/>
 *     &lt;enumeration value="FreeText"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SelectionModeCodeType")
@XmlEnum
public enum SelectionModeCodeType {


    /**
     * 
     * 						Automatic criteria. Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic"),

    /**
     * 
     * 						Manual criteria. Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("Manual")
    MANUAL("Manual"),

    /**
     * 
     * 						Indicates that the Item Specifics defined for an eBay catalog product will get pre-filled for a listing if the seller successfully matches their item to a product in eBay's catalog. To match an item to an eBay catalog product when adding or revising a listing, the seller provides either an <b>Add</b>/<b>Revise</b>/<b>Relist</b> eBay Product ID (ePID), or a Global Trade Identification Number such as a UPC, an EAN, anISBN), or a Brand/MPN pair.
     * 					
     * 
     */
    @XmlEnumValue("Prefilled")
    PREFILLED("Prefilled"),

    /**
     * 
     * 						If this value is returned, it is recommended that the seller only use one of the recommended values for the corresponding Item Specific. In other words, the seller should use the exact string provided in one of the corresponding <b>ValueRecommendation.Value</b> fields when creating, revising, or relisting an item and using that particular Item Specific.
     * 					
     * 
     */
    @XmlEnumValue("SelectionOnly")
    SELECTION_ONLY("SelectionOnly"),

    /**
     * 
     * 						Indicates that the seller is allowed to specify their own value(s) for the corresponding Item Specific when creating, revising, or relisting an item and using that particular Item Specific.
     * 					
     * 
     */
    @XmlEnumValue("FreeText")
    FREE_TEXT("FreeText"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SelectionModeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SelectionModeCodeType fromValue(String v) {
        for (SelectionModeCodeType c: SelectionModeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
