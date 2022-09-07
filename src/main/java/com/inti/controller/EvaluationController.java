package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Evaluation;
import com.inti.service.interfaces.IEvaluationService;

@RestController
@CrossOrigin
public class EvaluationController {

	@Autowired
	IEvaluationService evaluationService;

	@GetMapping("/evaluations")
	public List<Evaluation> findAll() {
		return evaluationService.findAll();
	}

	@GetMapping("/evaluations/{id}")
	public Evaluation findOne(@PathVariable("id") Long id) {
		return evaluationService.findOne(id);
	}

	@PostMapping("/evaluations")
	public Evaluation saveEvaluation(@RequestBody Evaluation evaluation) {
		return evaluationService.save(evaluation);
	}

	@DeleteMapping("/evaluations/{id}")
	public void deleteEvaluation(@PathVariable("id") Long id) {
		evaluationService.delete(id);
	}

}
