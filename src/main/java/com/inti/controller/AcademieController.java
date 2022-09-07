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
import com.inti.entities.Academie;
import com.inti.service.interfaces.IAcademieService;

@RestController
@CrossOrigin
public class AcademieController {
	@Autowired
	IAcademieService academieService;

	@GetMapping("/academies")
	public List<Academie> findAll() {
		return academieService.findAll();
	}

	@GetMapping("/academies/{id}")
    public Academie findOne(@PathVariable("id") Long id) {
	    return academieService.findOne(id);
    }

    @PostMapping("/academies")
    public Academie saveAcademie(@RequestBody Academie academie) {
	    return academieService.save(academie);
	}

	@DeleteMapping("/academies/{id}")
	public void deleteAcademie(@PathVariable("id") Long id) {
	        academieService.delete(id);
	    }



}
