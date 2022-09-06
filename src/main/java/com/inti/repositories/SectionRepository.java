package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section,Long>{

}
