package by.x1ss.library.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "publishing_houses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PublishingHouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String address;
}
