package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.inti.entities.Question;
import com.inti.service.interfaces.IQuestionService;

@RestController
@CrossOrigin
public class QuestionController {

	@Autowired
	IQuestionService questionService;

	@GetMapping("/questions")
	public List<Question> findAll(){
		return questionService.findAll();
	}

	 @PostMapping("/questions")
	    public Question saveQuestion(@RequestBody Question question) {
	        return questionService.save(question);
	    }

	    @PutMapping("/questions/{id}")
	    public Question updateQuestionWithPut(@PathVariable("id") Long id, @RequestBody Question question) {
	        Question currentQuestion = questionService.findOne(id);
	        currentQuestion.setQuestion(question.getQuestion());
	        currentQuestion.setCategorie(question.getCategorie());
          currentQuestion.setPersonne(question.getPersonne());
          currentQuestion.setCategorie(question.getCategorie());
	        return questionService.save(currentQuestion);
	    }

	    @GetMapping("/questions/{id}")
	    public Question findOne(@PathVariable("id") Long id) {
	        return questionService.findOne(id);
	    }

	    @DeleteMapping("/questions/{id}")
	    public void deleteQuestion(@PathVariable("id") Long id) {
	    	questionService.delete(id);
	    }

}
