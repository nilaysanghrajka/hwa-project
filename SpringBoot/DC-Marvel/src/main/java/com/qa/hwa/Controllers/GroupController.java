package com.qa.hwa.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hwa.Entities.Groups;

@RestController
@RequestMapping("/Groups")
public class GroupController {

	GroupRepo repo;
	
	@GetMapping("/allrecords")
	public List<Groups> showallrecord() {
		
		List <Groups> records = repo.findAll();
		
		return records;
	}
}
