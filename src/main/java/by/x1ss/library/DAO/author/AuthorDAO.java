package by.x1ss.library.DAO.author;

import by.x1ss.library.DTO.AuthorDTO;
import by.x1ss.library.entities.Author;

import java.util.List;

public interface AuthorDAO {
    Long addAuthor(Author author);
    void deleteAuthor(long id);
    void updateAuthor(long id, AuthorDTO author);
    Author getAuthor(long id);
    List<Author> getAllAuthors();
}
