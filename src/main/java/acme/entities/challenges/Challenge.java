
package acme.entities.challenges;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;


import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Challenge extends DomainEntity {

	private static final long serialVersionUID = 1L;

	@NotBlank
	private String title;

	@Temporal(TemporalType.TIMESTAMP)
	@Future
	private Date deadline;

	@NotBlank
	private String description;

	@Transient
	private String goal;

	
	@Valid
	private Money reward;
	
 // --------------------DERIVED ATTRIBUTES-------------------------
	
	public String getGoal() {
		StringBuilder result;
		result = new StringBuilder();
		
		if(this.reward.getAmount()>=2000.) {
			result = result.append("Gold");
		}
		else if(this.reward.getAmount()>=1000. && this.reward.getAmount()<2000.) {
			result = result.append("Silver");
		}
		else {
			result = result.append("Bronze");
		}
		
		return result.toString();
	}
}
