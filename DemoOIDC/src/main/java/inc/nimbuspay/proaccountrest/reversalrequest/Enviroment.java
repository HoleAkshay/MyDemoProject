package inc.nimbuspay.proaccountrest.reversalrequest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Enviroment {

    private Acquirer acqrr;
    
}