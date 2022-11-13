package by.x1ss.library.service.polygraphy;

import by.x1ss.library.DTO.PolygraphyDTO;
import by.x1ss.library.entities.polygraphy.Polygraphy;
import by.x1ss.library.entities.polygraphy.PolygraphyType;

import java.time.LocalDate;
import java.util.List;


public interface PolygraphyService {
    Long addPolygraphy(Polygraphy polygraphy);
    void deletePolygraphy(long id);
    void updatePolygraphy(long id, PolygraphyDTO polygraphyDTO);
    PolygraphyDTO getPolygraphy(long id);
    List<PolygraphyDTO> getAllPolygraphy();

    List<PolygraphyDTO> getPolygraphiesWithFilter(
            String name,
            String description,
            LocalDate dateOfPublication,
            String text,
            PolygraphyType type,
            String fullname,
            String country,
            String publishingHouseName,
            String address);
}
