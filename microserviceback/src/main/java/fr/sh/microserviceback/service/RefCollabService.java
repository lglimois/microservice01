package fr.sh.microserviceback.service;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import fr.sh.microserviceback.dto.Collaborator;

@Service
public class RefCollabService {

	private final RestTemplate restTemplate;

	public RefCollabService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public List getRefCollab() {
		ResponseEntity<List<Collaborator>> CollabResponse =
		        restTemplate.exchange("http://localhost:8081/api/collaborator",
		        		               //http://localhost:8081/api/collaborator
		                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Collaborator>>() {
		            });
		List<Collaborator> collab = CollabResponse.getBody();
		
		
		return collab;
	}
}
