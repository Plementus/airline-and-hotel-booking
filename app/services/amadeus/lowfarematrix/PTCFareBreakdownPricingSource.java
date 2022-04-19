
package services.amadeus.lowfarematrix;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PTC_FareBreakdownPricingSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PTC_FareBreakdownPricingSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Published"/>
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PTC_FareBreakdownPricingSource")
@XmlEnum
public enum PTCFareBreakdownPricingSource {

    @XmlEnumValue("Published")
    PUBLISHED("Published"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    PTCFareBreakdownPricingSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PTCFareBreakdownPricingSource fromValue(String v) {
        for (PTCFareBreakdownPricingSource c: PTCFareBreakdownPricingSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
