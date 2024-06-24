package inc.nimbuspay.proaccountrest.domain.party;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Organised structure that is set up for a particular purpose. For example, a
 * business, government body, department, charity, or financial institution.
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
public class Organisation extends Party {

    /* Purpose of the organisation, eg, charity. */
    private String purpose;

    /* Date and time at which a given organisation was officially registered. */
    private LocalDateTime registrationDate;

    /*
     * Specific identification assigned to an organisation. It is derived from the
     * association between Party and PartyIdentification.
     */
    private String organisationIdentification;

    /* Organisation which is divided in branches. */
    private String parentOrganisation;

    /* Specifies an organisation which is not a head office. */
    private String branch;

    /* Specifies the process which originates the changes to an organisation. */
    private String securitiesModification;

    /*
     * Place (including country) in which the organisation has its business
     * activity.
     */
    private String placeOfOperation;

    /* Place (including country) in which the organisation is registered. */
    private String placeOfRegistration;

    /* Description of an organisation. */
    private String description;

    /* Legal standing of the organisation. */
    private String legalStructure;

    /* Sector of business of the organisation, for example, pharmaceutical. */
    private String sector;

    /*
     * Indication of interest process for which a list of organisations is
     * specified.
     */
    private String relatedIndicationOfInterest;

    /* Strategy related to an organisation. */
    private String strategy;

    /* Description of the structure of a company. */
    private String organisationHierarchy;

    /*
     * Officer who has some rights to represent a given organisation. In account
     * management, it is the person to be contacted by the account servicer.
     */
    private String representativeOfficer;

    /* Date when the organisation was established. */
    private LocalDate establishmentDate;

    /*
     * The date the Legal Entity ceased operation or was merged. This element SHALL
     * be present if EntityExpirationReason is present, and omitted otherwise.
     */
    private LocalDateTime entityExpirationDate;

    /*
     * Reason that a Legal Entity ceased to operate. This element SHALL be present
     * if EntityExpirationDate is present, and omitted otherwise.
     */
    private String entityExpirationReason;

    /* Status of Legal Entity. */
    private String entityStatus;

    /*
     * Classification of a business by the types of goods or services it provides.
     */
    private String merchantCategory;

    /* Commercial logo of the organisation. */
    private String logo;

    /*
     * Enrolment service for the ultimate party to which an amount of money is due.
     */
    private String relatedUltimateCreditrorEnrolmentService;

    /* Enrolment service for the party to which an amount of money is due. */
    private String relatedCreditrorEnrolmentService;

    /* Post trade risk reduction for which the organisation is the structurer. */
    private String relatedPostTradeRiskReduction;
}
