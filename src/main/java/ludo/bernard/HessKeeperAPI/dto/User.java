package ludo.bernard.HessKeeperAPI.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
    
    @Id
    private String email;
    private String password;
    private String firstname;
    private String lastname;

}
