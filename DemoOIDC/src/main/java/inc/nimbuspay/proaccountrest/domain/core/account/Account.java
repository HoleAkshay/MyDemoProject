package inc.nimbuspay.proaccountrest.domain.core.account;

import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Record of transactions in specific types of assets, maintained by a
 * servicing party on behalf of one or more owning parties. Business
 * relationship between an account servicer and one or more account owners.
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
public class Account {

    /*
     * Agreement which provides information on the account and on the services
     * linked to it.
     */
    private String accountContract;

    /* Restriction on capability or operations allowed. */
    private String accountRestriction;

    /* Services linked to the account and specified in the account contract. */
    private String accountService;

    /*
     * Overall position representing the net debits and credits in an account at a
     * specific point in time.
     */
    private String balance;

    /* Base currency of the account. */
    private String baseCurrency;

    /*
     * Date on which the account and related services cease effectively to be
     * operational for the account owner.
     */
    private Date closingDate;

    /* Specifies the collateral account type. */
    private String collateralAccountType;

    /*
     * Rate used to calculate the difference between amounts based on the base
     * currency and the reporting currency.
     */
    private String currencyExchange;

    /*
     * Clearing member which holds a default fund account at an ICSD or at the
     * central bank.
     */
    private String defaultFundAccountOwner;

    /*
     * Default fund contribution parameters associated with a contribution account.
     */
    private String defaultFundContribution;

    /* Record of the movements into or out of an account. */
    private String entry;

    /*
     * Unique and unambiguous identification for the account between the account
     * owner and the account servicer.
     */
    private AccountIdentification identification;

    /* Party role for which an account is specified. */
    private String investmentFundPartyRole;

    /* Language for all communication concerning the account. */
    private String language;

    /* Date of the first movement on the account. */
    private Date liveDate;

    /* Product which provides guidance to investors to manage their portfolios. */
    private String managedAccountProduct;

    /*
     * Date on which the account and related basic services are effectively
     * operational for the account owner.
     */
    private Date openingDate;

    /* Account for which one or more sub-accounts are specified. */
    private String parentAccount;

    /*
     * Specifies each role linked to an account and played by a party in that
     * context.
     */
    private String partyRole;

    /* Specifies the purpose of the account. */
    private String purpose;

    /*
     * Process which compares and matches trade information with entries in an
     * account.
     */
    private String reconciliation;

    /* Collateral data for which a collateral account is specified. */
    private String relatedCollateralProcess;

    /*
     * Party for which an account is specified in the context of a corporate action.
     */
    private String relatedCorporateActionPartyRole;

    /*
     * Fund processing characteristics for which a settlement account is specified.
     */
    private String relatedFundProcessingCharacteristics;

    /* Proceeds delivery instruction which contain account identification. */
    private String relatedProceedsDelivery;

    /* Specifies the period for which the movements in the account are reported. */
    private String reportedPeriod;

    /*
     * Currency used to calculate and report the balance and related entries of an
     * account.
     */
    private String reportingCurrency;

    /* Specifies the role of the party which uses the account for settlement. */
    private String settlementPartyRole;

    /* Specifies the current state of an account, eg, enabled or deleted. */
    private String status;

    /* Subdivision of an account used to segregate specific holdings. */
    private String subAccount;

    /* System where the account is held. */
    private String system;

    /* Member of a system which is the owner of an account with the system. */
    private String systemMember;

    /* Party for which an account is specified in the context of a trade. */
    private String tradePartyRole;

    /* Specifies the type of account. */
    private String type;
}
