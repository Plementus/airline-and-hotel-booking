/**
 * Created by Babatunde on 2/12/2016.
 */
package services.roombookpro.messages;

import services.roombookpro.dto.CancellationPolicy;

import java.util.ArrayList;
import java.util.List;

public class CancellationPolicyResponse {
  private List<CancellationPolicy> cancellationPolicies;

  public CancellationPolicyResponse(List<CancellationPolicy> cancellationPolicies) {
    this.cancellationPolicies = cancellationPolicies;
  }

  public List<CancellationPolicy> getCancellationPolicies() {
    if(cancellationPolicies == null) {
      cancellationPolicies = new ArrayList<>();
    }
    return cancellationPolicies;
  }
}
