
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountPercentBasisType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AmountPercentBasisType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FullStay"/>
 *     &lt;enumeration value="Nights"/>
 *     &lt;enumeration value="FirstLast"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmountPercentBasisType")
@XmlEnum
public enum AmountPercentBasisType {

    @XmlEnumValue("FullStay")
    FULL_STAY("FullStay"),
    @XmlEnumValue("Nights")
    NIGHTS("Nights"),
    @XmlEnumValue("FirstLast")
    FIRST_LAST("FirstLast");
    private final String value;

    AmountPercentBasisType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmountPercentBasisType fromValue(String v) {
        for (AmountPercentBasisType c: AmountPercentBasisType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
