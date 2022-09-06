package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Compte;

public interface ICompteService {

	List<Compte> findAll();

	Compte save(Compte compte);

	void delete(Long id);

	

}
