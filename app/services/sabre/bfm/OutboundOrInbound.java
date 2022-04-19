
package services.sabre.bfm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutboundOrInbound.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OutboundOrInbound">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Outbound"/>
 *     &lt;enumeration value="Inbound"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OutboundOrInbound")
@XmlEnum
public enum OutboundOrInbound {

    @XmlEnumValue("Outbound")
    OUTBOUND("Outbound"),
    @XmlEnumValue("Inbound")
    INBOUND("Inbound");
    private final String value;

    OutboundOrInbound(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutboundOrInbound fromValue(String v) {
        for (OutboundOrInbound c: OutboundOrInbound.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
