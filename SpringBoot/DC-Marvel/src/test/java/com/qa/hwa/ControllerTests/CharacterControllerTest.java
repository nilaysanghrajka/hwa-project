package com.qa.hwa.ControllerTests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import com.qa.hwa.Entities.Characters;
import com.qa.hwa.Repositories.CharacterRepo;
import com.qa.hwa.Repositories.TeamRepo;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class CharacterControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private CharacterRepo crepo;
	
	@Autowired
	private TeamRepo trepo;
	
	private Characters testChar = new Characters("Flash", "Barry Allen", "Central", "Forensics Scientist", "Good", "DC");
	private Characters newtestchar = new Characters("Flash", "Bart Allen", "Central", "Student", "Good", "DC");
	private Characters testcharwithId;
	int id;
	
	
	@Before
	public void init() {
		this.crepo.deleteAll();
		this.trepo.deleteAll();
		this.testChar.setId(id);
		this.testcharwithId=this.crepo.save(testChar);
		this.id=this.testcharwithId.getId();
		this.newtestchar.setId(id);
	}
	
	@Test
	public void testCreate() throws Exception {
		
	}



	
}
