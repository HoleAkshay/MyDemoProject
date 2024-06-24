package inc.nimbuspay.proaccountrest.domain.party;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Data related to the authentication of the cardholder.
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
public class Authentication {
    /* Entity or object in charge of verifying the person authenticity */
    private String authenticationEntity;

    /* Method used to authenticate a person. */
    private String authenticationMethod;

    /* Specifies the result of the authentication. */
    private String authenticationResult;

    /*
     * This indicator identifies whether person authentication is supported and data
     * is available.
     */
    private String authenticationSupport;

    /* Value used to authenticate the owner of the payment card. */
    private String authenticationValue;

    /* Cardholder for which an authentication is provided. */
    private String cardholder;

    /*
     * Identifies in electronic commerce transactions whether customer
     * authentication is supported and data is available.
     */
    private String collectionIndicator;

    /*
     * If Strong Customer Authentication is not mandated to process the transaction,
     * this message element must identify the reason of exemption.
     */
    private String exemption;

    /*
     * Specifies the mandate related to the transport authentication details
     * mandate.
     */
    private String mandate;

    /* Personal Identification Number (PIN) for authentication. */
    private String pin;

    /* Encrypted personal identification number (PIN) format. */
    private String pinFormat;
}
