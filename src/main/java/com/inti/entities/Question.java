package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idQuestion;
	private String question;
	private String categorie;
	@ManyToOne
	@JoinColumn(name="id_personne")
	private Personne personne;
	
	public Question() {
		
	}

	
	public Question(Long idQuestion, String question, String categorie, Personne personne) {
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


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
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
