package com.qa.hwa.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Groups")
public class Groups {

	@Id
	@GeneratedValue
	private int Group_ID;
	private String Group_name;
	private String Group_side;
	
	
	public int getGroup_ID() {
		return Group_ID;
	}
	public void setGroup_ID(int group_ID) {
		Group_ID = group_ID;
	}
	public String getGroup_name() {
		return Group_name;
	}
	public void setGroup_name(String group_name) {
		Group_name = group_name;
	}
	public String getGroup_side() {
		return Group_side;
	}
	public void setGroup_side(String group_side) {
		Group_side = group_side;
	}
	
}
