
package services.sabre.airavail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OptionalQualifiers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdditionalAvailability" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="AirExtras" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DirectAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="MoveDown" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FlightQualifiers" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="VendorPrefs" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Airline" maxOccurs="20" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="DirectAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Charters" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="DirectOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Scan" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TimeQualifiers" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ArrivalTime" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="WindowAfter" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
 *                                     &lt;attribute name="WindowBefore" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DepartureTime" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="WindowBefore" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
 *                                     &lt;attribute name="WindowAfter" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OriginDestinationInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightSegment">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ConnectionLocations" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CarrierSpecificDisplay" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="LegOne">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="VendorPrefs">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Airline" maxOccurs="20" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                   &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                   &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="LegThree" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="VendorPrefs">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Airline" maxOccurs="20" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                   &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                   &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="LegTwo">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="VendorPrefs">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Airline" maxOccurs="20" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                   &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                   &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ConnectionLocation" maxOccurs="2">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ConnectTimeOverrides" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="Min" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DestinationLocation">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="OriginLocation">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateOrTime" />
 *                           &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateOrTime" />
 *                           &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ReturnHostCommand" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.1.1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "optionalQualifiers",
    "originDestinationInformation"
})
@XmlRootElement(name = "OTA_AirAvailRQ", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
public class OTAAirAvailRQ {

    @XmlElement(name = "OptionalQualifiers", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
    protected OptionalQualifiers optionalQualifiers;
    @XmlElement(name = "OriginDestinationInformation", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
    protected OriginDestinationInformation originDestinationInformation;
    @XmlAttribute(name = "ReturnHostCommand")
    protected Boolean returnHostCommand;
    @XmlAttribute(name = "TimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Gets the value of the optionalQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalQualifiers }
     *     
     */
    public OptionalQualifiers getOptionalQualifiers() {
        return optionalQualifiers;
    }

    /**
     * Sets the value of the optionalQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalQualifiers }
     *     
     */
    public void setOptionalQualifiers(OptionalQualifiers value) {
        this.optionalQualifiers = value;
    }

    /**
     * Gets the value of the originDestinationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestinationInformation }
     *     
     */
    public OriginDestinationInformation getOriginDestinationInformation() {
        return originDestinationInformation;
    }

    /**
     * Sets the value of the originDestinationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestinationInformation }
     *     
     */
    public void setOriginDestinationInformation(OriginDestinationInformation value) {
        this.originDestinationInformation = value;
    }

    /**
     * Gets the value of the returnHostCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnHostCommand() {
        return returnHostCommand;
    }

    /**
     * Sets the value of the returnHostCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnHostCommand(Boolean value) {
        this.returnHostCommand = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.1.1";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AdditionalAvailability" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="AirExtras" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DirectAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="MoveDown" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FlightQualifiers" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="VendorPrefs" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Airline" maxOccurs="20" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="DirectAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Charters" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="DirectOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Scan" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TimeQualifiers" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ArrivalTime" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="WindowAfter" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
     *                           &lt;attribute name="WindowBefore" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DepartureTime" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="WindowBefore" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
     *                           &lt;attribute name="WindowAfter" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "additionalAvailability",
        "flightQualifiers",
        "timeQualifiers"
    })
    public static class OptionalQualifiers {

        @XmlElement(name = "AdditionalAvailability", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
        protected AdditionalAvailability additionalAvailability;
        @XmlElement(name = "FlightQualifiers", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
        protected FlightQualifiers flightQualifiers;
        @XmlElement(name = "TimeQualifiers", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
        protected TimeQualifiers timeQualifiers;

        /**
         * Gets the value of the additionalAvailability property.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalAvailability }
         *     
         */
        public AdditionalAvailability getAdditionalAvailability() {
            return additionalAvailability;
        }

        /**
         * Sets the value of the additionalAvailability property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalAvailability }
         *     
         */
        public void setAdditionalAvailability(AdditionalAvailability value) {
            this.additionalAvailability = value;
        }

        /**
         * Gets the value of the flightQualifiers property.
         * 
         * @return
         *     possible object is
         *     {@link FlightQualifiers }
         *     
         */
        public FlightQualifiers getFlightQualifiers() {
            return flightQualifiers;
        }

        /**
         * Sets the value of the flightQualifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightQualifiers }
         *     
         */
        public void setFlightQualifiers(FlightQualifiers value) {
            this.flightQualifiers = value;
        }

        /**
         * Gets the value of the timeQualifiers property.
         * 
         * @return
         *     possible object is
         *     {@link TimeQualifiers }
         *     
         */
        public TimeQualifiers getTimeQualifiers() {
            return timeQualifiers;
        }

        /**
         * Sets the value of the timeQualifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeQualifiers }
         *     
         */
        public void setTimeQualifiers(TimeQualifiers value) {
            this.timeQualifiers = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="AirExtras" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DirectAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="MoveDown" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AdditionalAvailability {

            @XmlAttribute(name = "AirExtras")
            protected String airExtras;
            @XmlAttribute(name = "DirectAccess")
            protected Boolean directAccess;
            @XmlAttribute(name = "Ind")
            protected Boolean ind;
            @XmlAttribute(name = "MoveDown")
            protected Boolean moveDown;

            /**
             * Gets the value of the airExtras property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAirExtras() {
                return airExtras;
            }

            /**
             * Sets the value of the airExtras property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAirExtras(String value) {
                this.airExtras = value;
            }

            /**
             * Gets the value of the directAccess property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDirectAccess() {
                return directAccess;
            }

            /**
             * Sets the value of the directAccess property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDirectAccess(Boolean value) {
                this.directAccess = value;
            }

            /**
             * Gets the value of the ind property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isInd() {
                return ind;
            }

            /**
             * Sets the value of the ind property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInd(Boolean value) {
                this.ind = value;
            }

            /**
             * Gets the value of the moveDown property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMoveDown() {
                return moveDown;
            }

            /**
             * Sets the value of the moveDown property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMoveDown(Boolean value) {
                this.moveDown = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="VendorPrefs" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Airline" maxOccurs="20" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="DirectAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Charters" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="DirectOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Scan" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "vendorPrefs"
        })
        public static class FlightQualifiers {

            @XmlElement(name = "VendorPrefs", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
            protected VendorPrefs vendorPrefs;
            @XmlAttribute(name = "Charters")
            protected Boolean charters;
            @XmlAttribute(name = "DirectOnly")
            protected Boolean directOnly;
            @XmlAttribute(name = "ExcludeCodeshares")
            protected Boolean excludeCodeshares;
            @XmlAttribute(name = "Scan")
            protected Boolean scan;

            /**
             * Gets the value of the vendorPrefs property.
             * 
             * @return
             *     possible object is
             *     {@link VendorPrefs }
             *     
             */
            public VendorPrefs getVendorPrefs() {
                return vendorPrefs;
            }

            /**
             * Sets the value of the vendorPrefs property.
             * 
             * @param value
             *     allowed object is
             *     {@link VendorPrefs }
             *     
             */
            public void setVendorPrefs(VendorPrefs value) {
                this.vendorPrefs = value;
            }

            /**
             * Gets the value of the charters property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCharters() {
                return charters;
            }

            /**
             * Sets the value of the charters property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCharters(Boolean value) {
                this.charters = value;
            }

            /**
             * Gets the value of the directOnly property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDirectOnly() {
                return directOnly;
            }

            /**
             * Sets the value of the directOnly property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDirectOnly(Boolean value) {
                this.directOnly = value;
            }

            /**
             * Gets the value of the excludeCodeshares property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isExcludeCodeshares() {
                return excludeCodeshares;
            }

            /**
             * Sets the value of the excludeCodeshares property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setExcludeCodeshares(Boolean value) {
                this.excludeCodeshares = value;
            }

            /**
             * Gets the value of the scan property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isScan() {
                return scan;
            }

            /**
             * Sets the value of the scan property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setScan(Boolean value) {
                this.scan = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Airline" maxOccurs="20" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="DirectAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "airline"
            })
            public static class VendorPrefs {

                @XmlElement(name = "Airline", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                protected List<Airline> airline;
                @XmlAttribute(name = "DirectAccess")
                protected Boolean directAccess;
                @XmlAttribute(name = "Exclude")
                protected Boolean exclude;

                /**
                 * Gets the value of the airline property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the airline property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAirline().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Airline }
                 * 
                 * 
                 */
                public List<Airline> getAirline() {
                    if (airline == null) {
                        airline = new ArrayList<Airline>();
                    }
                    return this.airline;
                }

                /**
                 * Gets the value of the directAccess property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isDirectAccess() {
                    return directAccess;
                }

                /**
                 * Sets the value of the directAccess property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setDirectAccess(Boolean value) {
                    this.directAccess = value;
                }

                /**
                 * Gets the value of the exclude property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isExclude() {
                    return exclude;
                }

                /**
                 * Sets the value of the exclude property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setExclude(Boolean value) {
                    this.exclude = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Airline {

                    @XmlAttribute(name = "Code", required = true)
                    protected String code;

                    /**
                     * Gets the value of the code property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCode(String value) {
                        this.code = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ArrivalTime" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="WindowAfter" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
         *                 &lt;attribute name="WindowBefore" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DepartureTime" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="WindowBefore" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
         *                 &lt;attribute name="WindowAfter" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "arrivalTime",
            "departureTime"
        })
        public static class TimeQualifiers {

            @XmlElement(name = "ArrivalTime", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
            protected ArrivalTime arrivalTime;
            @XmlElement(name = "DepartureTime", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
            protected DepartureTime departureTime;

            /**
             * Gets the value of the arrivalTime property.
             * 
             * @return
             *     possible object is
             *     {@link ArrivalTime }
             *     
             */
            public ArrivalTime getArrivalTime() {
                return arrivalTime;
            }

            /**
             * Sets the value of the arrivalTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link ArrivalTime }
             *     
             */
            public void setArrivalTime(ArrivalTime value) {
                this.arrivalTime = value;
            }

            /**
             * Gets the value of the departureTime property.
             * 
             * @return
             *     possible object is
             *     {@link DepartureTime }
             *     
             */
            public DepartureTime getDepartureTime() {
                return departureTime;
            }

            /**
             * Sets the value of the departureTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link DepartureTime }
             *     
             */
            public void setDepartureTime(DepartureTime value) {
                this.departureTime = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="WindowAfter" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
             *       &lt;attribute name="WindowBefore" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ArrivalTime {

                @XmlAttribute(name = "WindowAfter", required = true)
                protected String windowAfter;
                @XmlAttribute(name = "WindowBefore", required = true)
                protected String windowBefore;

                /**
                 * Gets the value of the windowAfter property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWindowAfter() {
                    return windowAfter;
                }

                /**
                 * Sets the value of the windowAfter property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWindowAfter(String value) {
                    this.windowAfter = value;
                }

                /**
                 * Gets the value of the windowBefore property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWindowBefore() {
                    return windowBefore;
                }

                /**
                 * Sets the value of the windowBefore property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWindowBefore(String value) {
                    this.windowBefore = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="WindowBefore" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
             *       &lt;attribute name="WindowAfter" use="required" type="{http://webservices.sabre.com/sabreXML/2011/10}time" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DepartureTime {

                @XmlAttribute(name = "WindowBefore", required = true)
                protected String windowBefore;
                @XmlAttribute(name = "WindowAfter", required = true)
                protected String windowAfter;

                /**
                 * Gets the value of the windowBefore property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWindowBefore() {
                    return windowBefore;
                }

                /**
                 * Sets the value of the windowBefore property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWindowBefore(String value) {
                    this.windowBefore = value;
                }

                /**
                 * Gets the value of the windowAfter property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWindowAfter() {
                    return windowAfter;
                }

                /**
                 * Sets the value of the windowAfter property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWindowAfter(String value) {
                    this.windowAfter = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FlightSegment">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ConnectionLocations" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CarrierSpecificDisplay" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="LegOne">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="VendorPrefs">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Airline" maxOccurs="20" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                         &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                         &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="LegThree" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="VendorPrefs">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Airline" maxOccurs="20" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                         &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                         &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="LegTwo">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="VendorPrefs">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Airline" maxOccurs="20" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                         &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                         &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ConnectionLocation" maxOccurs="2">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ConnectTimeOverrides" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="Min" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DestinationLocation">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="OriginLocation">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateOrTime" />
     *                 &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateOrTime" />
     *                 &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flightSegment"
    })
    public static class OriginDestinationInformation {

        @XmlElement(name = "FlightSegment", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10", required = true)
        protected FlightSegment flightSegment;

        /**
         * Gets the value of the flightSegment property.
         * 
         * @return
         *     possible object is
         *     {@link FlightSegment }
         *     
         */
        public FlightSegment getFlightSegment() {
            return flightSegment;
        }

        /**
         * Sets the value of the flightSegment property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightSegment }
         *     
         */
        public void setFlightSegment(FlightSegment value) {
            this.flightSegment = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ConnectionLocations" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CarrierSpecificDisplay" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="LegOne">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="VendorPrefs">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Airline" maxOccurs="20" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                               &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                               &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="LegThree" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="VendorPrefs">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Airline" maxOccurs="20" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                               &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                               &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="LegTwo">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="VendorPrefs">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Airline" maxOccurs="20" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                               &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                               &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ConnectionLocation" maxOccurs="2">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ConnectTimeOverrides" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="Min" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DestinationLocation">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="OriginLocation">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateOrTime" />
         *       &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateOrTime" />
         *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="NumberInParty" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "connectionLocations",
            "destinationLocation",
            "originLocation"
        })
        public static class FlightSegment {

            @XmlElement(name = "ConnectionLocations", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
            protected ConnectionLocations connectionLocations;
            @XmlElement(name = "DestinationLocation", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10", required = true)
            protected DestinationLocation destinationLocation;
            @XmlElement(name = "OriginLocation", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10", required = true)
            protected OriginLocation originLocation;
            @XmlAttribute(name = "ArrivalDateTime")
            protected String arrivalDateTime;
            @XmlAttribute(name = "DepartureDateTime")
            protected String departureDateTime;
            @XmlAttribute(name = "FlightNumber")
            protected String flightNumber;
            @XmlAttribute(name = "NumberInParty")
            protected String numberInParty;
            @XmlAttribute(name = "ResBookDesigCode")
            protected String resBookDesigCode;

            /**
             * Gets the value of the connectionLocations property.
             * 
             * @return
             *     possible object is
             *     {@link ConnectionLocations }
             *     
             */
            public ConnectionLocations getConnectionLocations() {
                return connectionLocations;
            }

            /**
             * Sets the value of the connectionLocations property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConnectionLocations }
             *     
             */
            public void setConnectionLocations(ConnectionLocations value) {
                this.connectionLocations = value;
            }

            /**
             * Gets the value of the destinationLocation property.
             * 
             * @return
             *     possible object is
             *     {@link DestinationLocation }
             *     
             */
            public DestinationLocation getDestinationLocation() {
                return destinationLocation;
            }

            /**
             * Sets the value of the destinationLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link DestinationLocation }
             *     
             */
            public void setDestinationLocation(DestinationLocation value) {
                this.destinationLocation = value;
            }

            /**
             * Gets the value of the originLocation property.
             * 
             * @return
             *     possible object is
             *     {@link OriginLocation }
             *     
             */
            public OriginLocation getOriginLocation() {
                return originLocation;
            }

            /**
             * Sets the value of the originLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link OriginLocation }
             *     
             */
            public void setOriginLocation(OriginLocation value) {
                this.originLocation = value;
            }

            /**
             * Gets the value of the arrivalDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArrivalDateTime() {
                return arrivalDateTime;
            }

            /**
             * Sets the value of the arrivalDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArrivalDateTime(String value) {
                this.arrivalDateTime = value;
            }

            /**
             * Gets the value of the departureDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartureDateTime() {
                return departureDateTime;
            }

            /**
             * Sets the value of the departureDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartureDateTime(String value) {
                this.departureDateTime = value;
            }

            /**
             * Gets the value of the flightNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightNumber() {
                return flightNumber;
            }

            /**
             * Sets the value of the flightNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightNumber(String value) {
                this.flightNumber = value;
            }

            /**
             * Gets the value of the numberInParty property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumberInParty() {
                return numberInParty;
            }

            /**
             * Sets the value of the numberInParty property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumberInParty(String value) {
                this.numberInParty = value;
            }

            /**
             * Gets the value of the resBookDesigCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResBookDesigCode() {
                return resBookDesigCode;
            }

            /**
             * Sets the value of the resBookDesigCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResBookDesigCode(String value) {
                this.resBookDesigCode = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="CarrierSpecificDisplay" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="LegOne">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="VendorPrefs">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Airline" maxOccurs="20" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                     &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                     &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="LegThree" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="VendorPrefs">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Airline" maxOccurs="20" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                     &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                     &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="LegTwo">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="VendorPrefs">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Airline" maxOccurs="20" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                     &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                     &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ConnectionLocation" maxOccurs="2">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ConnectTimeOverrides" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="Min" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "carrierSpecificDisplay",
                "connectionLocation"
            })
            public static class ConnectionLocations {

                @XmlElement(name = "CarrierSpecificDisplay", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                protected CarrierSpecificDisplay carrierSpecificDisplay;
                @XmlElement(name = "ConnectionLocation", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10", required = true)
                protected List<ConnectionLocation> connectionLocation;

                /**
                 * Gets the value of the carrierSpecificDisplay property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CarrierSpecificDisplay }
                 *     
                 */
                public CarrierSpecificDisplay getCarrierSpecificDisplay() {
                    return carrierSpecificDisplay;
                }

                /**
                 * Sets the value of the carrierSpecificDisplay property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CarrierSpecificDisplay }
                 *     
                 */
                public void setCarrierSpecificDisplay(CarrierSpecificDisplay value) {
                    this.carrierSpecificDisplay = value;
                }

                /**
                 * Gets the value of the connectionLocation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the connectionLocation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConnectionLocation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ConnectionLocation }
                 * 
                 * 
                 */
                public List<ConnectionLocation> getConnectionLocation() {
                    if (connectionLocation == null) {
                        connectionLocation = new ArrayList<ConnectionLocation>();
                    }
                    return this.connectionLocation;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="LegOne">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="VendorPrefs">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Airline" maxOccurs="20" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                           &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                           &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="LegThree" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="VendorPrefs">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Airline" maxOccurs="20" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                           &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                           &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="LegTwo">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="VendorPrefs">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Airline" maxOccurs="20" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                           &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                           &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "legOne",
                    "legThree",
                    "legTwo"
                })
                public static class CarrierSpecificDisplay {

                    @XmlElement(name = "LegOne", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10", required = true)
                    protected LegOne legOne;
                    @XmlElement(name = "LegThree", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                    protected LegThree legThree;
                    @XmlElement(name = "LegTwo", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10", required = true)
                    protected LegTwo legTwo;

                    /**
                     * Gets the value of the legOne property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link LegOne }
                     *     
                     */
                    public LegOne getLegOne() {
                        return legOne;
                    }

                    /**
                     * Sets the value of the legOne property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link LegOne }
                     *     
                     */
                    public void setLegOne(LegOne value) {
                        this.legOne = value;
                    }

                    /**
                     * Gets the value of the legThree property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link LegThree }
                     *     
                     */
                    public LegThree getLegThree() {
                        return legThree;
                    }

                    /**
                     * Sets the value of the legThree property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link LegThree }
                     *     
                     */
                    public void setLegThree(LegThree value) {
                        this.legThree = value;
                    }

                    /**
                     * Gets the value of the legTwo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link LegTwo }
                     *     
                     */
                    public LegTwo getLegTwo() {
                        return legTwo;
                    }

                    /**
                     * Sets the value of the legTwo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link LegTwo }
                     *     
                     */
                    public void setLegTwo(LegTwo value) {
                        this.legTwo = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="VendorPrefs">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Airline" maxOccurs="20" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                 &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                 &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "vendorPrefs"
                    })
                    public static class LegOne {

                        @XmlElement(name = "VendorPrefs", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10", required = true)
                        protected VendorPrefs vendorPrefs;

                        /**
                         * Gets the value of the vendorPrefs property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link VendorPrefs }
                         *     
                         */
                        public VendorPrefs getVendorPrefs() {
                            return vendorPrefs;
                        }

                        /**
                         * Sets the value of the vendorPrefs property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link VendorPrefs }
                         *     
                         */
                        public void setVendorPrefs(VendorPrefs value) {
                            this.vendorPrefs = value;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="Airline" maxOccurs="20" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *       &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *       &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *       &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "airline"
                        })
                        public static class VendorPrefs {

                            @XmlElement(name = "Airline", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                            protected List<Airline> airline;
                            @XmlAttribute(name = "Exclude")
                            protected Boolean exclude;
                            @XmlAttribute(name = "ExcludeCodeshares")
                            protected Boolean excludeCodeshares;
                            @XmlAttribute(name = "Any")
                            protected Boolean any;

                            /**
                             * Gets the value of the airline property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the airline property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getAirline().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link Airline }
                             * 
                             * 
                             */
                            public List<Airline> getAirline() {
                                if (airline == null) {
                                    airline = new ArrayList<Airline>();
                                }
                                return this.airline;
                            }

                            /**
                             * Gets the value of the exclude property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isExclude() {
                                return exclude;
                            }

                            /**
                             * Sets the value of the exclude property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setExclude(Boolean value) {
                                this.exclude = value;
                            }

                            /**
                             * Gets the value of the excludeCodeshares property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isExcludeCodeshares() {
                                return excludeCodeshares;
                            }

                            /**
                             * Sets the value of the excludeCodeshares property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setExcludeCodeshares(Boolean value) {
                                this.excludeCodeshares = value;
                            }

                            /**
                             * Gets the value of the any property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isAny() {
                                return any;
                            }

                            /**
                             * Sets the value of the any property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setAny(Boolean value) {
                                this.any = value;
                            }


                            /**
                             * <p>Java class for anonymous complex type.
                             * 
                             * <p>The following schema fragment specifies the expected content contained within this class.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class Airline {

                                @XmlAttribute(name = "Code", required = true)
                                protected String code;

                                /**
                                 * Gets the value of the code property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCode() {
                                    return code;
                                }

                                /**
                                 * Sets the value of the code property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCode(String value) {
                                    this.code = value;
                                }

                            }

                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="VendorPrefs">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Airline" maxOccurs="20" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                 &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                 &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "vendorPrefs"
                    })
                    public static class LegThree {

                        @XmlElement(name = "VendorPrefs", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10", required = true)
                        protected VendorPrefs vendorPrefs;

                        /**
                         * Gets the value of the vendorPrefs property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link VendorPrefs }
                         *     
                         */
                        public VendorPrefs getVendorPrefs() {
                            return vendorPrefs;
                        }

                        /**
                         * Sets the value of the vendorPrefs property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link VendorPrefs }
                         *     
                         */
                        public void setVendorPrefs(VendorPrefs value) {
                            this.vendorPrefs = value;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="Airline" maxOccurs="20" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *       &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *       &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *       &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "airline"
                        })
                        public static class VendorPrefs {

                            @XmlElement(name = "Airline", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                            protected List<Airline> airline;
                            @XmlAttribute(name = "Exclude")
                            protected Boolean exclude;
                            @XmlAttribute(name = "ExcludeCodeshares")
                            protected Boolean excludeCodeshares;
                            @XmlAttribute(name = "Any")
                            protected Boolean any;

                            /**
                             * Gets the value of the airline property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the airline property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getAirline().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link Airline }
                             * 
                             * 
                             */
                            public List<Airline> getAirline() {
                                if (airline == null) {
                                    airline = new ArrayList<Airline>();
                                }
                                return this.airline;
                            }

                            /**
                             * Gets the value of the exclude property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isExclude() {
                                return exclude;
                            }

                            /**
                             * Sets the value of the exclude property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setExclude(Boolean value) {
                                this.exclude = value;
                            }

                            /**
                             * Gets the value of the excludeCodeshares property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isExcludeCodeshares() {
                                return excludeCodeshares;
                            }

                            /**
                             * Sets the value of the excludeCodeshares property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setExcludeCodeshares(Boolean value) {
                                this.excludeCodeshares = value;
                            }

                            /**
                             * Gets the value of the any property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isAny() {
                                return any;
                            }

                            /**
                             * Sets the value of the any property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setAny(Boolean value) {
                                this.any = value;
                            }


                            /**
                             * <p>Java class for anonymous complex type.
                             * 
                             * <p>The following schema fragment specifies the expected content contained within this class.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class Airline {

                                @XmlAttribute(name = "Code", required = true)
                                protected String code;

                                /**
                                 * Gets the value of the code property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCode() {
                                    return code;
                                }

                                /**
                                 * Sets the value of the code property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCode(String value) {
                                    this.code = value;
                                }

                            }

                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="VendorPrefs">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Airline" maxOccurs="20" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                 &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                 &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "vendorPrefs"
                    })
                    public static class LegTwo {

                        @XmlElement(name = "VendorPrefs", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10", required = true)
                        protected VendorPrefs vendorPrefs;

                        /**
                         * Gets the value of the vendorPrefs property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link VendorPrefs }
                         *     
                         */
                        public VendorPrefs getVendorPrefs() {
                            return vendorPrefs;
                        }

                        /**
                         * Sets the value of the vendorPrefs property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link VendorPrefs }
                         *     
                         */
                        public void setVendorPrefs(VendorPrefs value) {
                            this.vendorPrefs = value;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="Airline" maxOccurs="20" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *       &lt;attribute name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *       &lt;attribute name="ExcludeCodeshares" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *       &lt;attribute name="Any" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "airline"
                        })
                        public static class VendorPrefs {

                            @XmlElement(name = "Airline", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                            protected List<Airline> airline;
                            @XmlAttribute(name = "Exclude")
                            protected Boolean exclude;
                            @XmlAttribute(name = "ExcludeCodeshares")
                            protected Boolean excludeCodeshares;
                            @XmlAttribute(name = "Any")
                            protected Boolean any;

                            /**
                             * Gets the value of the airline property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the airline property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getAirline().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link Airline }
                             * 
                             * 
                             */
                            public List<Airline> getAirline() {
                                if (airline == null) {
                                    airline = new ArrayList<Airline>();
                                }
                                return this.airline;
                            }

                            /**
                             * Gets the value of the exclude property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isExclude() {
                                return exclude;
                            }

                            /**
                             * Sets the value of the exclude property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setExclude(Boolean value) {
                                this.exclude = value;
                            }

                            /**
                             * Gets the value of the excludeCodeshares property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isExcludeCodeshares() {
                                return excludeCodeshares;
                            }

                            /**
                             * Sets the value of the excludeCodeshares property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setExcludeCodeshares(Boolean value) {
                                this.excludeCodeshares = value;
                            }

                            /**
                             * Gets the value of the any property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Boolean }
                             *     
                             */
                            public Boolean isAny() {
                                return any;
                            }

                            /**
                             * Sets the value of the any property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Boolean }
                             *     
                             */
                            public void setAny(Boolean value) {
                                this.any = value;
                            }


                            /**
                             * <p>Java class for anonymous complex type.
                             * 
                             * <p>The following schema fragment specifies the expected content contained within this class.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class Airline {

                                @XmlAttribute(name = "Code", required = true)
                                protected String code;

                                /**
                                 * Gets the value of the code property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCode() {
                                    return code;
                                }

                                /**
                                 * Sets the value of the code property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCode(String value) {
                                    this.code = value;
                                }

                            }

                        }

                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="ConnectTimeOverrides" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="Min" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "connectTimeOverrides"
                })
                public static class ConnectionLocation {

                    @XmlElement(name = "ConnectTimeOverrides", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                    protected ConnectTimeOverrides connectTimeOverrides;
                    @XmlAttribute(name = "LocationCode", required = true)
                    protected String locationCode;

                    /**
                     * Gets the value of the connectTimeOverrides property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ConnectTimeOverrides }
                     *     
                     */
                    public ConnectTimeOverrides getConnectTimeOverrides() {
                        return connectTimeOverrides;
                    }

                    /**
                     * Sets the value of the connectTimeOverrides property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ConnectTimeOverrides }
                     *     
                     */
                    public void setConnectTimeOverrides(ConnectTimeOverrides value) {
                        this.connectTimeOverrides = value;
                    }

                    /**
                     * Gets the value of the locationCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLocationCode() {
                        return locationCode;
                    }

                    /**
                     * Sets the value of the locationCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLocationCode(String value) {
                        this.locationCode = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="Min" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class ConnectTimeOverrides {

                        @XmlAttribute(name = "Max")
                        protected String max;
                        @XmlAttribute(name = "Min", required = true)
                        protected String min;

                        /**
                         * Gets the value of the max property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMax() {
                            return max;
                        }

                        /**
                         * Sets the value of the max property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMax(String value) {
                            this.max = value;
                        }

                        /**
                         * Gets the value of the min property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMin() {
                            return min;
                        }

                        /**
                         * Sets the value of the min property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMin(String value) {
                            this.min = value;
                        }

                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DestinationLocation {

                @XmlAttribute(name = "LocationCode", required = true)
                protected String locationCode;

                /**
                 * Gets the value of the locationCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocationCode() {
                    return locationCode;
                }

                /**
                 * Sets the value of the locationCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocationCode(String value) {
                    this.locationCode = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="LocationCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class OriginLocation {

                @XmlAttribute(name = "LocationCode", required = true)
                protected String locationCode;

                /**
                 * Gets the value of the locationCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocationCode() {
                    return locationCode;
                }

                /**
                 * Sets the value of the locationCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocationCode(String value) {
                    this.locationCode = value;
                }

            }

        }

    }

}
