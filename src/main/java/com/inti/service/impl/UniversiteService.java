package com.inti.service.impl;

import com.inti.entities.Universite;
import com.inti.repositories.UniversiteRepository;
import com.inti.service.interfaces.IUniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversiteService implements IUniversiteService {
    @Autowired
    UniversiteRepository universiteRepository;

    @Override
    public List<Universite> findAll() {

        return universiteRepository.findAll();
    }

    @Override
    public Universite findOne(Long id) {

        return universiteRepository.findById(id).get();
    }

    @Override
    public Universite save(Universite universite) {

        return universiteRepository.save(universite);
    }

    @Override
    public void delete(Long id) {
        universiteRepository.deleteById(id);
    }

}
