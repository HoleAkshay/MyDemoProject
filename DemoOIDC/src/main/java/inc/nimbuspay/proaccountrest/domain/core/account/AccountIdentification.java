package inc.nimbuspay.proaccountrest.domain.core.account;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Unique identifier of an account, as assigned by the account servicer.
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
public class AccountIdentification {

    /* Account for which an identification is provided. */
    private Account account;

    /*
     * International Bank Account Number (IBAN) - identifier used internationally by
     * financial institutions to uniquely identify the account of a customer.
     * Further specifications of the format and content of the IBAN can be found in
     * the standard ISO 13616
     * "Banking and related financial services - International Bank Account Number (IBAN)"
     * version 1997-10-01, or later revisions.
     */
    private String iBAN;

    /*
     * Basic Bank Account Number (BBAN) - identifier used nationally by financial
     * institutions, ie, in individual countries, generally as part of a National
     * Account Numbering Scheme(s), to uniquely identify the account of a customer.
     */
    private String bBAN;

    /*
     * Universal Payment Identification Code (UPIC) - identifier used by the New
     * York Clearing House to mask confidential data, such as bank accounts and bank
     * routing numbers. UPIC numbers remain with business customers, regardless of
     * banking relationship changes.
     */
    private String uPIC;

    /*
     * Unique identifier for an account. It is assigned by the account servicer
     * using a proprietary identification scheme.
     */
    private String proprietaryIdentification;

    /*
     * Name of the account. It provides an additional means of identification, and
     * is designated by the account servicer in agreement with the account owner.
     */
    private String name;

    /*
     * Template describing the mask of the structure for the format of the
     * accounting account identifier; for example "AABBBBCC" where AA represents the
     * country, BBBB the service classification, CC the sales area.
     */
    private String costReferencePattern;

    /* String of characters (mainly numbers) used to identify an account. */
    private String number;
}
