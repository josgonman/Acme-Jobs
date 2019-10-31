
package acme.features.anonymous.offer;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.offers2.Offer2;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousOffer2ListService implements AbstractListService<Anonymous, Offer2> {

	//Internal State
	@Autowired
	private AnonymousOffer2Repository rep;


	//AbstractListService<Administrator, Shout> interface

	@Override
	public boolean authorise(final Request<Offer2> request) {
		assert request != null;
		return true;
	}

	@Override
	public Collection<Offer2> findMany(final Request<Offer2> request) {
		assert request != null;
		Collection<Offer2> result;
		result = this.rep.findMany();

		return result;
	}

	@Override
	public void unbind(final Request<Offer2> request, final Offer2 entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "company", "job", "salary", "moment");

	}

}
