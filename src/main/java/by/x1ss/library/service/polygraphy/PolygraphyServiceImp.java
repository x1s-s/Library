package by.x1ss.library.service.polygraphy;

import by.x1ss.library.DTO.PolygraphyDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/polygraphy")
@SuppressWarnings("rawtypes")
public class PolygraphyControllerImp implements PolygraphyController {

    @PostMapping("/add")
    @Override
    public ResponseEntity addPolygraphy(@RequestBody PolygraphyDTO polygraphyDTO) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public ResponseEntity deletePolygraphy(@PathVariable long id) {
        return null;
    }

    @PutMapping("/update/{id}")
    @Override
    public ResponseEntity updatePolygraphy(@PathVariable long id, @RequestBody PolygraphyDTO polygraphy) {
        return null;
    }

    @GetMapping("/get/{id}")
    @Override
    public ResponseEntity<PolygraphyDTO> getPolygraphy(@PathVariable long id) {
        return null;
    }

    @GetMapping("/get/all")
    @Override
    public ResponseEntity<List<PolygraphyDTO>> getAllPolygraphy() {
        return null;
    }
}

