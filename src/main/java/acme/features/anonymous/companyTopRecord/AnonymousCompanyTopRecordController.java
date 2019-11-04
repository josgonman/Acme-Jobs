
package acme.features.anonymous.companyTopRecord;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.companyRecords.CompanyRecord;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/company-top-record/")
public class AnonymousCompanyTopRecordController extends AbstractController<Anonymous, CompanyRecord> {

	@Autowired
	private AnonymousCompanyTopRecordListService	listService;

	@Autowired
	private AnonymousCompanyTopRecordShowService	showService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}
}
