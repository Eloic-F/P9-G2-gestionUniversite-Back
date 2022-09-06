package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Classe;
import com.inti.repositories.ClasseRepository;
import com.inti.service.interfaces.IClasseService;

@Service
public class ClasseService implements IClasseService {

	@Autowired
	ClasseRepository classeRepository;

	@Override
	public List<Classe> findAll() {
		return classeRepository.findAll();
	}

	@Override
	public Classe findOne(Long id) {
		return classeRepository.findById(id).get();
	}

	@Override
	public Classe save(Classe classe) {
		return classeRepository.save(classe);
	}

	@Override
	public void delete(Long id) {
		classeRepository.deleteById(id);
	}

}
