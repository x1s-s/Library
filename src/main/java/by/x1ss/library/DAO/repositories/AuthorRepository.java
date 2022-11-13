package by.x1ss.library.DAO.repositories;

import by.x1ss.library.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author findAuthorByFullnameAndCountry(String fullname, String country);

    @Query("SELECT a FROM Author a WHERE " +
            "(a.fullname = ?1 OR ?1 is null) AND " +
            "(a.country = ?2 OR ?2 is null)")
    Author findAuthorWithFilter(String fullname, String country);
}
