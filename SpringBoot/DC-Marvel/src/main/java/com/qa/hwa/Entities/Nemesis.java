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
	private int fk_Hero_ID;
	private int fk_Villain_ID;
	
	
	public int getNemsis_ID() {
		return Nemsis_ID;
	}
	public void setNemsis_ID(int nemsis_ID) {
		Nemsis_ID = nemsis_ID;
	}
	public int getFk_Hero_ID() {
		return fk_Hero_ID;
	}
	public void setFk_Hero_ID(int fk_Hero_ID) {
		this.fk_Hero_ID = fk_Hero_ID;
	}
	public int getFk_Villain_ID() {
		return fk_Villain_ID;
	}
	public void setFk_Villain_ID(int fk_Villain_ID) {
		this.fk_Villain_ID = fk_Villain_ID;
	}
	
}
