package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Formation;

public interface IFormationService {
    List<Formation> findAll();
	
	Formation findOne(Long id);
	
	Formation save(Formation formation);
	
	void delete(Long id);

}
