
package com.ebay.soap.eBLBaseComponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountHistorySelectionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountHistorySelectionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="LastInvoice"/>
 *     &lt;enumeration value="SpecifiedInvoice"/>
 *     &lt;enumeration value="BetweenSpecifiedDates"/>
 *     &lt;enumeration value="OrderId"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountHistorySelectionCodeType")
@XmlEnum
public enum AccountHistorySelectionCodeType {


    /**
     * 
     * 						This value should be used if the eBay user wants to see the account entries posted to the last invoice that was sent to the user by eBay. If this value is used, the <b>InvoiceDate</b>, <b>BeginDate</b>, and <b>EndDate</b> fields of the <b>GetAccount</b> request are no longer applicable and will be ignored if they are included in the call request.
     * 					
     * 
     */
    @XmlEnumValue("LastInvoice")
    LAST_INVOICE("LastInvoice"),

    /**
     * 
     * 						This value is no longer applicable or supported, and an error occurs if it is used. As an alternative, users can use <code>BetweenSpecifiedDates</code> instead.
     * 					
     * 
     */
    @XmlEnumValue("SpecifiedInvoice")
    SPECIFIED_INVOICE("SpecifiedInvoice"),

    /**
     * 
     * 						This value should be used if the eBay user wants to see account entries for a customized date range that can overlap multiple formal eBay invoices. If this value is used, then you also must specify <b>BeginDate</b> and <b>EndDate</b> to set the date range for which to retrieve account entries. If this value is used, then <b>InvoiceDate</b> is no longer applicable and will be ignored if it is included in the call request.
     * 					
     * 
     */
    @XmlEnumValue("BetweenSpecifiedDates")
    BETWEEN_SPECIFIED_DATES("BetweenSpecifiedDates"),

    /**
     * 
     * 						This value should be used if the eBay user wants to see the account entries related to a specific eBay order. If this value is used, the user must also include the <b>OrderID</b> field and sets its value to the identifier of the order for which they wish to retrieve account entries.
     * 						<br/><br/>
     * 							<span class="tablenote"><b>Note: </b> In June 2019, eBay introduced a new order ID format, but allowed developers/sellers to decide whether to immediately adopt the new format, or to continue working with the old format. Users who wanted to adopt the new format, could either use a Trading WSDL Version 1113 (or newer), or they could even use an older Trading WSDL but set the <b>X-EBAY-API-COMPATIBILITY-LEVEL</b> HTTP header value to <code>1113</code> in API calls. <b>Beginning in June 2020, only the new order ID format will be returned in response payloads for paid orders, regardless of the WSDL version number or compatibility level.</b>
     * 							<br><br>
     * 							Note that the unique identifier of a 'non-immediate payment' order will change as it goes from an unpaid order to a paid order. Due to this scenario, all calls that accept Order ID values as filters in the request payload, including the <b>GetAccount</b> call, will support the identifiers for both unpaid and paid orders. The new order ID format is a non-parsable string, globally unique across all eBay marketplaces, and consistent for both single line item and multiple line item orders. Unlike in the past, instead of just being known and exposed to the seller, these unique order identifiers will also be known and used/referenced by the buyer and eBay customer support.
     * 							<br><br>
     * 							Sellers can check to see if an order has been paid by looking for a value of 'Complete' in the <b>CheckoutStatus.Status</b> field in the response of <b>GetOrders</b> or <b>GetOrderTransactions</b> call, or in the <b>Status.CompleteStatus</b> field in the response of <b>GetItemTransactions</b> or <b>GetSellerTransactions</b> call. Sellers should  not fulfill orders until buyer has made payment.
     * 						</span>
     * 					
     * 
     */
    @XmlEnumValue("OrderId")
    ORDER_ID("OrderId"),

    /**
     * 
     * 						 (out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AccountHistorySelectionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountHistorySelectionCodeType fromValue(String v) {
        for (AccountHistorySelectionCodeType c: AccountHistorySelectionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}