package inc.nimbuspay.proaccountrest.financialrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Transaction {

    private String txTp;
    private TransactionIdentification txId;
    private TransactionAmounts txAmts;

}
