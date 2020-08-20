package com.qa.hwa.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.hwa.Entities.Team;

@Repository
public interface TeamRepo extends JpaRepository<Team, Integer>{

//	@Query(value="Select * from Team",nativeQuery=true)
//	List<String> listTeams();
//	
//	@Query(value="Select * from Groups",nativeQuery=true)
//	public List<String> listGroups();

}
