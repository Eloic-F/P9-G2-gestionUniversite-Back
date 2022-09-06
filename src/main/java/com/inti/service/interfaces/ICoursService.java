package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Cours;

public interface ICoursService {
	List<Cours> findAll();

	Cours findOne(Long id);

	Cours save(Cours cours);

	void delete(Long id);

}
