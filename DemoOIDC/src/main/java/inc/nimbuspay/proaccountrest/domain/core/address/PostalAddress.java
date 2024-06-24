package inc.nimbuspay.proaccountrest.domain.core.address;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Information that locates and identifies a specific address.
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
public class PostalAddress extends ContactPoint {
    /* Specifies the type of address. */
    private String addressType;

    /* Area of land bounded by streets. */
    private String block;

    /*
     * Identification of a building, within a group of buildings, that have the same
     * street number identifier.
     */
    private String buildingIdentification;

    /*
     * Name of the building or house.
     */
    private String buildingName;

    /*
     * Cheque issue information for which a delivery address is specified.
     */
    private String chequeIssue;

    /*
     * Country of the address.
     */
    private String country;

    /*
     * Identification of a division of a large organisation or building.
     */
    private String department;

    /*
     * Floor or storey within a building.
     */
    private String floor;

    /*
     * Specifies a place.
     */
    private String location;

    /* Identification of an allotment of land. */
    private String lot;

    /*
     * Specific place to deliver mail within a pre-defined postal address.
     */
    private String mailDeliverySubLocation;

    /*
     * Specifies the characteristics of an address.
     */
    private String mailingInstructions;

    /*
     * Physical delivery information related to an address.
     */
    private String physicalDelivery;

    /*
     * Identifier consisting of a group of letters and/or numbers that is added to a
     * postal address to assist the sorting of mail.
     */
    private String postCodeIdentification;

    /*
     * Numbered box in a post office, assigned to a person or organisation, where
     * letters are kept until called for.
     */
    private String postOfficeBox;

    /*
     * Number that identifies the position of a building on a street.
     */
    private String streetBuildingIdentification;

    /* Name of a street or thoroughfare. */
    private String streetName;

    /*
     * Identification of a sub-division of a large organisation or building.
     */
    private String subDepartment;

    /*
     * Identification of a suite or apartment.
     */
    private String suiteIdentification;

    /*
     * Name of a built-up area, with defined boundaries, and a local government.
     */
    private String townName;

    /*
     * Specifies the period during which a postal address is valid.
     */
    private String validityPeriod;
}
