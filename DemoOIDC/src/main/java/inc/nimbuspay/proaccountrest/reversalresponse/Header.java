package inc.nimbuspay.proaccountrest.reversalresponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Header {

    private String msgFctn;
    private String prtcolVrsn;
    private String creDtTm;
    private InitialParty initgPty;
}
