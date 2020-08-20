package com.qa.hwa.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hwa.Services.HeroServices;

@RestController
@RequestMapping("/Heroes")
@CrossOrigin
public class HeroController {

	@Autowired
	HeroServices service;
	
	@GetMapping("/ListOfHeroes")
	public List<String> listHeroes() {
		System.out.println("this works here");
		return service.listheroes();
	}
	
	
	
}
