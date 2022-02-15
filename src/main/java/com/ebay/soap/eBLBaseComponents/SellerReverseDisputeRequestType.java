
package com.ebay.soap.eBLBaseComponents;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This call allows a seller to reverse the results of an Unpaid Item case in a situation where the buyer and seller are able to reach a mutual agreement. If this action is successful, the buyer might have an Unpaid Item strike removed (if applicable). 
 * 				<br><br> 
 * 				An Unpaid Item case can only be reversed if it was closed with <b>DisputeActivity</b> set to <b>SellerEndCommunication</b>, <b>CameToAgreementNeedFVFCredit</b>, or <b>MutualAgreementOrNoBuyerResponse</b>.
 * 			
 * 
 * <p>Java class for SellerReverseDisputeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerReverseDisputeRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="DisputeID" type="{urn:ebay:apis:eBLBaseComponents}DisputeIDType" minOccurs="0"/>
 *         &lt;element name="DisputeResolutionReason" type="{urn:ebay:apis:eBLBaseComponents}DisputeResolutionReasonCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerReverseDisputeRequestType", propOrder = {
    "disputeID",
    "disputeResolutionReason"
})
public class SellerReverseDisputeRequestType
    extends AbstractRequestType
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "DisputeID")
    protected String disputeID;
    @XmlElement(name = "DisputeResolutionReason")
    protected DisputeResolutionReasonCodeType disputeResolutionReason;

    /**
     * Gets the value of the disputeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisputeID() {
        return disputeID;
    }

    /**
     * Sets the value of the disputeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisputeID(String value) {
        this.disputeID = value;
    }

    /**
     * Gets the value of the disputeResolutionReason property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeResolutionReasonCodeType }
     *     
     */
    public DisputeResolutionReasonCodeType getDisputeResolutionReason() {
        return disputeResolutionReason;
    }

    /**
     * Sets the value of the disputeResolutionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeResolutionReasonCodeType }
     *     
     */
    public void setDisputeResolutionReason(DisputeResolutionReasonCodeType value) {
        this.disputeResolutionReason = value;
    }

}
