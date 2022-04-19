
package services.sabre.bfm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PollingStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PollingStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="received"/>
 *     &lt;enumeration value="in progress"/>
 *     &lt;enumeration value="complete"/>
 *     &lt;enumeration value="error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PollingStatusType")
@XmlEnum
public enum PollingStatusType {

    @XmlEnumValue("received")
    RECEIVED("received"),
    @XmlEnumValue("in progress")
    IN_PROGRESS("in progress"),
    @XmlEnumValue("complete")
    COMPLETE("complete"),
    @XmlEnumValue("error")
    ERROR("error");
    private final String value;

    PollingStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PollingStatusType fromValue(String v) {
        for (PollingStatusType c: PollingStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
