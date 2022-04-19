
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustLoyaltySingleVendorInd.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustLoyaltySingleVendorInd">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SingleVndr"/>
 *     &lt;enumeration value="Alliance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustLoyaltySingleVendorInd")
@XmlEnum
public enum CustLoyaltySingleVendorInd {

    @XmlEnumValue("SingleVndr")
    SINGLE_VNDR("SingleVndr"),
    @XmlEnumValue("Alliance")
    ALLIANCE("Alliance");
    private final String value;

    CustLoyaltySingleVendorInd(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustLoyaltySingleVendorInd fromValue(String v) {
        for (CustLoyaltySingleVendorInd c: CustLoyaltySingleVendorInd.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
