package com.qa.hwa.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hwa.Services.TeamService;


@RestController
@RequestMapping("/Team")
public class TeamController {

//	@Autowired
//	TeamService service;
//	
//	@GetMapping("/ListOfTeams")
//	public List<String> listTeams() {
//		return service.listteams();
//	}
}
