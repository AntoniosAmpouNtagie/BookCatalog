package FinalProject.web.app.BookCatalog.services;

import FinalProject.web.app.BookCatalog.entity.Publishers;
import FinalProject.web.app.BookCatalog.repositories.PublishersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PublishersService {
    private final PublishersRepository publishersRepository;
    public List<Publishers> getAllPublishers(){
        return (List<Publishers>) publishersRepository.findAll();
    }
}
