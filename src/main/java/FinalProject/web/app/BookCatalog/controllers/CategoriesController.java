package FinalProject.web.app.BookCatalog.controllers;

import FinalProject.web.app.BookCatalog.entity.Categories;
import FinalProject.web.app.BookCatalog.services.CategoriesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/categories")
public class CategoriesController {
    private final CategoriesService categoriesService;
    public List<Categories> getAllCategories(){
        return categoriesService.getAllCategories();
    }
}
