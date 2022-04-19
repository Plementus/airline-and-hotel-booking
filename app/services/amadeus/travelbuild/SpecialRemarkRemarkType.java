
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialRemarkRemarkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialRemarkRemarkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Air"/>
 *     &lt;enumeration value="Car"/>
 *     &lt;enumeration value="Cryptic"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="Endorsement"/>
 *     &lt;enumeration value="TourCode"/>
 *     &lt;enumeration value="ValidatingCarrier"/>
 *     &lt;enumeration value="ManualDocument"/>
 *     &lt;enumeration value="AutomatedTicket"/>
 *     &lt;enumeration value="ElectronicTicket"/>
 *     &lt;enumeration value="ManualTicket"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="J"/>
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="Q"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="Z"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecialRemarkRemarkType")
@XmlEnum
public enum SpecialRemarkRemarkType {

    @XmlEnumValue("Air")
    AIR("Air"),
    @XmlEnumValue("Car")
    CAR("Car"),
    @XmlEnumValue("Cryptic")
    CRYPTIC("Cryptic"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("Endorsement")
    ENDORSEMENT("Endorsement"),
    @XmlEnumValue("TourCode")
    TOUR_CODE("TourCode"),
    @XmlEnumValue("ValidatingCarrier")
    VALIDATING_CARRIER("ValidatingCarrier"),
    @XmlEnumValue("ManualDocument")
    MANUAL_DOCUMENT("ManualDocument"),
    @XmlEnumValue("AutomatedTicket")
    AUTOMATED_TICKET("AutomatedTicket"),
    @XmlEnumValue("ElectronicTicket")
    ELECTRONIC_TICKET("ElectronicTicket"),
    @XmlEnumValue("ManualTicket")
    MANUAL_TICKET("ManualTicket"),
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    F("F"),
    G("G"),
    H("H"),
    I("I"),
    J("J"),
    K("K"),
    L("L"),
    M("M"),
    N("N"),
    O("O"),
    P("P"),
    Q("Q"),
    R("R"),
    S("S"),
    T("T"),
    U("U"),
    V("V"),
    W("W"),
    X("X"),
    Y("Y"),
    Z("Z");
    private final String value;

    SpecialRemarkRemarkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialRemarkRemarkType fromValue(String v) {
        for (SpecialRemarkRemarkType c: SpecialRemarkRemarkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
