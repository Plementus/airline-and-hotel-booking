
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatingAirlineFlightNumber.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperatingAirlineFlightNumber">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPEN"/>
 *     &lt;enumeration value="ARNK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperatingAirlineFlightNumber")
@XmlEnum
public enum OperatingAirlineFlightNumber {

    OPEN,
    ARNK;

    public String value() {
        return name();
    }

    public static OperatingAirlineFlightNumber fromValue(String v) {
        return valueOf(v);
    }

}
