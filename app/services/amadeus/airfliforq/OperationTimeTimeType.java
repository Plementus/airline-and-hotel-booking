
package services.amadeus.airfliforq;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationTimeTimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationTimeTimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Actual"/>
 *     &lt;enumeration value="Scheduled"/>
 *     &lt;enumeration value="Estimated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperationTimeTimeType")
@XmlEnum
public enum OperationTimeTimeType {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled"),
    @XmlEnumValue("Estimated")
    ESTIMATED("Estimated");
    private final String value;

    OperationTimeTimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationTimeTimeType fromValue(String v) {
        for (OperationTimeTimeType c: OperationTimeTimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
