package com.inti.service.impl;

import com.inti.entities.Formation;
import com.inti.repositories.FormationRepository;
import com.inti.service.interfaces.IFormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormationService implements IFormationService {
    @Autowired
    FormationRepository formationRepository;

    @Override
    public List<Formation> findAll() {

        return formationRepository.findAll();
    }

    @Override
    public Formation findOne(Long id) {

        return formationRepository.findById(id).get();
    }

    @Override
    public Formation save(Formation formation) {

        return formationRepository.save(formation);
    }

    @Override
    public void delete(Long id) {
        formationRepository.deleteById(id);
    }

}
