package inc.nimbuspay.proaccountrest.domain.party;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Entity involved in an activity.
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
public class Party extends RolePlayer {

    /* Number, physical or virtual address, used for communication. */
    private String contactPoint;

    /* Specific identification assigned to a party. */
    private String identification;

    /*
     * Status of an identity check to prevent money laundering. This includes the
     * counter-terrorism check.
     */
    private String moneyLaunderingCheck;

    /*
     * Taxation parameters which apply to an individual person or to an
     * organisation.
     */
    private String taxationConditions;

    /*
     * Location in which a person is permanently domiciled (the place of a person's
     * permanent home).
     */
    private String domicile;

    /*
     * Location from which the affairs of a company are directed or location in
     * which a person resides (the place of a person's home).
     */
    private String residence;

    /* Power of attorney which is held by the party. */
    private String powerOfAttorney;

    /* Location of the taxable party. */
    private String location;

    /* Security for which a close link with a party is identified. */
    private String closeLinkSecurity;

    /* Credit quality for the clearing member. */
    private String creditQuality;

    /* Specifies the type of shareholding. */
    private String shareholdingType;

    /*
     * Identifies a Postal address of the addressee that is accepting the
     * correspondence for an intended recipient.
     */
    private String relatedCareOf;
}
