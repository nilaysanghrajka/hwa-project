package com.qa.hwa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hwa.Entities.Characters;
import com.qa.hwa.Exceptions.CharacterNotFoundException;
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
	
	public Characters update (Characters newChar, int id) {
		try {
			Characters Char = viewById(id);
			if (newChar.getName() != null)
				Char.setName(newChar.getName());
			
			if (newChar.getAlterEgo() != null)
				Char.setAlterEgo(newChar.getAlterEgo());
			
			if (newChar.getLocation() != null)
				Char.setLocation(newChar.getLocation());
			
			if (newChar.getOccupation() != null)
				Char.setName(newChar.getOccupation());
			
			if (newChar.getSide() != null)
				Char.setSide(newChar.getSide());
			
			if (newChar.getUniverse() != null)
				Char.setUniverse(newChar.getUniverse());
			return this.repo.save(Char);
		}
		catch (CharacterNotFoundException e) {
			return null;
		}
	}
	

	public Characters viewById(int id) throws CharacterNotFoundException {
		// TODO Auto-generated method stub
		Characters found = this.repo.findById(id).orElseThrow(CharacterNotFoundException::new);
		return found;
	}
}