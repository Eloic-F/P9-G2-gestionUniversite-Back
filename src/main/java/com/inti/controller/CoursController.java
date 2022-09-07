package com.inti.controller;

import com.inti.entities.Cours;
import com.inti.service.interfaces.ICoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CoursController {
    @Autowired
    ICoursService coursService;

    @GetMapping("/cours")
    public List<Cours> findAll() {
        return coursService.findAll();
    }

    @GetMapping("/cours/{idCours}")
    public Cours findOne(@PathVariable("idCours") Long id) {
        return coursService.findOne(id);
    }

    @PostMapping("/cours")
    public Cours saveCours(@RequestBody Cours cours) {
        return coursService.save(cours);
    }

    @DeleteMapping("/cours/{idCours}")
    public void deleteCours(@PathVariable("idCours") Long id) {
        coursService.delete(id);
    }

    @PutMapping("/cours/{idCours}")
    public Cours updateCoursWithPut(@PathVariable("idCours") Long id, @RequestBody Cours cours) {
        Cours currentCours = coursService.findOne(id);
        currentCours.setLibelleCours(cours.getLibelleCours());
        return coursService.save(currentCours);
    }
}
