package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Universite;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {

}
