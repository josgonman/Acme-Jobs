
package acme.features.authenticated.activerequest;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.activerequests.ActiveRequest;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedActiveRequestRepository extends AbstractRepository {

	@Query("select s from ActiveRequest s where s.id = ?1")
    ActiveRequest findOneById(int id);
	
	@Query("select s from ActiveRequest s where datediff(current_date(), s.deadline)<0")
	Collection<ActiveRequest> findMany();
	

}
