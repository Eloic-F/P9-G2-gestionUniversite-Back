package com.inti.controller;

import com.inti.entities.Universite;
import com.inti.service.interfaces.IUniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UniversiteController {

    @Autowired
    IUniversiteService universiteService;

    @GetMapping("/universites")
    public List<Universite> findAll() {
        return universiteService.findAll();
    }

    @GetMapping("/universites/{idUniversite}")
    public Universite findOne(@PathVariable("idUniversite") Long id) {
        return universiteService.findOne(id);
    }

    @PostMapping("/universites")
    public Universite saveUniversite(@RequestBody Universite universite) {
        return universiteService.save(universite);
    }

    @DeleteMapping("/universites/{idUniversite}")
    public void deleteUniversite(@PathVariable("idUniversite") Long id) {
        universiteService.delete(id);
    }

    @PutMapping("/universites/{idUniversite}")
    public Universite updateUniversiteWithPut(@PathVariable("idUniversite") Long id, @RequestBody Universite universite) {
        Universite currentUniversite = universiteService.findOne(id);
        currentUniversite.setNomUniversite(universite.getNomUniversite());
        return universiteService.save(currentUniversite);
    }
}
