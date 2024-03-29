
package acme.features.administrator.dashboard;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.framework.repositories.AbstractRepository;

@Repository
public interface AdministratorDashboardRepository extends AbstractRepository {

	@Query("select count(a) from Announcement a")
	Integer getAllAnnouncements();

	@Query("select count(c) from CompanyRecord c")
	Integer getAllCompanies();

	@Query("select count(i) from InvestorRecord i")
	Integer getAllInvestor();

	@Query("select min(r.reward.amount) from ActiveRequest r where datediff(current_date(), r.deadline)<0")
	Double getMinReward();

	@Query("select max(r.reward.amount) from ActiveRequest r where datediff(current_date(), r.deadline)<0")
	Double getMaxReward();

	@Query("select avg(r.reward.amount) from ActiveRequest r where datediff(current_date(), r.deadline)<0")
	Double getAvgReward();

	@Query("select stddev(r.reward.amount) from ActiveRequest r where datediff(current_date(), r.deadline)<0")
	Double getStandDev();

	@Query("select min(o.minMon.amount) from Offer o where datediff(current_date(), o.deadline)<0")
	Double getMinMoney();

	@Query("select max(o.maxMon.amount) from Offer o where datediff(current_date(), o.deadline)<0")
	Double getMaxMoney();

	@Query("select avg(o.minMon.amount) from Offer o where datediff(current_date(), o.deadline)<0")
	Double getAvgMinMoney();

	@Query("select avg(o.maxMon.amount) from Offer o where datediff(current_date(), o.deadline)<0")
	Double getAvgMaxMoney();

	@Query("select stddev(o.minMon.amount) from Offer o where datediff(current_date(), o.deadline)<0")
	Double getStandDevOfferMin();

	@Query("select stddev(o.maxMon.amount) from Offer o where datediff(current_date(), o.deadline)<0")
	Double getStandDevOfferMax();

	@Query("select i.sector, count(i) from InvestorRecord i group by i.sector")
	Collection<Object[]> getTotalInvestorGroupBySector();

	@Query("select c.sector, count(c) from CompanyRecord c group by c.sector")
	Collection<Object[]> getTotalCompanyGroupBySector();

}
