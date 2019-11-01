package acme.features.anonymous.offer2;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.offers2.Offer2;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/offer2/")
public class AnonymousOffer2Controller extends AbstractController<Anonymous, Offer2> {

	// Internal state

	@Autowired
	private AnonymousOffer2ListService	listService;

	@Autowired
	private AnonymousOffer2CreateService	createService;


	//Constructors

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}
}