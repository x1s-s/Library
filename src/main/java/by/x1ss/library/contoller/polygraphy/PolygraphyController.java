package by.x1ss.library.contoller.polygraphy;

import by.x1ss.library.DTO.PolygraphyDTO;
import by.x1ss.library.entities.polygraphy.Polygraphy;
import by.x1ss.library.entities.polygraphy.PolygraphyType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

@SuppressWarnings("rawtypes")
public interface PolygraphyController {
    ResponseEntity<Long> addPolygraphy(Polygraphy polygraphy);
    ResponseEntity deletePolygraphy(long id);
    ResponseEntity updatePolygraphy(long id, PolygraphyDTO polygraphy);
    ResponseEntity<PolygraphyDTO> getPolygraphy(long id);
    ResponseEntity<List<PolygraphyDTO>> getAllPolygraphy();

    ResponseEntity<List<PolygraphyDTO>> getPolygraphiesWithFilter(
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
