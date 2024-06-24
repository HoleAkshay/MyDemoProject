package inc.nimbuspay.proaccountrest.reversalrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReversalInitiation {

    private ReversalInitiationHeader hdr;
    private ReversalInitiationBody body;
    
}
