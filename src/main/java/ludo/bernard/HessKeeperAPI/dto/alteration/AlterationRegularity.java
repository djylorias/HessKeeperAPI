package ludo.bernard.HessKeeperAPI.dto.alteration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AlterationRegularity {
    
    @Id
    private String regularity;
    private String name;

}
