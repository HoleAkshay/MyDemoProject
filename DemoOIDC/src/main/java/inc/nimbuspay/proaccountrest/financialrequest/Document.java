package inc.nimbuspay.proaccountrest.financialrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Document {

    private FinancialInitializationV03 finInitn;
}
