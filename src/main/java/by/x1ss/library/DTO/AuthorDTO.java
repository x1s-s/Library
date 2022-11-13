package by.x1ss.library.DTO;

import by.x1ss.library.entities.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDTO {
    private String fullname;
    private String country;

    public static AuthorDTO fromAuthor(Author author) {
        AuthorDTO authorDTO = new AuthorDTO();
        authorDTO.setFullname(author.getFullname());
        authorDTO.setCountry(author.getCountry());
        return authorDTO;
    }

    public void setNotNullFields(Author author) {
        if(fullname != null) {
            author.setFullname(fullname);
        }
        if(country != null) {
            author.setCountry(country);
        }
    }


}
