package core.gdsbookingengine.airFlifo;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import core.Utilities;
import play.Logger;
import services.amadeus.airfliforq.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 28/02/2016 8:43 AM
 * |
 **/
public class AirFlifoService {

    private POS pos;

    private Airline airline;

    private XMLGregorianCalendar xmlDepartureDate;

    private DepartureAirport departureAirport;

    private ArrivalAirport arrivalAirport;

    private AirFlifoRequest request;


    public AirFlifoService(AirFlifoRequest request) {
        this.request = request;
        this.setAirline();
        this.setXmlDepartureDate();
        this.setDepartureAirport();
        this.setArrivalAirport();
    }

    private void setAirline() {
        this.airline = new Airline();
        airline.setCode(this.request.getAirlineCode());
    }

    private void setXmlDepartureDate() {
        Calendar calendar = Utilities.parseDateOnly(request.getDepartureDate());
        xmlDepartureDate = new XMLGregorianCalendarImpl();
        if (calendar != null) {
            xmlDepartureDate.setYear(calendar.get(Calendar.YEAR));
            xmlDepartureDate.setMonth(Calendar.MONTH);
            xmlDepartureDate.setDay(Calendar.DAY_OF_MONTH);
        }
        this.xmlDepartureDate = xmlDepartureDate;
    }

    private void setDepartureAirport() {
        departureAirport = new DepartureAirport();
        departureAirport.setLocationCode(request.getDepartureAirportCode());
    }

    private void setArrivalAirport() {
        arrivalAirport = new ArrivalAirport();
        arrivalAirport.setLocationCode(request.getArrivalAirportCode());
    }

    public OTAAirFlifoRQ otaAirFlifoRQ() {
        pos = POSBuilder.createInstance();
        //set the parameter to the request.
        OTAAirFlifoRQ otaAirFlifoRQ = new OTAAirFlifoRQ();
        otaAirFlifoRQ.setPOS(pos);
        Logger.info("" + otaAirFlifoRQ.getPOS());
        otaAirFlifoRQ.setAirline(airline);
        otaAirFlifoRQ.setFlightNumber(this.request.getFlightNumber());
        otaAirFlifoRQ.setDepartureDate(xmlDepartureDate);
        otaAirFlifoRQ.setDepartureAirport(departureAirport);
        otaAirFlifoRQ.setArrivalAirport(arrivalAirport);
        return otaAirFlifoRQ;
    }
}