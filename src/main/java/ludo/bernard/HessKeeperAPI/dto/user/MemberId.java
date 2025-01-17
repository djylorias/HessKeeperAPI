package ludo.bernard.HessKeeperAPI.dto.user;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Embeddable
public class MemberId {
    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer memberId;
    private String email;

}
