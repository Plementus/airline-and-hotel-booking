
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatePlanRateIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RatePlanRateIndicator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ChangeDuringStay"/>
 *     &lt;enumeration value="MultipleNights"/>
 *     &lt;enumeration value="Exclusive"/>
 *     &lt;enumeration value="OnRequest"/>
 *     &lt;enumeration value="LimitedAvailability"/>
 *     &lt;enumeration value="AvailableForSale"/>
 *     &lt;enumeration value="ClosedOut"/>
 *     &lt;enumeration value="OtherAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RatePlanRateIndicator")
@XmlEnum
public enum RatePlanRateIndicator {

    @XmlEnumValue("ChangeDuringStay")
    CHANGE_DURING_STAY("ChangeDuringStay"),
    @XmlEnumValue("MultipleNights")
    MULTIPLE_NIGHTS("MultipleNights"),
    @XmlEnumValue("Exclusive")
    EXCLUSIVE("Exclusive"),
    @XmlEnumValue("OnRequest")
    ON_REQUEST("OnRequest"),
    @XmlEnumValue("LimitedAvailability")
    LIMITED_AVAILABILITY("LimitedAvailability"),
    @XmlEnumValue("AvailableForSale")
    AVAILABLE_FOR_SALE("AvailableForSale"),
    @XmlEnumValue("ClosedOut")
    CLOSED_OUT("ClosedOut"),
    @XmlEnumValue("OtherAvailable")
    OTHER_AVAILABLE("OtherAvailable");
    private final String value;

    RatePlanRateIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RatePlanRateIndicator fromValue(String v) {
        for (RatePlanRateIndicator c: RatePlanRateIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
