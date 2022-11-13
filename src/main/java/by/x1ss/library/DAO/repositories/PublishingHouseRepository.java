package by.x1ss.library.DAO.repositories;

import by.x1ss.library.entities.polygraphy.Polygraphy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolygraphyRepository extends CrudRepository<Polygraphy, Long> {
}
