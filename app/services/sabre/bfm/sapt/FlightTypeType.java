
package services.sabre.bfm.sapt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Nonstop"/>
 *     &lt;enumeration value="Direct"/>
 *     &lt;enumeration value="Connection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightTypeType")
@XmlEnum
public enum FlightTypeType {


    /**
     * Flight without plane change and without intermediate landing.
     * 
     */
    @XmlEnumValue("Nonstop")
    NONSTOP("Nonstop"),

    /**
     * Flight without plane change and possible intermediate landing.
     * 
     */
    @XmlEnumValue("Direct")
    DIRECT("Direct"),

    /**
     * Flight with plane changes, allowing maximum of 24 hours for each change
     * 
     */
    @XmlEnumValue("Connection")
    CONNECTION("Connection");
    private final String value;

    FlightTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightTypeType fromValue(String v) {
        for (FlightTypeType c: FlightTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
