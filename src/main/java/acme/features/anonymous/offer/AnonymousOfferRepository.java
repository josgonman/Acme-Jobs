
package acme.features.anonymous.offer;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.offers2.Offer2;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousOfferRepository extends AbstractRepository {

	@Query("select o from Offer o")
	Collection<Offer2> findMany();
}
