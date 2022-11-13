package by.x1ss.library.DAO.author;

import by.x1ss.library.DAO.repositories.AuthorRepository;
import by.x1ss.library.DTO.AuthorDTO;
import by.x1ss.library.entities.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorDAOImp implements AuthorDAO{
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Long addAuthor(Author author) {
        authorRepository.save(author);
        return author.getId();
    }

    @Override
    public void deleteAuthor(long id) {
        authorRepository.deleteById(id);
    }

    @Override
    public void updateAuthor(long id, AuthorDTO authorDTO) {
        Author author = authorRepository.findById(id).get();
        authorDTO.setNotNullFields(author);
        authorRepository.save(author);
    }

    @Override
    public Author getAuthor(long id) {
        return authorRepository.findById(id).get();
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
}
