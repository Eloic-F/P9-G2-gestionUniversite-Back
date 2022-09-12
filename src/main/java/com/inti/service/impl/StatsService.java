package com.inti.service.impl;

import com.inti.entities.Classe;
import com.inti.entities.Cours;
import com.inti.entities.Examen;
import com.inti.repositories.ClasseRepository;
import com.inti.repositories.CoursRepository;
import com.inti.repositories.ExamenRepository;
import com.inti.service.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatsService implements IStatsService {
  @Autowired
  IClasseService classeService;
  @Autowired
  IExamenService examenService;
  @Autowired
  ICoursService coursService;
  @Autowired
  IPersonneService personneService;
  @Override
  public float moyenne(Long id,Long idBis) {
    Cours cours=coursService.findOne(id);
    float moyenne=0;
    float somme=0;
    if (cours.getPersonne().getId()==idBis){
      for (Examen examen:cours.getExamens()) {
        somme=somme +examen.getNote();
      }
      moyenne=somme/cours.getExamens().size();
    }
    return moyenne;

  }

  @Override
  public int nbrQuestionCours(Long id) {
    Cours cours = coursService.findOne(id);
    int nbrQuestions = cours.getQuestions().size();
    return  nbrQuestions;
  }

  @Override
  public float tauxdeReussite(Long id) {
    Cours cours = coursService.findOne(id);
    float pourcent;
    int i=0;
    List<Boolean> taux=new ArrayList<>();
    boolean var;
    for (Examen examen:cours.getExamens()) {

      if (examen.getNote()>=10){
        var=true;
      }else {
        var=false;

      }taux.add(var);
    }
    for (Boolean bool:taux) {
      if (bool=true){
        i=i+1;
      }}
    pourcent=i/taux.size();
    return pourcent;
  }

  @Override
  public int nbrEleveClasse(Long id) {
    Classe classe=classeService.findOne(id);
    int nbrEleve=classe.getPersonnes().size();
    return nbrEleve;
  }

  @Override
  public int nbrEvaluationCours(Long id) {
   Cours cours=coursService.findOne(id);
   int nbrEvaluation= cours.getEvaluations().size();
   return nbrEvaluation;
  }
}
