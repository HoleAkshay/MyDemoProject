package inc.nimbuspay.proaccountrest.domain.core.address;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Number, physical or virtual address, used for communication.
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
public class ContactPoint {

    /* Identification of a contact point. */
    private String identification;

    /* Investment fund class for which an order desk is specified. */
    private String relatedInvestmentFund;

    /* BIC address which identifies the contact point. */
    private String bICAddress;

    /* Party for which a contact point is specified. */
    private String relatedParty;

    /* Corporate action event for which the documentation location is specified. */
    private String relatedCorporateActionEvent;

    /* Reporting service for which a contact point is specified. */
    private String relatedReportingService;

    /* Document which is stored at a specific place. */
    private String storedDocument;

    /* Payment for which a remittance location is specified. */
    private String remittanceRelatedPayment;

    /* Proxy appointment process for which a notification address is specified. */
    private String relatedProxyAppointment;

    /* Meeting which takes place at a specific place. */
    private String contactPointForMeeting;

    /* Vote parameters which apply to a vote location. */
    private String contactPointForVote;

    /* Contact address used for normal operations. */
    private String mainContact;

    /*
     * Physical/logical address, segregated from the main address that is used for
     * normal operations. The return address is used to route messages that require
     * specific attention/exception handling, eg, returns or rejects.
     */
    private String returnAddress;

    /* Payment for which a notification method is specified. */
    private String relatedPayment;

    /* Indicates whether the address is a temporary address. */
    private String temporaryIndicator;

    /* Attendance card which is delivered at a specific location. */
    private String deliveredAttendanceCard;

    /*
     * Processing characteristics of an investment fund class for which a local
     * market annex is specified.
     */
    private String investmentFundClassProcessing;
}
