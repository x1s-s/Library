package by.x1ss.library.service.publishingHouse;

import by.x1ss.library.DTO.PublishingHouseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publishingHouse")
@SuppressWarnings("rawtypes")
public class PublishingHouseControllerImp implements PublishingHouseController {
    @PostMapping("/add")
    @Override
    public ResponseEntity addPublishingHouse(@RequestBody PublishingHouseDTO publishingHouseDTO) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public ResponseEntity deletePublishingHouse(@PathVariable long id) {
        return null;
    }

    @PutMapping("/update/{id}")
    @Override
    public ResponseEntity updatePublishingHouse(@PathVariable long id,@RequestBody PublishingHouseDTO publishingHouse) {
        return null;
    }

    @GetMapping("/get/{id}")
    @Override
    public ResponseEntity<PublishingHouseDTO> getPublishingHouse(@PathVariable long id) {
        return null;
    }

    @GetMapping("/get/all")
    @Override
    public ResponseEntity<List<PublishingHouseDTO>> getAllPublishingHouse() {
        return null;
    }
}
