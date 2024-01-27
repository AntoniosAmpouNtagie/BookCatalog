package FinalProject.web.app.BookCatalog.services;

import FinalProject.web.app.BookCatalog.entity.Book;
import FinalProject.web.app.BookCatalog.repositories.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;
    public List<Book> getAllBooks(){
        return (List<Book>) bookRepository.findAll();
    }
}
