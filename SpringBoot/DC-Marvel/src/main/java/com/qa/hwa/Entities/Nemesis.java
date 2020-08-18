package com.qa.hwa.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Nemsis")
public class Nemesis {

	@Id
	@GeneratedValue
	private int Nemsis_ID;
	private int fkHero_ID;
	private int fkVillain_ID;
	
	
	public int getNemsis_ID() {
		return Nemsis_ID;
	}
	public void setNemsis_ID(int nemsis_ID) {
		Nemsis_ID = nemsis_ID;
	}
	public int getFkHero_ID() {
		return fkHero_ID;
	}
	public void setFkHero_ID(int fkHero_ID) {
		this.fkHero_ID = fkHero_ID;
	}
	public int getFkVillain_ID() {
		return fkVillain_ID;
	}
	public void setFkVillain_ID(int fkVillain_ID) {
		this.fkVillain_ID = fkVillain_ID;
	}
	
}
