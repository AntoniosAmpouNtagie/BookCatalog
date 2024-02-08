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
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long authorId;
    @Column(name = "authors_name")
    private String name;
    private int age;
    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE},mappedBy = "author")
    private List<Book> book;
}
