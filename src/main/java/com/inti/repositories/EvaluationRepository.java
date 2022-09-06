package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.entities.Evaluation;

public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {

}
