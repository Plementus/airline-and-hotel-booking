
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateDistanceDistUnitName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateDistanceDistUnitName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Mile"/>
 *     &lt;enumeration value="Km"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateDistanceDistUnitName")
@XmlEnum
public enum RateDistanceDistUnitName {

    @XmlEnumValue("Mile")
    MILE("Mile"),
    @XmlEnumValue("Km")
    KM("Km");
    private final String value;

    RateDistanceDistUnitName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RateDistanceDistUnitName fromValue(String v) {
        for (RateDistanceDistUnitName c: RateDistanceDistUnitName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
