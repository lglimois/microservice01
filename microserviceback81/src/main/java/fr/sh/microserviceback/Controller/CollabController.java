package fr.sh.microserviceback.Controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.sh.microserviceback.dto.Collaborator;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class CollabController {

	Logger logger = LoggerFactory.getLogger(CollabController.class);

	@RequestMapping("/")
	public String getIndex() {
		logger.info("Appel: /racine");
		
		return "{helloWorrld: \"coucou\"}";
	}

	@RequestMapping("/api/collaborator")
	public List getCollab() {
		logger.info("Appel: /api/collaborator");
		
		List list = new ArrayList<>();
		for (int i = 1; i < 3; i++) {
			Collaborator collaborator = new Collaborator("firstname"+i, "lastname"+i, "email"+i);
			list.add(collaborator);
		}
		return list;
	}

}
