package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Compte;
import com.inti.repositories.CompteRepository;
import com.inti.service.interfaces.ICompteService;

@Service
public class CompteService implements ICompteService {
	
	@Autowired
	CompteRepository compteRepository;

	@Override
	public List<Compte> findAll() {
		return compteRepository.findAll();
	}

	@Override
	public Compte save(Compte compte) {
		return compteRepository.save(compte);
	}

	@Override
	public void delete(Long id) {
		compteRepository.deleteById(id);
		
	}

	@Override
	public Compte findOne(Long id) {
		return compteRepository.findById(id).get();
	}
	
}
