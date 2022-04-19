
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCardCardCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentCardCardCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AU"/>
 *     &lt;enumeration value="AX"/>
 *     &lt;enumeration value="BC"/>
 *     &lt;enumeration value="BL"/>
 *     &lt;enumeration value="CB"/>
 *     &lt;enumeration value="CG"/>
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="CX"/>
 *     &lt;enumeration value="DN"/>
 *     &lt;enumeration value="DK"/>
 *     &lt;enumeration value="DS"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="GK"/>
 *     &lt;enumeration value="JC"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="MO"/>
 *     &lt;enumeration value="MP"/>
 *     &lt;enumeration value="SO"/>
 *     &lt;enumeration value="SW"/>
 *     &lt;enumeration value="TC"/>
 *     &lt;enumeration value="TP"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="VD"/>
 *     &lt;enumeration value="VE"/>
 *     &lt;enumeration value="VT"/>
 *     &lt;enumeration value="XS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentCardCardCode")
@XmlEnum
public enum PaymentCardCardCode {

    AU,
    AX,
    BC,
    BL,
    CB,
    CG,
    CN,
    CX,
    DN,
    DK,
    DS,
    EC,
    GK,
    JC,
    MC,
    MD,
    MO,
    MP,
    SO,
    SW,
    TC,
    TP,
    VI,
    VD,
    VE,
    VT,
    XS;

    public String value() {
        return name();
    }

    public static PaymentCardCardCode fromValue(String v) {
        return valueOf(v);
    }

}
