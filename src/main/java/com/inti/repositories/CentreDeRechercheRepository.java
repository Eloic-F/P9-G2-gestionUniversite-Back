package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.CentreDeRecherche;
import org.springframework.stereotype.Repository;

@Repository
public interface CentreDeRechercheRepository extends JpaRepository<CentreDeRecherche, Long> {

}
