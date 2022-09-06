package com.inti.service.impl;

import com.inti.entities.CentreDeRecherche;
import com.inti.repositories.CentreDeRechercheRepository;
import com.inti.service.interfaces.ICentreDeRechercheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CentreDeRechercheService implements ICentreDeRechercheService {
    @Autowired
    CentreDeRechercheRepository centreDeRechercheRepository;

    @Override
    public List<CentreDeRecherche> findAll() {

        return centreDeRechercheRepository.findAll();
    }

    @Override
    public CentreDeRecherche findOne(Long id) {

        return centreDeRechercheRepository.findById(id).get();
    }

    @Override
    public CentreDeRecherche save(CentreDeRecherche centreDeRecherche) {

        return centreDeRechercheRepository.save(centreDeRecherche);
    }

    @Override
    public void delete(Long id) {
        centreDeRechercheRepository.deleteById(id);
    }

}
