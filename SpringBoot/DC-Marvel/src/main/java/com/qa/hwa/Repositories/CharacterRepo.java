package com.qa.hwa.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.hwa.Entities.Characters;

@Repository
public interface CharacterRepo extends JpaRepository<Characters, Integer> {
	public List<Characters> findByName (String name);
	public List<Characters> findByUniverse(String universe);
//	public Characters saveAll(Characters c);
			
}
