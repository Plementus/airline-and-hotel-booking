
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeadlineOffsetDropTime.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeadlineOffsetDropTime">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BeforeArrival"/>
 *     &lt;enumeration value="AfterBooking"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeadlineOffsetDropTime")
@XmlEnum
public enum DeadlineOffsetDropTime {

    @XmlEnumValue("BeforeArrival")
    BEFORE_ARRIVAL("BeforeArrival"),
    @XmlEnumValue("AfterBooking")
    AFTER_BOOKING("AfterBooking");
    private final String value;

    DeadlineOffsetDropTime(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeadlineOffsetDropTime fromValue(String v) {
        for (DeadlineOffsetDropTime c: DeadlineOffsetDropTime.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
