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
import com.inti.entities.CentreDeRecherche;
import com.inti.service.interfaces.ICentreDeRechercheService;


@RestController
@CrossOrigin
public class CentreDeRechercheController {
	
	    @Autowired
	    ICentreDeRechercheService centreDeRechercheService;

	    @GetMapping("/centreDeRecherches")
	    public List<CentreDeRecherche> findAll() {
	        return centreDeRechercheService.findAll();
	    }

	    @GetMapping("/centreDeRecherches/{id}")
	    public CentreDeRecherche findOne(@PathVariable("id") Long id) {
	        return centreDeRechercheService.findOne(id);
	    }

	    @PostMapping("/centreDeRecherches")
	    public CentreDeRecherche saveCentreDeRecherche(@RequestBody CentreDeRecherche centreDeRecherche) {
	        return centreDeRechercheService.save(centreDeRecherche);
	    }

	    @DeleteMapping("/centreDeRecherches/{id}")
	    public void deleteCentreDeRecherche(@PathVariable("id") Long id) {
	        centreDeRechercheService.delete(id);
	    }

}
