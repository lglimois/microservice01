package fr.sh.microserviceback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class MicroservicebackApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicebackApplication.class, args);
	}
}
