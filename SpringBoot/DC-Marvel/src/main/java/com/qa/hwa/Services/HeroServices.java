package com.qa.hwa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qa.hwa.Repositories.HeroRepo;

@Service
public class HeroServices {
	
	@Autowired
	HeroRepo repo;
	
	public List<String> listheroes(){
		return repo.listHeroes();
	}	
}