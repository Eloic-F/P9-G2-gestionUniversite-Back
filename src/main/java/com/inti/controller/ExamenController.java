package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Examen;
import com.inti.service.interfaces.IExamenService;


@RestController
@CrossOrigin
public class ExamenController {
	@Autowired
	IExamenService examenService;

	@GetMapping("/examens")
	public List<Examen> findAll(){
		return examenService.findAll();
	}
	
	 @PostMapping("/examens")
	    public Examen saveExamen(@RequestBody Examen examen) {
	        return examenService.save(examen);
	    }
	    
	    @PutMapping("/examens/{id}")
	    public Examen updateExamenWithPut(@PathVariable("id") Long id, @RequestBody Examen examen) {
	        Examen currentExamen = examenService.findOne(id);
	        currentExamen.setType(examen.getType());
	        currentExamen.setDateExamen(examen.getDateExamen());
	        currentExamen.setDureeExamen(examen.getDureeExamen());
	        currentExamen.setNote(examen.getNote());
	        currentExamen.setCorrection(examen.getCorrection());
	        return examenService.save(currentExamen);
	    }
	    
	    @GetMapping("/examens/{id}")
	    public Examen findOne(@PathVariable("id") Long id) {
	        return examenService.findOne(id);
	    }

	    @DeleteMapping("/examens/{id}")
	    public void deleteExamen(@PathVariable("id") Long id) {
	    	examenService.delete(id);
	    }
}
