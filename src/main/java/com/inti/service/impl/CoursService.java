package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Cours;
import com.inti.repositories.CoursRepository;
import com.inti.service.interfaces.ICoursService;

@Service
public class CoursService implements ICoursService {

	@Autowired
	CoursRepository coursRepository;

	@Override
	public List<Cours> findAll() {
		return coursRepository.findAll();
	}

	@Override
	public Cours findOne(Long id) {
		return coursRepository.findById(id).get();
	}

	@Override
	public Cours save(Cours cours) {
		return coursRepository.save(cours);
	}

	@Override
	public void delete(Long id) {
		coursRepository.deleteById(id);
	}

}
