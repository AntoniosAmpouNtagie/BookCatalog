package FinalProject.web.app.BookCatalog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookId;
    private String title;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Author> authors;
    private int year;
    private double price;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Categories> categories;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publishers")
    private Publishers publishers;
    private String summary;
}
