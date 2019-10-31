
package acme.features.authenticated.activerequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.activerequests.ActiveRequest;
import acme.framework.components.Model;
import acme.framework.components.Request;

import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractShowService;

@Service
public class AuthenticatedActiveRequestShowService implements AbstractShowService<Authenticated, ActiveRequest> {

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
	public void unbind(final Request<ActiveRequest> request, final ActiveRequest entity, final Model model) {
		// TODO Auto-generated method stub
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "moment","deadline","description", "reward", "ticker");
	}
	
	public ActiveRequest findOne(final Request<ActiveRequest> request) {
		assert request != null;
		
		ActiveRequest result;
		int id;
		
		id = request.getModel().getInteger("id");
		result = this.rep.findOneById(id);
		return result;
		
	}
}
