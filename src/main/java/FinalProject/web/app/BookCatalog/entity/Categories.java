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
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long categoriesId;
    private String categoriesName;
    @ManyToMany(mappedBy = "categories")
    private List<Book> books;
}
