package inc.nimbuspay.proaccountrest.domain.core.payment;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Payment information and processes required to transfer cash end to end from
 * the debtor to the creditor.
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
public class Payment extends ObligationFulfilment {
    /* Account debited for the payment. */
    private String account;

    /* Specifies the charges or the allowance related to a payment. */
    private String adjustments;

    /* Amount of the payment. */
    private String amount;

    /* Provides the payment of the registered contract. */
    private String contractRegistration;

    /* Specifies the transfer method to be used for the credit. */
    private String creditMethod;

    /* Information on the exchange rate and amounts used in the payment */
    private String currencyExchange;

    /*
     * Specifies the currency of the amount to be transferred which may be different
     * from the currency of the debtor's account.
     */
    private String currencyOfTransfer;

    /*
     * Amount of money to be transferred between debtor and creditor, before
     * deduction of charges, expressed in the currency of the debtor's account, and
     * to be transferred in a different currency.
     */
    private String equivalentAmount;

    /*
     * Amount of money to be moved between the debtor and creditor, before deduction
     * of charges, expressed in the currency as ordered by the initiating party.
     */
    private String instructedAmount;

    /*
     * Further information related to the processing of the payment instruction that
     * may need to be acted upon by the creditor agent.
     * Usage: The instruction can relate to a level of service, can be an
     * instruction to be executed by the creditor's agent, or can be information
     * required by the creditor's agent to process the instruction.
     */
    private String instructionForCreditorAgent;

    /*
     * Further information related to the processing of the payment instruction that
     * may need to be acted upon by the debtor's agent.
     * Usage: The instruction can relate to a level of service, can be an
     * instruction to be executed by the debtor's agent, or can be information
     * required by the debtor's agent to process the instruction.
     */
    private String instructionForDebtorAgent;

    /*
     * Reconciliation of the amounts of an invoice with the amounts included in one
     * or more payments.
     */
    private String invoiceReconciliation;

    /* Original payment which is returned. */
    private String originalPayment;

    /*
     * Specifies each role linked to a payment and played by a party at that step in
     * a payment flow.
     */
    private String partyRole;

    /* Describes the processes necessary to execute a payment. */
    private String paymentExecution;

    /* Payment type at the origin of the cash entry eg, a cheque. */
    private String paymentInstrument;

    /* Specifies the obligation which created the payment. */
    private String paymentObligation;

    /*
     * Identifications provided to identify a payment at different processing
     * levels.
     */
    private String paymentRelatedIdentifications;

    /* Specifies the status of a payment at a specified time. */
    private String paymentStatus;

    /*
     * Date used for the correction of the value date of a cash pool movement that
     * has been posted with a different value date.
     */
    private Date poolingAdjustmentDate;

    /*
     * Urgency or order of importance that the originator would like the recipient
     * of the payment to apply to its processing.
     */
    private String priority;

    /* Payment which is the result of the debit authorisation */
    private String relatedDebitAuthorisation;

    /* Investigation case assigned to the payment. */
    private String relatedInvestigationCase;

    /* Case resolution related to a specific payment. */
    private String relatedInvestigationCaseResolution;

    /* Securities settlement process which is the source of the payment. */
    private String relatedSecuritiesSettlement;

    /* Payment which offsets an original payment. */
    private String returnPayment;

    /* Information on the requested settlement time of the instruction. */
    private String settlementTimeRequest;

    /* Identifies the standard settlement instructions. */
    private String standardSettlementInstructions;

    /* Payment levy tax. */
    private String taxOnPayment;

    /* Specifies the settlement operation which originates the payment. */
    private String tradeSettlement;

    /* Type, or nature, of the payment, eg, express payment. */
    private String type;

    /* Date on which a payment must be executed */
    private Date valueDate;
}
