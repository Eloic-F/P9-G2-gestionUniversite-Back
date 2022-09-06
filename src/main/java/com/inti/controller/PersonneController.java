package com.inti.controller;

import com.inti.entities.Personne;
import com.inti.service.interfaces.IPersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PersonneController {
    @Autowired
    IPersonneService personneService;

    @GetMapping("/personnes")
    public List<Personne> findAll() {
        return personneService.findAll();
    }

    @GetMapping("/personnes/{id}")
    public Personne findOne(@PathVariable("id") Long id) {
        return personneService.findOne(id);
    }

    @PostMapping("/personnes")
    public Personne savePersonne(@RequestBody Personne personne) {
        return personneService.save(personne);
    }

    @DeleteMapping("/personnes/{id}")
    public void deletePersonne(@PathVariable("id") Long id) {
        personneService.delete(id);
    }

    @PutMapping("/personnes/{id}")
    public Personne updatePersonneWithPut(@PathVariable("id") Long id, @RequestBody Personne personne) {
        Personne currentPersonne = personneService.findOne(id);
        currentPersonne.setPrenom(personne.getPrenom());
        currentPersonne.setNom(personne.getNom());
        return personneService.save(currentPersonne);
    }

}
