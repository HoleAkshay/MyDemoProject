package inc.nimbuspay.proaccountrest.domain.core.payment;

import inc.nimbuspay.proaccountrest.domain.core.PaymentCard;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Payment through an electronic money product.
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
public class CardPayment extends IndividualPayment {

    /* Identification of the type of amount. */
    private String amountQualifier;

    /*
     * Current totals of the ATM.
     */
    private String atmTotal;

    /* Parameters of the process of acquiring a card payment. */
    private String cardPaymentAcquiring;

    /*
     * Status of the payment by card.
     */
    private String cardPaymentStatus;

    /*
     * Amount added to the total price of the transaction and received in cash by
     * the customer.
     */
    private String cashBackAmount;

    /*
     * Specifies the direction of a payment.
     */
    private String debitCreditDirection;

    /* Detailed amount value. */
    private String detailedAmount;

    /*
     * Short description of the amount.
     */
    private String detailedAmountLabel;

    /* Amount tendered for a service performed. */
    private String gratuity;

    /* Specifies the card which is used in a payment by card. */
    private PaymentCard paymentCard;

    /* Specifies each role played by a party in the process of a payment by card. */
    private String paymentCardPartyRole;

    /* Product purchased with the transaction. */
    private String product;

    /* Total of a certain type of transaction. */
    private String reconciliation;

    /* Specifies the category to which the card transaction belongs. */
    private String transactionCategory;
}
