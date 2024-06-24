package inc.nimbuspay.proaccountrest.domain.core;

import java.time.LocalDate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Results and parameters of the card payment verification.
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
public class CardPaymentValidation {
    /* Outcome of the transaction at the acceptor. */
    private String transactionSuccess;

    /*
     * Indicate that the acceptor has forced the transaction in spite of the
     * authorisation result (online or offline), or incident to complete the
     * transaction.
     */
    private String merchantOverride;

    /* Transaction authorisation deadline to complete the related payment. */
    private LocalDate validityDate;

    /* Card payment to which the validation process applies. */
    private String cardPayment;

    /* Response to an authorisation request. */
    private String response;

    /* Value assigned by the authorising party. */
    private String authorisationCode;

    /* Reason to process an online authorisation. */
    private String onLineReason;

    /* Balance of the account attached to the payment card. */
    private String balance;

    /*
     * Result of the cardholder verification address checks on the street number and
     * the postal code.
     */
    private String cardholderAddressVerificationResult;

    /* Result of the printed CSC (Card Security Code) validation. */
    private String cSCResult;

    /* Product code for which the payment authorisation was declined. */
    private String declinedProductCode;

    /* Result of an e-commerce authentication process. */
    private String electronicCommerceAuthenticationResult;

    /* Incident occuring during the transaction. */
    private String failureReason;

    /* Signature of the message to display or print. */
    private String signature;
}
