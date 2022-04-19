
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeneralType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bus"/>
 *     &lt;enumeration value="Show"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeneralType")
@XmlEnum
public enum GeneralType {

    @XmlEnumValue("Bus")
    BUS("Bus"),
    @XmlEnumValue("Show")
    SHOW("Show"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    GeneralType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneralType fromValue(String v) {
        for (GeneralType c: GeneralType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
