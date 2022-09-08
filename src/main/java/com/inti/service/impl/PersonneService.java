package com.inti.service.impl;

import java.util.List;

import com.inti.entities.Cours;
import com.inti.entities.Examen;
import com.inti.entities.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Personne;
import com.inti.repositories.PersonneRepository;
import com.inti.service.interfaces.IPersonneService;

@Service
public class PersonneService implements IPersonneService {

	@Autowired
	PersonneRepository personneRepository;

	@Override
	public List<Personne> findAll() {
		return personneRepository.findAll();
	}

	@Override
	public Personne findOne(Long id) {
		return personneRepository.findById(id).get();
	}

	@Override
	public Personne save(Personne personne) {
		return personneRepository.save(personne);
	}

	@Override
	public void delete(Long id) {
		personneRepository.deleteById(id);
	}

	@Override
	public List<Question> findAllQuestion(Long id) {
		Personne personne=findOne(id);
		List<Question> questions=personne.getQuestions();
		return questions;
	}

	@Override
	public List<Cours> findAllCours(Long id) {
		Personne personne=findOne(id);
		List<Cours> cours=personne.getCourses();
		return cours;
	}

	@Override
	public List<Examen> findAllExamen(Long id) {
		Personne personne=findOne(id);
		List<Examen> examen=personne.getExamens();
		return examen;
	}
}
