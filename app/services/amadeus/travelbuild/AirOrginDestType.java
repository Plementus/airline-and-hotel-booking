
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirOrginDestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AirOrginDestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="First"/>
 *     &lt;enumeration value="Intermediate"/>
 *     &lt;enumeration value="Last"/>
 *     &lt;enumeration value="Only"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AirOrginDestType")
@XmlEnum
public enum AirOrginDestType {

    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("Intermediate")
    INTERMEDIATE("Intermediate"),
    @XmlEnumValue("Last")
    LAST("Last"),
    @XmlEnumValue("Only")
    ONLY("Only");
    private final String value;

    AirOrginDestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AirOrginDestType fromValue(String v) {
        for (AirOrginDestType c: AirOrginDestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
