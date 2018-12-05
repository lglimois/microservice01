package fr.sh.microserviceback.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.sh.microserviceback.dto.Collaborator;
import fr.sh.microserviceback.service.RefCollabService;


@RestController
public class PortailCollabController {

	@Autowired
	protected RefCollabService refcollabservice;
	
	@RequestMapping("/api/portailcollab")
	public List getCollab() {

		List list = refcollabservice.getRefCollab();
		return list;
	}
	
}
