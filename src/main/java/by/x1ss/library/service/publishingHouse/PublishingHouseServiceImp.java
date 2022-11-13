package by.x1ss.library.service.publishingHouse;

import by.x1ss.library.DAO.publishingHouse.PublishingHouseDAO;
import by.x1ss.library.DTO.PublishingHouseDTO;
import by.x1ss.library.entities.PublishingHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublishingHouseServiceImp implements PublishingHouseService {
    @Autowired
    private PublishingHouseDAO publishingHouseDAO;

    @Override
    public Long addPublishingHouse(PublishingHouse publishingHouse) {
        return publishingHouseDAO.addPublishingHouse(publishingHouse);
    }

    @Override
    public void deletePublishingHouse(long id) {
        publishingHouseDAO.deletePublishingHouse(id);
    }

    @Override
    public void updatePublishingHouse(long id, PublishingHouseDTO publishingHouseDTO) {
        publishingHouseDAO.updatePublishingHouse(id, publishingHouseDTO);
    }

    @Override
    public PublishingHouseDTO getPublishingHouse(long id) {
        return PublishingHouseDTO.fromPublishingHouse(publishingHouseDAO.getPublishingHouse(id));
    }

    @Override
    public List<PublishingHouseDTO> getAllPublishingHouse() {
        return publishingHouseDAO.getAllPublishingHouses().stream().map(PublishingHouseDTO::fromPublishingHouse).toList();
    }
}
