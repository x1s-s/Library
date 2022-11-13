package by.x1ss.library.DAO.publishingHouse;

import by.x1ss.library.DAO.repositories.PublishingHouseRepository;
import by.x1ss.library.DTO.PublishingHouseDTO;
import by.x1ss.library.entities.PublishingHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PublishingHouseDAOImp implements PublishingHouseDAO{
    @Autowired
    private PublishingHouseRepository publishingHouseRepository;

    @Override
    public Long addPublishingHouse(PublishingHouse publishingHouse) {
        publishingHouseRepository.save(publishingHouse);
        return publishingHouse.getId();
    }

    @Override
    public void deletePublishingHouse(long id) {
        publishingHouseRepository.deleteById(id);
    }

    @Override
    public void updatePublishingHouse(long id, PublishingHouseDTO publishingHouseDTO) {
        PublishingHouse publishingHouse = publishingHouseRepository.findById(id).get();
        publishingHouseDTO.setNotNullFields(publishingHouse);
    }

    @Override
    public PublishingHouse getPublishingHouse(long id) {
        return publishingHouseRepository.findById(id).get();
    }

    @Override
    public List<PublishingHouse> getAllPublishingHouses() {
        return publishingHouseRepository.findAll();
    }
}
