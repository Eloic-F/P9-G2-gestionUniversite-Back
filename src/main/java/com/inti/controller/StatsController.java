package com.inti.controller;

import com.inti.service.interfaces.IStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class StatsController {
  @Autowired
  IStatsService statsService;

  @GetMapping("/stats/nbrQuestion/{id}")
  public int nombreQuestion(@PathVariable("id")Long id){ return statsService.nbrQuestionCours(id);}

  @GetMapping("/stats/taux/{id}")
  public float tauxReussite(@PathVariable("id")Long id){return statsService.tauxdeReussite(id);}
  @GetMapping("/stats/moyenne/{id}")
  public float moyenne(@PathVariable("id")Long id, @RequestParam("idd")Long idd){return statsService.moyenne(idd,id);}
  @GetMapping("/stats/nbrEleve/{id}")
  public int nbrEleve(@PathVariable("id")Long id){return statsService.nbrEleveClasse(id);}
  @GetMapping("/stats/nbrEvaluation/{id}")
  public int nbrEvaluation(@PathVariable("id")Long id){return statsService.nbrEvaluationCours(id);}
}
