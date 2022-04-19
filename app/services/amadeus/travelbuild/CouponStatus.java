
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CouponStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CouponStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Void"/>
 *     &lt;enumeration value="AirportControl"/>
 *     &lt;enumeration value="FlownUsed"/>
 *     &lt;enumeration value="Boarded"/>
 *     &lt;enumeration value="CheckedIn"/>
 *     &lt;enumeration value="ExchangedReissued"/>
 *     &lt;enumeration value="OriginalIssue"/>
 *     &lt;enumeration value="IrregularOperations"/>
 *     &lt;enumeration value="NotAvailable"/>
 *     &lt;enumeration value="Confirmed"/>
 *     &lt;enumeration value="PrintExchange"/>
 *     &lt;enumeration value="Printed"/>
 *     &lt;enumeration value="Refunded"/>
 *     &lt;enumeration value="Requested"/>
 *     &lt;enumeration value="NotFound"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CouponStatus")
@XmlEnum
public enum CouponStatus {

    @XmlEnumValue("Void")
    VOID("Void"),
    @XmlEnumValue("AirportControl")
    AIRPORT_CONTROL("AirportControl"),
    @XmlEnumValue("FlownUsed")
    FLOWN_USED("FlownUsed"),
    @XmlEnumValue("Boarded")
    BOARDED("Boarded"),
    @XmlEnumValue("CheckedIn")
    CHECKED_IN("CheckedIn"),
    @XmlEnumValue("ExchangedReissued")
    EXCHANGED_REISSUED("ExchangedReissued"),
    @XmlEnumValue("OriginalIssue")
    ORIGINAL_ISSUE("OriginalIssue"),
    @XmlEnumValue("IrregularOperations")
    IRREGULAR_OPERATIONS("IrregularOperations"),
    @XmlEnumValue("NotAvailable")
    NOT_AVAILABLE("NotAvailable"),
    @XmlEnumValue("Confirmed")
    CONFIRMED("Confirmed"),
    @XmlEnumValue("PrintExchange")
    PRINT_EXCHANGE("PrintExchange"),
    @XmlEnumValue("Printed")
    PRINTED("Printed"),
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound");
    private final String value;

    CouponStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CouponStatus fromValue(String v) {
        for (CouponStatus c: CouponStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
