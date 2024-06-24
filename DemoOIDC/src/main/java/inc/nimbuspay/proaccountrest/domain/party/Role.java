package inc.nimbuspay.proaccountrest.domain.party;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Role of a party in an activity.
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
public class Role {

    /*
     * Entity which plays a role in the context of the business domain in which the
     * role is defined.
     */
    private String player;

    /* Contact person in the context of a role played by an organisation. */
    private String contactPersonRole;

    /* Specifies the role of the party in the transaction. */
    private String partyRole;

    /* Specifies the risk which is related to the role played by a party. */
    private String counterpartyRisk;

    /* Entry for which a role is specified. */
    private String entry;
}
