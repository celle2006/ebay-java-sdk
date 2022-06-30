
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
 * 				This type is used by the <b>ExtendedProducerResponsibility</b> container, which provides IDs for the producer or importer related to the new item, packaging, added documentation, or an eco-participation fee. In some markets, such as in France, this may be the importer of the item. This field is supported by a limited number of sites and specific categories. Use the <a href="../../../../../api-docs/sell/metadata/resources/marketplace/methods/getExtendedProducerResponsibilityPolicies" target="_blank">getExtendedProducerResponsibilityPolicies</a> method of the <b>Sell Metadata API</b> to retrieve valid categories for a site. 
 * 			
 * 
 * <p>Java class for ExtendedProducerResponsibilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedProducerResponsibilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProducerProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductPackageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentPackageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductDocumentationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EcoParticipationFee" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
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
@XmlType(name = "ExtendedProducerResponsibilityType", propOrder = {
    "producerProductID",
    "productPackageID",
    "shipmentPackageID",
    "productDocumentationID",
    "ecoParticipationFee",
    "any"
})
public class ExtendedProducerResponsibilityType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "ProducerProductID")
    protected String producerProductID;
    @XmlElement(name = "ProductPackageID")
    protected String productPackageID;
    @XmlElement(name = "ShipmentPackageID")
    protected String shipmentPackageID;
    @XmlElement(name = "ProductDocumentationID")
    protected String productDocumentationID;
    @XmlElement(name = "EcoParticipationFee")
    protected AmountType ecoParticipationFee;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the producerProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerProductID() {
        return producerProductID;
    }

    /**
     * Sets the value of the producerProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerProductID(String value) {
        this.producerProductID = value;
    }

    /**
     * Gets the value of the productPackageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductPackageID() {
        return productPackageID;
    }

    /**
     * Sets the value of the productPackageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductPackageID(String value) {
        this.productPackageID = value;
    }

    /**
     * Gets the value of the shipmentPackageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentPackageID() {
        return shipmentPackageID;
    }

    /**
     * Sets the value of the shipmentPackageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentPackageID(String value) {
        this.shipmentPackageID = value;
    }

    /**
     * Gets the value of the productDocumentationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDocumentationID() {
        return productDocumentationID;
    }

    /**
     * Sets the value of the productDocumentationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDocumentationID(String value) {
        this.productDocumentationID = value;
    }

    /**
     * Gets the value of the ecoParticipationFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEcoParticipationFee() {
        return ecoParticipationFee;
    }

    /**
     * Sets the value of the ecoParticipationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEcoParticipationFee(AmountType value) {
        this.ecoParticipationFee = value;
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
