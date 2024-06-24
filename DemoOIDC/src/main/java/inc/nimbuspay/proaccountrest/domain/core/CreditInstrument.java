package inc.nimbuspay.proaccountrest.domain.core;

import java.time.LocalDateTime;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Specifies the instrument to be used for the credit of a payment.
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
public class CreditInstrument {
    /* Identifies the credit instrument. */
    private String creditInstrumentIdentification;

    /* Time by which the amount must be paid in. */
    private LocalDateTime deadline;

    /* Transfer method to be used for the transfer. */
    private String method;

    /*
     * Amount less fees and charges, that will be exchanged on settlement date of
     * the trade.
     */
    private String netAmount;

    /* Payment which uses the credit instrument. */
    private String relatedPayment;

}
