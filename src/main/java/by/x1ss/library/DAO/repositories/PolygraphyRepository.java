package by.x1ss.library.DAO.repositories;

import by.x1ss.library.DTO.AuthorDTO;
import by.x1ss.library.DTO.PublishingHouseDTO;
import by.x1ss.library.entities.Author;
import by.x1ss.library.entities.PublishingHouse;
import by.x1ss.library.entities.polygraphy.Polygraphy;
import by.x1ss.library.entities.polygraphy.PolygraphyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PolygraphyRepository extends JpaRepository<Polygraphy, Long> {
    @Query("SELECT p FROM Polygraphy p WHERE " +
            "(p.name = ?1 OR ?1 is null) AND " +
            "(p.description = ?2 OR ?2 is null) AND " +
            "(p.dateOfPublication = ?3 OR ?3 is null ) AND" +
            "(p.text = ?4 OR ?4 is null) AND " +
            "(p.type = ?5 OR ?5 is null) AND" +
            "(p.author = ?6 or ?6 is null) AND" +
            "(p.publishingHouse = ?7 or ?7 is null)")
    List<Polygraphy> findPolygraphiesWithFilter(
            String name,
            String description,
            LocalDate date,
            String text,
            PolygraphyType type,
            Author author,
            PublishingHouse publishingHouse
    );
}
