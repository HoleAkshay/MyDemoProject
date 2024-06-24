package inc.nimbuspay.proaccountrest.domain.core.address;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Address which is accessed by electronic means.
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
public class ElectronicAddress extends ContactPoint {
    /* Address for electronic mail (e-mail). */
    private String emailAddress;

    /* Address for an Integrated Services Digital Network. */
    private String iSDNAddress;

    /*
     * Presentation process for which an electronic presentation address is
     * specified.
     */
    private String relatedPresentation;

    /* Address for a teletext. */
    private String teletextAddress;

    /* Address for a telex machine. */
    private String telexAddress;

    /*
     * Address for the Universal Resource Locator (URL), eg, used over the www
     * (HTTP) service.
     */
    private String urlAddress;
}
