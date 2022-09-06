package com.inti.entities;

import java.util.List;

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
	private String question;
	private String categorie;
	@ManyToOne
	@JoinColumn(name = "id_Personne")
	private Personne personne;

	public Question() {
		
	}

	



	public Question(Long idQuestion, String question, String categorie, Personne personne, List<Cours> personnes) {
		
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
