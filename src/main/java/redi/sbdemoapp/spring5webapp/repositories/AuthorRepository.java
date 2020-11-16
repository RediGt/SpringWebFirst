package redi.sbdemoapp.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import redi.sbdemoapp.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
