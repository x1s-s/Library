package by.x1ss.library.entities.polygraphy;

import by.x1ss.library.entities.Author;
import by.x1ss.library.entities.PublishingHouse;
import lombok.*;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "polygraphies")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Polygraphy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private LocalDate dateOfPublication;
    @Column(columnDefinition = "TEXT")
    private String text;
    @Enumerated(EnumType.STRING)
    private PolygraphyType type;
    @NonNull
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private Author author;
    @NonNull
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "publishing_house_id")
    private PublishingHouse publishingHouse;

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = LocalDate.parse(dateOfPublication);
    }

    public void setDateOfPublication(LocalDate dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }
}
