
package acme.entities.companyRecords;

import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CompanyRecord extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				name;

	@NotBlank
	private String				sector;

	@NotBlank
	private String				ceo;

	@NotBlank
	private String				activities;

	@NotBlank
	@URL
	private String				link;

	@NotBlank
	@Pattern(regexp = "^([+][\\d]{0,3})?[ ]?([(][\\d]{0,4}[)])?[ ]?([\\d]{6,10}|[\\d]{3} [\\d]{2} [\\d]{2} [\\d]{2}|[\\d]{3} [\\d]{3} [\\d]{3})$")
	private String				phone;

	@NotBlank
	@Email
	private String				email;

	private Boolean				incorporated;

	@NotNull
	@Range(min = 0, max = 5)
	private Integer				stars;


	@Transient
	public String getIncorporated() {
		StringBuilder res = new StringBuilder();
		res.append(this.incorporated);

		if (this.incorporated == true) {
			res.append(", Inc");
		} else {
			res.append(", LLC");
		}

		return res.toString();
	}
}
