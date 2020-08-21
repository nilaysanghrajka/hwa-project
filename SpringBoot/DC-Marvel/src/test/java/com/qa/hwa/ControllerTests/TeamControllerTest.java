package com.qa.hwa.ControllerTests;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import com.qa.hwa.Controllers.CharacterController;
import com.qa.hwa.Entities.Team;
import com.qa.hwa.Services.CharacterServices;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(MockitoJUnitRunner.class)
class TeamControllerTest {

	@Mock
	private CharacterServices characterservices;
	
	@Spy
	@InjectMocks 
	private CharacterController charactercontroller;
	
	@Test
	public void ListAllTeamTest() {
		Team team = new Team("X-men", "Good");
		Team newteam = new Team("X-men", "Neutral");
		Team savedteam = new Team(1, "No Team", "Neutral");
		
	}
}
