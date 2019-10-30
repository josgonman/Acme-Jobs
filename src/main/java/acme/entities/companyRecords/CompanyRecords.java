
package acme.entities.companyRecords;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CompanyRecords extends DomainEntity {

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
	@Pattern(regexp = "+" + "\\d\\d\\d " + "(\\d\\d\\d\\d)" + "\\d\\d\\d\\d\\d\\d")
	private Integer				phone;

	@NotBlank
	@Email
	private String				email;

	@NotBlank
	private Boolean				incorporated;

	@NotBlank
	@Range(min = 0, max = 5)
	private Integer				stars;
}
