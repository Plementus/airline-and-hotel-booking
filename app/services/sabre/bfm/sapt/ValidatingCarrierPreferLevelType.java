
package services.sabre.bfm.sapt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidatingCarrierPreferLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidatingCarrierPreferLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Unacceptable"/>
 *     &lt;enumeration value="Preferred"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValidatingCarrierPreferLevelType")
@XmlEnum
public enum ValidatingCarrierPreferLevelType {

    @XmlEnumValue("Unacceptable")
    UNACCEPTABLE("Unacceptable"),
    @XmlEnumValue("Preferred")
    PREFERRED("Preferred");
    private final String value;

    ValidatingCarrierPreferLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValidatingCarrierPreferLevelType fromValue(String v) {
        for (ValidatingCarrierPreferLevelType c: ValidatingCarrierPreferLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
