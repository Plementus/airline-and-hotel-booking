package core.gdsbookingengine;

import com.avaje.ebean.Expr;
import com.avaje.ebean.ExpressionList;
import core.security.Auth;
import models.*;
import play.Logger;
import services.amadeus.lowfareplus.AirItineraryPricingInfo;
import services.amadeus.lowfareplus.Tax;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PricingInfoWSResponse implements Serializable {

    private Double baseFare;
    private Double totalTax;
    private Double totalFare;
    private Double commissionedBaseFare;
    private Double commissionedTax;
    private Double commissionedTotalFare;

    private String currencyCode;
    private Integer decimalPlaces;
    private String pricingSource;
    private Double adultBaseFair;
    private Double childrenBaseFair;
    private Double infantBaseFair;
    private Double adultTaxFair;
    private Double childrenTaxFair;
    private Double infantTaxFair;
    private Double adultTotal;
    private Double childrenTotal;
    private Double infantTotal;
    private List<FareBreakDown> fareBreakDown;

    private AirlineFlightMarkUpDown airlineFlightMarkUpDown;

    public Double getAdultTotal() {
        return adultTotal;
    }

    public void setAdultTotal(Double adultTotal) {
        this.adultTotal = adultTotal;
    }

    public Double getChildrenTotal() {
        return childrenTotal;
    }

    public void setChildrenTotal(Double childrenTotal) {
        this.childrenTotal = childrenTotal;
    }

    public Double getInfantTotal() {
        return infantTotal;
    }

    public void setInfantTotal(Double infantTotal) {
        this.infantTotal = infantTotal;
    }

    public Double getAdultTaxFair() {
        return adultTaxFair;
    }

    public void setAdultTaxFair(Double adultTaxFair) {
        this.adultTaxFair = adultTaxFair;
    }

    public Double getChildrenTaxFair() {
        return childrenTaxFair;
    }

    public void setChildrenTaxFair(Double childrenTaxFair) {
        this.childrenTaxFair = childrenTaxFair;
    }

    public Double getInfantTaxFair() {
        return infantTaxFair;
    }

    public void setInfantTaxFair(Double infantTaxFair) {
        this.infantTaxFair = infantTaxFair;
    }

    public Double getAdultBaseFair() {
        return adultBaseFair;
    }

    public void setAdultBaseFair(Double adultBaseFair) {
        this.adultBaseFair = adultBaseFair;
    }

    public Double getChildrenBaseFair() {
        return childrenBaseFair;
    }

    public void setChildrenBaseFair(Double childrenBaseFair) {
        this.childrenBaseFair = childrenBaseFair;
    }

    public Double getInfantBaseFair() {
        return infantBaseFair;
    }

    public void setInfantBaseFair(Double infantBaseFair) {
        this.infantBaseFair = infantBaseFair;
    }

    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public Double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(Double baseFare) {
        this.baseFare = baseFare;
    }

    public String getPricingSource() {
        return pricingSource;
    }

    public void setPricingSource(String pricingSource) {
        this.pricingSource = pricingSource;
    }

    public Double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(Double tax) {
        this.totalTax = tax;
    }

    public Double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(Double totalFare) {
        this.totalFare = totalFare;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    private static PricingInfoWSResponse computePriceMarkup(PricingInfoWSResponse pricingInfoWSResponse, PricedItineraryWSResponse flightInfo) {
        return pricingInfoWSResponse;
    }

    public List<FareBreakDown> getFareBreakDowns() {
        if (fareBreakDown == null) {
            fareBreakDown = new ArrayList<>();
        }
        return fareBreakDown;
    }

    public AirlineFlightMarkUpDown getAirlineFlightMarkUpDown() {
        return airlineFlightMarkUpDown;
    }

    public void setAirlineFlightMarkUpDown(AirlineFlightMarkUpDown airlineFlightMarkUpDown) {
        this.airlineFlightMarkUpDown = airlineFlightMarkUpDown;
    }

    public void setMarkPricingDirection(PricedItineraryWSResponse pricedItinerary) {
        TicketPolicy ticketPolicy = pricedItinerary.getSearchRequest().getTicketPolicy();
        SalesCategory salesCategory = pricedItinerary.getSearchRequest().getSalesCategory();
        String authType = Auth.isAuthenticated() ? "LOGGED_IN" : "GUEST";
        TicketLocale ticketLocale = pricedItinerary.getSearchRequest().getTicketLocale();
        TripType tripType = pricedItinerary.getSearchRequest().getTripType();
        boolean isHotelCombo = pricedItinerary.getSearchRequest().isHotelCombo();
        CabinPreference cabinPreference = pricedItinerary.getSearchRequest().getPreferredCabin().equals(CabinPreference.Y) ? CabinPreference.ECONOMY : pricedItinerary.getSearchRequest().getPreferredCabin();

        AirlineFlightMarkUpDown airlineFlightMarkUpDown = null;
        //Get the 'FlightMarkupDownRule' base on flight condition.
        FlightMarkUpDownRules flightMarkUpDownRules = null;
        FlightMarkUpDownRules.find.where().raw("");
        ExpressionList<FlightMarkUpDownRules> query = FlightMarkUpDownRules.find.where()
                .eq("ticket_policy", ticketPolicy)
                .where().eq("hotel_incl", isHotelCombo)
                .where().eq("sales_category", salesCategory)
                .where().or(Expr.like("cabin_classes", cabinPreference.name()), Expr.like("cabin_classes", CabinPreference.Y.name() + "%"))
                .where().or(Expr.like("trip_types", tripType.name()), Expr.like("trip_types", tripType.name() + "%"))
                .where().or(Expr.like("u_auth_type", authType + "%"), Expr.like("u_auth_type", "BOTH"))
                .where().or(Expr.like("ticket_locale", ticketLocale + "%"), Expr.like("ticket_locale", "BOTH"));
        flightMarkUpDownRules = query.findUnique();
//        Logger.info("Query: " + );
        if (flightMarkUpDownRules != null) {
            airlineFlightMarkUpDown = AirlineFlightMarkUpDown.find.where().eq("flight_markup_down_rule_id", flightMarkUpDownRules).findUnique();
        }

        //at the end, set the match AirlineFlightMarkUpDown model from the query.
    }

    public Double getCommissionedBaseFare() {
        return commissionedBaseFare;
    }

    public void setGdsBaseFare(Double gdsBaseFare) {
        this.commissionedBaseFare = gdsBaseFare;
        this.setBaseFare(this.commissionedBaseFare);
    }

    public Double getCommissionedTax() {
        return commissionedTax;
    }

    public void setGdsTax(Double gdsTax) {
        this.commissionedTax = gdsTax;
        this.setTotalTax(this.commissionedTax);
    }

    public Double getCommissionedTotalFare() {
        return commissionedTotalFare;
    }

    public void setGdsTotalFare(Double gdsTotalFare) {
        this.commissionedTotalFare = gdsTotalFare;
        this.setTotalFare(this.commissionedTotalFare);
    }
}
