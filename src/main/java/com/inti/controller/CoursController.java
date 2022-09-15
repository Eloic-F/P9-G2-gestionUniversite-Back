package com.inti.controller;

import com.inti.entities.*;
import com.inti.service.interfaces.ICoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;
import java.util.Set;

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
    public String saveCours(@RequestParam("libelleCours")String libelleCours, @RequestParam("dureeCours")float dureeCours, @RequestParam("dateCours")Date dateCours,
                           @RequestParam("image")MultipartFile image, @RequestParam("UE")UE ue, @RequestParam("formation")Formation formation,
                           @RequestParam("personne")Personne personne, @RequestParam("evaluations")List<Evaluation> evaluations,
                           @RequestParam("questions")Set<Question>questions,@RequestParam("idCours") Long idCours){
        try{Cours cours = new Cours();
            cours.setIdCours(idCours);
            cours.setLibelleCours(libelleCours);
            cours.setDureeCours(dureeCours);
            cours.setDateCours(dateCours);
            cours.setImage(image.getBytes());
            cours.setUe(ue);
            cours.setFormation(formation);
            cours.setEvaluations(evaluations);
            cours.setPersonne(personne);
            cours.setQuestions(questions);
            coursService.save(cours);
            return "File upload sucess, filename = "+ image.getOriginalFilename();
        }catch (Exception ex){
            ex.printStackTrace();
            return "Failed upload";
        }
    }

    @DeleteMapping("/cours/{idCours}")
    public void deleteCours(@PathVariable("idCours") Long id) {
        coursService.delete(id);
    }

    @GetMapping("/cours/update/{idCours}")
    public Cours updateCoursWithPut(@PathVariable("idCours") Long id, @RequestBody Cours cours) {
        Cours currentCours = coursService.findOne(id);
        currentCours.setLibelleCours(cours.getLibelleCours());
        currentCours.setDureeCours(cours.getDureeCours());
        currentCours.setQuestions(cours.getQuestions());
        currentCours.setPersonne(cours.getPersonne());
        currentCours.setEvaluations(cours.getEvaluations());
        currentCours.setFormation(cours.getFormation());
        currentCours.setUe(cours.getUe());
        currentCours.setDateCours(cours.getDateCours());
        currentCours.setImage(cours.getImage());
        return coursService.save(currentCours);
    }
}
