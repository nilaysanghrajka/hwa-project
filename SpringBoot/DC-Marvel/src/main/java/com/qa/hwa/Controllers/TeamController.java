package com.qa.hwa.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hwa.Entities.Characters;
import com.qa.hwa.Entities.Team;
import com.qa.hwa.Services.TeamService;


@RestController
@RequestMapping("/Team")
@CrossOrigin
public class TeamController {

	@Autowired
	TeamService service;

	@GetMapping("/ListAll")
	public List<Team> listBoth() {
		System.out.println("team list");
		return service.listteam();
	}
	
	@GetMapping("/remove/{id}")
	public ResponseEntity<Integer> remove (@PathVariable int id) {
		service.remove(id);
		System.out.println("Delete Team " + id);
		return new ResponseEntity<> (id, HttpStatus.NO_CONTENT);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Team> create(@RequestBody Team team) {
		Team newteam = this.service.create(team);
		System.out.println("Create Team");
		return new ResponseEntity<> (newteam, HttpStatus.CREATED);
	}
	
	@PostMapping("/update/{id}")
	public ResponseEntity<Team> update(@RequestBody Team newteam, @PathVariable int id) {
		Team updated = this.service.update(newteam, id);
		System.out.println("This Team Updated " + id);
		return new ResponseEntity<> (updated, HttpStatus.ACCEPTED);
	}

}
