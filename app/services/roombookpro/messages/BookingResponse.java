/**
 * Created by Babatunde on 2/11/2016.
 */
package services.roombookpro.messages;

import core.hotels.HotelRoomBookingResponse;

public class BookingResponse implements HotelRoomBookingResponse {
  private String ref;
  private String agentRef;
  private String status;
  private String supplierRef;
  private String hotelConfirmationRef;

  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public String getAgentRef() {
    return agentRef;
  }

  public void setAgentRef(String agentRef) {
    this.agentRef = agentRef;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getSupplierRef() {
    return supplierRef;
  }

  public void setSupplierRef(String supplierRef) {
    this.supplierRef = supplierRef;
  }

  public String getHotelConfirmationRef() {
    return hotelConfirmationRef;
  }

  public void setHotelConfirmationRef(String hotelConfirmationRef) {
    this.hotelConfirmationRef = hotelConfirmationRef;
  }

}
