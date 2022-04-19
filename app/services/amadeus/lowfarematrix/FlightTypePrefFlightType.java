
package services.amadeus.lowfarematrix;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightTypePrefFlightType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightTypePrefFlightType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Nonstop"/>
 *     &lt;enumeration value="Direct"/>
 *     &lt;enumeration value="Connection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightTypePrefFlightType")
@XmlEnum
public enum FlightTypePrefFlightType {

    @XmlEnumValue("Nonstop")
    NONSTOP("Nonstop"),
    @XmlEnumValue("Direct")
    DIRECT("Direct"),
    @XmlEnumValue("Connection")
    CONNECTION("Connection");
    private final String value;

    FlightTypePrefFlightType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightTypePrefFlightType fromValue(String v) {
        for (FlightTypePrefFlightType c: FlightTypePrefFlightType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
