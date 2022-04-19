
package services.sabre.bfm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CabinType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="PremiumFirst"/>
 *     &lt;enumeration value="First"/>
 *     &lt;enumeration value="PremiumBusiness"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="PremiumEconomy"/>
 *     &lt;enumeration value="Economy"/>
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="J"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="P"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CabinType")
@XmlEnum
public enum CabinType {

    @XmlEnumValue("PremiumFirst")
    PREMIUM_FIRST("PremiumFirst"),
    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("PremiumBusiness")
    PREMIUM_BUSINESS("PremiumBusiness"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("PremiumEconomy")
    PREMIUM_ECONOMY("PremiumEconomy"),
    @XmlEnumValue("Economy")
    ECONOMY("Economy"),
    Y("Y"),
    S("S"),
    C("C"),
    J("J"),
    F("F"),
    P("P");
    private final String value;

    CabinType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CabinType fromValue(String v) {
        for (CabinType c: CabinType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
