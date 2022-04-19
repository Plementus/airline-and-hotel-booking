
package services.sabre.bfm.sapt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepartureOrArrival.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DepartureOrArrival">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Departure"/>
 *     &lt;enumeration value="Arrival"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DepartureOrArrival")
@XmlEnum
public enum DepartureOrArrival {

    @XmlEnumValue("Departure")
    DEPARTURE("Departure"),
    @XmlEnumValue("Arrival")
    ARRIVAL("Arrival");
    private final String value;

    DepartureOrArrival(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DepartureOrArrival fromValue(String v) {
        for (DepartureOrArrival c: DepartureOrArrival.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
