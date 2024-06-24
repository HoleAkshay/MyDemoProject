package inc.nimbuspay.proaccountrest.domain.core;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Payment processes initiated by a payment card.
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
public class CardPaymentAcquiring {
    /*
     * Message to be displayed or printed to the cardholder or the cashier.
     */
    private String actionMessage;

    /* Type of action to be performed by the POI (Point Of Interaction) system. */
    private String actionType;

    /* Human attendance at the POI location during the transaction. */
    private String attendanceContext;

    /* Language used to display messages to the attendant. */
    private String attendantLanguage;

    /*
     * Indicates whether a message can be sent or not on an attendant display
     * (attendant display present or not).
     */
    private String attendantMessageCapable;

    /*
     * Indicates whether the transaction is captured or not.
     */
    private String captureIndicator;

    /*
     * Entry mode of the card data.
     */
    private String cardDataEntryMode;

    /*
     * Indicates whether the transaction has been initiated in presence of the
     * cardholder or not.
     */
    private String cardholderPresent;

    /*
     * Type of service provided by the transaction.
     */
    private String cardPaymentService;

    /*
     * Indicates whether the transaction has been initiated by a card physically
     * present or not.
     */
    private String cardPresent;

    /*
     * Indicates whether the acquirer requires a further exchange after the
     * completion of the transaction.
     */
    private String completionRequired;

    /* Country of the merchant where the transaction took place. */
    private String country;

    /*
     * Indicator of a transaction fallback.
     */
    private String fallbackIndicator;

    /*
     * Data related to the interface of an integrated circuit card application.
     */
    private String iccRelatedData;

    /*
     * Identification of the transaction assigned by the initiating party for the
     * recipient party.
     */
    private String initiatorTransactionIdentifier;

    /* Interchange information related to the card scheme. */
    private String interchangeData;

    /*
     * Location category of the place where the merchant actually performed the
     * transaction.
     */
    private String location;

    /* On-line or off-line context of the transaction. */
    private String onLineContext;

    /*
     * Describes the Point of Interaction through which the payment by card was
     * initiated.
     */
    private String pointOfInteraction;

    /*
     * Identification of the transaction assigned by the recipient party for the
     * initiating party.
     */
    private String recipientTransactionIdentification;

    /* Card payment which is at the origin of the acquiring process. */
    private String relatedCardPayment;

    /*
     * Notify that a previous transaction has to be reversed if this original
     * transaction has been approved by the acquirer.
     */
    private String reversal;

    /*
     * Instructs the POI (Point Of Interaction) how to contact the host of the
     * terminal management system (TMS), to initiate the maintenance of the
     * terminal.
     */
    private String tmsTrigger;

    /*
     * Identifies the type of the communication channels used by the cardholder to
     * the acceptor system.
     */
    private String transactionChannel;

    /*
     * Local date and time of the transaction assigned by the POI (Point Of
     * Interaction).
     */
    private Date transactionDateTime;

    /* Indicates the environment of the transaction. */
    private String transactionEnvironment;

    /*
     * Identification of the transaction assigned by the POI (Point Of Interaction).
     */
    private String transactionIdentification;

    /* Transaction category level on an unattended POI (Point Of Interaction). */
    private String unattendedLevelCategory;

    /* Results and parameters of the card payment verification. */
    private String validation;
}
