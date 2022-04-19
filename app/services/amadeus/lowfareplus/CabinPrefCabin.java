
package services.amadeus.lowfareplus;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinPrefCabin.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CabinPrefCabin">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="First"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Economy"/>
 *     &lt;enumeration value="Main"/>
 *     &lt;enumeration value="Premium"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CabinPrefCabin")
@XmlEnum
public enum CabinPrefCabin {

    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Economy")
    ECONOMY("Economy"),
    @XmlEnumValue("Main")
    MAIN("Main"),
    @XmlEnumValue("Premium")
    PREMIUM("Premium");
    private final String value;

    CabinPrefCabin(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CabinPrefCabin fromValue(String v) {
        for (CabinPrefCabin c: CabinPrefCabin.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
