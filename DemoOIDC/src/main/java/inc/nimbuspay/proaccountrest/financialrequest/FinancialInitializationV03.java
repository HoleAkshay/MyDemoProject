package inc.nimbuspay.proaccountrest.financialrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FinancialInitializationV03 {

    private FinancialInitializationHeader hdr;
    private FinancialInitializationBody body;

}
