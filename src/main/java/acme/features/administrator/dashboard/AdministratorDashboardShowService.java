
package acme.features.administrator.dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.forms.Dashboard;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractShowService;

@Service
public class AdministratorDashboardShowService implements AbstractShowService<Administrator, Dashboard> {

	@Autowired
	AdministratorDashboardRepository repository;


	@Override
	public boolean authorise(final Request<Dashboard> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Dashboard> request, final Dashboard entity, final Model model) {
		assert request != null;
		assert model != null;
		assert entity != null;

		request.unbind(entity, model, "totalAnnouncements", "totalCompanies", "totalInvestor", "minActiveRequest", "maxActiveRequest", "avgActiveRequest", "standDevActiveResquest", "minActiveOffers", "maxActiveOffers", "avgMinActiveOffers",
			"avgMaxActiveOffers", "standDevActiveOffers");
	}

	@Override
	public Dashboard findOne(final Request<Dashboard> request) {
		assert request != null;

		Dashboard result = new Dashboard();

		result.setTotalAnnouncements(this.repository.getAllAnnouncements());
		result.setTotalCompanies(this.repository.getAllCompanies());
		result.setTotalInvestor(this.repository.getAllInvestor());
		result.setMinActiveRequest(this.repository.getMinReward());
		result.setMaxActiveRequest(this.repository.getMaxReward());
		result.setAvgActiveRequest(this.repository.getAvgReward());
		result.setStandDevActiveResquest(this.repository.getStandDev());
		result.setMinActiveOffers(this.repository.getMinMoney());
		result.setMaxActiveOffers(this.repository.getMaxMoney());
		result.setAvgMinActiveOffers(this.repository.getAvgMinMoney());
		result.setAvgMaxActiveOffers(this.repository.getAvgMaxMoney());
		result.setStandDevActiveOffers(this.repository.getStandDevOffer());

		return result;
	}

}
