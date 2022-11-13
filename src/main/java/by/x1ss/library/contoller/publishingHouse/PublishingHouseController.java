package by.x1ss.library.contoller.publishingHouse;

import by.x1ss.library.DTO.PublishingHouseDTO;
import by.x1ss.library.entities.PublishingHouse;
import org.springframework.http.ResponseEntity;

import java.util.List;

@SuppressWarnings("rawtypes")
public interface PublishingHouseController {
    ResponseEntity<Long> addPublishingHouse(PublishingHouse publishingHouse);
    ResponseEntity deletePublishingHouse(long id);
    ResponseEntity updatePublishingHouse(long id, PublishingHouseDTO publishingHouse);
    ResponseEntity<PublishingHouseDTO> getPublishingHouse(long id);
    ResponseEntity<List<PublishingHouseDTO>> getAllPublishingHouse();
}
