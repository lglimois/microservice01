package fr.sh.microserviceback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@SpringBootApplication
public class MicroservicebackApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicebackApplication.class, args);
	}
}
