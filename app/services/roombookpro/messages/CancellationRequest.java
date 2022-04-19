/**
 * Created by Babatunde on 2/12/2016.
 */

package services.roombookpro.messages;

public class CancellationRequest {
  private String ref;

  public CancellationRequest(String ref) {
    this.ref = ref;
  }

  public CancellationRequest() {}

  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }
}
