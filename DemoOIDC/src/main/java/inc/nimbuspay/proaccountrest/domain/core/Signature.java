package inc.nimbuspay.proaccountrest.domain.core;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Additional security provision attached to a contract. A (numeric) signature
 * can be used as evidence of origin and integrity, i.e., authenticity of the
 * signed data. A judge can accept this evidence as proof.
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
public class Signature extends Evidence {
    /* Validation of a payment by card for which a signeture is specified. */
    private String cardPaymentValidation;

    /* Parameters related to the signature provided. */
    private String conditions;
}
