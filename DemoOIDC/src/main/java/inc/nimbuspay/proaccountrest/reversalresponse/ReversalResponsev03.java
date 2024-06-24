package inc.nimbuspay.proaccountrest.reversalresponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReversalResponsev03 {

    private Header hdr;
    private Body body;

}
