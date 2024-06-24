package inc.nimbuspay.proaccountrest.domain.transaction;

import java.time.LocalDateTime;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * General information that unambiguously identifies a document, such as
 * identification number and issue date time.
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
public class Document {

    /* Agreement which is materialised by a document */
    private String agreement;

    /* Amount of money and currency of a document. */
    private String amount;

    /* Trade for which a certificare is issued. */
    private String commercialTrade;

    /*
     * Specifies if this document is a copy, a duplicate, or a duplicate of a copy.
     */
    private String copyDuplicate;

    /* Specifies the type of data set in which the document is included. */
    private String dataSetType;

    /*
     * Identification of a document for instance unique identification of the
     * purchase order,
     * assigned by the buyer.
     */
    private String documentIdentification;

    /* Unambiguous identification of the version of a document. */
    private String documentVersion;

    /* Proof of evidence which uses a document. */
    private String evidence;

    /* Guarantee that is described in a document. */
    private String guarantee;

    /* Issue date of the document. */
    private LocalDateTime issueDate;

    /* Language used for textual information in the document. */
    private String language;

    /* Written undertaking by a bank to honour a demand for payment. */
    private String letterOfCredit;

    /*
     * Role played by a party in the context of a document or in the context of the
     * business linked to the document.
     */
    private String partyRole;

    /* Document which is referred to in a payment obligation. */
    private String paymentObligation;

    /* Place where the document was issued. */
    private String placeOfIssue;

    /* Specifies where the document is stored. */
    private String placeOfStorage;

    /* Presentation of documents and statements. */
    private String presentation;

    /* Specifies the function of the document. */
    private String purpose;

    /* Reconciliation process for which a document is specified. */
    private String reconciliation;

    /* Related document which materialises the agreement. */
    private String relatedContract;

    /* Amount of money remitted for the referred document. */
    private String remittedAmount;

    /* Indication whether the document must be signed or not. */
    private String signedIndicator;

    /* Status of the document (eg delivered, paid, etc.) */
    private String status;

    /* Transport process for which related documents are specified. */
    private String transport;

    /* Specifies the type of the document, for example commercial invoice. */
    private String type;

}
