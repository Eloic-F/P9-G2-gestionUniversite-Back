package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Academie;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademieRepository extends JpaRepository<Academie, Long> {

}
