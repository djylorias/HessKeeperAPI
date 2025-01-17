package ludo.bernard.HessKeeperAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("ludo.bernard.HessKeeperAPI.repositories.*")
@EntityScan("ludo.bernard.HessKeeperAPI.dto.*")
public class HessKeeperApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HessKeeperApiApplication.class, args);
	}

}
