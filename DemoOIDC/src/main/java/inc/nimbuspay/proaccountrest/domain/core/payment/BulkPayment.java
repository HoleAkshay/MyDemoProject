package inc.nimbuspay.proaccountrest.domain.core.payment;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Payment which contains a series of other payments which have been grouped
 * under specific criteria. A bulk payment can only contain individual
 * payments of the same type (credit transfer or direct debit).
 * 
 * @see <a href=
 *      "https://www.iso20022.org/sites/default/files/documents/D7/Business_Model_Cards.zip">Business
 *      Domains Cards</a>
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
public class BulkPayment extends Payment {

    /*
     * Indicates that a bulk payment groups several individual payments of the same
     * type (credit transfer or direct debit).
     */
    private String groups;
}
