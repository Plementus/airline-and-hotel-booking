
package services.sabre.bfm.sapt;

import core.gdsbookingengine.FlightSearchResponse;
import core.gdsbookingengine.PricedItineraryFactory;
import core.gdsbookingengine.PricedItineraryWSResponse;
import services.sabre.utils.BfmSAPTPricedItineraryFactory;
//import services.utils.PricedItineraryFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Errors" type="{http://www.opentravel.org/OTA/2003/05}ErrorsType" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="Success" type="{http://www.opentravel.org/OTA/2003/05}SuccessType" minOccurs="0"/>
 *           &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/>
 *           &lt;element name="PricedItineraries" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="TPA_Extensions" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}ComplexProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="OneWayItineraries" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="BrandedOneWayItineraries" maxOccurs="10" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="TPA_Extensions" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="SimpleOneWayItineraries" maxOccurs="10" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="TPA_Extensions" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="DepartedItineraries" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="PricedItineraries" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="TPA_Extensions" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}ComplexProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="OneWayItineraries" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="BrandedOneWayItineraries" maxOccurs="10" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="TPA_Extensions" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="SimpleOneWayItineraries" maxOccurs="10" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="TPA_Extensions" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="SoldOutItineraries" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="PricedItineraries" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="TPA_Extensions" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}ComplexProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="OneWayItineraries" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="BrandedOneWayItineraries" maxOccurs="10" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="TPA_Extensions" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="SimpleOneWayItineraries" maxOccurs="10" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="TPA_Extensions" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="AvailableItineraries" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="PricedItineraries" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="TPA_Extensions" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}ComplexProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="OneWayItineraries" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="BrandedOneWayItineraries" maxOccurs="10" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="TPA_Extensions" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="SimpleOneWayItineraries" maxOccurs="10" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="TPA_Extensions" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="TPA_Extensions" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="AirlineOrderList" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="AirlineOrder" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;simpleContent>
 *                                     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
 *                                       &lt;attribute name="SequenceNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                                     &lt;/extension>
 *                                   &lt;/simpleContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OTA_PayloadStdAttributes"/>
 *       &lt;attribute name="PricedItinCount" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="BrandedOneWayItinCount" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="SimpleOneWayItinCount" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="DepartedItinCount" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="SoldOutItinCount" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="AvailableItinCount" type="{http://www.w3.org/2001/XMLSchema}short" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errors",
    "success",
    "warnings",
    "pricedItineraries",
    "oneWayItineraries",
    "departedItineraries",
    "soldOutItineraries",
    "availableItineraries",
    "tpaExtensions"
})
@XmlRootElement(name = "OTA_AirLowFareSearchRS")
public class OTAAirLowFareSearchRS implements FlightSearchResponse {

    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlElement(name = "Success")
    protected SuccessType success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "PricedItineraries")
    protected PricedItineraries pricedItineraries;
    @XmlElement(name = "OneWayItineraries")
    protected OneWayItineraries oneWayItineraries;
    @XmlElement(name = "DepartedItineraries")
    protected DepartedItineraries departedItineraries;
    @XmlElement(name = "SoldOutItineraries")
    protected SoldOutItineraries soldOutItineraries;
    @XmlElement(name = "AvailableItineraries")
    protected AvailableItineraries availableItineraries;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;
    @XmlAttribute(name = "PricedItinCount")
    protected Short pricedItinCount;
    @XmlAttribute(name = "BrandedOneWayItinCount")
    protected Short brandedOneWayItinCount;
    @XmlAttribute(name = "SimpleOneWayItinCount")
    protected Short simpleOneWayItinCount;
    @XmlAttribute(name = "DepartedItinCount")
    protected Short departedItinCount;
    @XmlAttribute(name = "SoldOutItinCount")
    protected Short soldOutItinCount;
    @XmlAttribute(name = "AvailableItinCount")
    protected Short availableItinCount;
    @XmlAttribute(name = "EchoToken")
    protected String echoToken;
    @XmlAttribute(name = "TimeStamp")
    protected String timeStamp;
    @XmlAttribute(name = "Target")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String target;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlAttribute(name = "SequenceNmbr")
    protected String sequenceNmbr;
    @XmlAttribute(name = "TransactionStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transactionStatusCode;
    @XmlAttribute(name = "PrimaryLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String primaryLangID;
    @XmlAttribute(name = "AltLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String altLangID;

  @Override
  public List<PricedItineraryWSResponse> getPricedItineraryWSResponses() {
    PricedItineraryFactory factory = new BfmSAPTPricedItineraryFactory();
    return getPricedItineraries().getPricedItinerary().stream()
        .map(factory::createPricedItineraryWSResponse).collect(Collectors.toList());
  }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorsType }
     *     
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorsType }
     *     
     */
    public void setErrors(ErrorsType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessType }
     *     
     */
    public SuccessType getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessType }
     *     
     */
    public void setSuccess(SuccessType value) {
        this.success = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link WarningsType }
     *     
     */
    public WarningsType getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningsType }
     *     
     */
    public void setWarnings(WarningsType value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the pricedItineraries property.
     * 
     * @return
     *     possible object is
     *     {@link PricedItineraries }
     *     
     */
    public PricedItineraries getPricedItineraries() {
        return pricedItineraries;
    }

    /**
     * Sets the value of the pricedItineraries property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedItineraries }
     *     
     */
    public void setPricedItineraries(PricedItineraries value) {
        this.pricedItineraries = value;
    }

    /**
     * Gets the value of the oneWayItineraries property.
     * 
     * @return
     *     possible object is
     *     {@link OneWayItineraries }
     *     
     */
    public OneWayItineraries getOneWayItineraries() {
        return oneWayItineraries;
    }

    /**
     * Sets the value of the oneWayItineraries property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneWayItineraries }
     *     
     */
    public void setOneWayItineraries(OneWayItineraries value) {
        this.oneWayItineraries = value;
    }

    /**
     * Gets the value of the departedItineraries property.
     * 
     * @return
     *     possible object is
     *     {@link DepartedItineraries }
     *     
     */
    public DepartedItineraries getDepartedItineraries() {
        return departedItineraries;
    }

    /**
     * Sets the value of the departedItineraries property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartedItineraries }
     *     
     */
    public void setDepartedItineraries(DepartedItineraries value) {
        this.departedItineraries = value;
    }

    /**
     * Gets the value of the soldOutItineraries property.
     * 
     * @return
     *     possible object is
     *     {@link SoldOutItineraries }
     *     
     */
    public SoldOutItineraries getSoldOutItineraries() {
        return soldOutItineraries;
    }

    /**
     * Sets the value of the soldOutItineraries property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoldOutItineraries }
     *     
     */
    public void setSoldOutItineraries(SoldOutItineraries value) {
        this.soldOutItineraries = value;
    }

    /**
     * Gets the value of the availableItineraries property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableItineraries }
     *     
     */
    public AvailableItineraries getAvailableItineraries() {
        return availableItineraries;
    }

    /**
     * Sets the value of the availableItineraries property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableItineraries }
     *     
     */
    public void setAvailableItineraries(AvailableItineraries value) {
        this.availableItineraries = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensions }
     *     
     */
    public TPAExtensions getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensions }
     *     
     */
    public void setTPAExtensions(TPAExtensions value) {
        this.tpaExtensions = value;
    }

    /**
     * Gets the value of the pricedItinCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPricedItinCount() {
        return pricedItinCount;
    }

    /**
     * Sets the value of the pricedItinCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPricedItinCount(Short value) {
        this.pricedItinCount = value;
    }

    /**
     * Gets the value of the brandedOneWayItinCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBrandedOneWayItinCount() {
        return brandedOneWayItinCount;
    }

    /**
     * Sets the value of the brandedOneWayItinCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBrandedOneWayItinCount(Short value) {
        this.brandedOneWayItinCount = value;
    }

    /**
     * Gets the value of the simpleOneWayItinCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSimpleOneWayItinCount() {
        return simpleOneWayItinCount;
    }

    /**
     * Sets the value of the simpleOneWayItinCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSimpleOneWayItinCount(Short value) {
        this.simpleOneWayItinCount = value;
    }

    /**
     * Gets the value of the departedItinCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDepartedItinCount() {
        return departedItinCount;
    }

    /**
     * Sets the value of the departedItinCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDepartedItinCount(Short value) {
        this.departedItinCount = value;
    }

    /**
     * Gets the value of the soldOutItinCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSoldOutItinCount() {
        return soldOutItinCount;
    }

    /**
     * Sets the value of the soldOutItinCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSoldOutItinCount(Short value) {
        this.soldOutItinCount = value;
    }

    /**
     * Gets the value of the availableItinCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAvailableItinCount() {
        return availableItinCount;
    }

    /**
     * Sets the value of the availableItinCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAvailableItinCount(Short value) {
        this.availableItinCount = value;
    }

    /**
     * Gets the value of the echoToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoToken() {
        return echoToken;
    }

    /**
     * Sets the value of the echoToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoToken(String value) {
        this.echoToken = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        if (target == null) {
            return "Production";
        } else {
            return target;
        }
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
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
     * Gets the value of the transactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * Sets the value of the transactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * Gets the value of the sequenceNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNmbr() {
        return sequenceNmbr;
    }

    /**
     * Sets the value of the sequenceNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNmbr(String value) {
        this.sequenceNmbr = value;
    }

    /**
     * Gets the value of the transactionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatusCode(String value) {
        this.transactionStatusCode = value;
    }

    /**
     * Gets the value of the primaryLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * Gets the value of the altLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Sets the value of the altLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltLangID(String value) {
        this.altLangID = value;
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
     *         &lt;element name="PricedItineraries" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TPA_Extensions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}ComplexProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OneWayItineraries" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BrandedOneWayItineraries" maxOccurs="10" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TPA_Extensions" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SimpleOneWayItineraries" maxOccurs="10" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TPA_Extensions" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
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
        "pricedItineraries",
        "oneWayItineraries"
    })
    public static class AvailableItineraries {

        @XmlElement(name = "PricedItineraries")
        protected PricedItineraries pricedItineraries;
        @XmlElement(name = "OneWayItineraries")
        protected OneWayItineraries oneWayItineraries;

        /**
         * Gets the value of the pricedItineraries property.
         * 
         * @return
         *     possible object is
         *     {@link PricedItineraries }
         *     
         */
        public PricedItineraries getPricedItineraries() {
            return pricedItineraries;
        }

        /**
         * Sets the value of the pricedItineraries property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricedItineraries }
         *     
         */
        public void setPricedItineraries(PricedItineraries value) {
            this.pricedItineraries = value;
        }

        /**
         * Gets the value of the oneWayItineraries property.
         * 
         * @return
         *     possible object is
         *     {@link OneWayItineraries }
         *     
         */
        public OneWayItineraries getOneWayItineraries() {
            return oneWayItineraries;
        }

        /**
         * Sets the value of the oneWayItineraries property.
         * 
         * @param value
         *     allowed object is
         *     {@link OneWayItineraries }
         *     
         */
        public void setOneWayItineraries(OneWayItineraries value) {
            this.oneWayItineraries = value;
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
         *         &lt;element name="BrandedOneWayItineraries" maxOccurs="10" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TPA_Extensions" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SimpleOneWayItineraries" maxOccurs="10" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TPA_Extensions" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
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
            "brandedOneWayItineraries",
            "simpleOneWayItineraries"
        })
        public static class OneWayItineraries {

            @XmlElement(name = "BrandedOneWayItineraries")
            protected List<BrandedOneWayItineraries> brandedOneWayItineraries;
            @XmlElement(name = "SimpleOneWayItineraries")
            protected List<SimpleOneWayItineraries> simpleOneWayItineraries;

            /**
             * Gets the value of the brandedOneWayItineraries property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the brandedOneWayItineraries property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBrandedOneWayItineraries().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BrandedOneWayItineraries }
             * 
             * 
             */
            public List<BrandedOneWayItineraries> getBrandedOneWayItineraries() {
                if (brandedOneWayItineraries == null) {
                    brandedOneWayItineraries = new ArrayList<BrandedOneWayItineraries>();
                }
                return this.brandedOneWayItineraries;
            }

            /**
             * Gets the value of the simpleOneWayItineraries property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the simpleOneWayItineraries property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSimpleOneWayItineraries().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SimpleOneWayItineraries }
             * 
             * 
             */
            public List<SimpleOneWayItineraries> getSimpleOneWayItineraries() {
                if (simpleOneWayItineraries == null) {
                    simpleOneWayItineraries = new ArrayList<SimpleOneWayItineraries>();
                }
                return this.simpleOneWayItineraries;
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
             *         &lt;element name="TPA_Extensions" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tpaExtensions",
                "pricedItinerary"
            })
            public static class BrandedOneWayItineraries {

                @XmlElement(name = "TPA_Extensions")
                protected TPAExtensions tpaExtensions;
                @XmlElement(name = "PricedItinerary")
                protected List<PricedItineraryType> pricedItinerary;
                @XmlAttribute(name = "RPH", required = true)
                protected String rph;

                /**
                 * Gets the value of the tpaExtensions property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TPAExtensions }
                 *     
                 */
                public TPAExtensions getTPAExtensions() {
                    return tpaExtensions;
                }

                /**
                 * Sets the value of the tpaExtensions property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TPAExtensions }
                 *     
                 */
                public void setTPAExtensions(TPAExtensions value) {
                    this.tpaExtensions = value;
                }

                /**
                 * Gets the value of the pricedItinerary property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPricedItinerary().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PricedItineraryType }
                 * 
                 * 
                 */
                public List<PricedItineraryType> getPricedItinerary() {
                    if (pricedItinerary == null) {
                        pricedItinerary = new ArrayList<PricedItineraryType>();
                    }
                    return this.pricedItinerary;
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
                 *         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
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
                    "processingMessage"
                })
                public static class TPAExtensions {

                    @XmlElement(name = "ProcessingMessage")
                    protected List<OneWayProcessingMessageType> processingMessage;

                    /**
                     * Gets the value of the processingMessage property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the processingMessage property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getProcessingMessage().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OneWayProcessingMessageType }
                     * 
                     * 
                     */
                    public List<OneWayProcessingMessageType> getProcessingMessage() {
                        if (processingMessage == null) {
                            processingMessage = new ArrayList<OneWayProcessingMessageType>();
                        }
                        return this.processingMessage;
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
             *         &lt;element name="TPA_Extensions" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tpaExtensions",
                "pricedItinerary"
            })
            public static class SimpleOneWayItineraries {

                @XmlElement(name = "TPA_Extensions")
                protected TPAExtensions tpaExtensions;
                @XmlElement(name = "PricedItinerary")
                protected List<PricedItineraryType> pricedItinerary;
                @XmlAttribute(name = "RPH", required = true)
                protected String rph;

                /**
                 * Gets the value of the tpaExtensions property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TPAExtensions }
                 *     
                 */
                public TPAExtensions getTPAExtensions() {
                    return tpaExtensions;
                }

                /**
                 * Sets the value of the tpaExtensions property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TPAExtensions }
                 *     
                 */
                public void setTPAExtensions(TPAExtensions value) {
                    this.tpaExtensions = value;
                }

                /**
                 * Gets the value of the pricedItinerary property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPricedItinerary().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PricedItineraryType }
                 * 
                 * 
                 */
                public List<PricedItineraryType> getPricedItinerary() {
                    if (pricedItinerary == null) {
                        pricedItinerary = new ArrayList<PricedItineraryType>();
                    }
                    return this.pricedItinerary;
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
                 *         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
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
                    "processingMessage"
                })
                public static class TPAExtensions {

                    @XmlElement(name = "ProcessingMessage")
                    protected List<OneWayProcessingMessageType> processingMessage;

                    /**
                     * Gets the value of the processingMessage property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the processingMessage property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getProcessingMessage().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OneWayProcessingMessageType }
                     * 
                     * 
                     */
                    public List<OneWayProcessingMessageType> getProcessingMessage() {
                        if (processingMessage == null) {
                            processingMessage = new ArrayList<OneWayProcessingMessageType>();
                        }
                        return this.processingMessage;
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
         *         &lt;element name="TPA_Extensions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}ComplexProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded"/>
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
            "tpaExtensions",
            "pricedItinerary"
        })
        public static class PricedItineraries {

            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensions tpaExtensions;
            @XmlElement(name = "PricedItinerary", required = true)
            protected List<PricedItineraryType> pricedItinerary;

            /**
             * Gets the value of the tpaExtensions property.
             * 
             * @return
             *     possible object is
             *     {@link TPAExtensions }
             *     
             */
            public TPAExtensions getTPAExtensions() {
                return tpaExtensions;
            }

            /**
             * Sets the value of the tpaExtensions property.
             * 
             * @param value
             *     allowed object is
             *     {@link TPAExtensions }
             *     
             */
            public void setTPAExtensions(TPAExtensions value) {
                this.tpaExtensions = value;
            }

            /**
             * Gets the value of the pricedItinerary property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPricedItinerary().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PricedItineraryType }
             * 
             * 
             */
            public List<PricedItineraryType> getPricedItinerary() {
                if (pricedItinerary == null) {
                    pricedItinerary = new ArrayList<PricedItineraryType>();
                }
                return this.pricedItinerary;
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
             *         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}ComplexProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
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
                "processingMessage"
            })
            public static class TPAExtensions {

                @XmlElement(name = "ProcessingMessage")
                protected List<ComplexProcessingMessageType> processingMessage;

                /**
                 * Gets the value of the processingMessage property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the processingMessage property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProcessingMessage().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ComplexProcessingMessageType }
                 * 
                 * 
                 */
                public List<ComplexProcessingMessageType> getProcessingMessage() {
                    if (processingMessage == null) {
                        processingMessage = new ArrayList<ComplexProcessingMessageType>();
                    }
                    return this.processingMessage;
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
     *         &lt;element name="PricedItineraries" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TPA_Extensions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}ComplexProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OneWayItineraries" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BrandedOneWayItineraries" maxOccurs="10" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TPA_Extensions" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SimpleOneWayItineraries" maxOccurs="10" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TPA_Extensions" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
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
        "pricedItineraries",
        "oneWayItineraries"
    })
    public static class DepartedItineraries {

        @XmlElement(name = "PricedItineraries")
        protected PricedItineraries pricedItineraries;
        @XmlElement(name = "OneWayItineraries")
        protected OneWayItineraries oneWayItineraries;

        /**
         * Gets the value of the pricedItineraries property.
         * 
         * @return
         *     possible object is
         *     {@link PricedItineraries }
         *     
         */
        public PricedItineraries getPricedItineraries() {
            return pricedItineraries;
        }

        /**
         * Sets the value of the pricedItineraries property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricedItineraries }
         *     
         */
        public void setPricedItineraries(PricedItineraries value) {
            this.pricedItineraries = value;
        }

        /**
         * Gets the value of the oneWayItineraries property.
         * 
         * @return
         *     possible object is
         *     {@link OneWayItineraries }
         *     
         */
        public OneWayItineraries getOneWayItineraries() {
            return oneWayItineraries;
        }

        /**
         * Sets the value of the oneWayItineraries property.
         * 
         * @param value
         *     allowed object is
         *     {@link OneWayItineraries }
         *     
         */
        public void setOneWayItineraries(OneWayItineraries value) {
            this.oneWayItineraries = value;
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
         *         &lt;element name="BrandedOneWayItineraries" maxOccurs="10" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TPA_Extensions" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SimpleOneWayItineraries" maxOccurs="10" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TPA_Extensions" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
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
            "brandedOneWayItineraries",
            "simpleOneWayItineraries"
        })
        public static class OneWayItineraries {

            @XmlElement(name = "BrandedOneWayItineraries")
            protected List<BrandedOneWayItineraries> brandedOneWayItineraries;
            @XmlElement(name = "SimpleOneWayItineraries")
            protected List<SimpleOneWayItineraries> simpleOneWayItineraries;

            /**
             * Gets the value of the brandedOneWayItineraries property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the brandedOneWayItineraries property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBrandedOneWayItineraries().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BrandedOneWayItineraries }
             * 
             * 
             */
            public List<BrandedOneWayItineraries> getBrandedOneWayItineraries() {
                if (brandedOneWayItineraries == null) {
                    brandedOneWayItineraries = new ArrayList<BrandedOneWayItineraries>();
                }
                return this.brandedOneWayItineraries;
            }

            /**
             * Gets the value of the simpleOneWayItineraries property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the simpleOneWayItineraries property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSimpleOneWayItineraries().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SimpleOneWayItineraries }
             * 
             * 
             */
            public List<SimpleOneWayItineraries> getSimpleOneWayItineraries() {
                if (simpleOneWayItineraries == null) {
                    simpleOneWayItineraries = new ArrayList<SimpleOneWayItineraries>();
                }
                return this.simpleOneWayItineraries;
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
             *         &lt;element name="TPA_Extensions" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tpaExtensions",
                "pricedItinerary"
            })
            public static class BrandedOneWayItineraries {

                @XmlElement(name = "TPA_Extensions")
                protected TPAExtensions tpaExtensions;
                @XmlElement(name = "PricedItinerary")
                protected List<PricedItineraryType> pricedItinerary;
                @XmlAttribute(name = "RPH", required = true)
                protected String rph;

                /**
                 * Gets the value of the tpaExtensions property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TPAExtensions }
                 *     
                 */
                public TPAExtensions getTPAExtensions() {
                    return tpaExtensions;
                }

                /**
                 * Sets the value of the tpaExtensions property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TPAExtensions }
                 *     
                 */
                public void setTPAExtensions(TPAExtensions value) {
                    this.tpaExtensions = value;
                }

                /**
                 * Gets the value of the pricedItinerary property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPricedItinerary().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PricedItineraryType }
                 * 
                 * 
                 */
                public List<PricedItineraryType> getPricedItinerary() {
                    if (pricedItinerary == null) {
                        pricedItinerary = new ArrayList<PricedItineraryType>();
                    }
                    return this.pricedItinerary;
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
                 *         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
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
                    "processingMessage"
                })
                public static class TPAExtensions {

                    @XmlElement(name = "ProcessingMessage")
                    protected List<OneWayProcessingMessageType> processingMessage;

                    /**
                     * Gets the value of the processingMessage property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the processingMessage property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getProcessingMessage().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OneWayProcessingMessageType }
                     * 
                     * 
                     */
                    public List<OneWayProcessingMessageType> getProcessingMessage() {
                        if (processingMessage == null) {
                            processingMessage = new ArrayList<OneWayProcessingMessageType>();
                        }
                        return this.processingMessage;
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
             *         &lt;element name="TPA_Extensions" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tpaExtensions",
                "pricedItinerary"
            })
            public static class SimpleOneWayItineraries {

                @XmlElement(name = "TPA_Extensions")
                protected TPAExtensions tpaExtensions;
                @XmlElement(name = "PricedItinerary")
                protected List<PricedItineraryType> pricedItinerary;
                @XmlAttribute(name = "RPH", required = true)
                protected String rph;

                /**
                 * Gets the value of the tpaExtensions property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TPAExtensions }
                 *     
                 */
                public TPAExtensions getTPAExtensions() {
                    return tpaExtensions;
                }

                /**
                 * Sets the value of the tpaExtensions property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TPAExtensions }
                 *     
                 */
                public void setTPAExtensions(TPAExtensions value) {
                    this.tpaExtensions = value;
                }

                /**
                 * Gets the value of the pricedItinerary property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPricedItinerary().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PricedItineraryType }
                 * 
                 * 
                 */
                public List<PricedItineraryType> getPricedItinerary() {
                    if (pricedItinerary == null) {
                        pricedItinerary = new ArrayList<PricedItineraryType>();
                    }
                    return this.pricedItinerary;
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
                 *         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
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
                    "processingMessage"
                })
                public static class TPAExtensions {

                    @XmlElement(name = "ProcessingMessage")
                    protected List<OneWayProcessingMessageType> processingMessage;

                    /**
                     * Gets the value of the processingMessage property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the processingMessage property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getProcessingMessage().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OneWayProcessingMessageType }
                     * 
                     * 
                     */
                    public List<OneWayProcessingMessageType> getProcessingMessage() {
                        if (processingMessage == null) {
                            processingMessage = new ArrayList<OneWayProcessingMessageType>();
                        }
                        return this.processingMessage;
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
         *         &lt;element name="TPA_Extensions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}ComplexProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded"/>
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
            "tpaExtensions",
            "pricedItinerary"
        })
        public static class PricedItineraries {

            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensions tpaExtensions;
            @XmlElement(name = "PricedItinerary", required = true)
            protected List<PricedItineraryType> pricedItinerary;

            /**
             * Gets the value of the tpaExtensions property.
             * 
             * @return
             *     possible object is
             *     {@link TPAExtensions }
             *     
             */
            public TPAExtensions getTPAExtensions() {
                return tpaExtensions;
            }

            /**
             * Sets the value of the tpaExtensions property.
             * 
             * @param value
             *     allowed object is
             *     {@link TPAExtensions }
             *     
             */
            public void setTPAExtensions(TPAExtensions value) {
                this.tpaExtensions = value;
            }

            /**
             * Gets the value of the pricedItinerary property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPricedItinerary().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PricedItineraryType }
             * 
             * 
             */
            public List<PricedItineraryType> getPricedItinerary() {
                if (pricedItinerary == null) {
                    pricedItinerary = new ArrayList<PricedItineraryType>();
                }
                return this.pricedItinerary;
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
             *         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}ComplexProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
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
                "processingMessage"
            })
            public static class TPAExtensions {

                @XmlElement(name = "ProcessingMessage")
                protected List<ComplexProcessingMessageType> processingMessage;

                /**
                 * Gets the value of the processingMessage property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the processingMessage property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProcessingMessage().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ComplexProcessingMessageType }
                 * 
                 * 
                 */
                public List<ComplexProcessingMessageType> getProcessingMessage() {
                    if (processingMessage == null) {
                        processingMessage = new ArrayList<ComplexProcessingMessageType>();
                    }
                    return this.processingMessage;
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
     *         &lt;element name="BrandedOneWayItineraries" maxOccurs="10" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TPA_Extensions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SimpleOneWayItineraries" maxOccurs="10" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TPA_Extensions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
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
        "brandedOneWayItineraries",
        "simpleOneWayItineraries"
    })
    public static class OneWayItineraries {

        @XmlElement(name = "BrandedOneWayItineraries")
        protected List<BrandedOneWayItineraries> brandedOneWayItineraries;
        @XmlElement(name = "SimpleOneWayItineraries")
        protected List<SimpleOneWayItineraries> simpleOneWayItineraries;

        /**
         * Gets the value of the brandedOneWayItineraries property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the brandedOneWayItineraries property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBrandedOneWayItineraries().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BrandedOneWayItineraries }
         * 
         * 
         */
        public List<BrandedOneWayItineraries> getBrandedOneWayItineraries() {
            if (brandedOneWayItineraries == null) {
                brandedOneWayItineraries = new ArrayList<BrandedOneWayItineraries>();
            }
            return this.brandedOneWayItineraries;
        }

        /**
         * Gets the value of the simpleOneWayItineraries property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the simpleOneWayItineraries property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSimpleOneWayItineraries().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimpleOneWayItineraries }
         * 
         * 
         */
        public List<SimpleOneWayItineraries> getSimpleOneWayItineraries() {
            if (simpleOneWayItineraries == null) {
                simpleOneWayItineraries = new ArrayList<SimpleOneWayItineraries>();
            }
            return this.simpleOneWayItineraries;
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
         *         &lt;element name="TPA_Extensions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tpaExtensions",
            "pricedItinerary"
        })
        public static class BrandedOneWayItineraries {

            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensions tpaExtensions;
            @XmlElement(name = "PricedItinerary")
            protected List<PricedItineraryType> pricedItinerary;
            @XmlAttribute(name = "RPH", required = true)
            protected String rph;

            /**
             * Gets the value of the tpaExtensions property.
             * 
             * @return
             *     possible object is
             *     {@link TPAExtensions }
             *     
             */
            public TPAExtensions getTPAExtensions() {
                return tpaExtensions;
            }

            /**
             * Sets the value of the tpaExtensions property.
             * 
             * @param value
             *     allowed object is
             *     {@link TPAExtensions }
             *     
             */
            public void setTPAExtensions(TPAExtensions value) {
                this.tpaExtensions = value;
            }

            /**
             * Gets the value of the pricedItinerary property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPricedItinerary().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PricedItineraryType }
             * 
             * 
             */
            public List<PricedItineraryType> getPricedItinerary() {
                if (pricedItinerary == null) {
                    pricedItinerary = new ArrayList<PricedItineraryType>();
                }
                return this.pricedItinerary;
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
             *         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
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
                "processingMessage"
            })
            public static class TPAExtensions {

                @XmlElement(name = "ProcessingMessage")
                protected List<OneWayProcessingMessageType> processingMessage;

                /**
                 * Gets the value of the processingMessage property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the processingMessage property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProcessingMessage().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OneWayProcessingMessageType }
                 * 
                 * 
                 */
                public List<OneWayProcessingMessageType> getProcessingMessage() {
                    if (processingMessage == null) {
                        processingMessage = new ArrayList<OneWayProcessingMessageType>();
                    }
                    return this.processingMessage;
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
         *         &lt;element name="TPA_Extensions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tpaExtensions",
            "pricedItinerary"
        })
        public static class SimpleOneWayItineraries {

            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensions tpaExtensions;
            @XmlElement(name = "PricedItinerary")
            protected List<PricedItineraryType> pricedItinerary;
            @XmlAttribute(name = "RPH", required = true)
            protected String rph;

            /**
             * Gets the value of the tpaExtensions property.
             * 
             * @return
             *     possible object is
             *     {@link TPAExtensions }
             *     
             */
            public TPAExtensions getTPAExtensions() {
                return tpaExtensions;
            }

            /**
             * Sets the value of the tpaExtensions property.
             * 
             * @param value
             *     allowed object is
             *     {@link TPAExtensions }
             *     
             */
            public void setTPAExtensions(TPAExtensions value) {
                this.tpaExtensions = value;
            }

            /**
             * Gets the value of the pricedItinerary property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPricedItinerary().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PricedItineraryType }
             * 
             * 
             */
            public List<PricedItineraryType> getPricedItinerary() {
                if (pricedItinerary == null) {
                    pricedItinerary = new ArrayList<PricedItineraryType>();
                }
                return this.pricedItinerary;
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
             *         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
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
                "processingMessage"
            })
            public static class TPAExtensions {

                @XmlElement(name = "ProcessingMessage")
                protected List<OneWayProcessingMessageType> processingMessage;

                /**
                 * Gets the value of the processingMessage property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the processingMessage property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProcessingMessage().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OneWayProcessingMessageType }
                 * 
                 * 
                 */
                public List<OneWayProcessingMessageType> getProcessingMessage() {
                    if (processingMessage == null) {
                        processingMessage = new ArrayList<OneWayProcessingMessageType>();
                    }
                    return this.processingMessage;
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
     *         &lt;element name="TPA_Extensions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}ComplexProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded"/>
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
        "tpaExtensions",
        "pricedItinerary"
    })
    public static class PricedItineraries {

        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensions tpaExtensions;
        @XmlElement(name = "PricedItinerary", required = true)
        protected List<PricedItineraryType> pricedItinerary;

        /**
         * Gets the value of the tpaExtensions property.
         * 
         * @return
         *     possible object is
         *     {@link TPAExtensions }
         *     
         */
        public TPAExtensions getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * Sets the value of the tpaExtensions property.
         * 
         * @param value
         *     allowed object is
         *     {@link TPAExtensions }
         *     
         */
        public void setTPAExtensions(TPAExtensions value) {
            this.tpaExtensions = value;
        }

        /**
         * Gets the value of the pricedItinerary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPricedItinerary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PricedItineraryType }
         * 
         * 
         */
        public List<PricedItineraryType> getPricedItinerary() {
            if (pricedItinerary == null) {
                pricedItinerary = new ArrayList<PricedItineraryType>();
            }
            return this.pricedItinerary;
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
         *         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}ComplexProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
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
            "processingMessage"
        })
        public static class TPAExtensions {

            @XmlElement(name = "ProcessingMessage")
            protected List<ComplexProcessingMessageType> processingMessage;

            /**
             * Gets the value of the processingMessage property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the processingMessage property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProcessingMessage().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ComplexProcessingMessageType }
             * 
             * 
             */
            public List<ComplexProcessingMessageType> getProcessingMessage() {
                if (processingMessage == null) {
                    processingMessage = new ArrayList<ComplexProcessingMessageType>();
                }
                return this.processingMessage;
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
     *         &lt;element name="PricedItineraries" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TPA_Extensions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}ComplexProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OneWayItineraries" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BrandedOneWayItineraries" maxOccurs="10" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TPA_Extensions" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SimpleOneWayItineraries" maxOccurs="10" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TPA_Extensions" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
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
        "pricedItineraries",
        "oneWayItineraries"
    })
    public static class SoldOutItineraries {

        @XmlElement(name = "PricedItineraries")
        protected PricedItineraries pricedItineraries;
        @XmlElement(name = "OneWayItineraries")
        protected OneWayItineraries oneWayItineraries;

        /**
         * Gets the value of the pricedItineraries property.
         * 
         * @return
         *     possible object is
         *     {@link PricedItineraries }
         *     
         */
        public PricedItineraries getPricedItineraries() {
            return pricedItineraries;
        }

        /**
         * Sets the value of the pricedItineraries property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricedItineraries }
         *     
         */
        public void setPricedItineraries(PricedItineraries value) {
            this.pricedItineraries = value;
        }

        /**
         * Gets the value of the oneWayItineraries property.
         * 
         * @return
         *     possible object is
         *     {@link OneWayItineraries }
         *     
         */
        public OneWayItineraries getOneWayItineraries() {
            return oneWayItineraries;
        }

        /**
         * Sets the value of the oneWayItineraries property.
         * 
         * @param value
         *     allowed object is
         *     {@link OneWayItineraries }
         *     
         */
        public void setOneWayItineraries(OneWayItineraries value) {
            this.oneWayItineraries = value;
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
         *         &lt;element name="BrandedOneWayItineraries" maxOccurs="10" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TPA_Extensions" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SimpleOneWayItineraries" maxOccurs="10" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TPA_Extensions" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
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
            "brandedOneWayItineraries",
            "simpleOneWayItineraries"
        })
        public static class OneWayItineraries {

            @XmlElement(name = "BrandedOneWayItineraries")
            protected List<BrandedOneWayItineraries> brandedOneWayItineraries;
            @XmlElement(name = "SimpleOneWayItineraries")
            protected List<SimpleOneWayItineraries> simpleOneWayItineraries;

            /**
             * Gets the value of the brandedOneWayItineraries property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the brandedOneWayItineraries property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBrandedOneWayItineraries().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BrandedOneWayItineraries }
             * 
             * 
             */
            public List<BrandedOneWayItineraries> getBrandedOneWayItineraries() {
                if (brandedOneWayItineraries == null) {
                    brandedOneWayItineraries = new ArrayList<BrandedOneWayItineraries>();
                }
                return this.brandedOneWayItineraries;
            }

            /**
             * Gets the value of the simpleOneWayItineraries property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the simpleOneWayItineraries property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSimpleOneWayItineraries().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SimpleOneWayItineraries }
             * 
             * 
             */
            public List<SimpleOneWayItineraries> getSimpleOneWayItineraries() {
                if (simpleOneWayItineraries == null) {
                    simpleOneWayItineraries = new ArrayList<SimpleOneWayItineraries>();
                }
                return this.simpleOneWayItineraries;
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
             *         &lt;element name="TPA_Extensions" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tpaExtensions",
                "pricedItinerary"
            })
            public static class BrandedOneWayItineraries {

                @XmlElement(name = "TPA_Extensions")
                protected TPAExtensions tpaExtensions;
                @XmlElement(name = "PricedItinerary")
                protected List<PricedItineraryType> pricedItinerary;
                @XmlAttribute(name = "RPH", required = true)
                protected String rph;

                /**
                 * Gets the value of the tpaExtensions property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TPAExtensions }
                 *     
                 */
                public TPAExtensions getTPAExtensions() {
                    return tpaExtensions;
                }

                /**
                 * Sets the value of the tpaExtensions property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TPAExtensions }
                 *     
                 */
                public void setTPAExtensions(TPAExtensions value) {
                    this.tpaExtensions = value;
                }

                /**
                 * Gets the value of the pricedItinerary property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPricedItinerary().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PricedItineraryType }
                 * 
                 * 
                 */
                public List<PricedItineraryType> getPricedItinerary() {
                    if (pricedItinerary == null) {
                        pricedItinerary = new ArrayList<PricedItineraryType>();
                    }
                    return this.pricedItinerary;
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
                 *         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
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
                    "processingMessage"
                })
                public static class TPAExtensions {

                    @XmlElement(name = "ProcessingMessage")
                    protected List<OneWayProcessingMessageType> processingMessage;

                    /**
                     * Gets the value of the processingMessage property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the processingMessage property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getProcessingMessage().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OneWayProcessingMessageType }
                     * 
                     * 
                     */
                    public List<OneWayProcessingMessageType> getProcessingMessage() {
                        if (processingMessage == null) {
                            processingMessage = new ArrayList<OneWayProcessingMessageType>();
                        }
                        return this.processingMessage;
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
             *         &lt;element name="TPA_Extensions" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tpaExtensions",
                "pricedItinerary"
            })
            public static class SimpleOneWayItineraries {

                @XmlElement(name = "TPA_Extensions")
                protected TPAExtensions tpaExtensions;
                @XmlElement(name = "PricedItinerary")
                protected List<PricedItineraryType> pricedItinerary;
                @XmlAttribute(name = "RPH", required = true)
                protected String rph;

                /**
                 * Gets the value of the tpaExtensions property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TPAExtensions }
                 *     
                 */
                public TPAExtensions getTPAExtensions() {
                    return tpaExtensions;
                }

                /**
                 * Sets the value of the tpaExtensions property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TPAExtensions }
                 *     
                 */
                public void setTPAExtensions(TPAExtensions value) {
                    this.tpaExtensions = value;
                }

                /**
                 * Gets the value of the pricedItinerary property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPricedItinerary().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PricedItineraryType }
                 * 
                 * 
                 */
                public List<PricedItineraryType> getPricedItinerary() {
                    if (pricedItinerary == null) {
                        pricedItinerary = new ArrayList<PricedItineraryType>();
                    }
                    return this.pricedItinerary;
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
                 *         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}OneWayProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
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
                    "processingMessage"
                })
                public static class TPAExtensions {

                    @XmlElement(name = "ProcessingMessage")
                    protected List<OneWayProcessingMessageType> processingMessage;

                    /**
                     * Gets the value of the processingMessage property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the processingMessage property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getProcessingMessage().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OneWayProcessingMessageType }
                     * 
                     * 
                     */
                    public List<OneWayProcessingMessageType> getProcessingMessage() {
                        if (processingMessage == null) {
                            processingMessage = new ArrayList<OneWayProcessingMessageType>();
                        }
                        return this.processingMessage;
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
         *         &lt;element name="TPA_Extensions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}ComplexProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryType" maxOccurs="unbounded"/>
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
            "tpaExtensions",
            "pricedItinerary"
        })
        public static class PricedItineraries {

            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensions tpaExtensions;
            @XmlElement(name = "PricedItinerary", required = true)
            protected List<PricedItineraryType> pricedItinerary;

            /**
             * Gets the value of the tpaExtensions property.
             * 
             * @return
             *     possible object is
             *     {@link TPAExtensions }
             *     
             */
            public TPAExtensions getTPAExtensions() {
                return tpaExtensions;
            }

            /**
             * Sets the value of the tpaExtensions property.
             * 
             * @param value
             *     allowed object is
             *     {@link TPAExtensions }
             *     
             */
            public void setTPAExtensions(TPAExtensions value) {
                this.tpaExtensions = value;
            }

            /**
             * Gets the value of the pricedItinerary property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPricedItinerary().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PricedItineraryType }
             * 
             * 
             */
            public List<PricedItineraryType> getPricedItinerary() {
                if (pricedItinerary == null) {
                    pricedItinerary = new ArrayList<PricedItineraryType>();
                }
                return this.pricedItinerary;
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
             *         &lt;element name="ProcessingMessage" type="{http://www.opentravel.org/OTA/2003/05}ComplexProcessingMessageType" maxOccurs="unbounded" minOccurs="0"/>
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
                "processingMessage"
            })
            public static class TPAExtensions {

                @XmlElement(name = "ProcessingMessage")
                protected List<ComplexProcessingMessageType> processingMessage;

                /**
                 * Gets the value of the processingMessage property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the processingMessage property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProcessingMessage().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ComplexProcessingMessageType }
                 * 
                 * 
                 */
                public List<ComplexProcessingMessageType> getProcessingMessage() {
                    if (processingMessage == null) {
                        processingMessage = new ArrayList<ComplexProcessingMessageType>();
                    }
                    return this.processingMessage;
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
     *         &lt;element name="AirlineOrderList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AirlineOrder" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
     *                           &lt;attribute name="SequenceNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
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
        "airlineOrderList"
    })
    public static class TPAExtensions {

        @XmlElement(name = "AirlineOrderList")
        protected AirlineOrderList airlineOrderList;

        /**
         * Gets the value of the airlineOrderList property.
         * 
         * @return
         *     possible object is
         *     {@link AirlineOrderList }
         *     
         */
        public AirlineOrderList getAirlineOrderList() {
            return airlineOrderList;
        }

        /**
         * Sets the value of the airlineOrderList property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirlineOrderList }
         *     
         */
        public void setAirlineOrderList(AirlineOrderList value) {
            this.airlineOrderList = value;
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
         *         &lt;element name="AirlineOrder" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
         *                 &lt;attribute name="SequenceNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
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
            "airlineOrder"
        })
        public static class AirlineOrderList {

            @XmlElement(name = "AirlineOrder", required = true)
            protected List<AirlineOrder> airlineOrder;

            /**
             * Gets the value of the airlineOrder property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the airlineOrder property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAirlineOrder().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirlineOrder }
             * 
             * 
             */
            public List<AirlineOrder> getAirlineOrder() {
                if (airlineOrder == null) {
                    airlineOrder = new ArrayList<AirlineOrder>();
                }
                return this.airlineOrder;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
             *       &lt;attribute name="SequenceNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AirlineOrder
                extends CompanyNameType
            {

                @XmlAttribute(name = "SequenceNumber", required = true)
                protected short sequenceNumber;

                /**
                 * Gets the value of the sequenceNumber property.
                 * 
                 */
                public short getSequenceNumber() {
                    return sequenceNumber;
                }

                /**
                 * Sets the value of the sequenceNumber property.
                 * 
                 */
                public void setSequenceNumber(short value) {
                    this.sequenceNumber = value;
                }

            }

        }

    }

}
