
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OffLocServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OffLocServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CustPickUp"/>
 *     &lt;enumeration value="VehDelivery"/>
 *     &lt;enumeration value="CustDropOff"/>
 *     &lt;enumeration value="VehCollection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OffLocServiceType")
@XmlEnum
public enum OffLocServiceType {

    @XmlEnumValue("CustPickUp")
    CUST_PICK_UP("CustPickUp"),
    @XmlEnumValue("VehDelivery")
    VEH_DELIVERY("VehDelivery"),
    @XmlEnumValue("CustDropOff")
    CUST_DROP_OFF("CustDropOff"),
    @XmlEnumValue("VehCollection")
    VEH_COLLECTION("VehCollection");
    private final String value;

    OffLocServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OffLocServiceType fromValue(String v) {
        for (OffLocServiceType c: OffLocServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
