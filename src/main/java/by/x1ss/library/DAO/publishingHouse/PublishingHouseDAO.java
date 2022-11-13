package by.x1ss.library.DAO.publishingHouse;

import by.x1ss.library.DTO.PublishingHouseDTO;
import by.x1ss.library.entities.PublishingHouse;

import java.util.List;

public interface PublishingHouseDAO {
    Long addPublishingHouse(PublishingHouse publishingHouse);
    void deletePublishingHouse(long id);
    void updatePublishingHouse(long id, PublishingHouseDTO publishingHouse);
    PublishingHouse getPublishingHouse(long id);
    List<PublishingHouse> getAllPublishingHouses();

}

