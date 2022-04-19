package core.gdsbookingengine;

import models.FlightMarkUpDownRules;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 15/12/2015 4:23 PM
 * |
 **/
public class FlightPricingInfo {
    public Double baseFair;
    public Double tax;
    public Double totalFare;
    private Double adultBaseFair;
    private Double childrenBaseFair;
    private Double infantBaseFair;
    private Double adultTaxFair;
    private Double childrenTaxFair;
    private Double infantTaxFair;
    private Double adultTotal;
    private Double childrenTotal;

    public Double getInfantTotal() {
        return infantTotal;
    }

    public void setInfantTotal(Double infantTotal) {
        this.infantTotal = infantTotal;
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

    private Double infantTotal;

    FlightMarkUpDownRules airlineCommission;

    public FlightMarkUpDownRules getAirlineCommission() {
        return airlineCommission;
    }

    public void setAirlineCommission(FlightMarkUpDownRules airlineCommission) {
        this.airlineCommission = airlineCommission;
    }


    public Double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(Double totalFare) {
        this.totalFare = totalFare;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public String currencyCode;

    public Double getBaseFair() {
        return baseFair;
    }

    public void setBaseFair(Double baseFair) {
        this.baseFair = baseFair;
    }
}
