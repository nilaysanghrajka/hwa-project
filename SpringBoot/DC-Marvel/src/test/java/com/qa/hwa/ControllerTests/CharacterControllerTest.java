package com.qa.hwa.ControllerTests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.qa.hwa.Controllers.CharacterController;
import com.qa.hwa.Entities.Characters;
import com.qa.hwa.Repositories.CharacterRepo;
import com.qa.hwa.Repositories.TeamRepo;
import com.qa.hwa.Services.CharacterServices;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(MockitoJUnitRunner.class)
public class CharacterControllerTest {

	@Mock
	private CharacterServices characterservices;
	
	@Spy
	@InjectMocks 
	private CharacterController charactercontroller;
	
	@Test
	public void ListAllTest() {
		Characters characters = new Characters("Flash", "Barry Allen", "Central", "Forensic Scientist", "Good", "DC");
		Characters newcharacters = new Characters("Flash", "Bart Allen", "Central", "Student", "Good", "DC");
		Characters savedcharacters = new Characters(1, "Batman", "Bruce Wayne", "Gotham", "Business Man", "Good", "DC");
	}

	

	
}
