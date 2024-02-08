package FinalProject.web.app.BookCatalog.entity;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Schema(description = "Details about the book")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookId;
    @Schema(description = "Title of the book")
    @Column(name = "book_title")
    private String title;
    @ManyToOne(fetch = FetchType.LAZY)
    private Author author;
    @Schema(description = "Year of publication")
    private int year;
    @Schema(description = "Price of the book")
    private double price;
    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name = "book_category",joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Categories> categories;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_id")
    private Publishers publishers;
    @Schema(description = "Summary of the book")
    private String summary;
}
