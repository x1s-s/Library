package by.x1ss.library.contoller.author;

import by.x1ss.library.DTO.AuthorDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

@SuppressWarnings("rawtypes")
public interface AuthorController {
    ResponseEntity addAuthor(AuthorDTO authorDTO);
    ResponseEntity deleteAuthor(long id);
    ResponseEntity updateAuthor(long id, AuthorDTO author);
    ResponseEntity<AuthorDTO> getAuthor(long id);
    ResponseEntity<List<AuthorDTO>> getAllAuthors();
}
