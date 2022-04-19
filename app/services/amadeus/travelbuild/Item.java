
package services.amadeus.travelbuild;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Air" type="{http://traveltalk.com/wsTravelBuild}Air" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Vehicle" type="{http://traveltalk.com/wsTravelBuild}Vehicle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Hotel" type="{http://traveltalk.com/wsTravelBuild}Hotel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Rail" type="{http://traveltalk.com/wsTravelBuild}Rail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Cruise" type="{http://traveltalk.com/wsTravelBuild}Cruise" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Tour" type="{http://traveltalk.com/wsTravelBuild}Tour" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="General" type="{http://traveltalk.com/wsTravelBuild}General" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Package" type="{http://traveltalk.com/wsTravelBuild}Package" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" type="{http://traveltalk.com/wsTravelBuild}TPA_ExtensionsRS" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ItinSeqNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="IsPassive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IssueBoardingPass" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BoardingPassIssued" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "air",
    "vehicle",
    "hotel",
    "rail",
    "cruise",
    "tour",
    "general",
    "_package",
    "tpaExtensions"
})
public class Item {

    @XmlElement(name = "Air")
    protected List<Air> air;
    @XmlElement(name = "Vehicle")
    protected List<Vehicle> vehicle;
    @XmlElement(name = "Hotel")
    protected List<Hotel> hotel;
    @XmlElement(name = "Rail")
    protected List<Rail> rail;
    @XmlElement(name = "Cruise")
    protected List<Cruise> cruise;
    @XmlElement(name = "Tour")
    protected List<Tour> tour;
    @XmlElement(name = "General")
    protected List<General> general;
    @XmlElement(name = "Package")
    protected List<java.lang.Package> _package;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsRS tpaExtensions;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "ItinSeqNumber")
    protected Integer itinSeqNumber;
    @XmlAttribute(name = "IsPassive")
    protected Boolean isPassive;
    @XmlAttribute(name = "IssueBoardingPass")
    protected Boolean issueBoardingPass;
    @XmlAttribute(name = "BoardingPassIssued")
    protected Boolean boardingPassIssued;

    /**
     * Gets the value of the air property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the air property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAir().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Air }
     * 
     * 
     */
    public List<Air> getAir() {
        if (air == null) {
            air = new ArrayList<Air>();
        }
        return this.air;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehicle }
     * 
     * 
     */
    public List<Vehicle> getVehicle() {
        if (vehicle == null) {
            vehicle = new ArrayList<Vehicle>();
        }
        return this.vehicle;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hotel }
     * 
     * 
     */
    public List<Hotel> getHotel() {
        if (hotel == null) {
            hotel = new ArrayList<Hotel>();
        }
        return this.hotel;
    }

    /**
     * Gets the value of the rail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rail }
     * 
     * 
     */
    public List<Rail> getRail() {
        if (rail == null) {
            rail = new ArrayList<Rail>();
        }
        return this.rail;
    }

    /**
     * Gets the value of the cruise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cruise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCruise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cruise }
     * 
     * 
     */
    public List<Cruise> getCruise() {
        if (cruise == null) {
            cruise = new ArrayList<Cruise>();
        }
        return this.cruise;
    }

    /**
     * Gets the value of the tour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tour }
     * 
     * 
     */
    public List<Tour> getTour() {
        if (tour == null) {
            tour = new ArrayList<Tour>();
        }
        return this.tour;
    }

    /**
     * Gets the value of the general property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the general property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link General }
     * 
     * 
     */
    public List<General> getGeneral() {
        if (general == null) {
            general = new ArrayList<General>();
        }
        return this.general;
    }

    /**
     * Gets the value of the package property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the package property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Package }
     * 
     * 
     */
    public List<java.lang.Package> getPackage() {
        if (_package == null) {
            _package = new ArrayList<java.lang.Package>();
        }
        return this._package;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsRS }
     *     
     */
    public TPAExtensionsRS getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsRS }
     *     
     */
    public void setTPAExtensions(TPAExtensionsRS value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the rph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * Sets the value of the rph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the itinSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItinSeqNumber() {
        return itinSeqNumber;
    }

    /**
     * Sets the value of the itinSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItinSeqNumber(Integer value) {
        this.itinSeqNumber = value;
    }

    /**
     * Gets the value of the isPassive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsPassive() {
        if (isPassive == null) {
            return false;
        } else {
            return isPassive;
        }
    }

    /**
     * Sets the value of the isPassive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPassive(Boolean value) {
        this.isPassive = value;
    }

    /**
     * Gets the value of the issueBoardingPass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIssueBoardingPass() {
        return issueBoardingPass;
    }

    /**
     * Sets the value of the issueBoardingPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIssueBoardingPass(Boolean value) {
        this.issueBoardingPass = value;
    }

    /**
     * Gets the value of the boardingPassIssued property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoardingPassIssued() {
        return boardingPassIssued;
    }

    /**
     * Sets the value of the boardingPassIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoardingPassIssued(Boolean value) {
        this.boardingPassIssued = value;
    }

}
