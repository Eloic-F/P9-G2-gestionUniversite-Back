package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long> {
	Personne findByUsername(String username);

}
