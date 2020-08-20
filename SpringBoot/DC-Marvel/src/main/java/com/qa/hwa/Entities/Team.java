package com.qa.hwa.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="Team")
public class Team {

	@Id
	@GeneratedValue
	private int teamid;
	private String teamname;
	private String teamside;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	public Team(int teamid, String teamname, String teamside) {
		super();
		this.teamid = teamid;
		this.teamname = teamname;
		this.teamside = teamside;
	}
	
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
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
		
		