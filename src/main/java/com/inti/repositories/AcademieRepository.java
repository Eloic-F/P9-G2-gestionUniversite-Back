package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Academie;


@Repository
public interface AcademieRepository extends JpaRepository<Academie, Long> {

}
