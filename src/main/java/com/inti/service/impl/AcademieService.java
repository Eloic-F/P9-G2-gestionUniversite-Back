package com.inti.service.impl;

import com.inti.entities.Academie;
import com.inti.repositories.AcademieRepository;
import com.inti.service.interfaces.IAcademieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademieService implements IAcademieService {
    @Autowired
    AcademieRepository academieRepository;

    @Override
    public List<Academie> findAll() {

        return academieRepository.findAll();
    }

    @Override
    public Academie findOne(Long id) {

        return academieRepository.findById(id).get();
    }

    @Override
    public Academie save(Academie academie) {

        return academieRepository.save(academie);
    }

    @Override
    public void delete(Long id) {
        academieRepository.deleteById(id);
    }


}
