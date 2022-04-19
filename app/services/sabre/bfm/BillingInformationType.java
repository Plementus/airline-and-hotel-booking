
package services.sabre.bfm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="UserStation" type="{http://www.w3.org/2001/XMLSchema}short" default="0" />
 *       &lt;attribute name="UserBranch" type="{http://www.w3.org/2001/XMLSchema}short" default="0" />
 *       &lt;attribute name="PartitionID" type="{http://www.opentravel.org/OTA/2003/05}PartitionIDType" />
 *       &lt;attribute name="UserSetAddress" type="{http://www.opentravel.org/OTA/2003/05}LnIATAType" />
 *       &lt;attribute name="AAACity" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="AgentSineIn" type="{http://www.opentravel.org/OTA/2003/05}AgentFunctionType" />
 *       &lt;attribute name="ServiceName" type="{http://www.opentravel.org/OTA/2003/05}ServiceNameType" />
 *       &lt;attribute name="ActionCode" type="{http://www.opentravel.org/OTA/2003/05}BillingActionCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingInformationType")
public class BillingInformationType {

    @XmlAttribute(name = "UserStation")
    protected Short userStation;
    @XmlAttribute(name = "UserBranch")
    protected Short userBranch;
    @XmlAttribute(name = "PartitionID")
    protected String partitionID;
    @XmlAttribute(name = "UserSetAddress")
    protected String userSetAddress;
    @XmlAttribute(name = "AAACity")
    protected String aaaCity;
    @XmlAttribute(name = "AgentSineIn")
    protected String agentSineIn;
    @XmlAttribute(name = "ServiceName")
    protected String serviceName;
    @XmlAttribute(name = "ActionCode")
    protected String actionCode;

    /**
     * Gets the value of the userStation property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public short getUserStation() {
        if (userStation == null) {
            return ((short) 0);
        } else {
            return userStation;
        }
    }

    /**
     * Sets the value of the userStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUserStation(Short value) {
        this.userStation = value;
    }

    /**
     * Gets the value of the userBranch property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public short getUserBranch() {
        if (userBranch == null) {
            return ((short) 0);
        } else {
            return userBranch;
        }
    }

    /**
     * Sets the value of the userBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUserBranch(Short value) {
        this.userBranch = value;
    }

    /**
     * Gets the value of the partitionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionID() {
        return partitionID;
    }

    /**
     * Sets the value of the partitionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitionID(String value) {
        this.partitionID = value;
    }

    /**
     * Gets the value of the userSetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSetAddress() {
        return userSetAddress;
    }

    /**
     * Sets the value of the userSetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSetAddress(String value) {
        this.userSetAddress = value;
    }

    /**
     * Gets the value of the aaaCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAAACity() {
        return aaaCity;
    }

    /**
     * Sets the value of the aaaCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAAACity(String value) {
        this.aaaCity = value;
    }

    /**
     * Gets the value of the agentSineIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentSineIn() {
        return agentSineIn;
    }

    /**
     * Sets the value of the agentSineIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentSineIn(String value) {
        this.agentSineIn = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

}
