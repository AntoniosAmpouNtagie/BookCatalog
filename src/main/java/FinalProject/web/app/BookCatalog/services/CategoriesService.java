package FinalProject.web.app.BookCatalog.services;

import FinalProject.web.app.BookCatalog.entity.Categories;
import FinalProject.web.app.BookCatalog.repositories.CategoriesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CategoriesService {
    private final CategoriesRepository categoriesRepository;
    public List<Categories> getAllCategories(){
        return (List<Categories>) categoriesRepository.findAll();
    }
}
