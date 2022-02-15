
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyerPaymentMethodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuyerPaymentMethodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="MOCC"/>
 *     &lt;enumeration value="AmEx"/>
 *     &lt;enumeration value="PaymentSeeDescription"/>
 *     &lt;enumeration value="CCAccepted"/>
 *     &lt;enumeration value="PersonalCheck"/>
 *     &lt;enumeration value="COD"/>
 *     &lt;enumeration value="VisaMC"/>
 *     &lt;enumeration value="PaisaPayAccepted"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PayPal"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="CashOnPickup"/>
 *     &lt;enumeration value="MoneyXferAccepted"/>
 *     &lt;enumeration value="MoneyXferAcceptedInCheckout"/>
 *     &lt;enumeration value="OtherOnlinePayments"/>
 *     &lt;enumeration value="Escrow"/>
 *     &lt;enumeration value="PrePayDelivery"/>
 *     &lt;enumeration value="CODPrePayDelivery"/>
 *     &lt;enumeration value="PostalTransfer"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="LoanCheck"/>
 *     &lt;enumeration value="CashInPerson"/>
 *     &lt;enumeration value="ELV"/>
 *     &lt;enumeration value="PaisaPayEscrow"/>
 *     &lt;enumeration value="PaisaPayEscrowEMI"/>
 *     &lt;enumeration value="IntegratedMerchantCreditCard"/>
 *     &lt;enumeration value="Moneybookers"/>
 *     &lt;enumeration value="Paymate"/>
 *     &lt;enumeration value="ProPay"/>
 *     &lt;enumeration value="PayOnPickup"/>
 *     &lt;enumeration value="Diners"/>
 *     &lt;enumeration value="StandardPayment"/>
 *     &lt;enumeration value="DirectDebit"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="PayUponInvoice"/>
 *     &lt;enumeration value="QIWI"/>
 *     &lt;enumeration value="PayPalCredit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuyerPaymentMethodCodeType")
@XmlEnum
public enum BuyerPaymentMethodCodeType {


    /**
     * 
     * 						This enumeration value indicates that no payment method has been specified for the listing. This may be the case for a classified ad listing, since payment happens outside of the eBay platform.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						This enumeration value indicates that a money order or cashiers check is accepted for payment. This value is only applicable for offline payments.
     * 					
     * 
     */
    MOCC("MOCC"),

    /**
     * 
     * 						This enumeration value indicates that American Express is accepted for payment.
     * 					
     * 
     */
    @XmlEnumValue("AmEx")
    AM_EX("AmEx"),

    /**
     * 
     * 						This enumeration value indicates that buyers should check the listing description for more details on payment. This may be the case for a classified ad listing, since payment happens outside of the eBay platform.
     * 					
     * 
     */
    @XmlEnumValue("PaymentSeeDescription")
    PAYMENT_SEE_DESCRIPTION("PaymentSeeDescription"),

    /**
     * 
     * 						This enumeration value indicates that credit cards are accepted for payment.
     * 						<br/><br/>
     * 						<span class="tablenote"><b>Note: </b>
     * 							This enumeration value is returned in the response of order management calls if the buyer used an eBay gift card to pay the full or partial balance of the order.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("CCAccepted")
    CC_ACCEPTED("CCAccepted"),

    /**
     * 
     * 						This enumeration value indicates that a personal check is accepted for payment. This value is only applicable for offline payments.
     * 					
     * 
     */
    @XmlEnumValue("PersonalCheck")
    PERSONAL_CHECK("PersonalCheck"),

    /**
     * 
     * 						This enumeration value indicates that cash on delivery of item is accepted for payment. This value is only applicable for offline payments.
     * 					
     * 
     */
    COD("COD"),

    /**
     * 
     * 						This enumeration value indicates that Visa or MasterCard are accepted for payment.
     * 					
     * 
     */
    @XmlEnumValue("VisaMC")
    VISA_MC("VisaMC"),

    /**
     * 
     * 						This payment method is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayAccepted")
    PAISA_PAY_ACCEPTED("PaisaPayAccepted"),

    /**
     * 
     * 						This enumeration value may be returned if the payment method is unknown.
     * 					
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * 
     * 						This enumeration value indicates that PayPal is accepted as a payment method. 
     * 					
     * 
     */
    @XmlEnumValue("PayPal")
    PAY_PAL("PayPal"),

    /**
     * 
     * 						This enumeration value indicates that Discover Card is accepted for payment.
     * 					
     * 
     */
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),

    /**
     * 
     * 						This enumeration value indicates that cash on pickup is accepted for payment. This value is only applicable for offline payments.
     * 					
     * 
     */
    @XmlEnumValue("CashOnPickup")
    CASH_ON_PICKUP("CashOnPickup"),

    /**
     * 
     * 						This enumeration value indicates that a direct transfer of money is accepted for payment.
     * 					
     * 
     */
    @XmlEnumValue("MoneyXferAccepted")
    MONEY_XFER_ACCEPTED("MoneyXferAccepted"),

    /**
     * 
     * 						This enumeration value indicates that a direct transfer of money during checkout is accepted for payment.
     * 					
     * 
     */
    @XmlEnumValue("MoneyXferAcceptedInCheckout")
    MONEY_XFER_ACCEPTED_IN_CHECKOUT("MoneyXferAcceptedInCheckout"),

    /**
     * 
     * 						This enumeration value may be returned if the payment method is unknown.
     * 					
     * 
     */
    @XmlEnumValue("OtherOnlinePayments")
    OTHER_ONLINE_PAYMENTS("OtherOnlinePayments"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("Escrow")
    ESCROW("Escrow"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("PrePayDelivery")
    PRE_PAY_DELIVERY("PrePayDelivery"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CODPrePayDelivery")
    COD_PRE_PAY_DELIVERY("CODPrePayDelivery"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("PostalTransfer")
    POSTAL_TRANSFER("PostalTransfer"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						This payment method is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("LoanCheck")
    LOAN_CHECK("LoanCheck"),

    /**
     * 
     * 						This payment method is deprecated. 'CashOnPickup' is now the only available offline cash option.
     * 					
     * 
     */
    @XmlEnumValue("CashInPerson")
    CASH_IN_PERSON("CashInPerson"),

    /**
     * 
     * 						Elektronisches Lastschriftverfahren (direct debit).
     * 						Only applicable to the Express Germany site, which has been shut down.
     * 					
     * 
     */
    ELV("ELV"),

    /**
     * 
     * 						This payment type is no longer applicable since eBay India is no longer a functioning site.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayEscrow")
    PAISA_PAY_ESCROW("PaisaPayEscrow"),

    /**
     * 
     * 						This payment type is no longer applicable since eBay India is no longer a functioning site.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayEscrowEMI")
    PAISA_PAY_ESCROW_EMI("PaisaPayEscrowEMI"),

    /**
     * 
     * 						This payment method is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("IntegratedMerchantCreditCard")
    INTEGRATED_MERCHANT_CREDIT_CARD("IntegratedMerchantCreditCard"),

    /**
     * 
     * 						This payment method is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Moneybookers")
    MONEYBOOKERS("Moneybookers"),

    /**
     * 
     * 						This payment method is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("Paymate")
    PAYMATE("Paymate"),

    /**
     * 
     * 						This payment method is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("ProPay")
    PRO_PAY("ProPay"),

    /**
     * 
     * 						This payment method is deprecated. 'CashOnPickup' is now the only available offline cash option.
     * 					
     * 
     */
    @XmlEnumValue("PayOnPickup")
    PAY_ON_PICKUP("PayOnPickup"),

    /**
     * 
     * 						This enumeration value indicates that the Diners Club credit card is accepted for payment.
     * 					
     * 
     */
    @XmlEnumValue("Diners")
    DINERS("Diners"),

    /**
     * 
     * 						This value is no longer used.
     * 					
     * 
     */
    @XmlEnumValue("StandardPayment")
    STANDARD_PAYMENT("StandardPayment"),

    /**
     * 
     * 						This payment method is deprecated.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebit")
    DIRECT_DEBIT("DirectDebit"),

    /**
     * 
     * 						This enumeration value is returned in the response of order management calls if eBay collects the online payment from the buyer, and the buyer has paid for the order with any accepted payment method except for an eBay gift card. If the buyer used an eBay gift card to pay the full or partial balance of the order, the <code>CCAccepted</code> value will be returned instead.
     * 					
     * 
     */
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),

    /**
     * 
     * 						This buyer payment method is only applicable for the Germany site and is associated with the rollout of Progressive Checkout and the Pay Upon Invoice feature. 'PayUponInvoice' is not a payment method that is offered to the buyer, but instead, eBay/PayPal makes the determination (based on several factors) during checkout whether the buyer is eligible for 'Pay Upon Invoice'. If the buyer is offered the 'Pay Upon Invoice' option, that buyer is not required to pay for the order until an order invoice is sent by the seller. The seller must offer PayPal as a payment option or the 'Pay Upon Invoice' option will not be made available to the buyer under any circumstance.
     * 						<br><br>
     * 						Only select categories on the Germany site will support the 'Pay Upon Invoice' option, and orders going above the two-thousand dollar EURO mark will not be eligible for 'Pay Upon Invoice'.
     * 						<br><br>
     * 						Since the seller can not specify 'Pay Upon Invoice' as a payment method, this enumeration value cannot be passed into a <b>Item.PaymentMethods</b> field in an Add/Revise/Relist call.
     * 					
     * 
     */
    @XmlEnumValue("PayUponInvoice")
    PAY_UPON_INVOICE("PayUponInvoice"),

    /**
     * 
     * 					This payment method is deprecated.
     * 				
     * 
     */
    QIWI("QIWI"),

    /**
     * 
     * 					This payment method is deprecated.
     * 				
     * 
     */
    @XmlEnumValue("PayPalCredit")
    PAY_PAL_CREDIT("PayPalCredit");
    private final String value;

    BuyerPaymentMethodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuyerPaymentMethodCodeType fromValue(String v) {
        for (BuyerPaymentMethodCodeType c: BuyerPaymentMethodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
