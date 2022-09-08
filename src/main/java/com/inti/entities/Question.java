package com.inti.entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idQuestion;
	private Map<String,String> question = new HashMap<>();
	private String categorie;
	@ManyToOne
	@JoinColumn(name = "id_Personne")
	private Personne personne;

	public Question() {
		
	}

	
	public Question(Long idQuestion, Map<String,String> question, String categorie, Personne personne, List<Cours> personnes) {
		
		this.idQuestion = idQuestion;
		this.question = question;
		this.categorie = categorie;
		this.personne = personne;
	}








	public Long getIdQuestion() {
		return idQuestion;
	}


	public void setIdQuestion(Long idQuestion) {
		this.idQuestion = idQuestion;
	}

	public Map<String, String> getQuestion() {
		return question;
	}

	public void setQuestion(Map<String, String> question) {
		this.question = question;
	}

	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	public Personne getPersonne() {
		return personne;
	}


	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	
	
	
	

}
