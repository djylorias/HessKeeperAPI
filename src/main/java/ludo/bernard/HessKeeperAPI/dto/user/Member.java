package ludo.bernard.HessKeeperAPI.dto.user;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Member {
    
    @EmbeddedId
    private MemberId memberId;
    private String password;
    private String firstname;
    private String lastname;

}
