
package services.amadeus.lowfareschedule;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirItineraryDirectionInd.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AirItineraryDirectionInd">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OneWay"/>
 *     &lt;enumeration value="Return"/>
 *     &lt;enumeration value="Circle"/>
 *     &lt;enumeration value="OpenJaw"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AirItineraryDirectionInd")
@XmlEnum
public enum AirItineraryDirectionInd {

    @XmlEnumValue("OneWay")
    ONE_WAY("OneWay"),
    @XmlEnumValue("Return")
    RETURN("Return"),
    @XmlEnumValue("Circle")
    CIRCLE("Circle"),
    @XmlEnumValue("OpenJaw")
    OPEN_JAW("OpenJaw"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AirItineraryDirectionInd(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AirItineraryDirectionInd fromValue(String v) {
        for (AirItineraryDirectionInd c: AirItineraryDirectionInd.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
