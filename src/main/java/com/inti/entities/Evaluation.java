package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Evaluation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEvaluation;
	private String commentaire;
	@Lob
	private byte[] image;

	// ASSOCIATIONS
	@ManyToOne
	@JoinColumn(name = "id_evaluation")
	private Evaluation evaluation;
	@ManyToOne
	@JoinColumn(name = "id_evaluation")
	private Cours cours;

	public Evaluation() {
		// TODO Auto-generated constructor stub
	}

	public Evaluation(String commentaire, byte[] image) {
		this.commentaire = commentaire;
		this.image = image;
	}

	public Long getIdEvaluation() {
		return idEvaluation;
	}

	public void setIdEvaluation(Long idEvaluation) {
		this.idEvaluation = idEvaluation;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Evaluation getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}

}