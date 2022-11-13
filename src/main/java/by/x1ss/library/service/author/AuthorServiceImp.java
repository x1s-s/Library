package by.x1ss.library.service.author;

import by.x1ss.library.DAO.author.AuthorDAO;
import by.x1ss.library.DTO.AuthorDTO;
import by.x1ss.library.entities.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImp implements AuthorService {
    @Autowired
    private AuthorDAO authorDAO;

    @Override
    public Long addAuthor(Author author) {
        return authorDAO.addAuthor(author);
    }

    @Override
    public void deleteAuthor(long id) {
        authorDAO.deleteAuthor(id);
    }

    @Override
    public void updateAuthor(long id, AuthorDTO author) {
        authorDAO.updateAuthor(id, author);
    }

    @Override
    public AuthorDTO getAuthor(long id) {
        return AuthorDTO.fromAuthor(authorDAO.getAuthor(id));
    }

    @Override
    public List<AuthorDTO> getAllAuthors() {
        return authorDAO.getAllAuthors().stream().map(AuthorDTO::fromAuthor).toList();
    }
}

