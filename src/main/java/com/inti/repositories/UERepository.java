package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.UE;

@Repository
public interface UERepository extends JpaRepository<UE, Long> {

}
