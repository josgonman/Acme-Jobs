
package acme.features.authenticated.activerequest;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.activerequests.ActiveRequest;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;

import acme.framework.entities.Authenticated;

@Controller
@RequestMapping("/authenticated/active-request/")
public class AunthenticatedActiveRequestController extends AbstractController<Authenticated, ActiveRequest> {

	// Internal state

	@Autowired
	private AuthenticatedActiveRequestListService	listService;
	private AuthenticatedActiveRequestShowService showService;


	//Constructors

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}
}
