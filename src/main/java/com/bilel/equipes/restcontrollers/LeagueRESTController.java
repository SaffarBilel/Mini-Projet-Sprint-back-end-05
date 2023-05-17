package com.bilel.equipes.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bilel.equipes.entities.League;
import com.bilel.equipes.repos.LeagueRepository;

@RestController
@RequestMapping("/api/lea")
@CrossOrigin("*")
public class LeagueRESTController {
	
	
	@Autowired
	LeagueRepository leagueRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<League> getAllCategories()
	{
	return leagueRepository.findAll();
	}

	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public League getLeagueById(@PathVariable("id") Long id) {
	return leagueRepository.findById(id).get();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
