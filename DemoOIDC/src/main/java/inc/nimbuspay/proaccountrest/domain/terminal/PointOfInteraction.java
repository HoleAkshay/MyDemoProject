package inc.nimbuspay.proaccountrest.domain.terminal;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Point of interaction (POI) is the entry point to a card payment system.
 * It could be a physical or logical card payment terminal containing software
 * and hardware components, it could be a payment system including a set of
 * card payment terminals linked to a local or remote server, or it could be
 * just an interface to make payments as telephone or Internet browser.
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
public class PointOfInteraction extends System {
    /*
     * Type of cardholder verification that could be performed during a transaction.
     */
    private String cardholderVerificationCapabilities;

    /* Process which uses the point of interaction. */
    private String cardPaymentAcquiring;

    /* Card reading capabilities of the POI performing the transaction. */
    private String cardReadingCapabilities;

    /* Type of components belonging to a POI. */
    private String component;

    /* Identification of the POI component assigned by its provider. */
    private String componentIdentification;

    /* Identification of a version of component belonging to a given model. */
    private String componentVersionNumber;

    /* Terminal management system for which a point of interaction is specified. */
    private String controllingTerminalManagementSystem;

    /* Display interfaces components. */
    private String displayCapabilities;

    /*
     * Error logging transferred by the point of interaction to the terminal
     * management system.
     */
    private String errorLog;

    /*
     * Identifier assigned by the merchant identifying a set of POI terminals
     * performing
     * some categories of transactions.
     */
    private String groupIdentifier;

    /* Number of columns of the display component. */
    private String lineWidth;

    /* Number of lines of the display component. */
    private String numberOfLines;

    /* On-line and off-line capabilities of the POI. */
    private String onLineCapabilities;

    /* Number of columns of the printer component. */
    private String printLineWidth;
}
