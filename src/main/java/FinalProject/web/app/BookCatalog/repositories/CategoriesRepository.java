package FinalProject.web.app.BookCatalog.repositories;

import FinalProject.web.app.BookCatalog.entity.Book;
import FinalProject.web.app.BookCatalog.entity.Categories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategoriesRepository extends CrudRepository<Categories,Long> {
}
