package com.qa.hwa.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Villain {

	@Id
	private int ID;
	private String name;
	private String alter_ego;
	private String groups;
	private String location;
	private String occupation;
}
}
