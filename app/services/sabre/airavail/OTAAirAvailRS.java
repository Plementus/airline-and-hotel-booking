
package services.sabre.airavail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://services.sabre.com/STL/v01}ApplicationResults"/>
 *         &lt;element name="OriginDestinationOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OriginDestinationOption" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BookingClassAvail" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Availability" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="DaysOfOperation" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="OperationSchedule" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="OperationTimes" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="OperationTime" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                             &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                             &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                             &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                             &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                             &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                             &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
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
 *                                       &lt;element name="DestinationLocation" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="DisclosureAirline" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Equipment" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="FlightDetails" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Canceled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="Charter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="CodeshareBlockDisplay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DiscontinueDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
 *                                               &lt;attribute name="EffectiveDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
 *                                               &lt;attribute name="GroundTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="TotalTravelTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="TrafficRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="MarketingAirline" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ParticipationLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Meal" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="OperatingAirline" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="OriginLocation" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                                     &lt;attribute name="ConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
 *                                     &lt;attribute name="DOT_Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="eTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="OnTimeInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="OriginTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DestinationTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applicationResults",
    "originDestinationOptions"
})
@XmlRootElement(name = "OTA_AirAvailRS", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
public class OTAAirAvailRS {

    @XmlElement(name = "ApplicationResults", namespace = "http://services.service.sabre.com/STL/v01", required = true)
    protected ApplicationResults applicationResults;
    @XmlElement(name = "OriginDestinationOptions", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
    protected OriginDestinationOptions originDestinationOptions;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * Gets the value of the applicationResults property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationResults }
     *     
     */
    public ApplicationResults getApplicationResults() {
        return applicationResults;
    }

    /**
     * Sets the value of the applicationResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationResults }
     *     
     */
    public void setApplicationResults(ApplicationResults value) {
        this.applicationResults = value;
    }

    /**
     * Gets the value of the originDestinationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestinationOptions }
     *     
     */
    public OriginDestinationOptions getOriginDestinationOptions() {
        return originDestinationOptions;
    }

    /**
     * Sets the value of the originDestinationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestinationOptions }
     *     
     */
    public void setOriginDestinationOptions(OriginDestinationOptions value) {
        this.originDestinationOptions = value;
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
        return version;
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
     *         &lt;element name="OriginDestinationOption" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BookingClassAvail" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Availability" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DaysOfOperation" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="OperationSchedule" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="OperationTimes" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="OperationTime" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                                   &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                                   &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                                   &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                                   &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                                   &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                                                   &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DestinationLocation" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DisclosureAirline" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Equipment" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="FlightDetails" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Canceled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="Charter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="CodeshareBlockDisplay" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DiscontinueDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
     *                                     &lt;attribute name="EffectiveDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
     *                                     &lt;attribute name="GroundTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="TotalTravelTime" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="TrafficRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="MarketingAirline" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ParticipationLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Meal" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="OperatingAirline" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="OriginLocation" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                           &lt;attribute name="ConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
     *                           &lt;attribute name="DOT_Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="eTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="OnTimeInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="OriginTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DestinationTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "originDestinationOption"
    })
    public static class OriginDestinationOptions {

        @XmlElement(name = "OriginDestinationOption", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
        protected List<OriginDestinationOption> originDestinationOption;
        @XmlAttribute(name = "OriginTimeZone")
        protected String originTimeZone;
        @XmlAttribute(name = "DestinationTimeZone")
        protected String destinationTimeZone;

        /**
         * Gets the value of the originDestinationOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originDestinationOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginDestinationOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OriginDestinationOption }
         * 
         * 
         */
        public List<OriginDestinationOption> getOriginDestinationOption() {
            if (originDestinationOption == null) {
                originDestinationOption = new ArrayList<OriginDestinationOption>();
            }
            return this.originDestinationOption;
        }

        /**
         * Gets the value of the originTimeZone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginTimeZone() {
            return originTimeZone;
        }

        /**
         * Sets the value of the originTimeZone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginTimeZone(String value) {
            this.originTimeZone = value;
        }

        /**
         * Gets the value of the destinationTimeZone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationTimeZone() {
            return destinationTimeZone;
        }

        /**
         * Sets the value of the destinationTimeZone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationTimeZone(String value) {
            this.destinationTimeZone = value;
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
         *         &lt;element name="FlightSegment" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BookingClassAvail" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Availability" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DaysOfOperation" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="OperationSchedule" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="OperationTimes" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="OperationTime" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                                         &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                                         &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                                         &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                                         &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                                         &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                                         &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DestinationLocation" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DisclosureAirline" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Equipment" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="FlightDetails" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Canceled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="Charter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="CodeshareBlockDisplay" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DiscontinueDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
         *                           &lt;attribute name="EffectiveDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
         *                           &lt;attribute name="GroundTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="TotalTravelTime" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="TrafficRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="MarketingAirline" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ParticipationLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Meal" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="OperatingAirline" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="OriginLocation" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *                 &lt;attribute name="ConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
         *                 &lt;attribute name="DOT_Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="eTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="OnTimeInd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class OriginDestinationOption {

            @XmlElement(name = "FlightSegment", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
            protected List<FlightSegment> flightSegment;
            @XmlAttribute(name = "RPH")
            protected String rph;

            /**
             * Gets the value of the flightSegment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightSegment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FlightSegment }
             * 
             * 
             */
            public List<FlightSegment> getFlightSegment() {
                if (flightSegment == null) {
                    flightSegment = new ArrayList<FlightSegment>();
                }
                return this.flightSegment;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="BookingClassAvail" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Availability" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DaysOfOperation" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="OperationSchedule" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="OperationTimes" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="OperationTime" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                               &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                               &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                               &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                               &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                               &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                                               &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DestinationLocation" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DisclosureAirline" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Equipment" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="FlightDetails" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Canceled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="Charter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="CodeshareBlockDisplay" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DiscontinueDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
             *                 &lt;attribute name="EffectiveDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
             *                 &lt;attribute name="GroundTime" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="TotalTravelTime" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="TrafficRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="MarketingAirline" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ParticipationLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Meal" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="OperatingAirline" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="OriginLocation" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="ArrivalDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
             *       &lt;attribute name="ConnectionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="DepartureDateTime" type="{http://webservices.sabre.com/sabreXML/2011/10}dateTime" />
             *       &lt;attribute name="DOT_Ind" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="eTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="OnTimeInd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="SmokingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="StopQuantity" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "bookingClassAvail",
                "daysOfOperation",
                "destinationLocation",
                "disclosureAirline",
                "equipment",
                "flightDetails",
                "marketingAirline",
                "meal",
                "operatingAirline",
                "originLocation"
            })
            public static class FlightSegment {

                @XmlElement(name = "BookingClassAvail", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                protected List<BookingClassAvail> bookingClassAvail;
                @XmlElement(name = "DaysOfOperation", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                protected DaysOfOperation daysOfOperation;
                @XmlElement(name = "DestinationLocation", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                protected DestinationLocation destinationLocation;
                @XmlElement(name = "DisclosureAirline", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                protected DisclosureAirline disclosureAirline;
                @XmlElement(name = "Equipment", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                protected Equipment equipment;
                @XmlElement(name = "FlightDetails", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                protected FlightDetails flightDetails;
                @XmlElement(name = "MarketingAirline", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                protected MarketingAirline marketingAirline;
                @XmlElement(name = "Meal", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                protected List<Meal> meal;
                @XmlElement(name = "OperatingAirline", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                protected OperatingAirline operatingAirline;
                @XmlElement(name = "OriginLocation", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                protected OriginLocation originLocation;
                @XmlAttribute(name = "ArrivalDateTime")
                protected String arrivalDateTime;
                @XmlAttribute(name = "ConnectionInd")
                protected String connectionInd;
                @XmlAttribute(name = "DepartureDateTime")
                protected String departureDateTime;
                @XmlAttribute(name = "DOT_Ind")
                protected String dotInd;
                @XmlAttribute(name = "eTicket")
                protected Boolean eTicket;
                @XmlAttribute(name = "FlightNumber")
                protected String flightNumber;
                @XmlAttribute(name = "OnTimeInd")
                protected String onTimeInd;
                @XmlAttribute(name = "RPH")
                protected String rph;
                @XmlAttribute(name = "SmokingAllowed")
                protected Boolean smokingAllowed;
                @XmlAttribute(name = "StopQuantity")
                protected String stopQuantity;

                /**
                 * Gets the value of the bookingClassAvail property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the bookingClassAvail property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBookingClassAvail().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BookingClassAvail }
                 * 
                 * 
                 */
                public List<BookingClassAvail> getBookingClassAvail() {
                    if (bookingClassAvail == null) {
                        bookingClassAvail = new ArrayList<BookingClassAvail>();
                    }
                    return this.bookingClassAvail;
                }

                /**
                 * Gets the value of the daysOfOperation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DaysOfOperation }
                 *     
                 */
                public DaysOfOperation getDaysOfOperation() {
                    return daysOfOperation;
                }

                /**
                 * Sets the value of the daysOfOperation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DaysOfOperation }
                 *     
                 */
                public void setDaysOfOperation(DaysOfOperation value) {
                    this.daysOfOperation = value;
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
                 * Gets the value of the disclosureAirline property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DisclosureAirline }
                 *     
                 */
                public DisclosureAirline getDisclosureAirline() {
                    return disclosureAirline;
                }

                /**
                 * Sets the value of the disclosureAirline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DisclosureAirline }
                 *     
                 */
                public void setDisclosureAirline(DisclosureAirline value) {
                    this.disclosureAirline = value;
                }

                /**
                 * Gets the value of the equipment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Equipment }
                 *     
                 */
                public Equipment getEquipment() {
                    return equipment;
                }

                /**
                 * Sets the value of the equipment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Equipment }
                 *     
                 */
                public void setEquipment(Equipment value) {
                    this.equipment = value;
                }

                /**
                 * Gets the value of the flightDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FlightDetails }
                 *     
                 */
                public FlightDetails getFlightDetails() {
                    return flightDetails;
                }

                /**
                 * Sets the value of the flightDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FlightDetails }
                 *     
                 */
                public void setFlightDetails(FlightDetails value) {
                    this.flightDetails = value;
                }

                /**
                 * Gets the value of the marketingAirline property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MarketingAirline }
                 *     
                 */
                public MarketingAirline getMarketingAirline() {
                    return marketingAirline;
                }

                /**
                 * Sets the value of the marketingAirline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MarketingAirline }
                 *     
                 */
                public void setMarketingAirline(MarketingAirline value) {
                    this.marketingAirline = value;
                }

                /**
                 * Gets the value of the meal property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the meal property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMeal().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Meal }
                 * 
                 * 
                 */
                public List<Meal> getMeal() {
                    if (meal == null) {
                        meal = new ArrayList<Meal>();
                    }
                    return this.meal;
                }

                /**
                 * Gets the value of the operatingAirline property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OperatingAirline }
                 *     
                 */
                public OperatingAirline getOperatingAirline() {
                    return operatingAirline;
                }

                /**
                 * Sets the value of the operatingAirline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OperatingAirline }
                 *     
                 */
                public void setOperatingAirline(OperatingAirline value) {
                    this.operatingAirline = value;
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
                 * Gets the value of the connectionInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConnectionInd() {
                    return connectionInd;
                }

                /**
                 * Sets the value of the connectionInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConnectionInd(String value) {
                    this.connectionInd = value;
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
                 * Gets the value of the dotInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDOTInd() {
                    return dotInd;
                }

                /**
                 * Sets the value of the dotInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDOTInd(String value) {
                    this.dotInd = value;
                }

                /**
                 * Gets the value of the eTicket property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isETicket() {
                    return eTicket;
                }

                /**
                 * Sets the value of the eTicket property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setETicket(Boolean value) {
                    this.eTicket = value;
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
                 * Gets the value of the onTimeInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOnTimeInd() {
                    return onTimeInd;
                }

                /**
                 * Sets the value of the onTimeInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOnTimeInd(String value) {
                    this.onTimeInd = value;
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
                 * Gets the value of the smokingAllowed property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isSmokingAllowed() {
                    return smokingAllowed;
                }

                /**
                 * Sets the value of the smokingAllowed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setSmokingAllowed(Boolean value) {
                    this.smokingAllowed = value;
                }

                /**
                 * Gets the value of the stopQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStopQuantity() {
                    return stopQuantity;
                }

                /**
                 * Sets the value of the stopQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStopQuantity(String value) {
                    this.stopQuantity = value;
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
                 *       &lt;attribute name="Availability" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="BrandID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class BookingClassAvail {

                    @XmlAttribute(name = "Availability")
                    protected String availability;
                    @XmlAttribute(name = "BrandID")
                    protected String brandID;
                    @XmlAttribute(name = "ResBookDesigCode")
                    protected String resBookDesigCode;
                    @XmlAttribute(name = "RPH")
                    protected String rph;

                    /**
                     * Gets the value of the availability property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAvailability() {
                        return availability;
                    }

                    /**
                     * Sets the value of the availability property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAvailability(String value) {
                        this.availability = value;
                    }

                    /**
                     * Gets the value of the brandID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBrandID() {
                        return brandID;
                    }

                    /**
                     * Sets the value of the brandID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBrandID(String value) {
                        this.brandID = value;
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
                 *         &lt;element name="OperationSchedule" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="OperationTimes" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="OperationTime" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                                     &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                                     &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                                     &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                                     &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                                     &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                                     &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                    "operationSchedule"
                })
                public static class DaysOfOperation {

                    @XmlElement(name = "OperationSchedule", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                    protected OperationSchedule operationSchedule;

                    /**
                     * Gets the value of the operationSchedule property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OperationSchedule }
                     *     
                     */
                    public OperationSchedule getOperationSchedule() {
                        return operationSchedule;
                    }

                    /**
                     * Sets the value of the operationSchedule property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OperationSchedule }
                     *     
                     */
                    public void setOperationSchedule(OperationSchedule value) {
                        this.operationSchedule = value;
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
                     *         &lt;element name="OperationTimes" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="OperationTime" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                           &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                           &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                           &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                           &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                           &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *                           &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                        "operationTimes"
                    })
                    public static class OperationSchedule {

                        @XmlElement(name = "OperationTimes", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                        protected OperationTimes operationTimes;

                        /**
                         * Gets the value of the operationTimes property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OperationTimes }
                         *     
                         */
                        public OperationTimes getOperationTimes() {
                            return operationTimes;
                        }

                        /**
                         * Sets the value of the operationTimes property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OperationTimes }
                         *     
                         */
                        public void setOperationTimes(OperationTimes value) {
                            this.operationTimes = value;
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
                         *         &lt;element name="OperationTime" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *                 &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *                 &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *                 &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *                 &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *                 &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                         *                 &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                            "operationTime"
                        })
                        public static class OperationTimes {

                            @XmlElement(name = "OperationTime", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                            protected OperationTime operationTime;

                            /**
                             * Gets the value of the operationTime property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link OperationTime }
                             *     
                             */
                            public OperationTime getOperationTime() {
                                return operationTime;
                            }

                            /**
                             * Sets the value of the operationTime property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link OperationTime }
                             *     
                             */
                            public void setOperationTime(OperationTime value) {
                                this.operationTime = value;
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
                             *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                             *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                             *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                             *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                             *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                             *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                             *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class OperationTime {

                                @XmlAttribute(name = "Fri")
                                protected Boolean fri;
                                @XmlAttribute(name = "Mon")
                                protected Boolean mon;
                                @XmlAttribute(name = "Sat")
                                protected Boolean sat;
                                @XmlAttribute(name = "Sun")
                                protected Boolean sun;
                                @XmlAttribute(name = "Thur")
                                protected Boolean thur;
                                @XmlAttribute(name = "Tue")
                                protected Boolean tue;
                                @XmlAttribute(name = "Weds")
                                protected Boolean weds;

                                /**
                                 * Gets the value of the fri property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public Boolean isFri() {
                                    return fri;
                                }

                                /**
                                 * Sets the value of the fri property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public void setFri(Boolean value) {
                                    this.fri = value;
                                }

                                /**
                                 * Gets the value of the mon property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public Boolean isMon() {
                                    return mon;
                                }

                                /**
                                 * Sets the value of the mon property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public void setMon(Boolean value) {
                                    this.mon = value;
                                }

                                /**
                                 * Gets the value of the sat property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public Boolean isSat() {
                                    return sat;
                                }

                                /**
                                 * Sets the value of the sat property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public void setSat(Boolean value) {
                                    this.sat = value;
                                }

                                /**
                                 * Gets the value of the sun property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public Boolean isSun() {
                                    return sun;
                                }

                                /**
                                 * Sets the value of the sun property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public void setSun(Boolean value) {
                                    this.sun = value;
                                }

                                /**
                                 * Gets the value of the thur property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public Boolean isThur() {
                                    return thur;
                                }

                                /**
                                 * Sets the value of the thur property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public void setThur(Boolean value) {
                                    this.thur = value;
                                }

                                /**
                                 * Gets the value of the tue property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public Boolean isTue() {
                                    return tue;
                                }

                                /**
                                 * Sets the value of the tue property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public void setTue(Boolean value) {
                                    this.tue = value;
                                }

                                /**
                                 * Gets the value of the weds property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public Boolean isWeds() {
                                    return weds;
                                }

                                /**
                                 * Sets the value of the weds property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Boolean }
                                 *     
                                 */
                                public void setWeds(Boolean value) {
                                    this.weds = value;
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
                 *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                    @XmlAttribute(name = "LocationCode")
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
                 *       &lt;sequence>
                 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "text"
                })
                public static class DisclosureAirline {

                    @XmlElement(name = "Text", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                    protected List<String> text;
                    @XmlAttribute(name = "Code")
                    protected String code;
                    @XmlAttribute(name = "CompanyShortName")
                    protected String companyShortName;

                    /**
                     * Gets the value of the text property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the text property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getText().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getText() {
                        if (text == null) {
                            text = new ArrayList<String>();
                        }
                        return this.text;
                    }

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

                    /**
                     * Gets the value of the companyShortName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCompanyShortName() {
                        return companyShortName;
                    }

                    /**
                     * Sets the value of the companyShortName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCompanyShortName(String value) {
                        this.companyShortName = value;
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
                 *       &lt;attribute name="AirEquipType" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Equipment {

                    @XmlAttribute(name = "AirEquipType")
                    protected String airEquipType;

                    /**
                     * Gets the value of the airEquipType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAirEquipType() {
                        return airEquipType;
                    }

                    /**
                     * Sets the value of the airEquipType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAirEquipType(String value) {
                        this.airEquipType = value;
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
                 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Canceled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="Charter" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="CodeshareBlockDisplay" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="DiscontinueDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
                 *       &lt;attribute name="EffectiveDate" type="{http://webservices.sabre.com/sabreXML/2011/10}date" />
                 *       &lt;attribute name="GroundTime" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="TotalTravelTime" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="TrafficRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "text"
                })
                public static class FlightDetails {

                    @XmlElement(name = "Text", namespace = "http://webservices.service.sabre.com/sabreXML/2011/10")
                    protected List<String> text;
                    @XmlAttribute(name = "Canceled")
                    protected Boolean canceled;
                    @XmlAttribute(name = "Charter")
                    protected Boolean charter;
                    @XmlAttribute(name = "CodeshareBlockDisplay")
                    protected String codeshareBlockDisplay;
                    @XmlAttribute(name = "DiscontinueDate")
                    protected String discontinueDate;
                    @XmlAttribute(name = "EffectiveDate")
                    protected String effectiveDate;
                    @XmlAttribute(name = "GroundTime")
                    protected String groundTime;
                    @XmlAttribute(name = "TotalTravelTime")
                    protected String totalTravelTime;
                    @XmlAttribute(name = "TrafficRestrictionCode")
                    protected String trafficRestrictionCode;

                    /**
                     * Gets the value of the text property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the text property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getText().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getText() {
                        if (text == null) {
                            text = new ArrayList<String>();
                        }
                        return this.text;
                    }

                    /**
                     * Gets the value of the canceled property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isCanceled() {
                        return canceled;
                    }

                    /**
                     * Sets the value of the canceled property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setCanceled(Boolean value) {
                        this.canceled = value;
                    }

                    /**
                     * Gets the value of the charter property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isCharter() {
                        return charter;
                    }

                    /**
                     * Sets the value of the charter property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setCharter(Boolean value) {
                        this.charter = value;
                    }

                    /**
                     * Gets the value of the codeshareBlockDisplay property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeshareBlockDisplay() {
                        return codeshareBlockDisplay;
                    }

                    /**
                     * Sets the value of the codeshareBlockDisplay property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeshareBlockDisplay(String value) {
                        this.codeshareBlockDisplay = value;
                    }

                    /**
                     * Gets the value of the discontinueDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDiscontinueDate() {
                        return discontinueDate;
                    }

                    /**
                     * Sets the value of the discontinueDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDiscontinueDate(String value) {
                        this.discontinueDate = value;
                    }

                    /**
                     * Gets the value of the effectiveDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEffectiveDate() {
                        return effectiveDate;
                    }

                    /**
                     * Sets the value of the effectiveDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEffectiveDate(String value) {
                        this.effectiveDate = value;
                    }

                    /**
                     * Gets the value of the groundTime property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getGroundTime() {
                        return groundTime;
                    }

                    /**
                     * Sets the value of the groundTime property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setGroundTime(String value) {
                        this.groundTime = value;
                    }

                    /**
                     * Gets the value of the totalTravelTime property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTotalTravelTime() {
                        return totalTravelTime;
                    }

                    /**
                     * Sets the value of the totalTravelTime property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTotalTravelTime(String value) {
                        this.totalTravelTime = value;
                    }

                    /**
                     * Gets the value of the trafficRestrictionCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTrafficRestrictionCode() {
                        return trafficRestrictionCode;
                    }

                    /**
                     * Sets the value of the trafficRestrictionCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTrafficRestrictionCode(String value) {
                        this.trafficRestrictionCode = value;
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
                 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ParticipationLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class MarketingAirline {

                    @XmlAttribute(name = "Code")
                    protected String code;
                    @XmlAttribute(name = "FlightNumber")
                    protected String flightNumber;
                    @XmlAttribute(name = "ParticipationLevel")
                    protected String participationLevel;

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
                     * Gets the value of the participationLevel property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getParticipationLevel() {
                        return participationLevel;
                    }

                    /**
                     * Sets the value of the participationLevel property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setParticipationLevel(String value) {
                        this.participationLevel = value;
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
                 *       &lt;attribute name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Meal {

                    @XmlAttribute(name = "MealCode")
                    protected String mealCode;

                    /**
                     * Gets the value of the mealCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMealCode() {
                        return mealCode;
                    }

                    /**
                     * Sets the value of the mealCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMealCode(String value) {
                        this.mealCode = value;
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
                 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class OperatingAirline {

                    @XmlAttribute(name = "Code")
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                    @XmlAttribute(name = "LocationCode")
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

}
