package com.qa.hwa.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Characters {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String alterEgo;
	private String location;
	private String occupation;
	private String side;
	private String universe;
	
	public Characters() {
		// TODO Auto-generated constructor stub
	}
		
	public Characters(String name, String alterEgo, String location, String occupation, String side, String universe) {
		super();
		this.name = name;
		this.alterEgo = alterEgo;
		this.location = location;
		this.occupation = occupation;
		this.side = side;
		this.universe = universe;
	}

	public Characters(int id, String name, String alterEgo, String location, String occupation, String side,
			String universe) {
		super();
		this.id = id;
		this.name = name;
		this.alterEgo = alterEgo;
		this.location = location;
		this.occupation = occupation;
		this.side = side;
		this.universe = universe;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlterEgo() {
		return alterEgo;
	}
	public void setAlterEgo(String alterEgo) {
		this.alterEgo = alterEgo;
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
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public String getUniverse() {
		return universe;
	}
	public void setUniverse(String universe) {
		this.universe = universe;
	}
	
	
}
