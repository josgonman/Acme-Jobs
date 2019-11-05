package acme.entities.banners;

import java.awt.Image;

import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Banner extends DomainEntity {


		private static final long	serialVersionUID	= 1L;
		@NotBlank
		@URL
		private String				picture;

		@NotBlank
		private String				slogan;

		@URL
		@NotBlank
		private String				url;

		
		private Boolean				comercial;
		
		@Transient
		@CreditCardNumber
		private String 				card;
		
		@Transient
		private	String				jingle;
	


	}


