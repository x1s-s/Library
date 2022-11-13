package by.x1ss.library.contoller.polygraphy;

import by.x1ss.library.DTO.PolygraphyDTO;
import by.x1ss.library.entities.polygraphy.Polygraphy;
import by.x1ss.library.entities.polygraphy.PolygraphyType;
import by.x1ss.library.service.polygraphy.PolygraphyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/polygraphy")
@SuppressWarnings("rawtypes")
public class PolygraphyControllerImp implements PolygraphyController {
    @Autowired
    private PolygraphyService polygraphyService;

    @PostMapping("/add")
    @Override
    public ResponseEntity<Long> addPolygraphy(@RequestBody Polygraphy polygraphy) {
        return ResponseEntity.ok(polygraphyService.addPolygraphy(polygraphy));
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public ResponseEntity deletePolygraphy(@PathVariable long id) {
        polygraphyService.deletePolygraphy(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    @Override
    public ResponseEntity updatePolygraphy(@PathVariable long id, @RequestBody PolygraphyDTO polygraphy) {
        polygraphyService.updatePolygraphy(id, polygraphy);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get/{id}")
    @Override
    public ResponseEntity<PolygraphyDTO> getPolygraphy(@PathVariable long id) {
        return ResponseEntity.ok(polygraphyService.getPolygraphy(id));
    }

    @GetMapping("/get/all")
    @Override
    public ResponseEntity<List<PolygraphyDTO>> getAllPolygraphy() {
        return ResponseEntity.ok(polygraphyService.getAllPolygraphy());
    }

    @GetMapping("/get/filter")
    @Override
    public ResponseEntity<List<PolygraphyDTO>> getPolygraphiesWithFilter(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String description,
            @RequestParam(required = false) LocalDate dateOfPublication,
            @RequestParam(required = false) String text,
            @RequestParam(required = false) PolygraphyType type,
            @RequestParam(required = false) String fullname,
            @RequestParam(required = false) String country,
            @RequestParam(required = false) String publishingHouseName,
            @RequestParam(required = false) String address) {
        return ResponseEntity.ok(polygraphyService.getPolygraphiesWithFilter(
                name,
                description,
                dateOfPublication,
                text,
                type,
                fullname,
                country,
                publishingHouseName,
                address));
    }
}

