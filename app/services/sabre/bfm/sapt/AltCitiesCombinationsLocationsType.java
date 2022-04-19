
package services.sabre.bfm.sapt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AltCitiesCombinationsLocationsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AltCitiesCombinationsLocationsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Main"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AltCitiesCombinationsLocationsType")
@XmlEnum
public enum AltCitiesCombinationsLocationsType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Main")
    MAIN("Main");
    private final String value;

    AltCitiesCombinationsLocationsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AltCitiesCombinationsLocationsType fromValue(String v) {
        for (AltCitiesCombinationsLocationsType c: AltCitiesCombinationsLocationsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
