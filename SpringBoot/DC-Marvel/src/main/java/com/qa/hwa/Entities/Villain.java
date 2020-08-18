package com.qa.hwa.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Villains")
public class Villain {

	@Id
	@GeneratedValue
	private String name;
	private String alter_ego;
	private String location;
	private String occupation;
	private String fkGroups_id;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlter_ego() {
		return alter_ego;
	}
	public void setAlter_ego(String alter_ego) {
		this.alter_ego = alter_ego;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getFkGroups_id() {
		return fkGroups_id;
	}
	public void setFkGroups_id(String fkGroups_id) {
		this.fkGroups_id = fkGroups_id;
	}
	
}

