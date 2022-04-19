
package services.amadeus.lowfareschedule;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionLocationConnectionInfo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectionLocationConnectionInfo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Via"/>
 *     &lt;enumeration value="Stop"/>
 *     &lt;enumeration value="Change"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConnectionLocationConnectionInfo")
@XmlEnum
public enum ConnectionLocationConnectionInfo {

    @XmlEnumValue("Via")
    VIA("Via"),
    @XmlEnumValue("Stop")
    STOP("Stop"),
    @XmlEnumValue("Change")
    CHANGE("Change");
    private final String value;

    ConnectionLocationConnectionInfo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectionLocationConnectionInfo fromValue(String v) {
        for (ConnectionLocationConnectionInfo c: ConnectionLocationConnectionInfo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
