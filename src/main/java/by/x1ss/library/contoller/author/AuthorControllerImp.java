package by.x1ss.library.contoller.author;

import by.x1ss.library.DTO.AuthorDTO;
import by.x1ss.library.entities.Author;
import by.x1ss.library.service.author.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
@SuppressWarnings("rawtypes")
public class AuthorControllerImp implements AuthorController {
    @Autowired
    private AuthorService authorService;

    @PostMapping("/add")
    @Override
    public ResponseEntity<Long> addAuthor(@RequestBody Author author) {
        return ResponseEntity.ok(authorService.addAuthor(author));
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public ResponseEntity deleteAuthor(@PathVariable long id) {
        authorService.deleteAuthor(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    @Override
    public ResponseEntity updateAuthor(@PathVariable long id,@RequestBody AuthorDTO author) {
        authorService.updateAuthor(id, author);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get/{id}")
    @Override
    public ResponseEntity<AuthorDTO> getAuthor(@PathVariable long id) {
        return ResponseEntity.ok(authorService.getAuthor(id));
    }

    @GetMapping("/get/all")
    @Override
    public ResponseEntity<List<AuthorDTO>> getAllAuthors() {
        return ResponseEntity.ok(authorService.getAllAuthors());
    }
}

