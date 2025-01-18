package ludo.bernard.HessKeeperAPI.repositories;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import ludo.bernard.HessKeeperAPI.dto.User;

@Component
public interface UserRepository extends CrudRepository<User, String>{}
