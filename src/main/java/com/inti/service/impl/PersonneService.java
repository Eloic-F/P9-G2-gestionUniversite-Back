package com.inti.service.impl;

import java.util.List;

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

}
