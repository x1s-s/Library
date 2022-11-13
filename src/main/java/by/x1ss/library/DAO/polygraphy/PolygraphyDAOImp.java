package by.x1ss.library.DAO.polygraphy;

import by.x1ss.library.DAO.repositories.AuthorRepository;
import by.x1ss.library.DAO.repositories.PolygraphyRepository;
import by.x1ss.library.DAO.repositories.PublishingHouseRepository;
import by.x1ss.library.DTO.PolygraphyDTO;
import by.x1ss.library.entities.Author;
import by.x1ss.library.entities.PublishingHouse;
import by.x1ss.library.entities.polygraphy.Polygraphy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PolygraphyDAOImp implements PolygraphyDAO{
    @Autowired
    private PolygraphyRepository polygraphyRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private PublishingHouseRepository publishingHouseRepository;

    @Override
    public Long addPolygraphy(Polygraphy polygraphy) {
        Author author = authorRepository.findAuthorByFullnameAndCountry(polygraphy.getAuthor().getFullname(), polygraphy.getAuthor().getCountry());
        PublishingHouse publishingHouse = publishingHouseRepository.findPublishingHouseByNameAndAddress(polygraphy.getPublishingHouse().getName(), polygraphy.getPublishingHouse().getAddress());
        if(author != null) {
            polygraphy.setAuthor(author);
        }
        if(publishingHouse != null) {
            polygraphy.setPublishingHouse(publishingHouse);
        }
        polygraphyRepository.save(polygraphy);
        return polygraphy.getId();
    }

    @Override
    public void deletePolygraphy(long id) {
        polygraphyRepository.deleteById(id);
    }

    @Override
    public void updatePolygraphy(long id, PolygraphyDTO polygraphyDTO) {
        Polygraphy polygraphy = polygraphyRepository.findById(id).get();
        polygraphyDTO.setNotNullFields(polygraphy);
    }


    @Override
    public Polygraphy getPolygraphy(long id) {
        return polygraphyRepository.findById(id).get();
    }

    @Override
    public List<Polygraphy> getAllPolygraphies() {
        return polygraphyRepository.findAll();
    }

    @Override
    public List<Polygraphy> getPolygraphyWithFilter(PolygraphyDTO polygraphy) {
        Author author = null;
        if(polygraphy.getAuthor().getFullname() != null || polygraphy.getAuthor().getCountry() != null) {
            author = authorRepository.findAuthorWithFilter(polygraphy.getAuthor().getFullname(), polygraphy.getAuthor().getCountry());
            if (author == null) {
                return new ArrayList<>();
            }
        }
        PublishingHouse publishingHouse = null;
        if (polygraphy.getPublishingHouse().getName() != null || polygraphy.getPublishingHouse().getAddress() != null) {
            publishingHouse = publishingHouseRepository.findPublishingHouseWithFilter(polygraphy.getPublishingHouse().getName(), polygraphy.getPublishingHouse().getAddress());
            if (publishingHouse == null) {
                return new ArrayList<>();
            }
        }
        return polygraphyRepository.findPolygraphiesWithFilter(
                polygraphy.getName(),
                polygraphy.getDescription(),
                polygraphy.getDateOfPublication(),
                polygraphy.getText(),
                polygraphy.getType(),
                author,
                publishingHouse
        );
    }
}
