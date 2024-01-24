package FinalProject.web.app.BookCatalog.repositories;

import FinalProject.web.app.BookCatalog.entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
