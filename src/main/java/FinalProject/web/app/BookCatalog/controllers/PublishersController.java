package FinalProject.web.app.BookCatalog.controllers;

import FinalProject.web.app.BookCatalog.entity.Publishers;
import FinalProject.web.app.BookCatalog.services.PublishersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/publishers")
public class PublishersController {
    private final PublishersService publishersService;
    public List<Publishers> getAllPublishers(){
        return publishersService.getAllPublishers();
    }
}
