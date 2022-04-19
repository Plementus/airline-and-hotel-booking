package core.gdsbookingengine;

import com.google.common.base.Strings;
import models.Airlines;
import models.Airports;
import org.apache.commons.lang3.StringUtils;
import services.amadeus.lowfareplus.OperatingAirline;

public class FlightSegmentWSResponse {
    private String departureAirport;
    private String arrivalAirport;
    private String departureAirportCode;
    private String arrivalAirportCode;
    private String airportCodeContext;
    private String departureTimeZone;
    private String arrivalTimeZone;
    private String departureDateTime;
    private String arrivalDateTime;
    private String duration;
    private String marketingAirline;
    private String marketingAirlineCode;
    private String operatingAirline;
    private String operatingAirlineCode;
    private String cabin;
    private String RPH;
    private String flightNumber;
    private String resBookDesigCode;
    private String airEquipType;
    private Integer numberInParty;
    private Boolean eTicketEligible;
    private Integer stopQuantity;
    private String marriageGrp;

    public FlightSegmentWSResponse() {

    }

    public String getDepartureAirport() {
        if (Strings.isNullOrEmpty(departureAirport)) {
            // Fetch from db
            Airports dAp = Airports.getAirports(departureAirportCode);
            if (departureAirport != null) {
                departureAirport = "";//dAp.airport_name;
            }
        }
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        if (Strings.isNullOrEmpty(arrivalAirport)) {
            // Fetch from db
            Airports aAp = Airports.getAirports(arrivalAirportCode);
            if (departureAirport != null) {
                arrivalAirport = "";//aAp.airport_name;
            }
        }
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public void setDepartureAirportCode(String departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
    }


    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    public void setArrivalAirportCode(String arrivalAirportCode) {
        this.arrivalAirportCode = arrivalAirportCode;
    }

    public String getAirportCodeContext() {
        return airportCodeContext;
    }

    public void setAirportCodeContext(String airportCodeContext) {
        this.airportCodeContext = airportCodeContext;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getDepartureTimeZone() {
        return departureTimeZone;
    }

    public void setDepartureTimeZone(String departureTimeZone) {
        this.departureTimeZone = departureTimeZone;
    }

    public String getArrivalTimeZone() {
        return arrivalTimeZone;
    }

    public void setArrivalTimeZone(String arrivalTimeZone) {
        this.arrivalTimeZone = arrivalTimeZone;
    }

    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Boolean isETicketEligible() {
        return this.eTicketEligible;
    }

    public void setETicketEligible(Boolean eTicketEligible) {
        this.eTicketEligible = eTicketEligible;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getMarketingAirline() {
        if (StringUtils.isEmpty(marketingAirline) || marketingAirline == null) {
            // Fetch from db
            Airlines aA = Airlines.getAirLines(marketingAirlineCode);
            if (aA != null) {
                this.marketingAirline = aA.name;
            }
        }
        return marketingAirline;
    }

    public void setMarketingAirline(String marketingAirline) {
        this.marketingAirline = marketingAirline;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public Integer getNumberInParty() {
        return numberInParty;
    }

    public void setNumberInParty(int numberInParty) {
        this.numberInParty = numberInParty;
    }

    public String getMarketingAirlineCode() {
        return marketingAirlineCode;
    }

    public void setMarketingAirlineCode(String marketingAirlineCode) {
        this.marketingAirlineCode = marketingAirlineCode;
    }

    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    public void setResBookDesigCode(String resBookDesigCode) {
        this.resBookDesigCode = resBookDesigCode;
    }

    public String getAirEquipType() {
        return airEquipType;
    }

    public void setAirEquipType(String airEquipType) {
        this.airEquipType = airEquipType;
    }

    public String getRPH() {
        return RPH;
    }

    public void setRPH(String RPH) {
        this.RPH = RPH;
    }

    public Integer getStopQuantity() {
        return stopQuantity;
    }

    public void setStopQuantity(Integer stopQuantity) {
        this.stopQuantity = stopQuantity;
    }

    public String getMarriageGrp() {
        return marriageGrp;
    }

    public void setMarriageGrp(String marriageGrp) {
        this.marriageGrp = marriageGrp;
    }

    public String getOperatingAirline() {
        return operatingAirline;
    }

    public void setOperatingAirline(String operatingAirline) {
        this.operatingAirline = operatingAirline;
    }

    public String getOperatingAirlineCode() {
        return operatingAirlineCode;
    }

    public void setOperatingAirlineCode(String operatingAirlineCode) {
        this.operatingAirlineCode = operatingAirlineCode;
    }
}
