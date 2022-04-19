/**
 * Created by Babatunde on 2/12/2016.
 */

package services.roombookpro.messages;

public class DetailsRequest {
  private String bookingRef;

  public DetailsRequest(String bookingRef) {
    this.bookingRef = bookingRef;
  }

  public DetailsRequest() {
  }

  public String getBookingRef() {
    return bookingRef;
  }

  public void setBookingRef(String bookingRef) {
    this.bookingRef = bookingRef;
  }
}
