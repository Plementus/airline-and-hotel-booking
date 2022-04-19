
package services.sabre.bfm.sapt;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines user preferences to be used in conducting a search.
 * 
 * <p>Java class for AirSearchPrefsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirSearchPrefsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VendorPref" type="{http://www.opentravel.org/OTA/2003/05}CompanyNamePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FlightTypePref" type="{http://www.opentravel.org/OTA/2003/05}FlightTypePrefType" minOccurs="0"/>
 *         &lt;element name="FareRestrictPref" maxOccurs="4" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareRestrictPrefType">
 *                 &lt;sequence>
 *                   &lt;element name="AdvResTicketing" type="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType" minOccurs="0"/>
 *                   &lt;element name="StayRestrictions" type="{http://www.opentravel.org/OTA/2003/05}StayRestrictionsType" minOccurs="0"/>
 *                   &lt;element name="VoluntaryChanges" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EquipPref" type="{http://www.opentravel.org/OTA/2003/05}EquipmentTypePref" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="CabinPref" type="{http://www.opentravel.org/OTA/2003/05}CabinPrefType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="TicketDistribPref" type="{http://www.opentravel.org/OTA/2003/05}TicketDistribPrefType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="TPA_Extensions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;group ref="{http://www.opentravel.org/OTA/2003/05}TravelPreferencesTPA_ExtensionsDepartureArrivalWindowGroup"/>
 *                   &lt;element name="ExcludeVendorPref" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="8"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="IncludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ExcludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="NumTrips" type="{http://www.opentravel.org/OTA/2003/05}NumTripsType" minOccurs="0"/>
 *                   &lt;element name="AltCitiesCombinations" type="{http://www.opentravel.org/OTA/2003/05}AltCitiesCombinationsType" minOccurs="0"/>
 *                   &lt;element name="NumTripsWithRouting" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Number" default="5">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *                                 &lt;minInclusive value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;group ref="{http://www.opentravel.org/OTA/2003/05}TravelPreferencesTPA_ExtensionsOnlineInterlineIndicatorGroup"/>
 *                   &lt;element name="TripType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MaxPrice" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DomesticLayoverTime" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Hours" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LongConnectTime" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Min" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                           &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                           &lt;attribute name="Enable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LongConnectPoints" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Min" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                           &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AirServiceOnly" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="JetServiceOnly" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SameConnectionAirportOnly" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SameOriginAirportOnly" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SameTurnaroundAirportOnly" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AircraftTypePenalty" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AlternateAirportPenalty" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FareAmountThreshold" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="numOfLowFareSol" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="numOfMustPriceOnlSol" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="numOfMustPriceInrlSol" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="numOfMustPriceNStpOnlSol" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="numOfMustPriceNStpInrlSol" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="numOfMustPriceSStopOnlSol" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="stpPenaltyInUSD" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="durPenaltyInUSD" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="depPenaltyInUSD" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="maxAllowedMustPriceOveragePerCrr" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="fltOptMustPriceReuseLimit" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="upperBoundMustPriceFactorForNotNonStp" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="upperBoundLFSFactor" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="numOfMustPriceNStp1StpOnlSol" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="numOfMustPriceNStp1StpInrlSol" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="upperBoundMustPriceFactorForNonStp" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="maxAllowedLFSOveragePerCrrPercent" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="targetMinNumOfLFSOnlSolPerCrr" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="targetMinNumOfLFSTotOnlSolPercent" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="fltOptLFSReuseLimitForNonAVS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="fltOptLFSReuseLimitForAVS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="avsPenaltyCrrs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="maxNumOfNonStpOnlSol" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="maxNumOfNonStpInrlSol" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="maxNumOfSingleStpOnlSol" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="maxNumOf2PlusStpSol" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="minAllowedOveragePerCrrPercent" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="minAllowedOveragePerCrr" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="maxRelFareLvlOfxForNonStp" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="maxRelFareLvlOfxForCnx" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="numOfMustPrice2PlusStpSol" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ItineraryNumberThreshold" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="XOFares" type="{http://www.opentravel.org/OTA/2003/05}XOFaresType" minOccurs="0"/>
 *                   &lt;group ref="{http://www.opentravel.org/OTA/2003/05}TravelPreferencesTPA_ExtensionsTaxesGroup"/>
 *                   &lt;element name="FlightStopsAsConnections" type="{http://www.opentravel.org/OTA/2003/05}FlightStopsAsConnectionsType" minOccurs="0"/>
 *                   &lt;element name="TicketingSumOfLocals" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Enable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="JumpCabinLogic" type="{http://www.opentravel.org/OTA/2003/05}JumpCabinLogicType" minOccurs="0"/>
 *                   &lt;element name="KeepSameCabin" type="{http://www.opentravel.org/OTA/2003/05}KeepSameCabinType" minOccurs="0"/>
 *                   &lt;element name="GoverningCarrierOverride" type="{http://www.opentravel.org/OTA/2003/05}GoverningCarrierOverrideType" minOccurs="0"/>
 *                   &lt;element name="ExcludeCallDirectCarriers" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ValidatingCarrier" type="{http://www.opentravel.org/OTA/2003/05}ValidatingCarrierType" minOccurs="0"/>
 *                   &lt;element name="SettlementMethod" type="{http://www.opentravel.org/OTA/2003/05}SettlementMethodType" minOccurs="0"/>
 *                   &lt;element name="FlexibleFares" type="{http://www.opentravel.org/OTA/2003/05}FlexibleFaresType" minOccurs="0"/>
 *                   &lt;element name="DiversityParameters" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Weightings" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="PriceWeight" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric0To10Type" />
 *                                     &lt;attribute name="TravelTimeWeight" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric0To10Type" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TimeOfDayDistribution" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TimeOfDayRange" maxOccurs="4" minOccurs="2">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Begin" use="required" type="{http://www.opentravel.org/OTA/2003/05}TimeWindowBoundaryType" />
 *                                               &lt;attribute name="End" use="required" type="{http://www.opentravel.org/OTA/2003/05}TimeWindowBoundaryType" />
 *                                               &lt;attribute name="Percentage" use="required" type="{http://www.opentravel.org/OTA/2003/05}PercentageType" />
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
 *                           &lt;attribute name="InboundOutboundPairing">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *                                 &lt;minInclusive value="1"/>
 *                                 &lt;maxInclusive value="1000"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="AdditionalNonStopsNumber">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *                                 &lt;minInclusive value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="AdditionalNonStopsPercentage" type="{http://www.opentravel.org/OTA/2003/05}PercentageType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AdditionalFareLimit" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SellingLevels" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="SellingLevelRules">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Ignore" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ShowFareAmounts">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Original" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Budget" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="MinimumPrice" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="MaximumPrice" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="RelativePriceThreshold" type="{http://www.opentravel.org/OTA/2003/05}SignedCountOrPercentage" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OptionsPerDatePairList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OptionsPerDatePair" type="{http://www.opentravel.org/OTA/2003/05}OptionsPerDatePairType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CountryPref" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
 *                           &lt;attribute name="PreferLevel" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="Unacceptable"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AncillaryFees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AncillaryFeeGroup" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Enable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Summary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpanishFamilyDiscount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Level" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SmokingIndicatorGroup"/>
 *       &lt;attribute name="OnTimeRate" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *       &lt;attribute name="ETicketDesired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ValidInterlineTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MaxStopsQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to999" />
 *       &lt;attribute name="AllFlightsData" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirSearchPrefsType", propOrder = {
    "vendorPref",
    "flightTypePref",
    "fareRestrictPref",
    "equipPref",
    "cabinPref",
    "ticketDistribPref",
    "tpaExtensions",
    "ancillaryFees",
    "spanishFamilyDiscount"
})
public class AirSearchPrefsType {

    @XmlElement(name = "VendorPref")
    protected List<CompanyNamePrefType> vendorPref;
    @XmlElement(name = "FlightTypePref")
    protected FlightTypePrefType flightTypePref;
    @XmlElement(name = "FareRestrictPref")
    protected List<FareRestrictPref> fareRestrictPref;
    @XmlElement(name = "EquipPref")
    protected List<EquipmentTypePref> equipPref;
    @XmlElement(name = "CabinPref")
    protected List<CabinPrefType> cabinPref;
    @XmlElement(name = "TicketDistribPref")
    protected List<TicketDistribPrefType> ticketDistribPref;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensions tpaExtensions;
    @XmlElement(name = "AncillaryFees")
    protected AncillaryFees ancillaryFees;
    @XmlElement(name = "SpanishFamilyDiscount")
    protected SpanishFamilyDiscount spanishFamilyDiscount;
    @XmlAttribute(name = "OnTimeRate")
    protected BigDecimal onTimeRate;
    @XmlAttribute(name = "ETicketDesired")
    protected Boolean eTicketDesired;
    @XmlAttribute(name = "ValidInterlineTicket")
    protected Boolean validInterlineTicket;
    @XmlAttribute(name = "MaxStopsQuantity")
    protected Integer maxStopsQuantity;
    @XmlAttribute(name = "AllFlightsData")
    protected Boolean allFlightsData;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;

    /**
     * Gets the value of the vendorPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNamePrefType }
     * 
     * 
     */
    public List<CompanyNamePrefType> getVendorPref() {
        if (vendorPref == null) {
            vendorPref = new ArrayList<CompanyNamePrefType>();
        }
        return this.vendorPref;
    }

    /**
     * Gets the value of the flightTypePref property.
     * 
     * @return
     *     possible object is
     *     {@link FlightTypePrefType }
     *     
     */
    public FlightTypePrefType getFlightTypePref() {
        return flightTypePref;
    }

    /**
     * Sets the value of the flightTypePref property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTypePrefType }
     *     
     */
    public void setFlightTypePref(FlightTypePrefType value) {
        this.flightTypePref = value;
    }

    /**
     * Gets the value of the fareRestrictPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRestrictPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRestrictPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRestrictPref }
     * 
     * 
     */
    public List<FareRestrictPref> getFareRestrictPref() {
        if (fareRestrictPref == null) {
            fareRestrictPref = new ArrayList<FareRestrictPref>();
        }
        return this.fareRestrictPref;
    }

    /**
     * Gets the value of the equipPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentTypePref }
     * 
     * 
     */
    public List<EquipmentTypePref> getEquipPref() {
        if (equipPref == null) {
            equipPref = new ArrayList<EquipmentTypePref>();
        }
        return this.equipPref;
    }

    /**
     * Gets the value of the cabinPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinPrefType }
     * 
     * 
     */
    public List<CabinPrefType> getCabinPref() {
        if (cabinPref == null) {
            cabinPref = new ArrayList<CabinPrefType>();
        }
        return this.cabinPref;
    }

    /**
     * Gets the value of the ticketDistribPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDistribPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDistribPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketDistribPrefType }
     * 
     * 
     */
    public List<TicketDistribPrefType> getTicketDistribPref() {
        if (ticketDistribPref == null) {
            ticketDistribPref = new ArrayList<TicketDistribPrefType>();
        }
        return this.ticketDistribPref;
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
     * Gets the value of the ancillaryFees property.
     * 
     * @return
     *     possible object is
     *     {@link AncillaryFees }
     *     
     */
    public AncillaryFees getAncillaryFees() {
        return ancillaryFees;
    }

    /**
     * Sets the value of the ancillaryFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryFees }
     *     
     */
    public void setAncillaryFees(AncillaryFees value) {
        this.ancillaryFees = value;
    }

    /**
     * Gets the value of the spanishFamilyDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link SpanishFamilyDiscount }
     *     
     */
    public SpanishFamilyDiscount getSpanishFamilyDiscount() {
        return spanishFamilyDiscount;
    }

    /**
     * Sets the value of the spanishFamilyDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpanishFamilyDiscount }
     *     
     */
    public void setSpanishFamilyDiscount(SpanishFamilyDiscount value) {
        this.spanishFamilyDiscount = value;
    }

    /**
     * Gets the value of the onTimeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOnTimeRate() {
        return onTimeRate;
    }

    /**
     * Sets the value of the onTimeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOnTimeRate(BigDecimal value) {
        this.onTimeRate = value;
    }

    /**
     * Gets the value of the eTicketDesired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isETicketDesired() {
        if (eTicketDesired == null) {
            return false;
        } else {
            return eTicketDesired;
        }
    }

    /**
     * Sets the value of the eTicketDesired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setETicketDesired(Boolean value) {
        this.eTicketDesired = value;
    }

    /**
     * Gets the value of the validInterlineTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isValidInterlineTicket() {
        if (validInterlineTicket == null) {
            return false;
        } else {
            return validInterlineTicket;
        }
    }

    /**
     * Sets the value of the validInterlineTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidInterlineTicket(Boolean value) {
        this.validInterlineTicket = value;
    }

    /**
     * Gets the value of the maxStopsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxStopsQuantity() {
        return maxStopsQuantity;
    }

    /**
     * Sets the value of the maxStopsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxStopsQuantity(Integer value) {
        this.maxStopsQuantity = value;
    }

    /**
     * Gets the value of the allFlightsData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllFlightsData() {
        if (allFlightsData == null) {
            return false;
        } else {
            return allFlightsData;
        }
    }

    /**
     * Sets the value of the allFlightsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllFlightsData(Boolean value) {
        this.allFlightsData = value;
    }

    /**
     * Gets the value of the smokingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmokingAllowed() {
        if (smokingAllowed == null) {
            return false;
        } else {
            return smokingAllowed;
        }
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AncillaryFeeGroup" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Enable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Summary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ancillaryFeeGroup"
    })
    public static class AncillaryFees {

        @XmlElement(name = "AncillaryFeeGroup")
        protected List<AncillaryFeeGroup> ancillaryFeeGroup;
        @XmlAttribute(name = "Enable", required = true)
        protected boolean enable;
        @XmlAttribute(name = "Summary")
        protected Boolean summary;

        /**
         * Gets the value of the ancillaryFeeGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ancillaryFeeGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAncillaryFeeGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AncillaryFeeGroup }
         * 
         * 
         */
        public List<AncillaryFeeGroup> getAncillaryFeeGroup() {
            if (ancillaryFeeGroup == null) {
                ancillaryFeeGroup = new ArrayList<AncillaryFeeGroup>();
            }
            return this.ancillaryFeeGroup;
        }

        /**
         * Gets the value of the enable property.
         * 
         */
        public boolean isEnable() {
            return enable;
        }

        /**
         * Sets the value of the enable property.
         * 
         */
        public void setEnable(boolean value) {
            this.enable = value;
        }

        /**
         * Gets the value of the summary property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSummary() {
            return summary;
        }

        /**
         * Sets the value of the summary property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSummary(Boolean value) {
            this.summary = value;
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
         *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AncillaryFeeGroup {

            @XmlAttribute(name = "Code", required = true)
            @XmlSchemaType(name = "anySimpleType")
            protected String code;
            @XmlAttribute(name = "Count")
            @XmlSchemaType(name = "anySimpleType")
            protected String count;

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
             * Gets the value of the count property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCount() {
                return count;
            }

            /**
             * Sets the value of the count property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCount(String value) {
                this.count = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareRestrictPrefType">
     *       &lt;sequence>
     *         &lt;element name="AdvResTicketing" type="{http://www.opentravel.org/OTA/2003/05}AdvResTicketingType" minOccurs="0"/>
     *         &lt;element name="StayRestrictions" type="{http://www.opentravel.org/OTA/2003/05}StayRestrictionsType" minOccurs="0"/>
     *         &lt;element name="VoluntaryChanges" type="{http://www.opentravel.org/OTA/2003/05}VoluntaryChangesType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "advResTicketing",
        "stayRestrictions",
        "voluntaryChanges"
    })
    public static class FareRestrictPref
        extends FareRestrictPrefType
    {

        @XmlElement(name = "AdvResTicketing")
        protected AdvResTicketingType advResTicketing;
        @XmlElement(name = "StayRestrictions")
        protected StayRestrictionsType stayRestrictions;
        @XmlElement(name = "VoluntaryChanges")
        protected VoluntaryChangesType voluntaryChanges;

        /**
         * Gets the value of the advResTicketing property.
         * 
         * @return
         *     possible object is
         *     {@link AdvResTicketingType }
         *     
         */
        public AdvResTicketingType getAdvResTicketing() {
            return advResTicketing;
        }

        /**
         * Sets the value of the advResTicketing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdvResTicketingType }
         *     
         */
        public void setAdvResTicketing(AdvResTicketingType value) {
            this.advResTicketing = value;
        }

        /**
         * Gets the value of the stayRestrictions property.
         * 
         * @return
         *     possible object is
         *     {@link StayRestrictionsType }
         *     
         */
        public StayRestrictionsType getStayRestrictions() {
            return stayRestrictions;
        }

        /**
         * Sets the value of the stayRestrictions property.
         * 
         * @param value
         *     allowed object is
         *     {@link StayRestrictionsType }
         *     
         */
        public void setStayRestrictions(StayRestrictionsType value) {
            this.stayRestrictions = value;
        }

        /**
         * Gets the value of the voluntaryChanges property.
         * 
         * @return
         *     possible object is
         *     {@link VoluntaryChangesType }
         *     
         */
        public VoluntaryChangesType getVoluntaryChanges() {
            return voluntaryChanges;
        }

        /**
         * Sets the value of the voluntaryChanges property.
         * 
         * @param value
         *     allowed object is
         *     {@link VoluntaryChangesType }
         *     
         */
        public void setVoluntaryChanges(VoluntaryChangesType value) {
            this.voluntaryChanges = value;
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
     *       &lt;attribute name="Level" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
     *             &lt;enumeration value="1"/>
     *             &lt;enumeration value="2"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SpanishFamilyDiscount {

        @XmlAttribute(name = "Level", required = true)
        protected short level;

        /**
         * Gets the value of the level property.
         * 
         */
        public short getLevel() {
            return level;
        }

        /**
         * Sets the value of the level property.
         * 
         */
        public void setLevel(short value) {
            this.level = value;
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
     *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05}TravelPreferencesTPA_ExtensionsDepartureArrivalWindowGroup"/>
     *         &lt;element name="ExcludeVendorPref" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="8"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="IncludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ExcludeAlliancePref" type="{http://www.opentravel.org/OTA/2003/05}AllianceType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="NumTrips" type="{http://www.opentravel.org/OTA/2003/05}NumTripsType" minOccurs="0"/>
     *         &lt;element name="AltCitiesCombinations" type="{http://www.opentravel.org/OTA/2003/05}AltCitiesCombinationsType" minOccurs="0"/>
     *         &lt;element name="NumTripsWithRouting" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Number" default="5">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
     *                       &lt;minInclusive value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05}TravelPreferencesTPA_ExtensionsOnlineInterlineIndicatorGroup"/>
     *         &lt;element name="TripType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MaxPrice" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DomesticLayoverTime" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Hours" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LongConnectTime" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Min" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                 &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                 &lt;attribute name="Enable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LongConnectPoints" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Min" type="{http://www.w3.org/2001/XMLSchema}short" />
     *                 &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AirServiceOnly" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="JetServiceOnly" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SameConnectionAirportOnly" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SameOriginAirportOnly" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SameTurnaroundAirportOnly" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AircraftTypePenalty" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AlternateAirportPenalty" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FareAmountThreshold" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="numOfLowFareSol" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="numOfMustPriceOnlSol" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="numOfMustPriceInrlSol" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="numOfMustPriceNStpOnlSol" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="numOfMustPriceNStpInrlSol" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="numOfMustPriceSStopOnlSol" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="stpPenaltyInUSD" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="durPenaltyInUSD" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="depPenaltyInUSD" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="maxAllowedMustPriceOveragePerCrr" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="fltOptMustPriceReuseLimit" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="upperBoundMustPriceFactorForNotNonStp" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="upperBoundLFSFactor" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="numOfMustPriceNStp1StpOnlSol" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="numOfMustPriceNStp1StpInrlSol" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="upperBoundMustPriceFactorForNonStp" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="maxAllowedLFSOveragePerCrrPercent" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="targetMinNumOfLFSOnlSolPerCrr" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="targetMinNumOfLFSTotOnlSolPercent" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="fltOptLFSReuseLimitForNonAVS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="fltOptLFSReuseLimitForAVS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="avsPenaltyCrrs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="maxNumOfNonStpOnlSol" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="maxNumOfNonStpInrlSol" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="maxNumOfSingleStpOnlSol" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="maxNumOf2PlusStpSol" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="minAllowedOveragePerCrrPercent" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="minAllowedOveragePerCrr" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="maxRelFareLvlOfxForNonStp" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="maxRelFareLvlOfxForCnx" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="numOfMustPrice2PlusStpSol" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ItineraryNumberThreshold" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="XOFares" type="{http://www.opentravel.org/OTA/2003/05}XOFaresType" minOccurs="0"/>
     *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05}TravelPreferencesTPA_ExtensionsTaxesGroup"/>
     *         &lt;element name="FlightStopsAsConnections" type="{http://www.opentravel.org/OTA/2003/05}FlightStopsAsConnectionsType" minOccurs="0"/>
     *         &lt;element name="TicketingSumOfLocals" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Enable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="JumpCabinLogic" type="{http://www.opentravel.org/OTA/2003/05}JumpCabinLogicType" minOccurs="0"/>
     *         &lt;element name="KeepSameCabin" type="{http://www.opentravel.org/OTA/2003/05}KeepSameCabinType" minOccurs="0"/>
     *         &lt;element name="GoverningCarrierOverride" type="{http://www.opentravel.org/OTA/2003/05}GoverningCarrierOverrideType" minOccurs="0"/>
     *         &lt;element name="ExcludeCallDirectCarriers" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ValidatingCarrier" type="{http://www.opentravel.org/OTA/2003/05}ValidatingCarrierType" minOccurs="0"/>
     *         &lt;element name="SettlementMethod" type="{http://www.opentravel.org/OTA/2003/05}SettlementMethodType" minOccurs="0"/>
     *         &lt;element name="FlexibleFares" type="{http://www.opentravel.org/OTA/2003/05}FlexibleFaresType" minOccurs="0"/>
     *         &lt;element name="DiversityParameters" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Weightings" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="PriceWeight" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric0To10Type" />
     *                           &lt;attribute name="TravelTimeWeight" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric0To10Type" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TimeOfDayDistribution" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TimeOfDayRange" maxOccurs="4" minOccurs="2">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Begin" use="required" type="{http://www.opentravel.org/OTA/2003/05}TimeWindowBoundaryType" />
     *                                     &lt;attribute name="End" use="required" type="{http://www.opentravel.org/OTA/2003/05}TimeWindowBoundaryType" />
     *                                     &lt;attribute name="Percentage" use="required" type="{http://www.opentravel.org/OTA/2003/05}PercentageType" />
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
     *                 &lt;attribute name="InboundOutboundPairing">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
     *                       &lt;minInclusive value="1"/>
     *                       &lt;maxInclusive value="1000"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="AdditionalNonStopsNumber">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
     *                       &lt;minInclusive value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="AdditionalNonStopsPercentage" type="{http://www.opentravel.org/OTA/2003/05}PercentageType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AdditionalFareLimit" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SellingLevels" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="SellingLevelRules">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Ignore" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ShowFareAmounts">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Original" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Budget" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="MinimumPrice" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="MaximumPrice" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="RelativePriceThreshold" type="{http://www.opentravel.org/OTA/2003/05}SignedCountOrPercentage" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OptionsPerDatePairList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OptionsPerDatePair" type="{http://www.opentravel.org/OTA/2003/05}OptionsPerDatePairType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CountryPref" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
     *                 &lt;attribute name="PreferLevel" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="Unacceptable"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
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
        "departureWindow",
        "arrivalWindow",
        "excludeVendorPref",
        "includeAlliancePref",
        "excludeAlliancePref",
        "numTrips",
        "altCitiesCombinations",
        "numTripsWithRouting",
        "onlineIndicator",
        "interlineIndicator",
        "tripType",
        "maxPrice",
        "domesticLayoverTime",
        "longConnectTime",
        "longConnectPoints",
        "airServiceOnly",
        "jetServiceOnly",
        "sameConnectionAirportOnly",
        "sameOriginAirportOnly",
        "sameTurnaroundAirportOnly",
        "aircraftTypePenalty",
        "alternateAirportPenalty",
        "fareAmountThreshold",
        "numOfLowFareSol",
        "numOfMustPriceOnlSol",
        "numOfMustPriceInrlSol",
        "numOfMustPriceNStpOnlSol",
        "numOfMustPriceNStpInrlSol",
        "numOfMustPriceSStopOnlSol",
        "stpPenaltyInUSD",
        "durPenaltyInUSD",
        "depPenaltyInUSD",
        "maxAllowedMustPriceOveragePerCrr",
        "fltOptMustPriceReuseLimit",
        "upperBoundMustPriceFactorForNotNonStp",
        "upperBoundLFSFactor",
        "numOfMustPriceNStp1StpOnlSol",
        "numOfMustPriceNStp1StpInrlSol",
        "upperBoundMustPriceFactorForNonStp",
        "maxAllowedLFSOveragePerCrrPercent",
        "targetMinNumOfLFSOnlSolPerCrr",
        "targetMinNumOfLFSTotOnlSolPercent",
        "fltOptLFSReuseLimitForNonAVS",
        "fltOptLFSReuseLimitForAVS",
        "avsPenaltyCrrs",
        "maxNumOfNonStpOnlSol",
        "maxNumOfNonStpInrlSol",
        "maxNumOfSingleStpOnlSol",
        "maxNumOf2PlusStpSol",
        "minAllowedOveragePerCrrPercent",
        "minAllowedOveragePerCrr",
        "maxRelFareLvlOfxForNonStp",
        "maxRelFareLvlOfxForCnx",
        "numOfMustPrice2PlusStpSol",
        "itineraryNumberThreshold",
        "xoFares",
        "exemptAllTaxes",
        "exemptAllTaxesAndFees",
        "taxes",
        "exemptTax",
        "flightStopsAsConnections",
        "ticketingSumOfLocals",
        "jumpCabinLogic",
        "keepSameCabin",
        "governingCarrierOverride",
        "excludeCallDirectCarriers",
        "validatingCarrier",
        "settlementMethod",
        "flexibleFares",
        "diversityParameters",
        "additionalFareLimit",
        "sellingLevels",
        "budget",
        "optionsPerDatePairList",
        "countryPref"
    })
    public static class TPAExtensions {

        @XmlElement(name = "DepartureWindow")
        protected String departureWindow;
        @XmlElement(name = "ArrivalWindow")
        protected String arrivalWindow;
        @XmlElement(name = "ExcludeVendorPref")
        protected List<ExcludeVendorPref> excludeVendorPref;
        @XmlElement(name = "IncludeAlliancePref")
        protected List<AllianceType> includeAlliancePref;
        @XmlElement(name = "ExcludeAlliancePref")
        protected List<AllianceType> excludeAlliancePref;
        @XmlElement(name = "NumTrips")
        protected NumTripsType numTrips;
        @XmlElement(name = "AltCitiesCombinations")
        protected AltCitiesCombinationsType altCitiesCombinations;
        @XmlElement(name = "NumTripsWithRouting")
        protected NumTripsWithRouting numTripsWithRouting;
        @XmlElement(name = "OnlineIndicator")
        protected OnlineIndicator onlineIndicator;
        @XmlElement(name = "InterlineIndicator")
        protected InterlineIndicator interlineIndicator;
        @XmlElement(name = "TripType")
        protected TripType tripType;
        @XmlElement(name = "MaxPrice")
        protected MaxPrice maxPrice;
        @XmlElement(name = "DomesticLayoverTime")
        protected DomesticLayoverTime domesticLayoverTime;
        @XmlElement(name = "LongConnectTime")
        protected LongConnectTime longConnectTime;
        @XmlElement(name = "LongConnectPoints")
        protected LongConnectPoints longConnectPoints;
        @XmlElement(name = "AirServiceOnly")
        protected AirServiceOnly airServiceOnly;
        @XmlElement(name = "JetServiceOnly")
        protected JetServiceOnly jetServiceOnly;
        @XmlElement(name = "SameConnectionAirportOnly")
        protected SameConnectionAirportOnly sameConnectionAirportOnly;
        @XmlElement(name = "SameOriginAirportOnly")
        protected SameOriginAirportOnly sameOriginAirportOnly;
        @XmlElement(name = "SameTurnaroundAirportOnly")
        protected SameTurnaroundAirportOnly sameTurnaroundAirportOnly;
        @XmlElement(name = "AircraftTypePenalty")
        protected AircraftTypePenalty aircraftTypePenalty;
        @XmlElement(name = "AlternateAirportPenalty")
        protected AlternateAirportPenalty alternateAirportPenalty;
        @XmlElement(name = "FareAmountThreshold")
        protected FareAmountThreshold fareAmountThreshold;
        protected NumOfLowFareSol numOfLowFareSol;
        protected NumOfMustPriceOnlSol numOfMustPriceOnlSol;
        protected NumOfMustPriceInrlSol numOfMustPriceInrlSol;
        protected NumOfMustPriceNStpOnlSol numOfMustPriceNStpOnlSol;
        protected NumOfMustPriceNStpInrlSol numOfMustPriceNStpInrlSol;
        protected NumOfMustPriceSStopOnlSol numOfMustPriceSStopOnlSol;
        protected StpPenaltyInUSD stpPenaltyInUSD;
        protected DurPenaltyInUSD durPenaltyInUSD;
        protected DepPenaltyInUSD depPenaltyInUSD;
        protected MaxAllowedMustPriceOveragePerCrr maxAllowedMustPriceOveragePerCrr;
        protected FltOptMustPriceReuseLimit fltOptMustPriceReuseLimit;
        protected UpperBoundMustPriceFactorForNotNonStp upperBoundMustPriceFactorForNotNonStp;
        protected UpperBoundLFSFactor upperBoundLFSFactor;
        protected NumOfMustPriceNStp1StpOnlSol numOfMustPriceNStp1StpOnlSol;
        protected NumOfMustPriceNStp1StpInrlSol numOfMustPriceNStp1StpInrlSol;
        protected UpperBoundMustPriceFactorForNonStp upperBoundMustPriceFactorForNonStp;
        protected MaxAllowedLFSOveragePerCrrPercent maxAllowedLFSOveragePerCrrPercent;
        protected TargetMinNumOfLFSOnlSolPerCrr targetMinNumOfLFSOnlSolPerCrr;
        protected TargetMinNumOfLFSTotOnlSolPercent targetMinNumOfLFSTotOnlSolPercent;
        protected FltOptLFSReuseLimitForNonAVS fltOptLFSReuseLimitForNonAVS;
        protected FltOptLFSReuseLimitForAVS fltOptLFSReuseLimitForAVS;
        protected AvsPenaltyCrrs avsPenaltyCrrs;
        protected MaxNumOfNonStpOnlSol maxNumOfNonStpOnlSol;
        protected MaxNumOfNonStpInrlSol maxNumOfNonStpInrlSol;
        protected MaxNumOfSingleStpOnlSol maxNumOfSingleStpOnlSol;
        protected MaxNumOf2PlusStpSol maxNumOf2PlusStpSol;
        protected MinAllowedOveragePerCrrPercent minAllowedOveragePerCrrPercent;
        protected MinAllowedOveragePerCrr minAllowedOveragePerCrr;
        protected MaxRelFareLvlOfxForNonStp maxRelFareLvlOfxForNonStp;
        protected MaxRelFareLvlOfxForCnx maxRelFareLvlOfxForCnx;
        protected NumOfMustPrice2PlusStpSol numOfMustPrice2PlusStpSol;
        @XmlElement(name = "ItineraryNumberThreshold")
        protected ItineraryNumberThreshold itineraryNumberThreshold;
        @XmlElement(name = "XOFares")
        protected XOFaresType xoFares;
        @XmlElement(name = "ExemptAllTaxes")
        protected ExchangeTravelPreferencesTPAExtensionsType.ExemptAllTaxes exemptAllTaxes;
        @XmlElement(name = "ExemptAllTaxesAndFees")
        protected ExchangeTravelPreferencesTPAExtensionsType.ExemptAllTaxesAndFees exemptAllTaxesAndFees;
        @XmlElement(name = "Taxes")
        protected ExchangeTravelPreferencesTPAExtensionsType.Taxes taxes;
        @XmlElement(name = "ExemptTax")
        protected List<TaxCodeType> exemptTax;
        @XmlElement(name = "FlightStopsAsConnections")
        protected FlightStopsAsConnectionsType flightStopsAsConnections;
        @XmlElement(name = "TicketingSumOfLocals")
        protected TicketingSumOfLocals ticketingSumOfLocals;
        @XmlElement(name = "JumpCabinLogic")
        protected JumpCabinLogicType jumpCabinLogic;
        @XmlElement(name = "KeepSameCabin")
        protected KeepSameCabinType keepSameCabin;
        @XmlElement(name = "GoverningCarrierOverride")
        protected GoverningCarrierOverrideType governingCarrierOverride;
        @XmlElement(name = "ExcludeCallDirectCarriers")
        protected ExcludeCallDirectCarriers excludeCallDirectCarriers;
        @XmlElement(name = "ValidatingCarrier")
        protected ValidatingCarrierType validatingCarrier;
        @XmlElement(name = "SettlementMethod")
        protected String settlementMethod;
        @XmlElement(name = "FlexibleFares")
        protected FlexibleFaresType flexibleFares;
        @XmlElement(name = "DiversityParameters")
        protected DiversityParameters diversityParameters;
        @XmlElement(name = "AdditionalFareLimit")
        protected AdditionalFareLimit additionalFareLimit;
        @XmlElement(name = "SellingLevels")
        protected SellingLevels sellingLevels;
        @XmlElement(name = "Budget")
        protected Budget budget;
        @XmlElement(name = "OptionsPerDatePairList")
        protected OptionsPerDatePairList optionsPerDatePairList;
        @XmlElement(name = "CountryPref")
        protected List<CountryPref> countryPref;

        /**
         * Gets the value of the departureWindow property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartureWindow() {
            return departureWindow;
        }

        /**
         * Sets the value of the departureWindow property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartureWindow(String value) {
            this.departureWindow = value;
        }

        /**
         * Gets the value of the arrivalWindow property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArrivalWindow() {
            return arrivalWindow;
        }

        /**
         * Sets the value of the arrivalWindow property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArrivalWindow(String value) {
            this.arrivalWindow = value;
        }

        /**
         * Gets the value of the excludeVendorPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the excludeVendorPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExcludeVendorPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExcludeVendorPref }
         * 
         * 
         */
        public List<ExcludeVendorPref> getExcludeVendorPref() {
            if (excludeVendorPref == null) {
                excludeVendorPref = new ArrayList<ExcludeVendorPref>();
            }
            return this.excludeVendorPref;
        }

        /**
         * Gets the value of the includeAlliancePref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the includeAlliancePref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIncludeAlliancePref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AllianceType }
         * 
         * 
         */
        public List<AllianceType> getIncludeAlliancePref() {
            if (includeAlliancePref == null) {
                includeAlliancePref = new ArrayList<AllianceType>();
            }
            return this.includeAlliancePref;
        }

        /**
         * Gets the value of the excludeAlliancePref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the excludeAlliancePref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExcludeAlliancePref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AllianceType }
         * 
         * 
         */
        public List<AllianceType> getExcludeAlliancePref() {
            if (excludeAlliancePref == null) {
                excludeAlliancePref = new ArrayList<AllianceType>();
            }
            return this.excludeAlliancePref;
        }

        /**
         * Gets the value of the numTrips property.
         * 
         * @return
         *     possible object is
         *     {@link NumTripsType }
         *     
         */
        public NumTripsType getNumTrips() {
            return numTrips;
        }

        /**
         * Sets the value of the numTrips property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumTripsType }
         *     
         */
        public void setNumTrips(NumTripsType value) {
            this.numTrips = value;
        }

        /**
         * Gets the value of the altCitiesCombinations property.
         * 
         * @return
         *     possible object is
         *     {@link AltCitiesCombinationsType }
         *     
         */
        public AltCitiesCombinationsType getAltCitiesCombinations() {
            return altCitiesCombinations;
        }

        /**
         * Sets the value of the altCitiesCombinations property.
         * 
         * @param value
         *     allowed object is
         *     {@link AltCitiesCombinationsType }
         *     
         */
        public void setAltCitiesCombinations(AltCitiesCombinationsType value) {
            this.altCitiesCombinations = value;
        }

        /**
         * Gets the value of the numTripsWithRouting property.
         * 
         * @return
         *     possible object is
         *     {@link NumTripsWithRouting }
         *     
         */
        public NumTripsWithRouting getNumTripsWithRouting() {
            return numTripsWithRouting;
        }

        /**
         * Sets the value of the numTripsWithRouting property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumTripsWithRouting }
         *     
         */
        public void setNumTripsWithRouting(NumTripsWithRouting value) {
            this.numTripsWithRouting = value;
        }

        /**
         * Gets the value of the onlineIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link OnlineIndicator }
         *     
         */
        public OnlineIndicator getOnlineIndicator() {
            return onlineIndicator;
        }

        /**
         * Sets the value of the onlineIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link OnlineIndicator }
         *     
         */
        public void setOnlineIndicator(OnlineIndicator value) {
            this.onlineIndicator = value;
        }

        /**
         * Gets the value of the interlineIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link InterlineIndicator }
         *     
         */
        public InterlineIndicator getInterlineIndicator() {
            return interlineIndicator;
        }

        /**
         * Sets the value of the interlineIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link InterlineIndicator }
         *     
         */
        public void setInterlineIndicator(InterlineIndicator value) {
            this.interlineIndicator = value;
        }

        /**
         * Gets the value of the tripType property.
         * 
         * @return
         *     possible object is
         *     {@link TripType }
         *     
         */
        public TripType getTripType() {
            return tripType;
        }

        /**
         * Sets the value of the tripType property.
         * 
         * @param value
         *     allowed object is
         *     {@link TripType }
         *     
         */
        public void setTripType(TripType value) {
            this.tripType = value;
        }

        /**
         * Gets the value of the maxPrice property.
         * 
         * @return
         *     possible object is
         *     {@link MaxPrice }
         *     
         */
        public MaxPrice getMaxPrice() {
            return maxPrice;
        }

        /**
         * Sets the value of the maxPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link MaxPrice }
         *     
         */
        public void setMaxPrice(MaxPrice value) {
            this.maxPrice = value;
        }

        /**
         * Gets the value of the domesticLayoverTime property.
         * 
         * @return
         *     possible object is
         *     {@link DomesticLayoverTime }
         *     
         */
        public DomesticLayoverTime getDomesticLayoverTime() {
            return domesticLayoverTime;
        }

        /**
         * Sets the value of the domesticLayoverTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link DomesticLayoverTime }
         *     
         */
        public void setDomesticLayoverTime(DomesticLayoverTime value) {
            this.domesticLayoverTime = value;
        }

        /**
         * Gets the value of the longConnectTime property.
         * 
         * @return
         *     possible object is
         *     {@link LongConnectTime }
         *     
         */
        public LongConnectTime getLongConnectTime() {
            return longConnectTime;
        }

        /**
         * Sets the value of the longConnectTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link LongConnectTime }
         *     
         */
        public void setLongConnectTime(LongConnectTime value) {
            this.longConnectTime = value;
        }

        /**
         * Gets the value of the longConnectPoints property.
         * 
         * @return
         *     possible object is
         *     {@link LongConnectPoints }
         *     
         */
        public LongConnectPoints getLongConnectPoints() {
            return longConnectPoints;
        }

        /**
         * Sets the value of the longConnectPoints property.
         * 
         * @param value
         *     allowed object is
         *     {@link LongConnectPoints }
         *     
         */
        public void setLongConnectPoints(LongConnectPoints value) {
            this.longConnectPoints = value;
        }

        /**
         * Gets the value of the airServiceOnly property.
         * 
         * @return
         *     possible object is
         *     {@link AirServiceOnly }
         *     
         */
        public AirServiceOnly getAirServiceOnly() {
            return airServiceOnly;
        }

        /**
         * Sets the value of the airServiceOnly property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirServiceOnly }
         *     
         */
        public void setAirServiceOnly(AirServiceOnly value) {
            this.airServiceOnly = value;
        }

        /**
         * Gets the value of the jetServiceOnly property.
         * 
         * @return
         *     possible object is
         *     {@link JetServiceOnly }
         *     
         */
        public JetServiceOnly getJetServiceOnly() {
            return jetServiceOnly;
        }

        /**
         * Sets the value of the jetServiceOnly property.
         * 
         * @param value
         *     allowed object is
         *     {@link JetServiceOnly }
         *     
         */
        public void setJetServiceOnly(JetServiceOnly value) {
            this.jetServiceOnly = value;
        }

        /**
         * Gets the value of the sameConnectionAirportOnly property.
         * 
         * @return
         *     possible object is
         *     {@link SameConnectionAirportOnly }
         *     
         */
        public SameConnectionAirportOnly getSameConnectionAirportOnly() {
            return sameConnectionAirportOnly;
        }

        /**
         * Sets the value of the sameConnectionAirportOnly property.
         * 
         * @param value
         *     allowed object is
         *     {@link SameConnectionAirportOnly }
         *     
         */
        public void setSameConnectionAirportOnly(SameConnectionAirportOnly value) {
            this.sameConnectionAirportOnly = value;
        }

        /**
         * Gets the value of the sameOriginAirportOnly property.
         * 
         * @return
         *     possible object is
         *     {@link SameOriginAirportOnly }
         *     
         */
        public SameOriginAirportOnly getSameOriginAirportOnly() {
            return sameOriginAirportOnly;
        }

        /**
         * Sets the value of the sameOriginAirportOnly property.
         * 
         * @param value
         *     allowed object is
         *     {@link SameOriginAirportOnly }
         *     
         */
        public void setSameOriginAirportOnly(SameOriginAirportOnly value) {
            this.sameOriginAirportOnly = value;
        }

        /**
         * Gets the value of the sameTurnaroundAirportOnly property.
         * 
         * @return
         *     possible object is
         *     {@link SameTurnaroundAirportOnly }
         *     
         */
        public SameTurnaroundAirportOnly getSameTurnaroundAirportOnly() {
            return sameTurnaroundAirportOnly;
        }

        /**
         * Sets the value of the sameTurnaroundAirportOnly property.
         * 
         * @param value
         *     allowed object is
         *     {@link SameTurnaroundAirportOnly }
         *     
         */
        public void setSameTurnaroundAirportOnly(SameTurnaroundAirportOnly value) {
            this.sameTurnaroundAirportOnly = value;
        }

        /**
         * Gets the value of the aircraftTypePenalty property.
         * 
         * @return
         *     possible object is
         *     {@link AircraftTypePenalty }
         *     
         */
        public AircraftTypePenalty getAircraftTypePenalty() {
            return aircraftTypePenalty;
        }

        /**
         * Sets the value of the aircraftTypePenalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link AircraftTypePenalty }
         *     
         */
        public void setAircraftTypePenalty(AircraftTypePenalty value) {
            this.aircraftTypePenalty = value;
        }

        /**
         * Gets the value of the alternateAirportPenalty property.
         * 
         * @return
         *     possible object is
         *     {@link AlternateAirportPenalty }
         *     
         */
        public AlternateAirportPenalty getAlternateAirportPenalty() {
            return alternateAirportPenalty;
        }

        /**
         * Sets the value of the alternateAirportPenalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link AlternateAirportPenalty }
         *     
         */
        public void setAlternateAirportPenalty(AlternateAirportPenalty value) {
            this.alternateAirportPenalty = value;
        }

        /**
         * Gets the value of the fareAmountThreshold property.
         * 
         * @return
         *     possible object is
         *     {@link FareAmountThreshold }
         *     
         */
        public FareAmountThreshold getFareAmountThreshold() {
            return fareAmountThreshold;
        }

        /**
         * Sets the value of the fareAmountThreshold property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareAmountThreshold }
         *     
         */
        public void setFareAmountThreshold(FareAmountThreshold value) {
            this.fareAmountThreshold = value;
        }

        /**
         * Gets the value of the numOfLowFareSol property.
         * 
         * @return
         *     possible object is
         *     {@link NumOfLowFareSol }
         *     
         */
        public NumOfLowFareSol getNumOfLowFareSol() {
            return numOfLowFareSol;
        }

        /**
         * Sets the value of the numOfLowFareSol property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumOfLowFareSol }
         *     
         */
        public void setNumOfLowFareSol(NumOfLowFareSol value) {
            this.numOfLowFareSol = value;
        }

        /**
         * Gets the value of the numOfMustPriceOnlSol property.
         * 
         * @return
         *     possible object is
         *     {@link NumOfMustPriceOnlSol }
         *     
         */
        public NumOfMustPriceOnlSol getNumOfMustPriceOnlSol() {
            return numOfMustPriceOnlSol;
        }

        /**
         * Sets the value of the numOfMustPriceOnlSol property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumOfMustPriceOnlSol }
         *     
         */
        public void setNumOfMustPriceOnlSol(NumOfMustPriceOnlSol value) {
            this.numOfMustPriceOnlSol = value;
        }

        /**
         * Gets the value of the numOfMustPriceInrlSol property.
         * 
         * @return
         *     possible object is
         *     {@link NumOfMustPriceInrlSol }
         *     
         */
        public NumOfMustPriceInrlSol getNumOfMustPriceInrlSol() {
            return numOfMustPriceInrlSol;
        }

        /**
         * Sets the value of the numOfMustPriceInrlSol property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumOfMustPriceInrlSol }
         *     
         */
        public void setNumOfMustPriceInrlSol(NumOfMustPriceInrlSol value) {
            this.numOfMustPriceInrlSol = value;
        }

        /**
         * Gets the value of the numOfMustPriceNStpOnlSol property.
         * 
         * @return
         *     possible object is
         *     {@link NumOfMustPriceNStpOnlSol }
         *     
         */
        public NumOfMustPriceNStpOnlSol getNumOfMustPriceNStpOnlSol() {
            return numOfMustPriceNStpOnlSol;
        }

        /**
         * Sets the value of the numOfMustPriceNStpOnlSol property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumOfMustPriceNStpOnlSol }
         *     
         */
        public void setNumOfMustPriceNStpOnlSol(NumOfMustPriceNStpOnlSol value) {
            this.numOfMustPriceNStpOnlSol = value;
        }

        /**
         * Gets the value of the numOfMustPriceNStpInrlSol property.
         * 
         * @return
         *     possible object is
         *     {@link NumOfMustPriceNStpInrlSol }
         *     
         */
        public NumOfMustPriceNStpInrlSol getNumOfMustPriceNStpInrlSol() {
            return numOfMustPriceNStpInrlSol;
        }

        /**
         * Sets the value of the numOfMustPriceNStpInrlSol property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumOfMustPriceNStpInrlSol }
         *     
         */
        public void setNumOfMustPriceNStpInrlSol(NumOfMustPriceNStpInrlSol value) {
            this.numOfMustPriceNStpInrlSol = value;
        }

        /**
         * Gets the value of the numOfMustPriceSStopOnlSol property.
         * 
         * @return
         *     possible object is
         *     {@link NumOfMustPriceSStopOnlSol }
         *     
         */
        public NumOfMustPriceSStopOnlSol getNumOfMustPriceSStopOnlSol() {
            return numOfMustPriceSStopOnlSol;
        }

        /**
         * Sets the value of the numOfMustPriceSStopOnlSol property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumOfMustPriceSStopOnlSol }
         *     
         */
        public void setNumOfMustPriceSStopOnlSol(NumOfMustPriceSStopOnlSol value) {
            this.numOfMustPriceSStopOnlSol = value;
        }

        /**
         * Gets the value of the stpPenaltyInUSD property.
         * 
         * @return
         *     possible object is
         *     {@link StpPenaltyInUSD }
         *     
         */
        public StpPenaltyInUSD getStpPenaltyInUSD() {
            return stpPenaltyInUSD;
        }

        /**
         * Sets the value of the stpPenaltyInUSD property.
         * 
         * @param value
         *     allowed object is
         *     {@link StpPenaltyInUSD }
         *     
         */
        public void setStpPenaltyInUSD(StpPenaltyInUSD value) {
            this.stpPenaltyInUSD = value;
        }

        /**
         * Gets the value of the durPenaltyInUSD property.
         * 
         * @return
         *     possible object is
         *     {@link DurPenaltyInUSD }
         *     
         */
        public DurPenaltyInUSD getDurPenaltyInUSD() {
            return durPenaltyInUSD;
        }

        /**
         * Sets the value of the durPenaltyInUSD property.
         * 
         * @param value
         *     allowed object is
         *     {@link DurPenaltyInUSD }
         *     
         */
        public void setDurPenaltyInUSD(DurPenaltyInUSD value) {
            this.durPenaltyInUSD = value;
        }

        /**
         * Gets the value of the depPenaltyInUSD property.
         * 
         * @return
         *     possible object is
         *     {@link DepPenaltyInUSD }
         *     
         */
        public DepPenaltyInUSD getDepPenaltyInUSD() {
            return depPenaltyInUSD;
        }

        /**
         * Sets the value of the depPenaltyInUSD property.
         * 
         * @param value
         *     allowed object is
         *     {@link DepPenaltyInUSD }
         *     
         */
        public void setDepPenaltyInUSD(DepPenaltyInUSD value) {
            this.depPenaltyInUSD = value;
        }

        /**
         * Gets the value of the maxAllowedMustPriceOveragePerCrr property.
         * 
         * @return
         *     possible object is
         *     {@link MaxAllowedMustPriceOveragePerCrr }
         *     
         */
        public MaxAllowedMustPriceOveragePerCrr getMaxAllowedMustPriceOveragePerCrr() {
            return maxAllowedMustPriceOveragePerCrr;
        }

        /**
         * Sets the value of the maxAllowedMustPriceOveragePerCrr property.
         * 
         * @param value
         *     allowed object is
         *     {@link MaxAllowedMustPriceOveragePerCrr }
         *     
         */
        public void setMaxAllowedMustPriceOveragePerCrr(MaxAllowedMustPriceOveragePerCrr value) {
            this.maxAllowedMustPriceOveragePerCrr = value;
        }

        /**
         * Gets the value of the fltOptMustPriceReuseLimit property.
         * 
         * @return
         *     possible object is
         *     {@link FltOptMustPriceReuseLimit }
         *     
         */
        public FltOptMustPriceReuseLimit getFltOptMustPriceReuseLimit() {
            return fltOptMustPriceReuseLimit;
        }

        /**
         * Sets the value of the fltOptMustPriceReuseLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link FltOptMustPriceReuseLimit }
         *     
         */
        public void setFltOptMustPriceReuseLimit(FltOptMustPriceReuseLimit value) {
            this.fltOptMustPriceReuseLimit = value;
        }

        /**
         * Gets the value of the upperBoundMustPriceFactorForNotNonStp property.
         * 
         * @return
         *     possible object is
         *     {@link UpperBoundMustPriceFactorForNotNonStp }
         *     
         */
        public UpperBoundMustPriceFactorForNotNonStp getUpperBoundMustPriceFactorForNotNonStp() {
            return upperBoundMustPriceFactorForNotNonStp;
        }

        /**
         * Sets the value of the upperBoundMustPriceFactorForNotNonStp property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpperBoundMustPriceFactorForNotNonStp }
         *     
         */
        public void setUpperBoundMustPriceFactorForNotNonStp(UpperBoundMustPriceFactorForNotNonStp value) {
            this.upperBoundMustPriceFactorForNotNonStp = value;
        }

        /**
         * Gets the value of the upperBoundLFSFactor property.
         * 
         * @return
         *     possible object is
         *     {@link UpperBoundLFSFactor }
         *     
         */
        public UpperBoundLFSFactor getUpperBoundLFSFactor() {
            return upperBoundLFSFactor;
        }

        /**
         * Sets the value of the upperBoundLFSFactor property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpperBoundLFSFactor }
         *     
         */
        public void setUpperBoundLFSFactor(UpperBoundLFSFactor value) {
            this.upperBoundLFSFactor = value;
        }

        /**
         * Gets the value of the numOfMustPriceNStp1StpOnlSol property.
         * 
         * @return
         *     possible object is
         *     {@link NumOfMustPriceNStp1StpOnlSol }
         *     
         */
        public NumOfMustPriceNStp1StpOnlSol getNumOfMustPriceNStp1StpOnlSol() {
            return numOfMustPriceNStp1StpOnlSol;
        }

        /**
         * Sets the value of the numOfMustPriceNStp1StpOnlSol property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumOfMustPriceNStp1StpOnlSol }
         *     
         */
        public void setNumOfMustPriceNStp1StpOnlSol(NumOfMustPriceNStp1StpOnlSol value) {
            this.numOfMustPriceNStp1StpOnlSol = value;
        }

        /**
         * Gets the value of the numOfMustPriceNStp1StpInrlSol property.
         * 
         * @return
         *     possible object is
         *     {@link NumOfMustPriceNStp1StpInrlSol }
         *     
         */
        public NumOfMustPriceNStp1StpInrlSol getNumOfMustPriceNStp1StpInrlSol() {
            return numOfMustPriceNStp1StpInrlSol;
        }

        /**
         * Sets the value of the numOfMustPriceNStp1StpInrlSol property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumOfMustPriceNStp1StpInrlSol }
         *     
         */
        public void setNumOfMustPriceNStp1StpInrlSol(NumOfMustPriceNStp1StpInrlSol value) {
            this.numOfMustPriceNStp1StpInrlSol = value;
        }

        /**
         * Gets the value of the upperBoundMustPriceFactorForNonStp property.
         * 
         * @return
         *     possible object is
         *     {@link UpperBoundMustPriceFactorForNonStp }
         *     
         */
        public UpperBoundMustPriceFactorForNonStp getUpperBoundMustPriceFactorForNonStp() {
            return upperBoundMustPriceFactorForNonStp;
        }

        /**
         * Sets the value of the upperBoundMustPriceFactorForNonStp property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpperBoundMustPriceFactorForNonStp }
         *     
         */
        public void setUpperBoundMustPriceFactorForNonStp(UpperBoundMustPriceFactorForNonStp value) {
            this.upperBoundMustPriceFactorForNonStp = value;
        }

        /**
         * Gets the value of the maxAllowedLFSOveragePerCrrPercent property.
         * 
         * @return
         *     possible object is
         *     {@link MaxAllowedLFSOveragePerCrrPercent }
         *     
         */
        public MaxAllowedLFSOveragePerCrrPercent getMaxAllowedLFSOveragePerCrrPercent() {
            return maxAllowedLFSOveragePerCrrPercent;
        }

        /**
         * Sets the value of the maxAllowedLFSOveragePerCrrPercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link MaxAllowedLFSOveragePerCrrPercent }
         *     
         */
        public void setMaxAllowedLFSOveragePerCrrPercent(MaxAllowedLFSOveragePerCrrPercent value) {
            this.maxAllowedLFSOveragePerCrrPercent = value;
        }

        /**
         * Gets the value of the targetMinNumOfLFSOnlSolPerCrr property.
         * 
         * @return
         *     possible object is
         *     {@link TargetMinNumOfLFSOnlSolPerCrr }
         *     
         */
        public TargetMinNumOfLFSOnlSolPerCrr getTargetMinNumOfLFSOnlSolPerCrr() {
            return targetMinNumOfLFSOnlSolPerCrr;
        }

        /**
         * Sets the value of the targetMinNumOfLFSOnlSolPerCrr property.
         * 
         * @param value
         *     allowed object is
         *     {@link TargetMinNumOfLFSOnlSolPerCrr }
         *     
         */
        public void setTargetMinNumOfLFSOnlSolPerCrr(TargetMinNumOfLFSOnlSolPerCrr value) {
            this.targetMinNumOfLFSOnlSolPerCrr = value;
        }

        /**
         * Gets the value of the targetMinNumOfLFSTotOnlSolPercent property.
         * 
         * @return
         *     possible object is
         *     {@link TargetMinNumOfLFSTotOnlSolPercent }
         *     
         */
        public TargetMinNumOfLFSTotOnlSolPercent getTargetMinNumOfLFSTotOnlSolPercent() {
            return targetMinNumOfLFSTotOnlSolPercent;
        }

        /**
         * Sets the value of the targetMinNumOfLFSTotOnlSolPercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link TargetMinNumOfLFSTotOnlSolPercent }
         *     
         */
        public void setTargetMinNumOfLFSTotOnlSolPercent(TargetMinNumOfLFSTotOnlSolPercent value) {
            this.targetMinNumOfLFSTotOnlSolPercent = value;
        }

        /**
         * Gets the value of the fltOptLFSReuseLimitForNonAVS property.
         * 
         * @return
         *     possible object is
         *     {@link FltOptLFSReuseLimitForNonAVS }
         *     
         */
        public FltOptLFSReuseLimitForNonAVS getFltOptLFSReuseLimitForNonAVS() {
            return fltOptLFSReuseLimitForNonAVS;
        }

        /**
         * Sets the value of the fltOptLFSReuseLimitForNonAVS property.
         * 
         * @param value
         *     allowed object is
         *     {@link FltOptLFSReuseLimitForNonAVS }
         *     
         */
        public void setFltOptLFSReuseLimitForNonAVS(FltOptLFSReuseLimitForNonAVS value) {
            this.fltOptLFSReuseLimitForNonAVS = value;
        }

        /**
         * Gets the value of the fltOptLFSReuseLimitForAVS property.
         * 
         * @return
         *     possible object is
         *     {@link FltOptLFSReuseLimitForAVS }
         *     
         */
        public FltOptLFSReuseLimitForAVS getFltOptLFSReuseLimitForAVS() {
            return fltOptLFSReuseLimitForAVS;
        }

        /**
         * Sets the value of the fltOptLFSReuseLimitForAVS property.
         * 
         * @param value
         *     allowed object is
         *     {@link FltOptLFSReuseLimitForAVS }
         *     
         */
        public void setFltOptLFSReuseLimitForAVS(FltOptLFSReuseLimitForAVS value) {
            this.fltOptLFSReuseLimitForAVS = value;
        }

        /**
         * Gets the value of the avsPenaltyCrrs property.
         * 
         * @return
         *     possible object is
         *     {@link AvsPenaltyCrrs }
         *     
         */
        public AvsPenaltyCrrs getAvsPenaltyCrrs() {
            return avsPenaltyCrrs;
        }

        /**
         * Sets the value of the avsPenaltyCrrs property.
         * 
         * @param value
         *     allowed object is
         *     {@link AvsPenaltyCrrs }
         *     
         */
        public void setAvsPenaltyCrrs(AvsPenaltyCrrs value) {
            this.avsPenaltyCrrs = value;
        }

        /**
         * Gets the value of the maxNumOfNonStpOnlSol property.
         * 
         * @return
         *     possible object is
         *     {@link MaxNumOfNonStpOnlSol }
         *     
         */
        public MaxNumOfNonStpOnlSol getMaxNumOfNonStpOnlSol() {
            return maxNumOfNonStpOnlSol;
        }

        /**
         * Sets the value of the maxNumOfNonStpOnlSol property.
         * 
         * @param value
         *     allowed object is
         *     {@link MaxNumOfNonStpOnlSol }
         *     
         */
        public void setMaxNumOfNonStpOnlSol(MaxNumOfNonStpOnlSol value) {
            this.maxNumOfNonStpOnlSol = value;
        }

        /**
         * Gets the value of the maxNumOfNonStpInrlSol property.
         * 
         * @return
         *     possible object is
         *     {@link MaxNumOfNonStpInrlSol }
         *     
         */
        public MaxNumOfNonStpInrlSol getMaxNumOfNonStpInrlSol() {
            return maxNumOfNonStpInrlSol;
        }

        /**
         * Sets the value of the maxNumOfNonStpInrlSol property.
         * 
         * @param value
         *     allowed object is
         *     {@link MaxNumOfNonStpInrlSol }
         *     
         */
        public void setMaxNumOfNonStpInrlSol(MaxNumOfNonStpInrlSol value) {
            this.maxNumOfNonStpInrlSol = value;
        }

        /**
         * Gets the value of the maxNumOfSingleStpOnlSol property.
         * 
         * @return
         *     possible object is
         *     {@link MaxNumOfSingleStpOnlSol }
         *     
         */
        public MaxNumOfSingleStpOnlSol getMaxNumOfSingleStpOnlSol() {
            return maxNumOfSingleStpOnlSol;
        }

        /**
         * Sets the value of the maxNumOfSingleStpOnlSol property.
         * 
         * @param value
         *     allowed object is
         *     {@link MaxNumOfSingleStpOnlSol }
         *     
         */
        public void setMaxNumOfSingleStpOnlSol(MaxNumOfSingleStpOnlSol value) {
            this.maxNumOfSingleStpOnlSol = value;
        }

        /**
         * Gets the value of the maxNumOf2PlusStpSol property.
         * 
         * @return
         *     possible object is
         *     {@link MaxNumOf2PlusStpSol }
         *     
         */
        public MaxNumOf2PlusStpSol getMaxNumOf2PlusStpSol() {
            return maxNumOf2PlusStpSol;
        }

        /**
         * Sets the value of the maxNumOf2PlusStpSol property.
         * 
         * @param value
         *     allowed object is
         *     {@link MaxNumOf2PlusStpSol }
         *     
         */
        public void setMaxNumOf2PlusStpSol(MaxNumOf2PlusStpSol value) {
            this.maxNumOf2PlusStpSol = value;
        }

        /**
         * Gets the value of the minAllowedOveragePerCrrPercent property.
         * 
         * @return
         *     possible object is
         *     {@link MinAllowedOveragePerCrrPercent }
         *     
         */
        public MinAllowedOveragePerCrrPercent getMinAllowedOveragePerCrrPercent() {
            return minAllowedOveragePerCrrPercent;
        }

        /**
         * Sets the value of the minAllowedOveragePerCrrPercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link MinAllowedOveragePerCrrPercent }
         *     
         */
        public void setMinAllowedOveragePerCrrPercent(MinAllowedOveragePerCrrPercent value) {
            this.minAllowedOveragePerCrrPercent = value;
        }

        /**
         * Gets the value of the minAllowedOveragePerCrr property.
         * 
         * @return
         *     possible object is
         *     {@link MinAllowedOveragePerCrr }
         *     
         */
        public MinAllowedOveragePerCrr getMinAllowedOveragePerCrr() {
            return minAllowedOveragePerCrr;
        }

        /**
         * Sets the value of the minAllowedOveragePerCrr property.
         * 
         * @param value
         *     allowed object is
         *     {@link MinAllowedOveragePerCrr }
         *     
         */
        public void setMinAllowedOveragePerCrr(MinAllowedOveragePerCrr value) {
            this.minAllowedOveragePerCrr = value;
        }

        /**
         * Gets the value of the maxRelFareLvlOfxForNonStp property.
         * 
         * @return
         *     possible object is
         *     {@link MaxRelFareLvlOfxForNonStp }
         *     
         */
        public MaxRelFareLvlOfxForNonStp getMaxRelFareLvlOfxForNonStp() {
            return maxRelFareLvlOfxForNonStp;
        }

        /**
         * Sets the value of the maxRelFareLvlOfxForNonStp property.
         * 
         * @param value
         *     allowed object is
         *     {@link MaxRelFareLvlOfxForNonStp }
         *     
         */
        public void setMaxRelFareLvlOfxForNonStp(MaxRelFareLvlOfxForNonStp value) {
            this.maxRelFareLvlOfxForNonStp = value;
        }

        /**
         * Gets the value of the maxRelFareLvlOfxForCnx property.
         * 
         * @return
         *     possible object is
         *     {@link MaxRelFareLvlOfxForCnx }
         *     
         */
        public MaxRelFareLvlOfxForCnx getMaxRelFareLvlOfxForCnx() {
            return maxRelFareLvlOfxForCnx;
        }

        /**
         * Sets the value of the maxRelFareLvlOfxForCnx property.
         * 
         * @param value
         *     allowed object is
         *     {@link MaxRelFareLvlOfxForCnx }
         *     
         */
        public void setMaxRelFareLvlOfxForCnx(MaxRelFareLvlOfxForCnx value) {
            this.maxRelFareLvlOfxForCnx = value;
        }

        /**
         * Gets the value of the numOfMustPrice2PlusStpSol property.
         * 
         * @return
         *     possible object is
         *     {@link NumOfMustPrice2PlusStpSol }
         *     
         */
        public NumOfMustPrice2PlusStpSol getNumOfMustPrice2PlusStpSol() {
            return numOfMustPrice2PlusStpSol;
        }

        /**
         * Sets the value of the numOfMustPrice2PlusStpSol property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumOfMustPrice2PlusStpSol }
         *     
         */
        public void setNumOfMustPrice2PlusStpSol(NumOfMustPrice2PlusStpSol value) {
            this.numOfMustPrice2PlusStpSol = value;
        }

        /**
         * Gets the value of the itineraryNumberThreshold property.
         * 
         * @return
         *     possible object is
         *     {@link ItineraryNumberThreshold }
         *     
         */
        public ItineraryNumberThreshold getItineraryNumberThreshold() {
            return itineraryNumberThreshold;
        }

        /**
         * Sets the value of the itineraryNumberThreshold property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItineraryNumberThreshold }
         *     
         */
        public void setItineraryNumberThreshold(ItineraryNumberThreshold value) {
            this.itineraryNumberThreshold = value;
        }

        /**
         * Gets the value of the xoFares property.
         * 
         * @return
         *     possible object is
         *     {@link XOFaresType }
         *     
         */
        public XOFaresType getXOFares() {
            return xoFares;
        }

        /**
         * Sets the value of the xoFares property.
         * 
         * @param value
         *     allowed object is
         *     {@link XOFaresType }
         *     
         */
        public void setXOFares(XOFaresType value) {
            this.xoFares = value;
        }

        /**
         * Gets the value of the exemptAllTaxes property.
         * 
         * @return
         *     possible object is
         *     {@link ExchangeTravelPreferencesTPAExtensionsType.ExemptAllTaxes }
         *     
         */
        public ExchangeTravelPreferencesTPAExtensionsType.ExemptAllTaxes getExemptAllTaxes() {
            return exemptAllTaxes;
        }

        /**
         * Sets the value of the exemptAllTaxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExchangeTravelPreferencesTPAExtensionsType.ExemptAllTaxes }
         *     
         */
        public void setExemptAllTaxes(ExchangeTravelPreferencesTPAExtensionsType.ExemptAllTaxes value) {
            this.exemptAllTaxes = value;
        }

        /**
         * Gets the value of the exemptAllTaxesAndFees property.
         * 
         * @return
         *     possible object is
         *     {@link ExchangeTravelPreferencesTPAExtensionsType.ExemptAllTaxesAndFees }
         *     
         */
        public ExchangeTravelPreferencesTPAExtensionsType.ExemptAllTaxesAndFees getExemptAllTaxesAndFees() {
            return exemptAllTaxesAndFees;
        }

        /**
         * Sets the value of the exemptAllTaxesAndFees property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExchangeTravelPreferencesTPAExtensionsType.ExemptAllTaxesAndFees }
         *     
         */
        public void setExemptAllTaxesAndFees(ExchangeTravelPreferencesTPAExtensionsType.ExemptAllTaxesAndFees value) {
            this.exemptAllTaxesAndFees = value;
        }

        /**
         * Gets the value of the taxes property.
         * 
         * @return
         *     possible object is
         *     {@link ExchangeTravelPreferencesTPAExtensionsType.Taxes }
         *     
         */
        public ExchangeTravelPreferencesTPAExtensionsType.Taxes getTaxes() {
            return taxes;
        }

        /**
         * Sets the value of the taxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExchangeTravelPreferencesTPAExtensionsType.Taxes }
         *     
         */
        public void setTaxes(ExchangeTravelPreferencesTPAExtensionsType.Taxes value) {
            this.taxes = value;
        }

        /**
         * Gets the value of the exemptTax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exemptTax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExemptTax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaxCodeType }
         * 
         * 
         */
        public List<TaxCodeType> getExemptTax() {
            if (exemptTax == null) {
                exemptTax = new ArrayList<TaxCodeType>();
            }
            return this.exemptTax;
        }

        /**
         * Gets the value of the flightStopsAsConnections property.
         * 
         * @return
         *     possible object is
         *     {@link FlightStopsAsConnectionsType }
         *     
         */
        public FlightStopsAsConnectionsType getFlightStopsAsConnections() {
            return flightStopsAsConnections;
        }

        /**
         * Sets the value of the flightStopsAsConnections property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightStopsAsConnectionsType }
         *     
         */
        public void setFlightStopsAsConnections(FlightStopsAsConnectionsType value) {
            this.flightStopsAsConnections = value;
        }

        /**
         * Gets the value of the ticketingSumOfLocals property.
         * 
         * @return
         *     possible object is
         *     {@link TicketingSumOfLocals }
         *     
         */
        public TicketingSumOfLocals getTicketingSumOfLocals() {
            return ticketingSumOfLocals;
        }

        /**
         * Sets the value of the ticketingSumOfLocals property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketingSumOfLocals }
         *     
         */
        public void setTicketingSumOfLocals(TicketingSumOfLocals value) {
            this.ticketingSumOfLocals = value;
        }

        /**
         * Gets the value of the jumpCabinLogic property.
         * 
         * @return
         *     possible object is
         *     {@link JumpCabinLogicType }
         *     
         */
        public JumpCabinLogicType getJumpCabinLogic() {
            return jumpCabinLogic;
        }

        /**
         * Sets the value of the jumpCabinLogic property.
         * 
         * @param value
         *     allowed object is
         *     {@link JumpCabinLogicType }
         *     
         */
        public void setJumpCabinLogic(JumpCabinLogicType value) {
            this.jumpCabinLogic = value;
        }

        /**
         * Gets the value of the keepSameCabin property.
         * 
         * @return
         *     possible object is
         *     {@link KeepSameCabinType }
         *     
         */
        public KeepSameCabinType getKeepSameCabin() {
            return keepSameCabin;
        }

        /**
         * Sets the value of the keepSameCabin property.
         * 
         * @param value
         *     allowed object is
         *     {@link KeepSameCabinType }
         *     
         */
        public void setKeepSameCabin(KeepSameCabinType value) {
            this.keepSameCabin = value;
        }

        /**
         * Gets the value of the governingCarrierOverride property.
         * 
         * @return
         *     possible object is
         *     {@link GoverningCarrierOverrideType }
         *     
         */
        public GoverningCarrierOverrideType getGoverningCarrierOverride() {
            return governingCarrierOverride;
        }

        /**
         * Sets the value of the governingCarrierOverride property.
         * 
         * @param value
         *     allowed object is
         *     {@link GoverningCarrierOverrideType }
         *     
         */
        public void setGoverningCarrierOverride(GoverningCarrierOverrideType value) {
            this.governingCarrierOverride = value;
        }

        /**
         * Gets the value of the excludeCallDirectCarriers property.
         * 
         * @return
         *     possible object is
         *     {@link ExcludeCallDirectCarriers }
         *     
         */
        public ExcludeCallDirectCarriers getExcludeCallDirectCarriers() {
            return excludeCallDirectCarriers;
        }

        /**
         * Sets the value of the excludeCallDirectCarriers property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExcludeCallDirectCarriers }
         *     
         */
        public void setExcludeCallDirectCarriers(ExcludeCallDirectCarriers value) {
            this.excludeCallDirectCarriers = value;
        }

        /**
         * Gets the value of the validatingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link ValidatingCarrierType }
         *     
         */
        public ValidatingCarrierType getValidatingCarrier() {
            return validatingCarrier;
        }

        /**
         * Sets the value of the validatingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link ValidatingCarrierType }
         *     
         */
        public void setValidatingCarrier(ValidatingCarrierType value) {
            this.validatingCarrier = value;
        }

        /**
         * Gets the value of the settlementMethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSettlementMethod() {
            return settlementMethod;
        }

        /**
         * Sets the value of the settlementMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSettlementMethod(String value) {
            this.settlementMethod = value;
        }

        /**
         * Gets the value of the flexibleFares property.
         * 
         * @return
         *     possible object is
         *     {@link FlexibleFaresType }
         *     
         */
        public FlexibleFaresType getFlexibleFares() {
            return flexibleFares;
        }

        /**
         * Sets the value of the flexibleFares property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlexibleFaresType }
         *     
         */
        public void setFlexibleFares(FlexibleFaresType value) {
            this.flexibleFares = value;
        }

        /**
         * Gets the value of the diversityParameters property.
         * 
         * @return
         *     possible object is
         *     {@link DiversityParameters }
         *     
         */
        public DiversityParameters getDiversityParameters() {
            return diversityParameters;
        }

        /**
         * Sets the value of the diversityParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link DiversityParameters }
         *     
         */
        public void setDiversityParameters(DiversityParameters value) {
            this.diversityParameters = value;
        }

        /**
         * Gets the value of the additionalFareLimit property.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalFareLimit }
         *     
         */
        public AdditionalFareLimit getAdditionalFareLimit() {
            return additionalFareLimit;
        }

        /**
         * Sets the value of the additionalFareLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalFareLimit }
         *     
         */
        public void setAdditionalFareLimit(AdditionalFareLimit value) {
            this.additionalFareLimit = value;
        }

        /**
         * Gets the value of the sellingLevels property.
         * 
         * @return
         *     possible object is
         *     {@link SellingLevels }
         *     
         */
        public SellingLevels getSellingLevels() {
            return sellingLevels;
        }

        /**
         * Sets the value of the sellingLevels property.
         * 
         * @param value
         *     allowed object is
         *     {@link SellingLevels }
         *     
         */
        public void setSellingLevels(SellingLevels value) {
            this.sellingLevels = value;
        }

        /**
         * Gets the value of the budget property.
         * 
         * @return
         *     possible object is
         *     {@link Budget }
         *     
         */
        public Budget getBudget() {
            return budget;
        }

        /**
         * Sets the value of the budget property.
         * 
         * @param value
         *     allowed object is
         *     {@link Budget }
         *     
         */
        public void setBudget(Budget value) {
            this.budget = value;
        }

        /**
         * Gets the value of the optionsPerDatePairList property.
         * 
         * @return
         *     possible object is
         *     {@link OptionsPerDatePairList }
         *     
         */
        public OptionsPerDatePairList getOptionsPerDatePairList() {
            return optionsPerDatePairList;
        }

        /**
         * Sets the value of the optionsPerDatePairList property.
         * 
         * @param value
         *     allowed object is
         *     {@link OptionsPerDatePairList }
         *     
         */
        public void setOptionsPerDatePairList(OptionsPerDatePairList value) {
            this.optionsPerDatePairList = value;
        }

        /**
         * Gets the value of the countryPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countryPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountryPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountryPref }
         * 
         * 
         */
        public List<CountryPref> getCountryPref() {
            if (countryPref == null) {
                countryPref = new ArrayList<CountryPref>();
            }
            return this.countryPref;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AdditionalFareLimit {

            @XmlAttribute(name = "Value", required = true)
            @XmlSchemaType(name = "unsignedInt")
            protected long value;

            /**
             * Gets the value of the value property.
             * 
             */
            public long getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(long value) {
                this.value = value;
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
         *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AirServiceOnly {

            @XmlAttribute(name = "Ind", required = true)
            protected boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             */
            public boolean isInd() {
                return ind;
            }

            /**
             * Sets the value of the ind property.
             * 
             */
            public void setInd(boolean value) {
                this.ind = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AircraftTypePenalty {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AlternateAirportPenalty {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AvsPenaltyCrrs {

            @XmlAttribute(name = "Value", required = true)
            protected String value;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
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
         *       &lt;attribute name="MinimumPrice" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="MaximumPrice" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="RelativePriceThreshold" type="{http://www.opentravel.org/OTA/2003/05}SignedCountOrPercentage" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Budget {

            @XmlAttribute(name = "MinimumPrice")
            @XmlSchemaType(name = "anySimpleType")
            protected String minimumPrice;
            @XmlAttribute(name = "MaximumPrice")
            @XmlSchemaType(name = "anySimpleType")
            protected String maximumPrice;
            @XmlAttribute(name = "RelativePriceThreshold")
            protected String relativePriceThreshold;

            /**
             * Gets the value of the minimumPrice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMinimumPrice() {
                return minimumPrice;
            }

            /**
             * Sets the value of the minimumPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMinimumPrice(String value) {
                this.minimumPrice = value;
            }

            /**
             * Gets the value of the maximumPrice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaximumPrice() {
                return maximumPrice;
            }

            /**
             * Sets the value of the maximumPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaximumPrice(String value) {
                this.maximumPrice = value;
            }

            /**
             * Gets the value of the relativePriceThreshold property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelativePriceThreshold() {
                return relativePriceThreshold;
            }

            /**
             * Sets the value of the relativePriceThreshold property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelativePriceThreshold(String value) {
                this.relativePriceThreshold = value;
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
         *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
         *       &lt;attribute name="PreferLevel" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="Unacceptable"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CountryPref {

            @XmlAttribute(name = "Code", required = true)
            protected String code;
            @XmlAttribute(name = "PreferLevel", required = true)
            protected String preferLevel;

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
             * Gets the value of the preferLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferLevel() {
                return preferLevel;
            }

            /**
             * Sets the value of the preferLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferLevel(String value) {
                this.preferLevel = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DepPenaltyInUSD {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *         &lt;element name="Weightings" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="PriceWeight" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric0To10Type" />
         *                 &lt;attribute name="TravelTimeWeight" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric0To10Type" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TimeOfDayDistribution" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TimeOfDayRange" maxOccurs="4" minOccurs="2">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Begin" use="required" type="{http://www.opentravel.org/OTA/2003/05}TimeWindowBoundaryType" />
         *                           &lt;attribute name="End" use="required" type="{http://www.opentravel.org/OTA/2003/05}TimeWindowBoundaryType" />
         *                           &lt;attribute name="Percentage" use="required" type="{http://www.opentravel.org/OTA/2003/05}PercentageType" />
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
         *       &lt;attribute name="InboundOutboundPairing">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
         *             &lt;minInclusive value="1"/>
         *             &lt;maxInclusive value="1000"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="AdditionalNonStopsNumber">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
         *             &lt;minInclusive value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="AdditionalNonStopsPercentage" type="{http://www.opentravel.org/OTA/2003/05}PercentageType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "weightings",
            "timeOfDayDistribution"
        })
        public static class DiversityParameters {

            @XmlElement(name = "Weightings")
            protected Weightings weightings;
            @XmlElement(name = "TimeOfDayDistribution")
            protected TimeOfDayDistribution timeOfDayDistribution;
            @XmlAttribute(name = "InboundOutboundPairing")
            protected Integer inboundOutboundPairing;
            @XmlAttribute(name = "AdditionalNonStopsNumber")
            protected Integer additionalNonStopsNumber;
            @XmlAttribute(name = "AdditionalNonStopsPercentage")
            protected Integer additionalNonStopsPercentage;

            /**
             * Gets the value of the weightings property.
             * 
             * @return
             *     possible object is
             *     {@link Weightings }
             *     
             */
            public Weightings getWeightings() {
                return weightings;
            }

            /**
             * Sets the value of the weightings property.
             * 
             * @param value
             *     allowed object is
             *     {@link Weightings }
             *     
             */
            public void setWeightings(Weightings value) {
                this.weightings = value;
            }

            /**
             * Gets the value of the timeOfDayDistribution property.
             * 
             * @return
             *     possible object is
             *     {@link TimeOfDayDistribution }
             *     
             */
            public TimeOfDayDistribution getTimeOfDayDistribution() {
                return timeOfDayDistribution;
            }

            /**
             * Sets the value of the timeOfDayDistribution property.
             * 
             * @param value
             *     allowed object is
             *     {@link TimeOfDayDistribution }
             *     
             */
            public void setTimeOfDayDistribution(TimeOfDayDistribution value) {
                this.timeOfDayDistribution = value;
            }

            /**
             * Gets the value of the inboundOutboundPairing property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getInboundOutboundPairing() {
                return inboundOutboundPairing;
            }

            /**
             * Sets the value of the inboundOutboundPairing property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setInboundOutboundPairing(Integer value) {
                this.inboundOutboundPairing = value;
            }

            /**
             * Gets the value of the additionalNonStopsNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAdditionalNonStopsNumber() {
                return additionalNonStopsNumber;
            }

            /**
             * Sets the value of the additionalNonStopsNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAdditionalNonStopsNumber(Integer value) {
                this.additionalNonStopsNumber = value;
            }

            /**
             * Gets the value of the additionalNonStopsPercentage property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAdditionalNonStopsPercentage() {
                return additionalNonStopsPercentage;
            }

            /**
             * Sets the value of the additionalNonStopsPercentage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAdditionalNonStopsPercentage(Integer value) {
                this.additionalNonStopsPercentage = value;
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
             *         &lt;element name="TimeOfDayRange" maxOccurs="4" minOccurs="2">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Begin" use="required" type="{http://www.opentravel.org/OTA/2003/05}TimeWindowBoundaryType" />
             *                 &lt;attribute name="End" use="required" type="{http://www.opentravel.org/OTA/2003/05}TimeWindowBoundaryType" />
             *                 &lt;attribute name="Percentage" use="required" type="{http://www.opentravel.org/OTA/2003/05}PercentageType" />
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
                "timeOfDayRange"
            })
            public static class TimeOfDayDistribution {

                @XmlElement(name = "TimeOfDayRange", required = true)
                protected List<TimeOfDayRange> timeOfDayRange;

                /**
                 * Gets the value of the timeOfDayRange property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the timeOfDayRange property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTimeOfDayRange().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TimeOfDayRange }
                 * 
                 * 
                 */
                public List<TimeOfDayRange> getTimeOfDayRange() {
                    if (timeOfDayRange == null) {
                        timeOfDayRange = new ArrayList<TimeOfDayRange>();
                    }
                    return this.timeOfDayRange;
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
                 *       &lt;attribute name="Begin" use="required" type="{http://www.opentravel.org/OTA/2003/05}TimeWindowBoundaryType" />
                 *       &lt;attribute name="End" use="required" type="{http://www.opentravel.org/OTA/2003/05}TimeWindowBoundaryType" />
                 *       &lt;attribute name="Percentage" use="required" type="{http://www.opentravel.org/OTA/2003/05}PercentageType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class TimeOfDayRange {

                    @XmlAttribute(name = "Begin", required = true)
                    protected String begin;
                    @XmlAttribute(name = "End", required = true)
                    protected String end;
                    @XmlAttribute(name = "Percentage", required = true)
                    protected int percentage;

                    /**
                     * Gets the value of the begin property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBegin() {
                        return begin;
                    }

                    /**
                     * Sets the value of the begin property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBegin(String value) {
                        this.begin = value;
                    }

                    /**
                     * Gets the value of the end property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEnd() {
                        return end;
                    }

                    /**
                     * Sets the value of the end property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEnd(String value) {
                        this.end = value;
                    }

                    /**
                     * Gets the value of the percentage property.
                     * 
                     */
                    public int getPercentage() {
                        return percentage;
                    }

                    /**
                     * Sets the value of the percentage property.
                     * 
                     */
                    public void setPercentage(int value) {
                        this.percentage = value;
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
             *       &lt;attribute name="PriceWeight" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric0To10Type" />
             *       &lt;attribute name="TravelTimeWeight" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric0To10Type" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Weightings {

                @XmlAttribute(name = "PriceWeight", required = true)
                protected int priceWeight;
                @XmlAttribute(name = "TravelTimeWeight", required = true)
                protected int travelTimeWeight;

                /**
                 * Gets the value of the priceWeight property.
                 * 
                 */
                public int getPriceWeight() {
                    return priceWeight;
                }

                /**
                 * Sets the value of the priceWeight property.
                 * 
                 */
                public void setPriceWeight(int value) {
                    this.priceWeight = value;
                }

                /**
                 * Gets the value of the travelTimeWeight property.
                 * 
                 */
                public int getTravelTimeWeight() {
                    return travelTimeWeight;
                }

                /**
                 * Sets the value of the travelTimeWeight property.
                 * 
                 */
                public void setTravelTimeWeight(int value) {
                    this.travelTimeWeight = value;
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
         *       &lt;attribute name="Hours" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DomesticLayoverTime {

            @XmlAttribute(name = "Hours", required = true)
            protected short hours;

            /**
             * Gets the value of the hours property.
             * 
             */
            public short getHours() {
                return hours;
            }

            /**
             * Sets the value of the hours property.
             * 
             */
            public void setHours(short value) {
                this.hours = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DurPenaltyInUSD {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ExcludeCallDirectCarriers {

            @XmlAttribute(name = "Enabled")
            protected Boolean enabled;

            /**
             * Gets the value of the enabled property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isEnabled() {
                return enabled;
            }

            /**
             * Sets the value of the enabled property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setEnabled(Boolean value) {
                this.enabled = value;
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
         *       &lt;attribute name="Code">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="8"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ExcludeVendorPref {

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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FareAmountThreshold {

            @XmlAttribute(name = "Value", required = true)
            protected float value;

            /**
             * Gets the value of the value property.
             * 
             */
            public float getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(float value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FltOptLFSReuseLimitForAVS {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FltOptLFSReuseLimitForNonAVS {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class FltOptMustPriceReuseLimit {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InterlineIndicator {

            @XmlAttribute(name = "Ind")
            protected Boolean ind;

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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ItineraryNumberThreshold {

            @XmlAttribute(name = "Value", required = true)
            protected float value;

            /**
             * Gets the value of the value property.
             * 
             */
            public float getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(float value) {
                this.value = value;
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
         *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class JetServiceOnly {

            @XmlAttribute(name = "Ind", required = true)
            protected boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             */
            public boolean isInd() {
                return ind;
            }

            /**
             * Sets the value of the ind property.
             * 
             */
            public void setInd(boolean value) {
                this.ind = value;
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
         *       &lt;attribute name="Min" type="{http://www.w3.org/2001/XMLSchema}short" />
         *       &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LongConnectPoints {

            @XmlAttribute(name = "Min")
            protected Short min;
            @XmlAttribute(name = "Max")
            protected Short max;

            /**
             * Gets the value of the min property.
             * 
             * @return
             *     possible object is
             *     {@link Short }
             *     
             */
            public Short getMin() {
                return min;
            }

            /**
             * Sets the value of the min property.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setMin(Short value) {
                this.min = value;
            }

            /**
             * Gets the value of the max property.
             * 
             * @return
             *     possible object is
             *     {@link Short }
             *     
             */
            public Short getMax() {
                return max;
            }

            /**
             * Sets the value of the max property.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setMax(Short value) {
                this.max = value;
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
         *       &lt;attribute name="Min" type="{http://www.w3.org/2001/XMLSchema}short" />
         *       &lt;attribute name="Max" type="{http://www.w3.org/2001/XMLSchema}short" />
         *       &lt;attribute name="Enable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LongConnectTime {

            @XmlAttribute(name = "Min")
            protected Short min;
            @XmlAttribute(name = "Max")
            protected Short max;
            @XmlAttribute(name = "Enable")
            protected Boolean enable;

            /**
             * Gets the value of the min property.
             * 
             * @return
             *     possible object is
             *     {@link Short }
             *     
             */
            public Short getMin() {
                return min;
            }

            /**
             * Sets the value of the min property.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setMin(Short value) {
                this.min = value;
            }

            /**
             * Gets the value of the max property.
             * 
             * @return
             *     possible object is
             *     {@link Short }
             *     
             */
            public Short getMax() {
                return max;
            }

            /**
             * Sets the value of the max property.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setMax(Short value) {
                this.max = value;
            }

            /**
             * Gets the value of the enable property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isEnable() {
                return enable;
            }

            /**
             * Sets the value of the enable property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setEnable(Boolean value) {
                this.enable = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MaxAllowedLFSOveragePerCrrPercent {

            @XmlAttribute(name = "Value", required = true)
            protected float value;

            /**
             * Gets the value of the value property.
             * 
             */
            public float getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(float value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MaxAllowedMustPriceOveragePerCrr {

            @XmlAttribute(name = "Value", required = true)
            protected float value;

            /**
             * Gets the value of the value property.
             * 
             */
            public float getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(float value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MaxNumOf2PlusStpSol {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MaxNumOfNonStpInrlSol {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MaxNumOfNonStpOnlSol {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MaxNumOfSingleStpOnlSol {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MaxPrice {

            @XmlAttribute(name = "Value")
            protected BigDecimal value;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValue(BigDecimal value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MaxRelFareLvlOfxForCnx {

            @XmlAttribute(name = "Value", required = true)
            protected float value;

            /**
             * Gets the value of the value property.
             * 
             */
            public float getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(float value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MaxRelFareLvlOfxForNonStp {

            @XmlAttribute(name = "Value", required = true)
            protected float value;

            /**
             * Gets the value of the value property.
             * 
             */
            public float getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(float value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MinAllowedOveragePerCrr {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MinAllowedOveragePerCrrPercent {

            @XmlAttribute(name = "Value", required = true)
            protected float value;

            /**
             * Gets the value of the value property.
             * 
             */
            public float getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(float value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NumOfLowFareSol {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NumOfMustPrice2PlusStpSol {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NumOfMustPriceInrlSol {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NumOfMustPriceNStp1StpInrlSol {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NumOfMustPriceNStp1StpOnlSol {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NumOfMustPriceNStpInrlSol {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NumOfMustPriceNStpOnlSol {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NumOfMustPriceOnlSol {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NumOfMustPriceSStopOnlSol {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Number" default="5">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
         *             &lt;minInclusive value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NumTripsWithRouting {

            @XmlAttribute(name = "Number")
            protected Short number;

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link Short }
             *     
             */
            public short getNumber() {
                if (number == null) {
                    return ((short) 5);
                } else {
                    return number;
                }
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setNumber(Short value) {
                this.number = value;
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
         *       &lt;attribute name="Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OnlineIndicator {

            @XmlAttribute(name = "Ind")
            protected Boolean ind;

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
         *         &lt;element name="OptionsPerDatePair" type="{http://www.opentravel.org/OTA/2003/05}OptionsPerDatePairType" maxOccurs="unbounded"/>
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
            "optionsPerDatePair"
        })
        public static class OptionsPerDatePairList {

            @XmlElement(name = "OptionsPerDatePair", required = true)
            protected List<OptionsPerDatePairType> optionsPerDatePair;

            /**
             * Gets the value of the optionsPerDatePair property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the optionsPerDatePair property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOptionsPerDatePair().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OptionsPerDatePairType }
             * 
             * 
             */
            public List<OptionsPerDatePairType> getOptionsPerDatePair() {
                if (optionsPerDatePair == null) {
                    optionsPerDatePair = new ArrayList<OptionsPerDatePairType>();
                }
                return this.optionsPerDatePair;
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
         *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SameConnectionAirportOnly {

            @XmlAttribute(name = "Ind", required = true)
            protected boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             */
            public boolean isInd() {
                return ind;
            }

            /**
             * Sets the value of the ind property.
             * 
             */
            public void setInd(boolean value) {
                this.ind = value;
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
         *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SameOriginAirportOnly {

            @XmlAttribute(name = "Ind", required = true)
            protected boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             */
            public boolean isInd() {
                return ind;
            }

            /**
             * Sets the value of the ind property.
             * 
             */
            public void setInd(boolean value) {
                this.ind = value;
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
         *       &lt;attribute name="Ind" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SameTurnaroundAirportOnly {

            @XmlAttribute(name = "Ind", required = true)
            protected boolean ind;

            /**
             * Gets the value of the ind property.
             * 
             */
            public boolean isInd() {
                return ind;
            }

            /**
             * Sets the value of the ind property.
             * 
             */
            public void setInd(boolean value) {
                this.ind = value;
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
         *       &lt;choice>
         *         &lt;element name="SellingLevelRules">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Ignore" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ShowFareAmounts">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Original" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sellingLevelRules",
            "showFareAmounts"
        })
        public static class SellingLevels {

            @XmlElement(name = "SellingLevelRules")
            protected SellingLevelRules sellingLevelRules;
            @XmlElement(name = "ShowFareAmounts")
            protected ShowFareAmounts showFareAmounts;

            /**
             * Gets the value of the sellingLevelRules property.
             * 
             * @return
             *     possible object is
             *     {@link SellingLevelRules }
             *     
             */
            public SellingLevelRules getSellingLevelRules() {
                return sellingLevelRules;
            }

            /**
             * Sets the value of the sellingLevelRules property.
             * 
             * @param value
             *     allowed object is
             *     {@link SellingLevelRules }
             *     
             */
            public void setSellingLevelRules(SellingLevelRules value) {
                this.sellingLevelRules = value;
            }

            /**
             * Gets the value of the showFareAmounts property.
             * 
             * @return
             *     possible object is
             *     {@link ShowFareAmounts }
             *     
             */
            public ShowFareAmounts getShowFareAmounts() {
                return showFareAmounts;
            }

            /**
             * Sets the value of the showFareAmounts property.
             * 
             * @param value
             *     allowed object is
             *     {@link ShowFareAmounts }
             *     
             */
            public void setShowFareAmounts(ShowFareAmounts value) {
                this.showFareAmounts = value;
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
             *       &lt;attribute name="Ignore" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SellingLevelRules {

                @XmlAttribute(name = "Ignore", required = true)
                protected boolean ignore;

                /**
                 * Gets the value of the ignore property.
                 * 
                 */
                public boolean isIgnore() {
                    return ignore;
                }

                /**
                 * Sets the value of the ignore property.
                 * 
                 */
                public void setIgnore(boolean value) {
                    this.ignore = value;
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
             *       &lt;attribute name="Original" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ShowFareAmounts {

                @XmlAttribute(name = "Original")
                protected Boolean original;
                @XmlAttribute(name = "Adjusted")
                protected Boolean adjusted;

                /**
                 * Gets the value of the original property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isOriginal() {
                    return original;
                }

                /**
                 * Sets the value of the original property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setOriginal(Boolean value) {
                    this.original = value;
                }

                /**
                 * Gets the value of the adjusted property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isAdjusted() {
                    return adjusted;
                }

                /**
                 * Sets the value of the adjusted property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setAdjusted(Boolean value) {
                    this.adjusted = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class StpPenaltyInUSD {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}short" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TargetMinNumOfLFSOnlSolPerCrr {

            @XmlAttribute(name = "Value", required = true)
            protected short value;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TargetMinNumOfLFSTotOnlSolPercent {

            @XmlAttribute(name = "Value", required = true)
            protected float value;

            /**
             * Gets the value of the value property.
             * 
             */
            public float getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(float value) {
                this.value = value;
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
         *       &lt;attribute name="Enable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TicketingSumOfLocals {

            @XmlAttribute(name = "Enable")
            protected Boolean enable;

            /**
             * Gets the value of the enable property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isEnable() {
                if (enable == null) {
                    return false;
                } else {
                    return enable;
                }
            }

            /**
             * Sets the value of the enable property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setEnable(Boolean value) {
                this.enable = value;
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
         *       &lt;attribute name="Value" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TripType {

            @XmlAttribute(name = "Value")
            protected AirTripType value;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link AirTripType }
             *     
             */
            public AirTripType getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirTripType }
             *     
             */
            public void setValue(AirTripType value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UpperBoundLFSFactor {

            @XmlAttribute(name = "Value", required = true)
            protected float value;

            /**
             * Gets the value of the value property.
             * 
             */
            public float getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(float value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UpperBoundMustPriceFactorForNonStp {

            @XmlAttribute(name = "Value", required = true)
            protected float value;

            /**
             * Gets the value of the value property.
             * 
             */
            public float getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(float value) {
                this.value = value;
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
         *       &lt;attribute name="Value" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UpperBoundMustPriceFactorForNotNonStp {

            @XmlAttribute(name = "Value", required = true)
            protected float value;

            /**
             * Gets the value of the value property.
             * 
             */
            public float getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(float value) {
                this.value = value;
            }

        }

    }

}
