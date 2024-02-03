package FinalProject.web.app.BookCatalog.controllers;

import FinalProject.web.app.BookCatalog.entity.Book;
import FinalProject.web.app.BookCatalog.services.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/api/books")
@Tag(name = "Book Management",description = "The Book API")
public class BookController {
    private final BookService bookService;
    @Operation(summary = "Get list of sll books")
    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
}
