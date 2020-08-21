package com.qa.hwa.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String teamname;
	private String teamside;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	public Team(String teamname, String teamside) {
		super();
		this.teamname = teamname;
		this.teamside = teamside;
	}

	public Team(int id, String teamname, String teamside) {
		super();
		this.id = id;
		this.teamname = teamname;
		this.teamside = teamside;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public String getTeamside() {
		return teamside;
	}

	public void setTeamside(String teamside) {
		this.teamside = teamside;
	}
		
}
		
		