
package acme.forms;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dashboard implements Serializable {

	private static final long	serialVersionUID	= 1L;

	//Atributos

	Integer						totalAnnouncements;
	Integer						totalCompanies;
	Integer						totalInvestor;
	Double						minActiveRequest;
	Double						maxActiveRequest;
	Double						avgActiveRequest;
	Double						standDevActiveResquest;
	Double						minActiveOffers;
	Double						maxActiveOffers;
	Double						avgMinActiveOffers;
	Double						avgMaxActiveOffers;
	Double						standDevActiveOffers;
	List<Integer>				totalInvestorGroupBySector;
	List<Integer>				totalCompanyGroupBySector;
	Collection<String>			sectors;
	
	
}
