
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepartureDayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DepartureDayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Mon"/>
 *     &lt;enumeration value="Tue"/>
 *     &lt;enumeration value="Wed"/>
 *     &lt;enumeration value="Thu"/>
 *     &lt;enumeration value="Fri"/>
 *     &lt;enumeration value="Sat"/>
 *     &lt;enumeration value="Sun"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DepartureDayType")
@XmlEnum
public enum DepartureDayType {

    @XmlEnumValue("Mon")
    MON("Mon"),
    @XmlEnumValue("Tue")
    TUE("Tue"),
    @XmlEnumValue("Wed")
    WED("Wed"),
    @XmlEnumValue("Thu")
    THU("Thu"),
    @XmlEnumValue("Fri")
    FRI("Fri"),
    @XmlEnumValue("Sat")
    SAT("Sat"),
    @XmlEnumValue("Sun")
    SUN("Sun");
    private final String value;

    DepartureDayType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DepartureDayType fromValue(String v) {
        for (DepartureDayType c: DepartureDayType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
