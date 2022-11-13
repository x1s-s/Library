package by.x1ss.library.DTO;

import by.x1ss.library.entities.PublishingHouse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublishingHouseDTO {
    private String name;
    private String address;

    public static PublishingHouseDTO fromPublishingHouse(PublishingHouse publishingHouse) {
        PublishingHouseDTO publishingHouseDTO = new PublishingHouseDTO();
        publishingHouseDTO.setName(publishingHouse.getName());
        publishingHouseDTO.setAddress(publishingHouse.getAddress());
        return publishingHouseDTO;
    }

    public void setNotNullFields(PublishingHouse publishingHouse) {
        if(name != null) {
            publishingHouse.setName(name);
        }
        if(address != null) {
            publishingHouse.setAddress(address);
        }
    }
}
