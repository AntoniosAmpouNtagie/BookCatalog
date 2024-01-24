package FinalProject.web.app.BookCatalog.repositories;

import FinalProject.web.app.BookCatalog.entity.Book;
import FinalProject.web.app.BookCatalog.entity.Publishers;
import org.springframework.data.repository.CrudRepository;

public interface PublishersRepository extends CrudRepository<Publishers,Long> {
}
