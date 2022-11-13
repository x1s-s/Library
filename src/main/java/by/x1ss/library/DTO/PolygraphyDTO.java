package by.x1ss.library.DTO;

import by.x1ss.library.entities.polygraphy.Polygraphy;
import by.x1ss.library.entities.polygraphy.PolygraphyType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Calendar;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolygraphyDTO {
    private String name;
    private String description;
    private LocalDate dateOfPublication;
    private String text;
    private PolygraphyType type;
    private AuthorDTO author;
    private PublishingHouseDTO publishingHouse;

    public static PolygraphyDTO fromPolygraphy(Polygraphy polygraphy) {
        PolygraphyDTO polygraphyDTO = new PolygraphyDTO();
        polygraphyDTO.setName(polygraphy.getName());
        polygraphyDTO.setDescription(polygraphy.getDescription());
        polygraphyDTO.setDateOfPublication(polygraphy.getDateOfPublication());
        polygraphyDTO.setText(polygraphy.getText());
        polygraphyDTO.setType(polygraphy.getType());
        polygraphyDTO.setAuthor(AuthorDTO.fromAuthor(polygraphy.getAuthor()));
        polygraphyDTO.setPublishingHouse(PublishingHouseDTO.fromPublishingHouse(polygraphy.getPublishingHouse()));
        return polygraphyDTO;
    }

    public void setNotNullFields(Polygraphy polygraphy){
        if (name != null) {
            polygraphy.setName(name);
        }
        if (description != null) {
            polygraphy.setDescription(description);
        }
        if (dateOfPublication != null) {
            polygraphy.setDateOfPublication(dateOfPublication);
        }
        if (text != null) {
            polygraphy.setText(text);
        }
        if (type != null) {
            polygraphy.setType(type);
        }
        if (author != null) {
            author.setNotNullFields(polygraphy.getAuthor());
        }
        if (publishingHouse != null) {
            publishingHouse.setNotNullFields(polygraphy.getPublishingHouse());
        }
    }
}
