/**
 * Created by Ibrahim Olanrewaju on 12/13/2015.
 */

package core.gdsbookingengine;

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

  public static TicketType fromValue(String v) {
    for (TicketType ticket: TicketType.values()) {
      if (ticket.value.equals(v)) {
        return ticket;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
