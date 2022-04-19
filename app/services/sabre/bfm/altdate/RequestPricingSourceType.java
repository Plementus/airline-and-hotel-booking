
package services.sabre.bfm.altdate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestPricingSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestPricingSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Published"/>
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestPricingSourceType")
@XmlEnum
public enum RequestPricingSourceType {

    @XmlEnumValue("Published")
    PUBLISHED("Published"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    RequestPricingSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestPricingSourceType fromValue(String v) {
        for (RequestPricingSourceType c: RequestPricingSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
