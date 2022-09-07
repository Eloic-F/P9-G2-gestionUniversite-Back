package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Formation;
import com.inti.service.interfaces.IFormationService;

@RestController
@CrossOrigin
public class FormationController {

	@Autowired
	IFormationService formationService;

	@GetMapping("/formations")
	public List<Formation> findAll() {
		return formationService.findAll();
	}

	@GetMapping("/formations/{id}")
	public Formation findOne(@PathVariable("id") Long id) {
		return formationService.findOne(id);
	}

	@PostMapping("/formations")
	public Formation saveFormation(@RequestBody Formation formation) {
		return formationService.save(formation);
	}

	@DeleteMapping("/formations/{id}")
	public void deleteFormation(@PathVariable("id") Long id) {
		formationService.delete(id);
	}
}
