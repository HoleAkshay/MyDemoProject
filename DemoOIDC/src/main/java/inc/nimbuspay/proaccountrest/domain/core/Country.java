package inc.nimbuspay.proaccountrest.domain.core;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Nation with its own government.
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
public class Country {
    /* Specifies a person which is a citizen of a country. */
    private String citizen;

    /* Identifies a nation with its own government (ISO 3166). */
    private String code;

    /*
     * Specifies the beneficial owner which has certified that it is not domiciled
     * in the country.
     */
    private String countryForBeneficialOwner;

    /* Specifies the safekeeping places located in a specific country. */
    private String countryForSafekeepingPlace;

    /*
     * Specifies the other parameters of the investment fund class which apply in
     * that country.
     */
    private String countryRelatedInvestmentFundProcessing;

    /* Investment funds which are domiciled in a specific country. */
    private String domiciledFunds;

    /* Market for which a country is specified. */
    private String market;

    /*
     * Name by which a country is known. It is normally the name attached to the ISO
     * country code.
     */
    private String name;

    /* Regulatory authority of the country. */
    private String nationalRegulatoryAuthority;

    /* Specifies the representation of a postal address per country. */
    private String postalAddressSpecification;

    /* Specifies the product for which an origin is specified. */
    private String producedProducts;

    /* Card payment which took place in the specified country. */
    private String relatedCardPayment;

    /* Payment card for which a country code is attached. */
    private String relatedPaymentCard;

    /*
     * Unit resulting from the division of a country, dependency, or other area of
     * special geopolitical interest contained in ISO 3166-1, on the basis of
     * country names obtained from the United Nations (ISO 3166-2: Country
     * subdivision code).
     */
    private String subDivision;

    /* Tax parameters applicable in a country. */
    private String tax;
}
