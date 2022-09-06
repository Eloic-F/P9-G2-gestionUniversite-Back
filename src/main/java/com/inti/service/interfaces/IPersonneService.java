package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Personne;

public interface IPersonneService {
	
	List<Personne> findAll();

	Personne findOne(Long id);

	Personne save(Personne personne);

	void delete(Long id);

}
