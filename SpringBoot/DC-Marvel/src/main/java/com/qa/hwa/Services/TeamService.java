package com.qa.hwa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hwa.Entities.Team;
import com.qa.hwa.Exceptions.TeamNotFoundException;
import com.qa.hwa.Repositories.TeamRepo;

@Service
public class TeamService {
	
	@Autowired
	TeamRepo repo;
	
	public List<Team> listteam(){
		return repo.findAll();
	}
	
	public Team create(Team team) {
		Team saved = this.repo.save(team);
		return saved;
	}
	
	public void remove (int id) {
		repo.deleteById(id);
	}
	
	public Team update (Team newteam, int id) {
		try {
			Team team = viewById(id);
			if (newteam.getTeamname() != null)
				team.setTeamname(newteam.getTeamname());
			
			if (newteam.getTeamside() != null)
				team.setTeamside(newteam.getTeamside());
			
			return this.repo.save(team);
		}
		catch (TeamNotFoundException e) {
			return null;
		}
	}
	
	public Team viewById(int id) throws TeamNotFoundException {
		// TODO Auto-generated method stub
		Team found = this.repo.findById(id).orElseThrow(TeamNotFoundException::new);
		return found;
	}
	

}