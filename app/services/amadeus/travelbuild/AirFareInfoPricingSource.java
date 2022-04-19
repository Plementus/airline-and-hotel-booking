
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirFareInfoPricingSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AirFareInfoPricingSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Published"/>
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AirFareInfoPricingSource")
@XmlEnum
public enum AirFareInfoPricingSource {

    @XmlEnumValue("Published")
    PUBLISHED("Published"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    AirFareInfoPricingSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AirFareInfoPricingSource fromValue(String v) {
        for (AirFareInfoPricingSource c: AirFareInfoPricingSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
