package com.qa.hwa.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Heroes")
public class Heroes {

	@Id
	@GeneratedValue
	private int ID;
	private String Name;
	private String Alter_ego;
	private String Location;
	private String Occupation;
	private String fk_Groups_id;
	
	public Heroes(int iD, String name, String alter_ego, String location, String occupation, String fk_Groups_id) {
		super();
		ID = iD;
		Name = name;
		Alter_ego = alter_ego;
		Location = location;
		Occupation = occupation;
		this.fk_Groups_id = fk_Groups_id;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAlter_ego() {
		return Alter_ego;
	}
	public void setAlter_ego(String alter_ego) {
		Alter_ego = alter_ego;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	public String getFk_Groups_id() {
		return fk_Groups_id;
	}
	public void setFk_Groups_id(String fk_Groups_id) {
		this.fk_Groups_id = fk_Groups_id;
	}
	
}
