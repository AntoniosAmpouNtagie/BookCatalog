package FinalProject.web.app.BookCatalog.repositories;

import FinalProject.web.app.BookCatalog.entity.Book;
import FinalProject.web.app.BookCatalog.entity.Publishers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PublishersRepository extends CrudRepository<Publishers,Long> {
}
