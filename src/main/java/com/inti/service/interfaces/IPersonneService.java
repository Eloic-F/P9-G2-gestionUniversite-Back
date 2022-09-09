package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Cours;
import com.inti.entities.Examen;
import com.inti.entities.Personne;
import com.inti.entities.Question;

public interface IPersonneService {
	
	List<Personne> findAll();

	Personne findOne(Long id);

	Personne save(Personne personne);

	void delete(Long id);

	List<Question> findAllQuestion(Long id);

	List<Examen> findAllExamen(Long id);

	List<Cours> findAllCours(Long id);

}
