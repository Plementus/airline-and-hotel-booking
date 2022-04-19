
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceRequestInformationPricingSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceRequestInformationPricingSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Published"/>
 *     &lt;enumeration value="Private"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceRequestInformationPricingSource")
@XmlEnum
public enum PriceRequestInformationPricingSource {

    @XmlEnumValue("Published")
    PUBLISHED("Published"),
    @XmlEnumValue("Private")
    PRIVATE("Private");
    private final String value;

    PriceRequestInformationPricingSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriceRequestInformationPricingSource fromValue(String v) {
        for (PriceRequestInformationPricingSource c: PriceRequestInformationPricingSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
