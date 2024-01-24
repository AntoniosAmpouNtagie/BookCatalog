package FinalProject.web.app.BookCatalog.repositories;

import FinalProject.web.app.BookCatalog.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepository extends CrudRepository<Book,Long> {
}
