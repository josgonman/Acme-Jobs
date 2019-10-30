
package acme.features.anonymous.offer2;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.offers2.Offer2;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousOffer2Repository extends AbstractRepository {

	@Query("select o from Offer2 o")
	Collection<Offer2> findMany();
}
