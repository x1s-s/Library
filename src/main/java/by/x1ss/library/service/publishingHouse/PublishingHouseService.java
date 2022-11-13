package by.x1ss.library.service.publishingHouse;

import by.x1ss.library.DTO.PublishingHouseDTO;
import by.x1ss.library.entities.PublishingHouse;

import java.util.List;


public interface PublishingHouseService {
    Long addPublishingHouse(PublishingHouse publishingHouse);
    void deletePublishingHouse(long id);
    void updatePublishingHouse(long id, PublishingHouseDTO publishingHouse);
    PublishingHouseDTO getPublishingHouse(long id);
    List<PublishingHouseDTO> getAllPublishingHouse();

}
