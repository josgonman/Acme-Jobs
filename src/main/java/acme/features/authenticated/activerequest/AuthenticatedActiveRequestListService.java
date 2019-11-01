
package acme.features.authenticated.activerequest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.activerequests.ActiveRequest;
import acme.framework.components.Model;
import acme.framework.components.Request;

import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedActiveRequestListService implements AbstractListService<Authenticated, ActiveRequest> {

	//Internal State
	@Autowired
	private AuthenticatedActiveRequestRepository rep;


	//AbstractListService<Administrator, Request> interface

	@Override
	public boolean authorise(final Request<ActiveRequest> request) {
		assert request != null;
		return true;
	}

	@Override
	public Collection<ActiveRequest> findMany(final Request<ActiveRequest> request) {
		assert request != null;
		Collection<ActiveRequest> result;
		result = this.rep.findMany();

		return result;
	}

	@Override
	public void unbind(final Request<ActiveRequest> request, final ActiveRequest entity, final Model model) {
		// TODO Auto-generated method stub
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "deadline","title", "reward");
	}

}
