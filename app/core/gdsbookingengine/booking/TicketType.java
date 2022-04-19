package core.gdsbookingengine.booking;

/**
 * Created by Ibrahim Olanrewaju on 12/13/2015.
 */
public enum TicketType {
  E_TICKET("eTicket"),
  PAPER("Paper");
  private final String value;

  TicketType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }
}
