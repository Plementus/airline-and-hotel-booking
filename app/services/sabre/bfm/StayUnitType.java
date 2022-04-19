
package services.sabre.bfm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StayUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StayUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Minutes"/>
 *     &lt;enumeration value="Hours"/>
 *     &lt;enumeration value="Days"/>
 *     &lt;enumeration value="Months"/>
 *     &lt;enumeration value="MON"/>
 *     &lt;enumeration value="TUES"/>
 *     &lt;enumeration value="WED"/>
 *     &lt;enumeration value="THU"/>
 *     &lt;enumeration value="FRI"/>
 *     &lt;enumeration value="SAT"/>
 *     &lt;enumeration value="SUN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StayUnitType")
@XmlEnum
public enum StayUnitType {

    @XmlEnumValue("Minutes")
    MINUTES("Minutes"),
    @XmlEnumValue("Hours")
    HOURS("Hours"),
    @XmlEnumValue("Days")
    DAYS("Days"),
    @XmlEnumValue("Months")
    MONTHS("Months"),

    /**
     * Monday
     * 
     */
    MON("MON"),

    /**
     * Tuesday
     * 
     */
    TUES("TUES"),

    /**
     * Wednesday
     * 
     */
    WED("WED"),

    /**
     * Thursday
     * 
     */
    THU("THU"),

    /**
     * Friday
     * 
     */
    FRI("FRI"),

    /**
     * Saturday
     * 
     */
    SAT("SAT"),

    /**
     * Sunday
     * 
     */
    SUN("SUN");
    private final String value;

    StayUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StayUnitType fromValue(String v) {
        for (StayUnitType c: StayUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
