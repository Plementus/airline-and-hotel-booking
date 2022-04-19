
package services.amadeus.lowfareschedule;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for E_TicketEligibilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="E_TicketEligibilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Eligible"/>
 *     &lt;enumeration value="NotEligible"/>
 *     &lt;enumeration value="Required"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "E_TicketEligibilityType")
@XmlEnum
public enum ETicketEligibilityType {

    @XmlEnumValue("Eligible")
    ELIGIBLE("Eligible"),
    @XmlEnumValue("NotEligible")
    NOT_ELIGIBLE("NotEligible"),
    @XmlEnumValue("Required")
    REQUIRED("Required");
    private final String value;

    ETicketEligibilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ETicketEligibilityType fromValue(String v) {
        for (ETicketEligibilityType c: ETicketEligibilityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
