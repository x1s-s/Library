package by.x1ss.library.service.polygraphy;

import by.x1ss.library.DTO.PolygraphyDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

@SuppressWarnings("rawtypes")
public interface PolygraphyController {
    ResponseEntity addPolygraphy(PolygraphyDTO polygraphyDTO);
    ResponseEntity deletePolygraphy(long id);
    ResponseEntity updatePolygraphy(long id, PolygraphyDTO polygraphy);
    ResponseEntity<PolygraphyDTO> getPolygraphy(long id);
    ResponseEntity<List<PolygraphyDTO>> getAllPolygraphy();

}
