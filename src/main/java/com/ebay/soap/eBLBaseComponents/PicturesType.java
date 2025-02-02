
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 			Defines variation-specific pictures associated with one
 * 			<b>VariationSpecificName</b> (e.g., Color) whose values differ across variations.
 * 			
 * 
 * <p>Java class for PicturesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PicturesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VariationSpecificName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VariationSpecificPictureSet" type="{urn:ebay:apis:eBLBaseComponents}VariationSpecificPictureSetType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PicturesType", propOrder = {
    "variationSpecificName",
    "variationSpecificPictureSet",
    "any"
})
public class PicturesType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "VariationSpecificName")
    protected String variationSpecificName;
    @XmlElement(name = "VariationSpecificPictureSet")
    protected List<VariationSpecificPictureSetType> variationSpecificPictureSet;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the variationSpecificName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariationSpecificName() {
        return variationSpecificName;
    }

    /**
     * Sets the value of the variationSpecificName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariationSpecificName(String value) {
        this.variationSpecificName = value;
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link VariationSpecificPictureSetType }
     *     
     */
    public VariationSpecificPictureSetType[] getVariationSpecificPictureSet() {
        if (this.variationSpecificPictureSet == null) {
            return new VariationSpecificPictureSetType[ 0 ] ;
        }
        return ((VariationSpecificPictureSetType[]) this.variationSpecificPictureSet.toArray(new VariationSpecificPictureSetType[this.variationSpecificPictureSet.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link VariationSpecificPictureSetType }
     *     
     */
    public VariationSpecificPictureSetType getVariationSpecificPictureSet(int idx) {
        if (this.variationSpecificPictureSet == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.variationSpecificPictureSet.get(idx);
    }

    public int getVariationSpecificPictureSetLength() {
        if (this.variationSpecificPictureSet == null) {
            return  0;
        }
        return this.variationSpecificPictureSet.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link VariationSpecificPictureSetType }
     *     
     */
    public void setVariationSpecificPictureSet(VariationSpecificPictureSetType[] values) {
        this._getVariationSpecificPictureSet().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.variationSpecificPictureSet.add(values[i]);
        }
    }

    protected List<VariationSpecificPictureSetType> _getVariationSpecificPictureSet() {
        if (variationSpecificPictureSet == null) {
            variationSpecificPictureSet = new ArrayList<VariationSpecificPictureSetType>();
        }
        return variationSpecificPictureSet;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link VariationSpecificPictureSetType }
     *     
     */
    public VariationSpecificPictureSetType setVariationSpecificPictureSet(int idx, VariationSpecificPictureSetType value) {
        return this.variationSpecificPictureSet.set(idx, value);
    }

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object[] getAny() {
        if (this.any == null) {
            return new Object[ 0 ] ;
        }
        return ((Object[]) this.any.toArray(new Object[this.any.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny(int idx) {
        if (this.any == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.any.get(idx);
    }

    public int getAnyLength() {
        if (this.any == null) {
            return  0;
        }
        return this.any.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object[] values) {
        this._getAny().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.any.add(values[i]);
        }
    }

    protected List<Object> _getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return any;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object setAny(int idx, Object value) {
        return this.any.set(idx, value);
    }

}
