
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehTransmissionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehTransmissionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Automatic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehTransmissionType")
@XmlEnum
public enum VehTransmissionType {

    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic");
    private final String value;

    VehTransmissionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehTransmissionType fromValue(String v) {
        for (VehTransmissionType c: VehTransmissionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
