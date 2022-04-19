/**
 * Created by Babatunde on 2/12/2016.
 */

package services.roombookpro.messages;

import services.roombookpro.dto.Cancellation;

public class CancellationResponse {
  private Cancellation cancellation;

  public CancellationResponse(Cancellation cancellation) {
    this.cancellation = cancellation;
  }

  public CancellationResponse() {}

  public Cancellation getCancellation() {
    return cancellation;
  }

  public void setCancellation(Cancellation cancellation) {
    this.cancellation = cancellation;
  }
}
