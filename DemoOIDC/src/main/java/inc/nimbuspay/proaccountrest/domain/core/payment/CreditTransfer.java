package inc.nimbuspay.proaccountrest.domain.core.payment;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Payment made by transferring an amount of money from a debtor to a creditor.
 * The payment flows through one or more financial institutions or systems.
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
public class CreditTransfer extends IndividualPayment {

    /*
     * Transaction is a standing order. This information is derived from the
     * presence of detailed standing order specification.
     */
    private String standingOrder;

    /* Standing order which creates the credit transfers. */
    private String relatedStandingOrder;
}
