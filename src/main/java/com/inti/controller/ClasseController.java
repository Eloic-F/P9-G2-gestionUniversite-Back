package com.inti.controller;

import com.inti.entities.Classe;
import com.inti.service.interfaces.IClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ClasseController {
    @Autowired
    IClasseService classeService;

    @GetMapping("/classes")
    public List<Classe> findAll() {
        return classeService.findAll();
    }

    @GetMapping("/classes/{idClasse}")
    public Classe findOne(@PathVariable("idClasse") Long id) {
        return classeService.findOne(id);
    }

    @PostMapping("/classes")
    public Classe saveClasse(@RequestBody Classe classe) {
        return classeService.save(classe);
    }

    @DeleteMapping("/classes/{idClasse}")
    public void deleteClasse(@PathVariable("idClasse") Long id) {
        classeService.delete(id);
    }

    @PutMapping("/classes/{idClasse}")
    public Classe updateClasseWithPut(@PathVariable("idClasse") Long id, @RequestBody Classe classe) {
        Classe currentClasse = classeService.findOne(id);
        currentClasse.setNomClasse(classe.getNomClasse());
        return classeService.save(currentClasse);
    }
}
