package by.x1ss.library.service.polygraphy;

import by.x1ss.library.DAO.polygraphy.PolygraphyDAO;
import by.x1ss.library.DTO.AuthorDTO;
import by.x1ss.library.DTO.PolygraphyDTO;
import by.x1ss.library.DTO.PublishingHouseDTO;
import by.x1ss.library.entities.polygraphy.Polygraphy;
import by.x1ss.library.entities.polygraphy.PolygraphyType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Service
public class PolygraphyServiceImp implements PolygraphyService {
    @Autowired
    private PolygraphyDAO polygraphyDAO;

    @Override
    public Long addPolygraphy(Polygraphy polygraphy) {
        return polygraphyDAO.addPolygraphy(polygraphy);
    }

    @Override
    public void deletePolygraphy(long id) {
        polygraphyDAO.deletePolygraphy(id);
    }

    @Override
    public void updatePolygraphy(long id, PolygraphyDTO polygraphyDTO) {
        polygraphyDAO.updatePolygraphy(id, polygraphyDTO);
    }

    @Override
    public PolygraphyDTO getPolygraphy(long id) {
        return PolygraphyDTO.fromPolygraphy(polygraphyDAO.getPolygraphy(id));
    }

    @Override
    public List<PolygraphyDTO> getAllPolygraphy() {
        return polygraphyDAO.getAllPolygraphies().stream().map(PolygraphyDTO::fromPolygraphy).toList();
    }

    @Override
    public List<PolygraphyDTO> getPolygraphiesWithFilter(
            String name,
            String description,
            LocalDate dateOfPublication,
            String text,
            PolygraphyType type,
            String fullname,
            String country,
            String publishingHouseName,
            String address) {
        PolygraphyDTO polygraphyDTO = new PolygraphyDTO(
                name,
                description,
                dateOfPublication,
                text,
                type,
                new AuthorDTO(fullname , country),
                new PublishingHouseDTO(publishingHouseName, address)
        );
        return polygraphyDAO.getPolygraphyWithFilter(polygraphyDTO).stream().map(PolygraphyDTO::fromPolygraphy).toList();
    }

}

