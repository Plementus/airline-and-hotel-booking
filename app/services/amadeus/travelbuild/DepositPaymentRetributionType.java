
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepositPaymentRetributionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DepositPaymentRetributionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ResAutoCancelled"/>
 *     &lt;enumeration value="ResNotGuaranteed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DepositPaymentRetributionType")
@XmlEnum
public enum DepositPaymentRetributionType {

    @XmlEnumValue("ResAutoCancelled")
    RES_AUTO_CANCELLED("ResAutoCancelled"),
    @XmlEnumValue("ResNotGuaranteed")
    RES_NOT_GUARANTEED("ResNotGuaranteed");
    private final String value;

    DepositPaymentRetributionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DepositPaymentRetributionType fromValue(String v) {
        for (DepositPaymentRetributionType c: DepositPaymentRetributionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
