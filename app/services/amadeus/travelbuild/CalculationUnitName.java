
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculationUnitName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalculationUnitName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RentalPeriod"/>
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="Hour"/>
 *     &lt;enumeration value="Gallon"/>
 *     &lt;enumeration value="Liter"/>
 *     &lt;enumeration value="Mile"/>
 *     &lt;enumeration value="Km"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CalculationUnitName")
@XmlEnum
public enum CalculationUnitName {

    @XmlEnumValue("RentalPeriod")
    RENTAL_PERIOD("RentalPeriod"),
    @XmlEnumValue("Year")
    YEAR("Year"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Hour")
    HOUR("Hour"),
    @XmlEnumValue("Gallon")
    GALLON("Gallon"),
    @XmlEnumValue("Liter")
    LITER("Liter"),
    @XmlEnumValue("Mile")
    MILE("Mile"),
    @XmlEnumValue("Km")
    KM("Km");
    private final String value;

    CalculationUnitName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalculationUnitName fromValue(String v) {
        for (CalculationUnitName c: CalculationUnitName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
