package by.x1ss.library.service.author;

import by.x1ss.library.DTO.AuthorDTO;
import by.x1ss.library.entities.Author;

import java.util.List;


public interface AuthorService {
    Long addAuthor(Author author);
    void deleteAuthor(long id);
    void updateAuthor(long id, AuthorDTO author);
    AuthorDTO getAuthor(long id);
    List<AuthorDTO> getAllAuthors();
}
