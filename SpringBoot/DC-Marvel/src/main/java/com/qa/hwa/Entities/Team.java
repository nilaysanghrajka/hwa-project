package com.qa.hwa.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Team")
public class Team {

	@Id
	@GeneratedValue
	private int TeamID;
	private String TeamName;
	private String TeamSide;
	
	public Team(int teamID, String teamName, String teamSide) {
		super();
		TeamID = teamID;
		TeamName = teamName;
		TeamSide = teamSide;
	}
	public int getTeamID() {
		return TeamID;
	}
	public void setTeamID(int teamID) {
		TeamID = teamID;
	}
	public String getTeamName() {
		return TeamName;
	}
	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	public String getTeamSide() {
		return TeamSide;
	}
	public void setTeamSide(String teamSide) {
		TeamSide = teamSide;
	}

	
}
