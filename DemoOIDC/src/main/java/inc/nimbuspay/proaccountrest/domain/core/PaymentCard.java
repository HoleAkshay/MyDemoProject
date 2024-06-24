package inc.nimbuspay.proaccountrest.domain.core;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Electronic money product that provides the cardholder with a portable and
 * specialised computer device that typically contains a microprocessor.
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
public class PaymentCard {
    /* Brand name of the card. */
    private String cardBrand;

    /* Country code attached to the card by the card issuer. */
    private String cardCountryCode;

    /* Currency code of the card issuer. */
    private String cardCurrencyCode;

    /*
     * The card programme associated by a retailer to a cardholder among a series of
     * payment programmes offered by the retailer.
     */
    private String cardProgramme;

    /* Monetary value of the credit available for this financial card. */
    private String creditAvailableAmount;

    /* Year and month the card expires. */
    private String expiryDate;

    /* Interest applied on amounts due for credit card payments. */
    private String interest;

    /* Limit specified on a payment card. */
    private String limit;

    /*
     * Number embossed on a card that links the card to the account owner and
     * account servicer (sometimes called personal account number or PAN).
     */
    private String number;

    /* Payment for which a payment card is used. */
    private String payment;

    /*
     * Defines a category of cards related the acceptance processing rules defined
     * by the acquirer.
     */
    private String profileNumber;

    /* Account linked to the card. */
    private String relatedAccount;

    /* Type of cardholder account used for the transaction. */
    private String relatedAccountType;

    /*
     * Security code written on the card, sometimes called card security code (CSC).
     */
    private String securityCode;

    /* Card Security Code management associated with the transaction. */
    private String securityCodeManagement;

    /* Identifies a card inside a set of cards with the same number (or PAN). */
    private String sequenceNumber;

    /* Services attached to the card. */
    private String serviceCode;

    /* Year and month the card is available for use. */
    private String startDate;

    /* Card track content or equivalent. */
    private String trackValue;

    /* Type of card, eg, credit card. */
    private String type;
}
