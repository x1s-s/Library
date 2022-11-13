package by.x1ss.library.contoller.author;

import by.x1ss.library.DTO.AuthorDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
@SuppressWarnings("rawtypes")
public class AuthorControllerImp implements AuthorController {
    @PostMapping("/add")
    @Override
    public ResponseEntity addAuthor(@RequestBody AuthorDTO authorDTO) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public ResponseEntity deleteAuthor(@PathVariable long id) {
        return null;
    }

    @PutMapping("/update/{id}")
    @Override
    public ResponseEntity updateAuthor(@PathVariable long id,@RequestBody AuthorDTO author) {
        return null;
    }

    @GetMapping("/get/{id}")
    @Override
    public ResponseEntity<AuthorDTO> getAuthor(@PathVariable long id) {
        return null;
    }

    @GetMapping("/get/all")
    @Override
    public ResponseEntity<List<AuthorDTO>> getAllAuthors() {
        return null;
    }
}

