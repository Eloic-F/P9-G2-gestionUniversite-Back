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

import com.inti.entities.Compte;
import com.inti.entities.Personne;
import com.inti.service.interfaces.ICompteService;
import com.inti.service.interfaces.IPersonneService;

@RestController
@CrossOrigin
public class CompteController {
	@Autowired
	ICompteService compteService;
	
	@Autowired
	IPersonneService personneService;
	
	@GetMapping("/comptes")
    public List<Compte> findAll() {
        return compteService.findAll();
    }


    @PostMapping("/comptes")
    public Compte saveCompte(@RequestBody Compte compte) {
        return compteService.save(compte);
    }
    
    @PutMapping("/comptes/{id}")
    public Compte updateCompteWithPut(@PathVariable("id") Long id, @RequestBody Compte compte,@RequestBody Personne personne) {
        Compte currentCompte = compteService.findOne(id);
        Personne p=personneService.findOne(id);
        currentCompte.setNumeroCompte(compte.getNumeroCompte());
        currentCompte.setStatut(compte.getStatut());
        p.setId(currentCompte.getIdCompte());
        return compteService.save(currentCompte);
    }
    
    @GetMapping("/comptes/{id}")
    public Compte findOne(@PathVariable("id") Long id) {
        return compteService.findOne(id);
    }

    @DeleteMapping("/comptes/{id}")
    public void deleteCompte(@PathVariable("id") Long id) {
    	compteService.delete(id);
    }
    

}
