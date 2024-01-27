package FinalProject.web.app.BookCatalog.controllers;

import FinalProject.web.app.BookCatalog.entity.Author;
import FinalProject.web.app.BookCatalog.entity.Book;
import FinalProject.web.app.BookCatalog.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService bookService;
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
}
