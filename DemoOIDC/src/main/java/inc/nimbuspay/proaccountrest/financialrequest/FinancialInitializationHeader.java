package inc.nimbuspay.proaccountrest.financialrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FinancialInitializationHeader {

    private String msgFctn;
    private String prtcolVrsn;
    private String creDtTm;
    private InitiatingParty initgPty;
}
