
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemarksRemarkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RemarksRemarkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="TravelPolicy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RemarksRemarkType")
@XmlEnum
public enum RemarksRemarkType {

    @XmlEnumValue("General")
    GENERAL("General"),
    @XmlEnumValue("TravelPolicy")
    TRAVEL_POLICY("TravelPolicy");
    private final String value;

    RemarksRemarkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemarksRemarkType fromValue(String v) {
        for (RemarksRemarkType c: RemarksRemarkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
