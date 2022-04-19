
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BagAllowanceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BagAllowanceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Piece"/>
 *     &lt;enumeration value="Weight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BagAllowanceType")
@XmlEnum
public enum BagAllowanceType {

    @XmlEnumValue("Piece")
    PIECE("Piece"),
    @XmlEnumValue("Weight")
    WEIGHT("Weight");
    private final String value;

    BagAllowanceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BagAllowanceType fromValue(String v) {
        for (BagAllowanceType c: BagAllowanceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
