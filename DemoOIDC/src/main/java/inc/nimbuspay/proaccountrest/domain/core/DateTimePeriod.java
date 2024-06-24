package inc.nimbuspay.proaccountrest.domain.core;

import java.time.LocalDateTime;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Time span defined by a start date and time, and an end date and time.
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
public class DateTimePeriod {
    /* Account for which a reported period is specified. */
    private String account;

    /* Account restriction for which a validity period is specified. */
    private String accountRestriction;

    /* Relationship with an amount. */
    private String amount;

    /* Securities proceeds for which an assented line period is specified. */
    private String assentedLinePeriodProceedsDefinition;

    /* Scheme for which a validity period is specified. */
    private String assessmentValidityScheme;

    /* Bank operation for which an applicable period is specified. */
    private String bankOperation;

    /* Bidding conditions for which a compulsory purchase period is specified. */
    private String biddingConditions;

    /*
     * Cash and securities distribution information for which a blocking period is
     * specified.
     */
    private String blockingPeriodDistribution;

    /* Corporate action for which a book closure period has been specified. */
    private String bookClosureCorporateAction;

    /*
     * Corporate event for which a suspension period for book entry transfers is
     * specified.
     */
    private String bookEntryTransferSuspensionRelatedEvent;

    /* Cash distribution for which an interest period is specified. */
    private String cashDistribution;

    /* Class action for which a claim period is specified. */
    private String classAction;

    /*
     * Corporate event for which a suspension period for co-depositories is
     * specified.
     */
    private String coDepositoriesSuspensionRelatedEvent;

    /* Security component for which a separation period is specified. */
    private String componentSecurity;

    /* Corporate action option for which an action period is defined. */
    private String corporateActionOption;

    /* Debt for which a custom date is specified. */
    private String customDateDebt;

    /*
     * Corporate event for which a suspension period for deposits at agent is
     * specified.
     */
    private String depositAtAgentSuspensionRelatedEvent;

    /* Corporate event for which a suspension period for deposits is specified. */
    private String depositSuspensionRelatedEvent;

    /*
     * Cash and securities distribution information for which an exercise period is
     * specified.
     */
    private String exercisePeriodDistribution;

    /* Debt for which an extendible period is specified. */
    private String extendiblePeriodDebt;

    /* Swap for which a maturity period is specified. */
    private String financialInstrumentSwap;

    /* Date and time at which the range starts. */
    private LocalDateTime fromDateTime;

    /* Guarantee for which an effective period is specified. */
    private String guarantee;

    /* Issuance for which subscription information is provided. */
    private String issuance;

    /* Period specified as a number of days. */
    private String numberOfDays;

    /*
     * Cash and securities distribution information for which an offer period is
     * specified.
     */
    private String offerPeriodDistribution;

    /* Securities proceeds for which a parallel trading period is specified. */
    private String parallelTradingProceedsDefinition;

    /* Payment instruction for which a processing validity time is specified. */
    private String paymentInstruction;

    /* Relationship with a percentage. */
    private String percentage;

    /* Performance factors for which an accumulation period is specified. */
    private String performanceFactors;

    /* Corporate event for which a suspension period for pledges is specified. */
    private String pledgeSuspensionRelatedEvent;

    /* Securities pricing for which a price calculation period is specified. */
    private String priceCalculationRelatedPricing;

    /* Securities pricing for which a price fact period is specified. */
    private String priceFactRelatedPricing;

    /* Corporate event for which a privilege suspension period has been defined. */
    private String privilegeSuspensionCorporateAction;

    /* Redemption schedule for which a notice period is provided. */
    private String redemptionSchedule;

    /* Link between two accounts for which a validity period is specified. */
    private String relatedAccountLink;

    /* Adjustment for which a validity period is provided. */
    private String relatedAdjustment;

    /* Agreement for which a validity period is specified. */
    private String relatedAgreement;

    /* Corporate action event for which a trading period is specified. */
    private String relatedCorporateAction;

    /* Party identification for which a validity period is specified. */
    private String relatedIdentification;

    /* Interest calculation process for which an interest period is specified. */
    private String relatedInterestCalculation;

    /* InvestmentPlan for which an investment period is specified. */
    private String relatedInvestmentPlan;

    /* Invoice for which a period is specified. */
    private String relatedInvoice;

    /* Limit for which a validity period is specified. */
    private String relatedLimit;

    /* Payment terms for which a period is specified. */
    private String relatedPaymentTerms;

    /* Portfolio valuation process for which a valuation period is specified. */
    private String relatedPortfolioValuation;

    /* Postal address for which a validity period is specified. */
    private String relatedPostalAddress;

    /* Trade delivery process for which a delivery period is specified. */
    private String relatedProductDelivery;

    /* Role player for which a validity period is specified. */
    private String relatedRolePlayer;

    /* Securities identification for which a validity period is specified. */
    private String relatedSecuritiesIdentification;

    /* Securities registration process for which a split period is specified. */
    private String relatedSecuritiesRegistration;

    /* Standing order for which a validity period is specified. */
    private String relatedStandingOrder;

    /* SSI for which a validity period is specified. */
    private String relatedStandingSettlementInstruction;

    /* System availability for which the closure period is provided. */
    private String relatedSystemAvailability;

    /* Securities conversion process for which a conversion period is specified. */
    private String securitiesConversion;

    /*
     * Corporate event for which a suspension period for segregation is specified.
     */
    private String segregationPeriodRelatedEvent;

    /* Securities proceeds for which a sell thru issuer period is specified. */
    private String sellThruIssuerProceedsDefinition;

    /* Status for which a validity time is specified. */
    private String status;

    /* System for which a validity period is specified. */
    private String system;

    /* Tax period for which a from/to date is specified. */
    private String taxPeriod;

    /* Date and time at which the range ends. */
    private LocalDateTime toDateTime;

    /* Trade certificate for which an inspection date is specified. */
    private String tradeCertificate;

    /*
     * Cash and securities distribution information for which a trading period is
     * specified.
     */
    private String tradingPeriodDistribution;

    /* Trading session for which a time bracket is specified. */
    private String tradingSession;

    /* Valuation statistics for which a reference period is specified. */
    private String valuationStatistics;

    /*
     * Corporate event for which a suspension period for withdrawals at agent is
     * specified.
     */
    private String withdrawalAtAgentSuspensionRelatedEvent;

    /*
     * Corporate event for which a suspension period for withdrawals in nominee name
     * is specified.
     */
    private String withdrawalInNomineeNameSuspensionRelatedEvent;

    /*
     * Corporate event for which a suspension period for withdrawals in street name
     * is specified.
     */
    private String withdrawalInStreetNameSuspensionRelatedEvent;

    /*
     * Corporate event for which a suspension period for withdrawals is specified.
     */
    private String withdrawalSuspensionRelatedEvent;

    /* Yield calculation for which a value period is specified. */
    private String yieldCalculation;
}
