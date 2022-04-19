package core.gdsbookingengine.booking;

/**
 * Created by Ibrahim Olanrewaju on 4/27/2016.
 */

public class ReservationItem {
  final String EMPTY_STRING = "";
  private String RPH = EMPTY_STRING;
  private boolean eTicketType;
  private int stopQuantity;
  private String status = EMPTY_STRING;
  private boolean specialMeal;
  private boolean smokingAllowed;
  private int segmentNumber;
  private String resBookingCode = EMPTY_STRING;
  private int numberInParty;
  private int flightNumber;
  private String elapsedTime = EMPTY_STRING;
  private String departureDateTime = EMPTY_STRING;
  private String dayOfWeekInd = EMPTY_STRING;
  private String arrivalDateTime = EMPTY_STRING;
  private long airMilesFlown;
  private String destinationLocationCode = EMPTY_STRING;
  private String airEquipType = EMPTY_STRING;
  private String airline = EMPTY_STRING;
  private String marriageGrp = EMPTY_STRING;
  private String mealCode = EMPTY_STRING;
  private String originLocationCode = EMPTY_STRING;
  private String updatedArrivalTime = EMPTY_STRING;
  private String updatedDepartureTime = EMPTY_STRING;

  public String getRPH() {
    return RPH;
  }

  public void setRPH(String RPH) {
    this.RPH = RPH;
  }

  public boolean iseTicketType() {
    return eTicketType;
  }

  public void seteTicketType(boolean eTicketType) {
    this.eTicketType = eTicketType;
  }

  public int getStopQuantity() {
    return stopQuantity;
  }

  public void setStopQuantity(int stopQuantity) {
    this.stopQuantity = stopQuantity;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public boolean isSpecialMeal() {
    return specialMeal;
  }

  public void setSpecialMeal(boolean specialMeal) {
    this.specialMeal = specialMeal;
  }

  public boolean isSmokingAllowed() {
    return smokingAllowed;
  }

  public void setSmokingAllowed(boolean smokingAllowed) {
    this.smokingAllowed = smokingAllowed;
  }

  public int getSegmentNumber() {
    return segmentNumber;
  }

  public void setSegmentNumber(int segmentNumber) {
    this.segmentNumber = segmentNumber;
  }

  public String getResBookingCode() {
    return resBookingCode;
  }

  public void setResBookingCode(String resBookingCode) {
    this.resBookingCode = resBookingCode;
  }

  public int getNumberInParty() {
    return numberInParty;
  }

  public void setNumberInParty(int numberInParty) {
    this.numberInParty = numberInParty;
  }

  public int getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(int flightNumber) {
    this.flightNumber = flightNumber;
  }

  public String getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(String elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public String getDepartureDateTime() {
    return departureDateTime;
  }

  public void setDepartureDateTime(String departureDateTime) {
    this.departureDateTime = departureDateTime;
  }

  public String getDayOfWeekInd() {
    return dayOfWeekInd;
  }

  public void setDayOfWeekInd(String dayOfWeekInd) {
    this.dayOfWeekInd = dayOfWeekInd;
  }

  public String getArrivalDateTime() {
    return arrivalDateTime;
  }

  public void setArrivalDateTime(String arrivalDateTime) {
    this.arrivalDateTime = arrivalDateTime;
  }

  public long getAirMilesFlown() {
    return airMilesFlown;
  }

  public void setAirMilesFlown(long airMilesFlown) {
    this.airMilesFlown = airMilesFlown;
  }

  public String getDestinationLocationCode() {
    return destinationLocationCode;
  }

  public void setDestinationLocationCode(String destinationLocationCode) {
    this.destinationLocationCode = destinationLocationCode;
  }

  public String getAirEquipType() {
    return airEquipType;
  }

  public void setAirEquipType(String airEquipType) {
    this.airEquipType = airEquipType;
  }

  public String getAirline() {
    return airline;
  }

  public void setAirline(String airline) {
    this.airline = airline;
  }

  public String getMarriageGrp() {
    return marriageGrp;
  }

  public void setMarriageGrp(String marriageGrp) {
    this.marriageGrp = marriageGrp;
  }

  public String getMealCode() {
    return mealCode;
  }

  public void setMealCode(String mealCode) {
    this.mealCode = mealCode;
  }

  public String getOriginLocationCode() {
    return originLocationCode;
  }

  public void setOriginLocationCode(String originLocationCode) {
    this.originLocationCode = originLocationCode;
  }

  public String getUpdatedArrivalTime() {
    return updatedArrivalTime;
  }

  public void setUpdatedArrivalTime(String updatedArrivalTime) {
    this.updatedArrivalTime = updatedArrivalTime;
  }

  public String getUpdatedDepartureTime() {
    return updatedDepartureTime;
  }

  public void setUpdatedDepartureTime(String updatedDepartureTime) {
    this.updatedDepartureTime = updatedDepartureTime;
  }
}
