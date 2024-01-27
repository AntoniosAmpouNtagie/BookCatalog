package FinalProject.web.app.BookCatalog.services;

import FinalProject.web.app.BookCatalog.entity.Author;
import FinalProject.web.app.BookCatalog.repositories.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AuthorService {
    private final AuthorRepository authorRepository;
    public List<Author> getAllAuthors(){
        return (List<Author>) authorRepository.findAll();
    }
}
