package by.x1ss.library.contoller.publishingHouse;

import by.x1ss.library.DTO.PublishingHouseDTO;
import by.x1ss.library.entities.PublishingHouse;
import by.x1ss.library.service.publishingHouse.PublishingHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publishingHouse")
@SuppressWarnings("rawtypes")
public class PublishingHouseControllerImp implements PublishingHouseController {
    @Autowired
    private PublishingHouseService publishingHouseService;

    @PostMapping("/add")
    @Override
    public ResponseEntity<Long> addPublishingHouse(@RequestBody PublishingHouse publishingHouse) {
        return ResponseEntity.ok(publishingHouseService.addPublishingHouse(publishingHouse));
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public ResponseEntity deletePublishingHouse(@PathVariable long id) {
        publishingHouseService.deletePublishingHouse(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    @Override
    public ResponseEntity updatePublishingHouse(@PathVariable long id,@RequestBody PublishingHouseDTO publishingHouse) {
        publishingHouseService.updatePublishingHouse(id, publishingHouse);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get/{id}")
    @Override
    public ResponseEntity<PublishingHouseDTO> getPublishingHouse(@PathVariable long id) {
        return ResponseEntity.ok(publishingHouseService.getPublishingHouse(id));
    }

    @GetMapping("/get/all")
    @Override
    public ResponseEntity<List<PublishingHouseDTO>> getAllPublishingHouse() {
        return ResponseEntity.ok(publishingHouseService.getAllPublishingHouse());
    }
}
