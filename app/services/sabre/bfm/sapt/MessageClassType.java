
package services.sabre.bfm.sapt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageClassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="I"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageClassType")
@XmlEnum
public enum MessageClassType {


    /**
     * Error
     * 
     */
    E,

    /**
     * Warrning
     * 
     */
    W,

    /**
     * Diagnostic
     * 
     */
    D,

    /**
     * Info
     * 
     */
    I;

    public String value() {
        return name();
    }

    public static MessageClassType fromValue(String v) {
        return valueOf(v);
    }

}
