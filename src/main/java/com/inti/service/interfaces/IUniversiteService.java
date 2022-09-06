package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Universite;

public interface IUniversiteService {
	
	List<Universite> findAll();
	
	Universite findOne(Long id);
	
	Universite save(Universite universite);
	
	void delete(Long id);

}
