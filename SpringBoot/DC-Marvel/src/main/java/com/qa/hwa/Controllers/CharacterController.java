package com.qa.hwa.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hwa.Entities.Characters;
import com.qa.hwa.Services.CharacterServices;


@RestController
//@RequestMapping("/Heroes")
@CrossOrigin
public class CharacterController {

	@Autowired
	CharacterServices service;
	
	@GetMapping("/characters/{charname}")
	public List<Characters> charList(@PathVariable("charname") String name) {
		return service.charName (name);
	}
	
	@GetMapping("/ListAll")
	public List<Characters> listBoth() {
		System.out.println("this works here");
		return service.listboth();
	}
	
	@GetMapping("/characuni/{uni}")
	public List<Characters> characuni(@PathVariable("characuni") String uni) {
		return service.characuni(uni);
	}
	
	
	@GetMapping("/remove/{id}")
	public ResponseEntity<Integer> remove (@PathVariable int id) {
		service.remove(id);
		return new ResponseEntity<> (id, HttpStatus.NO_CONTENT);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Characters> create(@RequestBody Characters Char) {
		Characters newChar = this.service.create(Char);
		System.out.println("Create character");
		return new ResponseEntity<> (newChar, HttpStatus.CREATED);
	}
	
}
