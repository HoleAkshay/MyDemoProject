package inc.nimbuspay.proaccountrest.domain.core;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Status of a payment by card.
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
@EqualsAndHashCode(callSuper = true)
public class CardPaymentStatus extends Status {
    /* Card payment for which a status is provided. */
    private String cardPayment;

    /* List of incidents during the transaction. */
    private String failureReason;

    /* Reason of the rejection of a request or an advice. */
    private String rejectionReason;
}
