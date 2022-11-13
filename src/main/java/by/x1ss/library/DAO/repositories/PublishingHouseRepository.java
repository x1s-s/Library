package by.x1ss.library.DAO.repositories;

import by.x1ss.library.entities.PublishingHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishingHouseRepository extends JpaRepository<PublishingHouse, Long> {
    PublishingHouse findPublishingHouseByNameAndAddress(String name, String address);

    @Query("SELECT p FROM PublishingHouse p WHERE " +
            "(p.name = ?1 OR ?1 is null) AND " +
            "(p.address = ?2 OR ?2 is null)")
    PublishingHouse findPublishingHouseWithFilter(String name, String address);
}
