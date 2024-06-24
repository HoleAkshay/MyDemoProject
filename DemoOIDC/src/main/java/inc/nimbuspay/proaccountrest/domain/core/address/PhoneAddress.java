package inc.nimbuspay.proaccountrest.domain.core.address;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Collection of information that identifies a phone address.
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
public class PhoneAddress extends ContactPoint {
    /*
     * Collection of information that identifies a FAX number, as defined by telecom
     * services.
     * It is recommended to use only numbers and limited punctuation +,-.(.).
     */
    private String faxNumber;

    /*
     * Collection of information that identifies a mobile phone number, as defined
     * by telecom services.
     * It is recommended to use only numbers and limited punctuation +,-.(.).
     */
    private String mobileNumber;

    /*
     * Collection of information that identifies a phone number, as defined by
     * telecom services.
     * It is recommended to use only numbers and limited punctuation +,-.(.).
     */
    private String phoneNumber;
}
