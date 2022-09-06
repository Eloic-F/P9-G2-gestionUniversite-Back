package com.inti.service.impl;

import com.inti.entities.Section;
import com.inti.repositories.SectionRepository;
import com.inti.service.interfaces.ISectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionService implements ISectionService {
    @Autowired
    SectionRepository sectionRepository;

    @Override
    public List<Section> findAll() {

        return sectionRepository.findAll();
    }

    @Override
    public Section findOne(Long id) {

        return sectionRepository.findById(id).get();
    }

    @Override
    public Section save(Section section) {

        return sectionRepository.save(section);
    }

    @Override
    public void delete(Long id) {
        sectionRepository.deleteById(id);
    }

}
