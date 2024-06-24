package inc.nimbuspay.proaccountrest.reversalrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReversalIntializationRequest {

     private Document document;

}
