
package acme.entities.banners;

import javax.persistence.Entity;


import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class NoComercialBanner extends Banner{
	
	private String				jingle;
}
