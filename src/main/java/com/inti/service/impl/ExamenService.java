package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Examen;
import com.inti.repositories.ExamenRepository;
import com.inti.service.interfaces.IExamenService;

@Service
public class ExamenService implements IExamenService {

	@Autowired
	ExamenRepository examenRepository;

	@Override
	public List<Examen> findAll() {
		return examenRepository.findAll();
	}

	@Override
	public Examen save(Examen examen) {
		return examenRepository.save(examen);
	}

	@Override
	public void delete(Long id) {
		examenRepository.deleteById(id);
		
	}

	@Override
	public Examen findOne(Long id) {
		return examenRepository.findById(id).get();
	}
}
