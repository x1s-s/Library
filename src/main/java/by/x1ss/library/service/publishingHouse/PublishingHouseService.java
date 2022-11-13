package by.x1ss.library.service.publishingHouse;

import by.x1ss.library.DTO.PublishingHouseDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

@SuppressWarnings("rawtypes")
public interface PublishingHouseController {
    ResponseEntity addPublishingHouse(PublishingHouseDTO publishingHouseDTO);
    ResponseEntity deletePublishingHouse(long id);
    ResponseEntity updatePublishingHouse(long id, PublishingHouseDTO publishingHouse);
    ResponseEntity<PublishingHouseDTO> getPublishingHouse(long id);
    ResponseEntity<List<PublishingHouseDTO>> getAllPublishingHouse();
}
