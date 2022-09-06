package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Classe;

public interface IClasseService {
	List<Classe> findAll();

	Classe findOne(Long id);

	Classe save(Classe classe);

	void delete(Long id);

}
