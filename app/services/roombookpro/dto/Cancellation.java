/**
 * Created by Ibrahim Olanrewaju on 2/12/2016.
 */

package services.roombookpro.dto;

public class Cancellation {
  private String ref;
  private String agentRef;
  private String cancellationDate;
  private String status;
  private Price charge;

  public Cancellation(String ref, String agentRef, String cancellationDate, String status, Price charge) {
    this.ref = ref;
    this.agentRef = agentRef;
    this.cancellationDate = cancellationDate;
    this.status = status;
    this.charge = charge;
  }

  public Cancellation() {}

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

  public String getCancellationDate() {
    return cancellationDate;
  }

  public void setCancellationDate(String cancellationDate) {
    this.cancellationDate = cancellationDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Price getCharge() {
    return charge;
  }

  public void setCharge(Price charge) {
    this.charge = charge;
  }
}
