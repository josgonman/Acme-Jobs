
package acme.features.anonymous.offer;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.offers2.Offer2;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousOffer2CreateService implements AbstractCreateService<Anonymous, Offer2> {

	//Internal state

	@Autowired
	AnonymousOffer2Repository repository;


	@Override
	public boolean authorise(final Request<Offer2> request) {
		assert request != null;

		return true;
	}
	@Override
	public void bind(final Request<Offer2> request, final Offer2 entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<Offer2> request, final Offer2 entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "company", "job", "salary");
	}

	@Override
	public Offer2 instantiate(final Request<Offer2> request) {
		assert request != null;

		Offer2 result;
		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);

		result = new Offer2();
		result.setCompany("La Vanguardia");
		result.setJob("Escritor");
		result.setSalary(1200.00);
		result.setMoment(moment);

		return result;
	}

	@Override
	public void validate(final Request<Offer2> request, final Offer2 entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Offer2> request, final Offer2 entity) {
		assert request != null;
		assert entity != null;

		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);
		entity.setMoment(moment);
		this.repository.save(entity);
	}

}
