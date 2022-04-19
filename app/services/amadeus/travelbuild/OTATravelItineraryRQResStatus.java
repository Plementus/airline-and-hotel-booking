
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTA_TravelItineraryRQResStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OTA_TravelItineraryRQResStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Book"/>
 *     &lt;enumeration value="Quote"/>
 *     &lt;enumeration value="Hold"/>
 *     &lt;enumeration value="Initiate"/>
 *     &lt;enumeration value="Ignore"/>
 *     &lt;enumeration value="Modify"/>
 *     &lt;enumeration value="Commit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OTA_TravelItineraryRQResStatus")
@XmlEnum
public enum OTATravelItineraryRQResStatus {

    @XmlEnumValue("Book")
    BOOK("Book"),
    @XmlEnumValue("Quote")
    QUOTE("Quote"),
    @XmlEnumValue("Hold")
    HOLD("Hold"),
    @XmlEnumValue("Initiate")
    INITIATE("Initiate"),
    @XmlEnumValue("Ignore")
    IGNORE("Ignore"),
    @XmlEnumValue("Modify")
    MODIFY("Modify"),
    @XmlEnumValue("Commit")
    COMMIT("Commit");
    private final String value;

    OTATravelItineraryRQResStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OTATravelItineraryRQResStatus fromValue(String v) {
        for (OTATravelItineraryRQResStatus c: OTATravelItineraryRQResStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
