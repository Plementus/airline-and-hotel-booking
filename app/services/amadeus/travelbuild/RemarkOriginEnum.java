
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemarkOriginEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RemarkOriginEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Vendor"/>
 *     &lt;enumeration value="Agent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RemarkOriginEnum")
@XmlEnum
public enum RemarkOriginEnum {

    @XmlEnumValue("Vendor")
    VENDOR("Vendor"),
    @XmlEnumValue("Agent")
    AGENT("Agent");
    private final String value;

    RemarkOriginEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemarkOriginEnum fromValue(String v) {
        for (RemarkOriginEnum c: RemarkOriginEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
