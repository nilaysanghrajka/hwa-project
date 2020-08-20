package com.qa.hwa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qa.hwa.Repositories.GroupRepo;

@Service
public class TeamService {
	
	@Autowired
	GroupRepo repo;

	public List<String> listteams() {
		// TODO Auto-generated method stub
		return repo.listGroups();
	}
	

}