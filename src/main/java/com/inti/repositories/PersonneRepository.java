package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
