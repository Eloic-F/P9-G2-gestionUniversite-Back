package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Academie;

public interface IAcademieService {
	
	List<Academie> findAll();
	
	Academie findOne(Long id);
	
	Academie save(Academie academie);
	
	void delete(Long id);

}
