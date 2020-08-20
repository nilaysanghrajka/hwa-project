package com.qa.hwa.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.hwa.Entities.Heroes;

@Repository
public interface HeroRepo extends JpaRepository<Heroes, Integer> {
	
	@Query(value="Select * from heroes",nativeQuery=true)
	public List<String> listHeroes();
	
}
