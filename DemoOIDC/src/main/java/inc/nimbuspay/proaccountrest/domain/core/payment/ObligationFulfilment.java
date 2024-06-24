package inc.nimbuspay.proaccountrest.domain.core.payment;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Processes by which an obligation is extinguished fully or partially.
 * 
 * @see <a href=
 *      "https://www.iso20022.org/sites/default/files/documents/D7/Business_Model_Cards.zip">Business
 *      Domains Cards</a>
 * 
 * @see <a href=
 *      "https://www.iso20022.org/sites/default/files/media/file/FullBusinessModelDefinitions_20240425.xlsx">Business
 *      Concepts</a>
 * 
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ObligationFulfilment {

    /* Date and time on which assets become available. */
    private Date date;

    /*
     * Specifies the obligation which has been offset for instance a payment
     * obligation or a securities delivery.
     */
    private String obligationOffset;

    /*
     * Specifies the obligation which result from a settlement process, for instance
     * the remaining obligation when the obligations are netted.
     */
    private String resultingObligation;
}
