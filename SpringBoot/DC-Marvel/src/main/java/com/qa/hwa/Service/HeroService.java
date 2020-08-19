package com.qa.hwa.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.qa.hwa.Entities.Heroes;
import com.qa.hwa.Repositories.HeroRepo;

@Service
public class HeroService {

	@Autowired
	HeroRepo repo;
	
	@GetMapping("/save")
    public String saveRecord() {
		Heroes s = new Heroes ();
		s.setID(1);
		s.setName("Superman");
		s.setAlter_ego("Clark Kent");
		s.setLocation("Metropolis");
		s.setOccupation("Reporter");
		repo.save(s);
        return "Record Saved";
    }
}
