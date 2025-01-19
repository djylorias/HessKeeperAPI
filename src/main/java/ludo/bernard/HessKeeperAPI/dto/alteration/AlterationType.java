package ludo.bernard.HessKeeperAPI.dto.alteration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AlterationType {
    
    @Id
    private String type;
    private String name;

}
