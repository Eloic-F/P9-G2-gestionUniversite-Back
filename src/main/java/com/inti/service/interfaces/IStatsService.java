package com.inti.service.interfaces;

import com.inti.entities.Classe;
import com.inti.entities.Cours;
import com.inti.entities.Examen;

public interface IStatsService {
  float moyenne (Long id,Long idBis);
  int nbrQuestionCours(Long id);
  float tauxdeReussite(Long id);
  int nbrEleveClasse(Long id);
  int nbrEvaluationCours(Long id);

}
