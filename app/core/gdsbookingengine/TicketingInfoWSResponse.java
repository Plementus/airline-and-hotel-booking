package core.gdsbookingengine;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TicketingInfoWSResponse {
  private LocalDateTime ticketTimeLimit;
  private TicketType ticketType;

  public LocalDateTime getTicketTimeLimit() {
    return ticketTimeLimit;
  }

  public void setTicketTimeLimit(LocalDateTime ticketTimeLimit) {
    this.ticketTimeLimit = ticketTimeLimit;
  }

  public TicketType getTicketType() {
    return ticketType;
  }

  public void setTicketType(TicketType ticketType) {
    this.ticketType = ticketType;
  }
}