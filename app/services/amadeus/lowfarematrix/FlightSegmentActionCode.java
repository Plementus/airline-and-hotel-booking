
package services.amadeus.lowfarematrix;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightSegmentActionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightSegmentActionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="Waitlist"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightSegmentActionCode")
@XmlEnum
public enum FlightSegmentActionCode {

    OK("OK"),
    @XmlEnumValue("Waitlist")
    WAITLIST("Waitlist"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FlightSegmentActionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightSegmentActionCode fromValue(String v) {
        for (FlightSegmentActionCode c: FlightSegmentActionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
