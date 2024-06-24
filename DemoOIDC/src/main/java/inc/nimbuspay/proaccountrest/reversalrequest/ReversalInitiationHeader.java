package inc.nimbuspay.proaccountrest.reversalrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReversalInitiationHeader {

    private String msgFctn;
    private String prtcolVrsn;
    private String creDtTm;
    private InitiatingParty initgPty;
}
