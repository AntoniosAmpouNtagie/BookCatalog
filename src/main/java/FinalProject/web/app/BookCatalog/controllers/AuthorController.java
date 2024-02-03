package FinalProject.web.app.BookCatalog.controllers;

import FinalProject.web.app.BookCatalog.entity.Author;
import FinalProject.web.app.BookCatalog.services.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/authors")
public class AuthorController {
    private final AuthorService authorService;
    @GetMapping
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthors();
    }
}
