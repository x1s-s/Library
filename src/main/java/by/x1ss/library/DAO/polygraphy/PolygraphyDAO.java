package by.x1ss.library.DAO.polygraphy;

import by.x1ss.library.DTO.PolygraphyDTO;
import by.x1ss.library.entities.polygraphy.Polygraphy;

import java.util.List;

public interface PolygraphyDAO {
    Long addPolygraphy(Polygraphy polygraphy);
    void deletePolygraphy(long id);
    void updatePolygraphy(long id, PolygraphyDTO polygraphy);
    Polygraphy getPolygraphy(long id);
    List<Polygraphy> getAllPolygraphies();

    List<Polygraphy> getPolygraphyWithFilter(PolygraphyDTO polygraphy);
}
