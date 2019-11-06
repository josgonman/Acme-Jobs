
package acme.entities.banners;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ComercialBanner extends Banner {

	/**
	 *
	 */
	private static final long	serialVersionUID	= 1L;

	@CreditCardNumber
	private String				card;
}
