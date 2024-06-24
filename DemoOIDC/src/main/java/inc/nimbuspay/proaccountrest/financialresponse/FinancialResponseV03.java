package inc.nimbuspay.proaccountrest.financialresponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FinancialResponseV03 {

    private Header hdr;
    private Body body;
}
