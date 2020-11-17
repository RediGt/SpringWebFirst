package redi.sbdemoapp.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import redi.sbdemoapp.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
