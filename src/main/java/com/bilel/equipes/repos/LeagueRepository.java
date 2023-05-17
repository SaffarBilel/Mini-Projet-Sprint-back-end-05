package com.bilel.equipes.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bilel.equipes.entities.League;


@RepositoryRestResource(path = "lea")
@CrossOrigin(origins = "http://localhost:4200/") //pour autoriser angular 
public interface LeagueRepository extends JpaRepository<League, Long>{

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
