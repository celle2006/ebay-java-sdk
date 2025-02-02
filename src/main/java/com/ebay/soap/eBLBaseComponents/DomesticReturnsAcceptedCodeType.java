
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
 * 				This type defines the available options the seller has for accepting domestic returns.
 * 			
 * 
 * <p>Java class for DomesticReturnsAcceptedCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomesticReturnsAcceptedCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DomesticReturnsAccepted" type="{urn:ebay:apis:eBLBaseComponents}ReturnsAcceptedCodeType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "DomesticReturnsAcceptedCodeType", propOrder = {
    "domesticReturnsAccepted",
    "any"
})
public class DomesticReturnsAcceptedCodeType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DomesticReturnsAccepted")
    protected List<ReturnsAcceptedCodeType> domesticReturnsAccepted;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * 
     * 
     * @return
     *     array of
     *     {@link ReturnsAcceptedCodeType }
     *     
     */
    public ReturnsAcceptedCodeType[] getDomesticReturnsAccepted() {
        if (this.domesticReturnsAccepted == null) {
            return new ReturnsAcceptedCodeType[ 0 ] ;
        }
        return ((ReturnsAcceptedCodeType[]) this.domesticReturnsAccepted.toArray(new ReturnsAcceptedCodeType[this.domesticReturnsAccepted.size()] ));
    }

    /**
     * 
     * 
     * @return
     *     one of
     *     {@link ReturnsAcceptedCodeType }
     *     
     */
    public ReturnsAcceptedCodeType getDomesticReturnsAccepted(int idx) {
        if (this.domesticReturnsAccepted == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.domesticReturnsAccepted.get(idx);
    }

    public int getDomesticReturnsAcceptedLength() {
        if (this.domesticReturnsAccepted == null) {
            return  0;
        }
        return this.domesticReturnsAccepted.size();
    }

    /**
     * 
     * 
     * @param values
     *     allowed objects are
     *     {@link ReturnsAcceptedCodeType }
     *     
     */
    public void setDomesticReturnsAccepted(ReturnsAcceptedCodeType[] values) {
        this._getDomesticReturnsAccepted().clear();
        int len = values.length;
        for (int i = 0; (i<len); i ++) {
            this.domesticReturnsAccepted.add(values[i]);
        }
    }

    protected List<ReturnsAcceptedCodeType> _getDomesticReturnsAccepted() {
        if (domesticReturnsAccepted == null) {
            domesticReturnsAccepted = new ArrayList<ReturnsAcceptedCodeType>();
        }
        return domesticReturnsAccepted;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnsAcceptedCodeType }
     *     
     */
    public ReturnsAcceptedCodeType setDomesticReturnsAccepted(int idx, ReturnsAcceptedCodeType value) {
        return this.domesticReturnsAccepted.set(idx, value);
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
