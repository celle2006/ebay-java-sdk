
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				The base request type for the <b>GetUserDisputes</b> call. This call is used to retrieve a list of Unpaid Item cases that the user is involved in as a buyer or seller.
 * 				<br/><br/>
 * 				<span class="tablenote"><strong>Note:</strong>
 * 					The <b>GetUserDisputes</b> call now only retrieves Unpaid Item cases, and is no longer used to retrieve Item not Received (INR) disputes created through PayPal, since this is no longer an option for eBay buyers. eBay buyers must create an INR case through eBay's Resolution Center, and this call also does not support eBay Money Back Guarantee cases.
 * 					<br><br>
 * 					To respond to an eBay Money Back Guarantee case, the seller should use the <a href="https://developer.ebay.com/Devzone/post-order/index.html" target="_blank">Case Management calls</a> of the <b>Post-Order API</b> or manage/respond to cases manually through the eBay Resolution Center.
 * 				</span>
 * 			
 * 
 * <p>Java class for GetUserDisputesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUserDisputesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="DisputeFilterType" type="{urn:ebay:apis:eBLBaseComponents}DisputeFilterTypeCodeType" minOccurs="0"/>
 *         &lt;element name="DisputeSortType" type="{urn:ebay:apis:eBLBaseComponents}DisputeSortTypeCodeType" minOccurs="0"/>
 *         &lt;element name="ModTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ModTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{urn:ebay:apis:eBLBaseComponents}PaginationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserDisputesRequestType", propOrder = {
    "disputeFilterType",
    "disputeSortType",
    "modTimeFrom",
    "modTimeTo",
    "pagination"
})
public class GetUserDisputesRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DisputeFilterType")
    protected DisputeFilterTypeCodeType disputeFilterType;
    @XmlElement(name = "DisputeSortType")
    protected DisputeSortTypeCodeType disputeSortType;
    @XmlElement(name = "ModTimeFrom", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar modTimeFrom;
    @XmlElement(name = "ModTimeTo", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar modTimeTo;
    @XmlElement(name = "Pagination")
    protected PaginationType pagination;

    /**
     * Gets the value of the disputeFilterType property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeFilterTypeCodeType }
     *     
     */
    public DisputeFilterTypeCodeType getDisputeFilterType() {
        return disputeFilterType;
    }

    /**
     * Sets the value of the disputeFilterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeFilterTypeCodeType }
     *     
     */
    public void setDisputeFilterType(DisputeFilterTypeCodeType value) {
        this.disputeFilterType = value;
    }

    /**
     * Gets the value of the disputeSortType property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeSortTypeCodeType }
     *     
     */
    public DisputeSortTypeCodeType getDisputeSortType() {
        return disputeSortType;
    }

    /**
     * Sets the value of the disputeSortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeSortTypeCodeType }
     *     
     */
    public void setDisputeSortType(DisputeSortTypeCodeType value) {
        this.disputeSortType = value;
    }

    /**
     * Gets the value of the modTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getModTimeFrom() {
        return modTimeFrom;
    }

    /**
     * Sets the value of the modTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModTimeFrom(Calendar value) {
        this.modTimeFrom = value;
    }

    /**
     * Gets the value of the modTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getModTimeTo() {
        return modTimeTo;
    }

    /**
     * Sets the value of the modTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModTimeTo(Calendar value) {
        this.modTimeTo = value;
    }

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationType }
     *     
     */
    public PaginationType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationType }
     *     
     */
    public void setPagination(PaginationType value) {
        this.pagination = value;
    }

}
