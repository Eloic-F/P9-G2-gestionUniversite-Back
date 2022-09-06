package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Examen;

public interface IExamenService {

	List<Examen> findAll();
	
	Examen findOne(Long id);

	Examen save(Examen examen);

	void delete(Long id);

}
