package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.CentreDeRecherche;

public interface ICentreDeRechercheService {
	
    List<CentreDeRecherche> findAll();
	
	CentreDeRecherche findOne(Long id);
	
	CentreDeRecherche save(CentreDeRecherche centreDeRecherche);
	
	void delete(Long id);

}
