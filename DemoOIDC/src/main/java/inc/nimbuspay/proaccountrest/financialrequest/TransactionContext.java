package inc.nimbuspay.proaccountrest.financialrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionContext {

    private String mrchntCtgyCd;
}
