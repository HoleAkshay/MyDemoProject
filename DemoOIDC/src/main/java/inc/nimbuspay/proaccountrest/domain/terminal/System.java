package inc.nimbuspay.proaccountrest.domain.terminal;

import java.time.LocalDateTime;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Set of integrated applications that provides centralised services such as
 * clearing, netting, reconciliation, trading and/or settlement.
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
public class System extends RolePlayer {

        /* Account managed by a system and held by a system member. */
        private String account;

        /* Assessment associated with a system. */
        private String assessment;

        /* Information about the activity or non-activity of the system. */
        private String availability;

        /*
         * Specific point in time associated with the system's processing cycle.
         * Operations of a system are composed of a
         * series of processes, the closing, or completion, of which constitutes
         */
        private String event;

        /* Location, address and country in which the system is located. */
        private String location;

        /* Negotiation process which uses a ssystem. */
        private String negotiation;

        /* Specifies each role linked to a system. */
        private String partyRole;

        /* Reconciliation process provided by the system. */
        private String reconciliation;

        /* Status of the system. */
        private String status;

        /* Date time of a system performing a task. */
        private LocalDateTime systemDateTime;

        /* Business details provided for an information system. */
        private String systemGeneratedInformation;

        /* Identification of the system. */
        private String systemIdentification;

        /* Specifies the language used by the system. */
        private String systemLanguage;

        /* Trade processed by a system. */
        private String trade;

        /* Specifies the status of trades and their value inside a system. */
        private String tradesPosition;

        /*
         * Date at, or period of time during which, the stipulated version is in effect.
         */
        private LocalDateTime versionValidityPeriod;
}
