package com.qa.hwa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hwa.Entities.Characters;
import com.qa.hwa.Repositories.CharacterRepo;

@Service
public class CharacterServices {
	
	@Autowired
	CharacterRepo repo;
	
	public List<Characters> charName (String name) {
		return repo.findByName(name);
	}
	
	public List<Characters> listboth(){
		return repo.findAll();
	}

	public List<Characters> characuni (String universe) {
		return repo.findByUniverse(universe);
	}
	
	public Characters create(Characters Char) {
		Characters saved = this.repo.save(Char);
		return saved;
	}
	
	public void remove (int id) {
		repo.deleteById(id);;
	}
}