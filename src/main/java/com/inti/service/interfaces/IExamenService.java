package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Examen;



public interface IExamenService {

	List<Examen> findAll();

	Examen save(Examen examen);

	void delete(Long id);

}
