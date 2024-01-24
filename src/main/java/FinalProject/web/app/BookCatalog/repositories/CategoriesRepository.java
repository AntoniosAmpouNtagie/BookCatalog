package FinalProject.web.app.BookCatalog.repositories;

import FinalProject.web.app.BookCatalog.entity.Book;
import FinalProject.web.app.BookCatalog.entity.Categories;
import org.springframework.data.repository.CrudRepository;

public interface CategoriesRepository extends CrudRepository<Categories,Long> {
}
