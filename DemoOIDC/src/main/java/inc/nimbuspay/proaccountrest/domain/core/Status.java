package inc.nimbuspay.proaccountrest.domain.core;

import java.time.LocalDateTime;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The status of an instruction, advice or request.
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
public class Status {
    /* Specifies the status of a cancellation request. */
    private String cancellationProcessingStatus;

    /* Status of the processing of an instruction. */
    private String instructionProcessingStatus;

    /* Provides the status of a modification request. */
    private String modificationProcessingStatus;

    /* Role played by a party in the context of assigning a status. */
    private String partyRole;

    /* Status of settlement of a transaction. */
    private String settlementStatus;

    /* Date and time at which the status was assigned. */
    private LocalDateTime statusDateTime;

    /* Specifies the state or the condition. */
    private String statusDescription;

    /* Specifies the reasons for the status. */
    private String statusReason;

    /* Status of processing of a transaction at account servicer level. */
    private String transactionProcessingStatus;

    /* Period of time during which the status is valid. */
    private String validityTime;
}
