package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inti.entities.Evaluation;
import com.inti.repositories.EvaluationRepository;
import com.inti.service.interfaces.IEvaluationService;

public class EvaluationService implements IEvaluationService {

	@Autowired
	EvaluationRepository evaluationRepository;

	@Override
	public List<Evaluation> findAll() {
		return evaluationRepository.findAll();
	}

	@Override
	public Evaluation findOne(Long id) {
		return evaluationRepository.findById(id).get();
	}

	@Override
	public Evaluation save(Evaluation evaluation) {
		return evaluationRepository.save(evaluation);
	}

	@Override
	public void delete(Long id) {
		evaluationRepository.deleteById(id);
	}

}
