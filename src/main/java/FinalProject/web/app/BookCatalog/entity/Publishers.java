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
public class Publishers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long publishersId;
    private String name;
    private String address;
    @OneToMany(mappedBy = "publishers")
    private List<Book> books;
}
